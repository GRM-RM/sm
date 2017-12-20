package com.grm.sm.controller;

import com.github.pagehelper.PageInfo;
import com.grm.sm.dto.SelectDto;
import com.grm.sm.pojo.Student;
import com.grm.sm.service.StudentService;
import com.grm.sm.utils.CheckStudentInfo;
import com.grm.sm.utils.Constants;
import com.grm.sm.utils.FilterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grm
 */
@Controller
public class StudentController {

    /**
     * 自动注入服务层
     */
    @Autowired
    private StudentService studentService;

    /**
     * 执行添加学生
     *
     * @param student 学生信息
     * @param result
     * @return 返回视图信息
     */
    @RequestMapping("/add")
    public ModelAndView add(Student student, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        //对学生信息进行校验
        ModelAndView check = CheckStudentInfo.check(modelAndView, student);
        //如果没通过了校验 check.getModel().size() > 0满足条件，返回对应的视图信息
        if (check.getModel().size() > 0) {
            check.setViewName("add");
            return check;
        }
        //通过校验，执行添加操作
        studentService.addStudent(student);
        check.setViewName("redirect:findByPage");
        return check;
    }

    /**
     * 分页查找数据
     *
     * @param selectDto 查找信息封装的dto
     * @param result
     * @return
     */
    @RequestMapping("/findByPage")
    public ModelAndView findByPage(SelectDto selectDto, BindingResult result) {
        String _pageNum = selectDto.getPageNum() + "";
        Integer pageNum = 1;
        //如果dto内的页码为空,设置该页码的默认值为1
        if (_pageNum != null && !_pageNum.trim().equals("") && !"null".equals(_pageNum)) {
            pageNum = selectDto.getPageNum();
        }
        selectDto.setPageNum(pageNum);
        //定义默认的提示信息
        String msg = "";

        //dto中的学生姓名不为空，对学生姓名信息进行过滤
        if (selectDto.getStuName() != null && !"".equals(selectDto.getStuName().trim())) {
            selectDto.setStuName(FilterUtil.filterQueryString(selectDto.getStuName()));
        }

        //dto中的学生班级不为空，对学生班级信息进行过滤
        if (selectDto.getStuClass() != null && !"".equals(selectDto.getStuClass().trim())) {
            selectDto.setStuClass(FilterUtil.filterQueryString(selectDto.getStuClass()));
        }

        //后端对页码是否查出范围进行校验
        Integer total = studentService.getTotal(selectDto);
        Integer pageCount = total % Constants.PAGESIZE == 0 ? total / Constants.PAGESIZE : total / Constants.PAGESIZE + 1;
        if (pageCount < selectDto.getPageNum()) {
            msg = "<script type='text/javascript'>alert('页码超出范围，为您显示最后一页')</script>";
            selectDto.setPageNum(pageCount);
        }
        if (selectDto.getPageNum() < 1) {
            msg = "<script type='text/javascript'>alert('页码超出范围，为您显示第一页')</script>";
            selectDto.setPageNum(1);
        }

        //调用服务层，查询出结果
        PageInfo<Student> page = studentService.findByPage(selectDto);
        //对page中的数据进行空值判断，如果为空，给出没有记录的提示信息
        if (page.getList().size() < 1) {
            msg = "<script type='text/javascript'>alert('没有该记录')</script>";
        }

        //执行完删除操作之后，查看是否有删除结果信息，如果存在删除结果信息，返回给前端提示
        if (selectDto.getDelMsg() != null && !"".equals(selectDto.getDelMsg().trim())) {
            msg = "<script type='text/javascript'>alert('" + selectDto.getDelMsg() + "')</script>";
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", msg);
        modelAndView.addObject("page", page);
        modelAndView.addObject("selectDto", selectDto);
        modelAndView.setViewName("/list");
        return modelAndView;
    }

    /**
     * 通过学生id删除学生
     *
     * @param stuId     学生id
     * @param pageNum 当前的页码
     * @return 删除完之后跳转到findByPage
     */
    @RequestMapping("/delByStuId")
    public ModelAndView delByStuId(Integer stuId, Integer pageNum) {
        //先去数据库中查找该条数据是否存在
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.findById(stuId);
        modelAndView.setViewName("redirect:findByPage");
        modelAndView.addObject("pageNum",pageNum);

        if (student != null) {
            //如果存在进行删除
            studentService.delByStuId(student);
        } else {
            //如果不存在，返回该条记录已经被删除的提示信息
            modelAndView.addObject("delMsg","该条记录已经被删除");
        }
        return modelAndView;
    }

    /**
     * 编辑信息之前先通过stuId将该条数据信息查出
     *
     * @param stuId 学生id
     * @return
     */
    @RequestMapping("/edit")
    public ModelAndView edit(Integer stuId) {
        ModelAndView modelAndView = new ModelAndView();
        //首先去查找该条记录
        Student student = studentService.findById(stuId);
        if (student != null) {
            //如果存在该条记录，前往编辑页面
            modelAndView.addObject("student", student);
            modelAndView.setViewName("edit");
        } else {
            //如果不存在该条记录，返回list界面并且给出提示信息
            modelAndView.setViewName("redirect:findByPage");
            modelAndView.addObject("delMsg", "该条记录已经被删除");
        }
        return modelAndView;
    }

    /**
     * 修改学生信息保存
     *
     * @param student 学生信息
     * @return
     */
    @RequestMapping("/doUpdate")
    public ModelAndView doUpdate(Student student) {
        ModelAndView modelAndView = new ModelAndView();
        //对学生信息进行校验
        ModelAndView check = CheckStudentInfo.check(modelAndView, student);
        if (check.getModel().size() > 0) {
            //如果没通过了校验 check.getModel().size() > 0满足条件，返回对应的视图信息
            check.setViewName("edit");
            return check;
        }
        //通过id查出学生
        Student byId = studentService.findById(student.getStuId());
        if (byId != null) {
            //如果存在该条记录，进行信息更新操作
            studentService.update(student);
        } else {
            //如果不存在该条记录，返回list界面并且给出提示信息
            check.addObject("delMsg", "修改失败，该条记录已经被删除");
        }
        check.setViewName("redirect:findByPage");
        return check;
    }

    /**
     * ajax请求校验学生学号是否已经存在
     *
     * @param stuNo 学生学号
     * @return 返回校验的结果
     */
    @RequestMapping("/findByStuNo")
    @ResponseBody
    public Map<String, Boolean> findByStuNo(Integer stuNo) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        //通过学号查找学生记录
        Student student = studentService.findByStuNo(stuNo);
        if (student != null) {
            //如果存在记录，说明该学号已经被占用，返回false
            map.put("status", false);
        } else {
            //如果不存在记录，说明该学号没有被占用，返回true
            map.put("status", true);
        }
        return map;
    }
}

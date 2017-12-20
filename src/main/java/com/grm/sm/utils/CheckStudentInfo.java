package com.grm.sm.utils;

import com.grm.sm.pojo.Student;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用于检测学生信息的工具类
 *
 * @author grm
 */
public class CheckStudentInfo {

    /**
     * 用于controller中校验student的信息
     *
     * @param modelAndView controller中返回的视图
     * @param student      需要校验的student对象
     * @return 返回包含视图信息的model
     */
    public static ModelAndView check(ModelAndView modelAndView, Student student) {
        //对学生姓名信息过滤
        if (student.getStuName() != null && !"".equals(student.getStuName().trim())) {
            String stuName = FilterUtil.filterAddString(student.getStuName());
            student.setStuName(stuName);
        }
        //对学生班级信息过滤
        if (student.getStuClass() != null && !"".equals(student.getStuClass().trim())) {
            String stuClass = FilterUtil.filterAddString(student.getStuClass());
            student.setStuClass(stuClass);
        }

        if (student.getStuTelephone() != null && !"".equals(student.getStuTelephone())) {
            String stuTelephone = FilterUtil.filterAddString(student.getStuTelephone());
            student.setStuTelephone(stuTelephone);
            //输入多个手机号码时,检测每一个手机号是否都满足条件
            String[] stuTelephones = stuTelephone.split(";");
            for (String st : stuTelephones) {
                if (!st.matches("^\\d{11}$")) {
                    //校验失败，重新返回添加页面
                    modelAndView.addObject("stuTelephoneMsg", "电话输入的格式有误");
                    return modelAndView;
                }
            }
        }

        if (student.getStuEmail() != null && !"".equals(student.getStuEmail().trim())) {
            String stuEmail = FilterUtil.filterAddString(student.getStuEmail());
            student.setStuEmail(stuEmail);
            //输入多个邮箱时，校验每一个邮箱是否都满足条件
            String[] stuEmails = stuEmail.split(";");
            for (String se : stuEmails) {
                if (!se.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")) {
                    modelAndView.addObject("stuEmailMsg", "邮箱输入的格式有误");
                    return modelAndView;
                }
            }
        }

        if (student.getStuDescription() != null && !"".equals(student.getStuDescription().trim())) {
            String stuDescription = FilterUtil.filterAddString(student.getStuDescription());
            student.setStuDescription(stuDescription);
        }

        return modelAndView;
    }
}

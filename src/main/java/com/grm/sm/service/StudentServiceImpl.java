package com.grm.sm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grm.sm.dao.StudentMapper;
import com.grm.sm.dto.SelectDto;
import com.grm.sm.pojo.Student;
import com.grm.sm.pojo.StudentExample;
import com.grm.sm.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 业务层接口实现类
 *
 * @author grm
 */
@Service
public class StudentServiceImpl implements StudentService {

    /**
     * 自动注入dao层
     */
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo<Student> findByPage(SelectDto selectDto) {
        //mybatis分页插件进行分页传入页码和页面大小
        PageHelper.startPage(selectDto.getPageNum(), Constants.PAGESIZE);
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        //根据exact的值分别进行模糊查询和精确查询
        if (selectDto.getExact() != null) {
            if (selectDto.getStuName() != null && !"".equals(selectDto.getStuName().trim())) {
                criteria.andStuNameEqualTo(selectDto.getStuName());
            }

            if (selectDto.getStuClass() != null && !"".equals(selectDto.getStuClass().trim())) {
                criteria.andStuClassEqualTo(selectDto.getStuClass());
            }

            if (selectDto.getStuNo() != null) {
                criteria.andStuNoEqualTo(selectDto.getStuNo());
            }

        } else {
            if (selectDto.getStuName() != null && !"".equals(selectDto.getStuName().trim())) {
                criteria.andStuNameLike("%" + selectDto.getStuName() + "%");
            }

            if (selectDto.getStuClass() != null && !"".equals(selectDto.getStuClass().trim())) {
                criteria.andStuClassLike("%" + selectDto.getStuClass() + "%");
            }

            if (selectDto.getStuNo() != null) {
                criteria.andStuNoEqualTo(selectDto.getStuNo());
            }
        }

        List<Student> students = studentMapper.selectByExample(example);
        PageInfo<Student> pageInfo = new PageInfo<Student>(students);
        return pageInfo;
    }

    @Override
    public Student findById(Integer stuId) {
        return studentMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public void addStudent(Student student) {
        Date date = new Date();
        student.setStuCreatedTime(date);
        student.setStuUpdateTime(date);
        studentMapper.insertSelective(student);
    }

    @Override
    public void delByStuId(Student student) {
        studentMapper.deleteByPrimaryKey(student.getStuId());
    }

    @Override
    public void update(Student student) {
        //修改最后更新时间
        Date date = new Date();
        student.setStuUpdateTime(date);
        studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public Integer getTotal(SelectDto selectDto) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();

        if (selectDto.getExact() != null) {
            if (selectDto.getStuName() != null && !"".equals(selectDto.getStuName().trim())) {
                criteria.andStuNameEqualTo(selectDto.getStuName());
            }

            if (selectDto.getStuClass() != null && !"".equals(selectDto.getStuClass().trim())) {
                criteria.andStuClassEqualTo(selectDto.getStuClass());
            }

            if (selectDto.getStuNo() != null) {
                criteria.andStuNoEqualTo(selectDto.getStuNo());
            }

        } else {
            if (selectDto.getStuName() != null && !"".equals(selectDto.getStuName().trim())) {
                criteria.andStuNameLike("%" + selectDto.getStuName() + "%");
            }

            if (selectDto.getStuClass() != null && !"".equals(selectDto.getStuClass().trim())) {
                criteria.andStuClassLike("%" + selectDto.getStuClass() + "%");
            }

            if (selectDto.getStuNo() != null) {
                criteria.andStuNoEqualTo(selectDto.getStuNo());
            }
        }
        //根据查询条件，查询出有多少条记录
        int count = studentMapper.countByExample(example);
        return count;
    }

    @Override
    public Student findByStuNo(Integer stuNo) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuNoEqualTo(stuNo);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if (students.size() > 0) {
            return students.get(0);
        } else {
            return null;
        }
    }
}

package com.grm.sm.service;


import com.github.pagehelper.PageInfo;
import com.grm.sm.dto.SelectDto;
import com.grm.sm.pojo.Student;

/**
 * 业务层接口
 *
 * @author grm
 */
public interface StudentService {
    /**
     * 分页查找学生，并且将结果封装成PageInfo类
     *
     * @param selectDto 查询条件封装的dto
     * @return 返回封装结果PageInfo类
     */
    PageInfo<Student> findByPage(SelectDto selectDto);

    /**
     * 通过学生id查找学生
     *
     * @param stuId 学生的id
     * @return 返回通过学生id查询到的student对象
     */
    Student findById(Integer stuId);

    /**
     * 添加学生
     *
     * @param student 需要添加的学生对象
     */
    void addStudent(Student student);

    /**
     * 根据学生id删除学生
     *
     * @param student 需要删除的学生对象
     */
    void delByStuId(Student student);

    /**
     * 更新学生信息
     *
     * @param student 需要更新的学生对象
     */
    void update(Student student);

    /**
     * 分页时，通过查询条件查询到的总记录条数
     *
     * @param selectDto 查询条件封装的dto
     * @return 返回查询结果为总记录条数
     */
    Integer getTotal(SelectDto selectDto);

    /**
     * 根据学生学号查询学生信息
     *
     * @param stuNo 需要查询的学生学号
     * @return 返回根据学生学号查询到的学生对象
     */
    Student findByStuNo(Integer stuNo);

}

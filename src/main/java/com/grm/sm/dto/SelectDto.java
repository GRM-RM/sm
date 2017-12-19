package com.grm.sm.dto;

/**
 *
 * 根据查询条件封装的dto
 * @author grm
 */
public class SelectDto {
    /**学生姓名*/
    private String stuName;
    /**学生所在班级*/
    private String stuClass;
    /**学生学号*/
    private Integer stuNo;
    /**查询的页码*/
    private Integer pageNum;
    /**是否精确查找。值为空时,根据学生姓名和学生班级进行模糊查询,否则进行精确查询*/
    private Integer exact;
    /**进行删除操作后的结果信息*/
    private String delMsg;


    public SelectDto() {
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getExact() {
        return exact;
    }

    public void setExact(Integer exact) {
        this.exact = exact;
    }

    public String getDelMsg() {
        return delMsg;
    }

    public void setDelMsg(String delMsg) {
        this.delMsg = delMsg;
    }
}

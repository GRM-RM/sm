package com.grm.sm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeIsNull() {
            addCriterion("stu_created_time is null");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeIsNotNull() {
            addCriterion("stu_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeEqualTo(Date value) {
            addCriterion("stu_created_time =", value, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeNotEqualTo(Date value) {
            addCriterion("stu_created_time <>", value, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeGreaterThan(Date value) {
            addCriterion("stu_created_time >", value, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_created_time >=", value, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeLessThan(Date value) {
            addCriterion("stu_created_time <", value, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_created_time <=", value, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeIn(List<Date> values) {
            addCriterion("stu_created_time in", values, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeNotIn(List<Date> values) {
            addCriterion("stu_created_time not in", values, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("stu_created_time between", value1, value2, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_created_time not between", value1, value2, "stuCreatedTime");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionIsNull() {
            addCriterion("stu_description is null");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionIsNotNull() {
            addCriterion("stu_description is not null");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionEqualTo(String value) {
            addCriterion("stu_description =", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionNotEqualTo(String value) {
            addCriterion("stu_description <>", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionGreaterThan(String value) {
            addCriterion("stu_description >", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("stu_description >=", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionLessThan(String value) {
            addCriterion("stu_description <", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionLessThanOrEqualTo(String value) {
            addCriterion("stu_description <=", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionLike(String value) {
            addCriterion("stu_description like", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionNotLike(String value) {
            addCriterion("stu_description not like", value, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionIn(List<String> values) {
            addCriterion("stu_description in", values, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionNotIn(List<String> values) {
            addCriterion("stu_description not in", values, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionBetween(String value1, String value2) {
            addCriterion("stu_description between", value1, value2, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuDescriptionNotBetween(String value1, String value2) {
            addCriterion("stu_description not between", value1, value2, "stuDescription");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIsNull() {
            addCriterion("stu_idcard is null");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIsNotNull() {
            addCriterion("stu_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdcardEqualTo(String value) {
            addCriterion("stu_idcard =", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotEqualTo(String value) {
            addCriterion("stu_idcard <>", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardGreaterThan(String value) {
            addCriterion("stu_idcard >", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("stu_idcard >=", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLessThan(String value) {
            addCriterion("stu_idcard <", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLessThanOrEqualTo(String value) {
            addCriterion("stu_idcard <=", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLike(String value) {
            addCriterion("stu_idcard like", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotLike(String value) {
            addCriterion("stu_idcard not like", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIn(List<String> values) {
            addCriterion("stu_idcard in", values, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotIn(List<String> values) {
            addCriterion("stu_idcard not in", values, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardBetween(String value1, String value2) {
            addCriterion("stu_idcard between", value1, value2, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotBetween(String value1, String value2) {
            addCriterion("stu_idcard not between", value1, value2, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNull() {
            addCriterion("stu_no is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("stu_no is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(Integer value) {
            addCriterion("stu_no =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(Integer value) {
            addCriterion("stu_no <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(Integer value) {
            addCriterion("stu_no >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_no >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(Integer value) {
            addCriterion("stu_no <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("stu_no <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<Integer> values) {
            addCriterion("stu_no in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<Integer> values) {
            addCriterion("stu_no not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(Integer value1, Integer value2) {
            addCriterion("stu_no between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_no not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(Integer value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(Integer value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(Integer value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(Integer value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(Integer value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<Integer> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<Integer> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(Integer value1, Integer value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(Integer value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(Integer value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(Integer value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(Integer value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<Integer> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<Integer> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(Integer value1, Integer value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneIsNull() {
            addCriterion("stu_telephone is null");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneIsNotNull() {
            addCriterion("stu_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneEqualTo(String value) {
            addCriterion("stu_telephone =", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneNotEqualTo(String value) {
            addCriterion("stu_telephone <>", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneGreaterThan(String value) {
            addCriterion("stu_telephone >", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_telephone >=", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneLessThan(String value) {
            addCriterion("stu_telephone <", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneLessThanOrEqualTo(String value) {
            addCriterion("stu_telephone <=", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneLike(String value) {
            addCriterion("stu_telephone like", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneNotLike(String value) {
            addCriterion("stu_telephone not like", value, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneIn(List<String> values) {
            addCriterion("stu_telephone in", values, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneNotIn(List<String> values) {
            addCriterion("stu_telephone not in", values, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneBetween(String value1, String value2) {
            addCriterion("stu_telephone between", value1, value2, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuTelephoneNotBetween(String value1, String value2) {
            addCriterion("stu_telephone not between", value1, value2, "stuTelephone");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeIsNull() {
            addCriterion("stu_update_time is null");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeIsNotNull() {
            addCriterion("stu_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeEqualTo(Date value) {
            addCriterion("stu_update_time =", value, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeNotEqualTo(Date value) {
            addCriterion("stu_update_time <>", value, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeGreaterThan(Date value) {
            addCriterion("stu_update_time >", value, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_update_time >=", value, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeLessThan(Date value) {
            addCriterion("stu_update_time <", value, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_update_time <=", value, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeIn(List<Date> values) {
            addCriterion("stu_update_time in", values, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeNotIn(List<Date> values) {
            addCriterion("stu_update_time not in", values, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("stu_update_time between", value1, value2, "stuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStuUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_update_time not between", value1, value2, "stuUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.fourbears.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtTagExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRegIsNull() {
            addCriterion("reg is null");
            return (Criteria) this;
        }

        public Criteria andRegIsNotNull() {
            addCriterion("reg is not null");
            return (Criteria) this;
        }

        public Criteria andRegEqualTo(String value) {
            addCriterion("reg =", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotEqualTo(String value) {
            addCriterion("reg <>", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegGreaterThan(String value) {
            addCriterion("reg >", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegGreaterThanOrEqualTo(String value) {
            addCriterion("reg >=", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLessThan(String value) {
            addCriterion("reg <", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLessThanOrEqualTo(String value) {
            addCriterion("reg <=", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLike(String value) {
            addCriterion("reg like", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotLike(String value) {
            addCriterion("reg not like", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegIn(List<String> values) {
            addCriterion("reg in", values, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotIn(List<String> values) {
            addCriterion("reg not in", values, "reg");
            return (Criteria) this;
        }

        public Criteria andRegBetween(String value1, String value2) {
            addCriterion("reg between", value1, value2, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotBetween(String value1, String value2) {
            addCriterion("reg not between", value1, value2, "reg");
            return (Criteria) this;
        }

        public Criteria andReg1IsNull() {
            addCriterion("reg1 is null");
            return (Criteria) this;
        }

        public Criteria andReg1IsNotNull() {
            addCriterion("reg1 is not null");
            return (Criteria) this;
        }

        public Criteria andReg1EqualTo(String value) {
            addCriterion("reg1 =", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1NotEqualTo(String value) {
            addCriterion("reg1 <>", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1GreaterThan(String value) {
            addCriterion("reg1 >", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1GreaterThanOrEqualTo(String value) {
            addCriterion("reg1 >=", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1LessThan(String value) {
            addCriterion("reg1 <", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1LessThanOrEqualTo(String value) {
            addCriterion("reg1 <=", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1Like(String value) {
            addCriterion("reg1 like", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1NotLike(String value) {
            addCriterion("reg1 not like", value, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1In(List<String> values) {
            addCriterion("reg1 in", values, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1NotIn(List<String> values) {
            addCriterion("reg1 not in", values, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1Between(String value1, String value2) {
            addCriterion("reg1 between", value1, value2, "reg1");
            return (Criteria) this;
        }

        public Criteria andReg1NotBetween(String value1, String value2) {
            addCriterion("reg1 not between", value1, value2, "reg1");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTagModelIsNull() {
            addCriterion("tag_model is null");
            return (Criteria) this;
        }

        public Criteria andTagModelIsNotNull() {
            addCriterion("tag_model is not null");
            return (Criteria) this;
        }

        public Criteria andTagModelEqualTo(Integer value) {
            addCriterion("tag_model =", value, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelNotEqualTo(Integer value) {
            addCriterion("tag_model <>", value, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelGreaterThan(Integer value) {
            addCriterion("tag_model >", value, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_model >=", value, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelLessThan(Integer value) {
            addCriterion("tag_model <", value, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelLessThanOrEqualTo(Integer value) {
            addCriterion("tag_model <=", value, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelIn(List<Integer> values) {
            addCriterion("tag_model in", values, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelNotIn(List<Integer> values) {
            addCriterion("tag_model not in", values, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelBetween(Integer value1, Integer value2) {
            addCriterion("tag_model between", value1, value2, "tagModel");
            return (Criteria) this;
        }

        public Criteria andTagModelNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_model not between", value1, value2, "tagModel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusIsNull() {
            addCriterion("oprea_status is null");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusIsNotNull() {
            addCriterion("oprea_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusEqualTo(Integer value) {
            addCriterion("oprea_status =", value, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusNotEqualTo(Integer value) {
            addCriterion("oprea_status <>", value, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusGreaterThan(Integer value) {
            addCriterion("oprea_status >", value, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oprea_status >=", value, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusLessThan(Integer value) {
            addCriterion("oprea_status <", value, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oprea_status <=", value, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusIn(List<Integer> values) {
            addCriterion("oprea_status in", values, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusNotIn(List<Integer> values) {
            addCriterion("oprea_status not in", values, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusBetween(Integer value1, Integer value2) {
            addCriterion("oprea_status between", value1, value2, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andOpreaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oprea_status not between", value1, value2, "opreaStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNull() {
            addCriterion("run_status is null");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNotNull() {
            addCriterion("run_status is not null");
            return (Criteria) this;
        }

        public Criteria andRunStatusEqualTo(Integer value) {
            addCriterion("run_status =", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotEqualTo(Integer value) {
            addCriterion("run_status <>", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThan(Integer value) {
            addCriterion("run_status >", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_status >=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThan(Integer value) {
            addCriterion("run_status <", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThanOrEqualTo(Integer value) {
            addCriterion("run_status <=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusIn(List<Integer> values) {
            addCriterion("run_status in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotIn(List<Integer> values) {
            addCriterion("run_status not in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusBetween(Integer value1, Integer value2) {
            addCriterion("run_status between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("run_status not between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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
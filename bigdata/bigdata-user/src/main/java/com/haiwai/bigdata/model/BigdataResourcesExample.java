package com.haiwai.bigdata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BigdataResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigdataResourcesExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeIsNull() {
            addCriterion("resources_code is null");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeIsNotNull() {
            addCriterion("resources_code is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeEqualTo(Integer value) {
            addCriterion("resources_code =", value, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeNotEqualTo(Integer value) {
            addCriterion("resources_code <>", value, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeGreaterThan(Integer value) {
            addCriterion("resources_code >", value, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resources_code >=", value, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeLessThan(Integer value) {
            addCriterion("resources_code <", value, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeLessThanOrEqualTo(Integer value) {
            addCriterion("resources_code <=", value, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeIn(List<Integer> values) {
            addCriterion("resources_code in", values, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeNotIn(List<Integer> values) {
            addCriterion("resources_code not in", values, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeBetween(Integer value1, Integer value2) {
            addCriterion("resources_code between", value1, value2, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("resources_code not between", value1, value2, "resourcesCode");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIsNull() {
            addCriterion("resources_name is null");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIsNotNull() {
            addCriterion("resources_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesNameEqualTo(String value) {
            addCriterion("resources_name =", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotEqualTo(String value) {
            addCriterion("resources_name <>", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameGreaterThan(String value) {
            addCriterion("resources_name >", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameGreaterThanOrEqualTo(String value) {
            addCriterion("resources_name >=", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLessThan(String value) {
            addCriterion("resources_name <", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLessThanOrEqualTo(String value) {
            addCriterion("resources_name <=", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLike(String value) {
            addCriterion("resources_name like", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotLike(String value) {
            addCriterion("resources_name not like", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIn(List<String> values) {
            addCriterion("resources_name in", values, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotIn(List<String> values) {
            addCriterion("resources_name not in", values, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameBetween(String value1, String value2) {
            addCriterion("resources_name between", value1, value2, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotBetween(String value1, String value2) {
            addCriterion("resources_name not between", value1, value2, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesDescIsNull() {
            addCriterion("resources_desc is null");
            return (Criteria) this;
        }

        public Criteria andResourcesDescIsNotNull() {
            addCriterion("resources_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesDescEqualTo(String value) {
            addCriterion("resources_desc =", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescNotEqualTo(String value) {
            addCriterion("resources_desc <>", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescGreaterThan(String value) {
            addCriterion("resources_desc >", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescGreaterThanOrEqualTo(String value) {
            addCriterion("resources_desc >=", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescLessThan(String value) {
            addCriterion("resources_desc <", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescLessThanOrEqualTo(String value) {
            addCriterion("resources_desc <=", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescLike(String value) {
            addCriterion("resources_desc like", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescNotLike(String value) {
            addCriterion("resources_desc not like", value, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescIn(List<String> values) {
            addCriterion("resources_desc in", values, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescNotIn(List<String> values) {
            addCriterion("resources_desc not in", values, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescBetween(String value1, String value2) {
            addCriterion("resources_desc between", value1, value2, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andResourcesDescNotBetween(String value1, String value2) {
            addCriterion("resources_desc not between", value1, value2, "resourcesDesc");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUrlNumIsNull() {
            addCriterion("url_num is null");
            return (Criteria) this;
        }

        public Criteria andUrlNumIsNotNull() {
            addCriterion("url_num is not null");
            return (Criteria) this;
        }

        public Criteria andUrlNumEqualTo(Integer value) {
            addCriterion("url_num =", value, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumNotEqualTo(Integer value) {
            addCriterion("url_num <>", value, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumGreaterThan(Integer value) {
            addCriterion("url_num >", value, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("url_num >=", value, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumLessThan(Integer value) {
            addCriterion("url_num <", value, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumLessThanOrEqualTo(Integer value) {
            addCriterion("url_num <=", value, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumIn(List<Integer> values) {
            addCriterion("url_num in", values, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumNotIn(List<Integer> values) {
            addCriterion("url_num not in", values, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumBetween(Integer value1, Integer value2) {
            addCriterion("url_num between", value1, value2, "urlNum");
            return (Criteria) this;
        }

        public Criteria andUrlNumNotBetween(Integer value1, Integer value2) {
            addCriterion("url_num not between", value1, value2, "urlNum");
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
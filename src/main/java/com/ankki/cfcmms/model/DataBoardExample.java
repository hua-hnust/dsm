package com.ankki.cfcmms.model;

import java.util.ArrayList;
import java.util.List;

public class DataBoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataBoardExample() {
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

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(Integer value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(Integer value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(Integer value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(Integer value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(Integer value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<Integer> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<Integer> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(Integer value1, Integer value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdIsNull() {
            addCriterion("db_config_id is null");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdIsNotNull() {
            addCriterion("db_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdEqualTo(Integer value) {
            addCriterion("db_config_id =", value, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdNotEqualTo(Integer value) {
            addCriterion("db_config_id <>", value, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdGreaterThan(Integer value) {
            addCriterion("db_config_id >", value, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("db_config_id >=", value, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdLessThan(Integer value) {
            addCriterion("db_config_id <", value, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("db_config_id <=", value, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdIn(List<Integer> values) {
            addCriterion("db_config_id in", values, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdNotIn(List<Integer> values) {
            addCriterion("db_config_id not in", values, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("db_config_id between", value1, value2, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDbConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("db_config_id not between", value1, value2, "dbConfigId");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameIsNull() {
            addCriterion("data_board_name is null");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameIsNotNull() {
            addCriterion("data_board_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameEqualTo(String value) {
            addCriterion("data_board_name =", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameNotEqualTo(String value) {
            addCriterion("data_board_name <>", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameGreaterThan(String value) {
            addCriterion("data_board_name >", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_board_name >=", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameLessThan(String value) {
            addCriterion("data_board_name <", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameLessThanOrEqualTo(String value) {
            addCriterion("data_board_name <=", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameLike(String value) {
            addCriterion("data_board_name like", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameNotLike(String value) {
            addCriterion("data_board_name not like", value, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameIn(List<String> values) {
            addCriterion("data_board_name in", values, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameNotIn(List<String> values) {
            addCriterion("data_board_name not in", values, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameBetween(String value1, String value2) {
            addCriterion("data_board_name between", value1, value2, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardNameNotBetween(String value1, String value2) {
            addCriterion("data_board_name not between", value1, value2, "dataBoardName");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueIsNull() {
            addCriterion("data_board_value is null");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueIsNotNull() {
            addCriterion("data_board_value is not null");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueEqualTo(String value) {
            addCriterion("data_board_value =", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueNotEqualTo(String value) {
            addCriterion("data_board_value <>", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueGreaterThan(String value) {
            addCriterion("data_board_value >", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueGreaterThanOrEqualTo(String value) {
            addCriterion("data_board_value >=", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueLessThan(String value) {
            addCriterion("data_board_value <", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueLessThanOrEqualTo(String value) {
            addCriterion("data_board_value <=", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueLike(String value) {
            addCriterion("data_board_value like", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueNotLike(String value) {
            addCriterion("data_board_value not like", value, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueIn(List<String> values) {
            addCriterion("data_board_value in", values, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueNotIn(List<String> values) {
            addCriterion("data_board_value not in", values, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueBetween(String value1, String value2) {
            addCriterion("data_board_value between", value1, value2, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardValueNotBetween(String value1, String value2) {
            addCriterion("data_board_value not between", value1, value2, "dataBoardValue");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeIsNull() {
            addCriterion("data_board_time is null");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeIsNotNull() {
            addCriterion("data_board_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeEqualTo(Long value) {
            addCriterion("data_board_time =", value, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeNotEqualTo(Long value) {
            addCriterion("data_board_time <>", value, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeGreaterThan(Long value) {
            addCriterion("data_board_time >", value, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("data_board_time >=", value, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeLessThan(Long value) {
            addCriterion("data_board_time <", value, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeLessThanOrEqualTo(Long value) {
            addCriterion("data_board_time <=", value, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeIn(List<Long> values) {
            addCriterion("data_board_time in", values, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeNotIn(List<Long> values) {
            addCriterion("data_board_time not in", values, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeBetween(Long value1, Long value2) {
            addCriterion("data_board_time between", value1, value2, "dataBoardTime");
            return (Criteria) this;
        }

        public Criteria andDataBoardTimeNotBetween(Long value1, Long value2) {
            addCriterion("data_board_time not between", value1, value2, "dataBoardTime");
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
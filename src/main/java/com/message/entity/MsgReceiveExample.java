package com.message.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgReceiveExample() {
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

        public Criteria andReceiveIdIsNull() {
            addCriterion("RECEIVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIsNotNull() {
            addCriterion("RECEIVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdEqualTo(String value) {
            addCriterion("RECEIVE_ID =", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotEqualTo(String value) {
            addCriterion("RECEIVE_ID <>", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThan(String value) {
            addCriterion("RECEIVE_ID >", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ID >=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThan(String value) {
            addCriterion("RECEIVE_ID <", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ID <=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLike(String value) {
            addCriterion("RECEIVE_ID like", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotLike(String value) {
            addCriterion("RECEIVE_ID not like", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIn(List<String> values) {
            addCriterion("RECEIVE_ID in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotIn(List<String> values) {
            addCriterion("RECEIVE_ID not in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdBetween(String value1, String value2) {
            addCriterion("RECEIVE_ID between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_ID not between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNull() {
            addCriterion("SMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNotNull() {
            addCriterion("SMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSmsIdEqualTo(String value) {
            addCriterion("SMS_ID =", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotEqualTo(String value) {
            addCriterion("SMS_ID <>", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThan(String value) {
            addCriterion("SMS_ID >", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_ID >=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThan(String value) {
            addCriterion("SMS_ID <", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThanOrEqualTo(String value) {
            addCriterion("SMS_ID <=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLike(String value) {
            addCriterion("SMS_ID like", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotLike(String value) {
            addCriterion("SMS_ID not like", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIn(List<String> values) {
            addCriterion("SMS_ID in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotIn(List<String> values) {
            addCriterion("SMS_ID not in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdBetween(String value1, String value2) {
            addCriterion("SMS_ID between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotBetween(String value1, String value2) {
            addCriterion("SMS_ID not between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andNormalStateIsNull() {
            addCriterion("NORMAL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNormalStateIsNotNull() {
            addCriterion("NORMAL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNormalStateEqualTo(Short value) {
            addCriterion("NORMAL_STATE =", value, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateNotEqualTo(Short value) {
            addCriterion("NORMAL_STATE <>", value, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateGreaterThan(Short value) {
            addCriterion("NORMAL_STATE >", value, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateGreaterThanOrEqualTo(Short value) {
            addCriterion("NORMAL_STATE >=", value, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateLessThan(Short value) {
            addCriterion("NORMAL_STATE <", value, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateLessThanOrEqualTo(Short value) {
            addCriterion("NORMAL_STATE <=", value, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateIn(List<Short> values) {
            addCriterion("NORMAL_STATE in", values, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateNotIn(List<Short> values) {
            addCriterion("NORMAL_STATE not in", values, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateBetween(Short value1, Short value2) {
            addCriterion("NORMAL_STATE between", value1, value2, "normalState");
            return (Criteria) this;
        }

        public Criteria andNormalStateNotBetween(Short value1, Short value2) {
            addCriterion("NORMAL_STATE not between", value1, value2, "normalState");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNull() {
            addCriterion("RECEIVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNotNull() {
            addCriterion("RECEIVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeEqualTo(Short value) {
            addCriterion("RECEIVE_TYPE =", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotEqualTo(Short value) {
            addCriterion("RECEIVE_TYPE <>", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThan(Short value) {
            addCriterion("RECEIVE_TYPE >", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("RECEIVE_TYPE >=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThan(Short value) {
            addCriterion("RECEIVE_TYPE <", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThanOrEqualTo(Short value) {
            addCriterion("RECEIVE_TYPE <=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIn(List<Short> values) {
            addCriterion("RECEIVE_TYPE in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotIn(List<Short> values) {
            addCriterion("RECEIVE_TYPE not in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeBetween(Short value1, Short value2) {
            addCriterion("RECEIVE_TYPE between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotBetween(Short value1, Short value2) {
            addCriterion("RECEIVE_TYPE not between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andSmsOrderIsNull() {
            addCriterion("SMS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSmsOrderIsNotNull() {
            addCriterion("SMS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSmsOrderEqualTo(Short value) {
            addCriterion("SMS_ORDER =", value, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderNotEqualTo(Short value) {
            addCriterion("SMS_ORDER <>", value, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderGreaterThan(Short value) {
            addCriterion("SMS_ORDER >", value, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("SMS_ORDER >=", value, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderLessThan(Short value) {
            addCriterion("SMS_ORDER <", value, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderLessThanOrEqualTo(Short value) {
            addCriterion("SMS_ORDER <=", value, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderIn(List<Short> values) {
            addCriterion("SMS_ORDER in", values, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderNotIn(List<Short> values) {
            addCriterion("SMS_ORDER not in", values, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderBetween(Short value1, Short value2) {
            addCriterion("SMS_ORDER between", value1, value2, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsOrderNotBetween(Short value1, Short value2) {
            addCriterion("SMS_ORDER not between", value1, value2, "smsOrder");
            return (Criteria) this;
        }

        public Criteria andSmsTimeIsNull() {
            addCriterion("SMS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSmsTimeIsNotNull() {
            addCriterion("SMS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSmsTimeEqualTo(Date value) {
            addCriterion("SMS_TIME =", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeNotEqualTo(Date value) {
            addCriterion("SMS_TIME <>", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeGreaterThan(Date value) {
            addCriterion("SMS_TIME >", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SMS_TIME >=", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeLessThan(Date value) {
            addCriterion("SMS_TIME <", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeLessThanOrEqualTo(Date value) {
            addCriterion("SMS_TIME <=", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeIn(List<Date> values) {
            addCriterion("SMS_TIME in", values, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeNotIn(List<Date> values) {
            addCriterion("SMS_TIME not in", values, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeBetween(Date value1, Date value2) {
            addCriterion("SMS_TIME between", value1, value2, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeNotBetween(Date value1, Date value2) {
            addCriterion("SMS_TIME not between", value1, value2, "smsTime");
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
package com.message.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TabMsgTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TabMsgTemplateExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("TEMPLATE_ID like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("TEMPLATE_ID not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("TEMPLATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("TEMPLATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("TEMPLATE_NAME =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("TEMPLATE_NAME <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("TEMPLATE_NAME >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_NAME >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("TEMPLATE_NAME <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_NAME <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("TEMPLATE_NAME like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("TEMPLATE_NAME not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("TEMPLATE_NAME in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("TEMPLATE_NAME not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_NAME between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_NAME not between", value1, value2, "templateName");
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

        public Criteria andEnableIsNull() {
            addCriterion("ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Short value) {
            addCriterion("ENABLE =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Short value) {
            addCriterion("ENABLE <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Short value) {
            addCriterion("ENABLE >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLE >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Short value) {
            addCriterion("ENABLE <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Short value) {
            addCriterion("ENABLE <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Short> values) {
            addCriterion("ENABLE in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Short> values) {
            addCriterion("ENABLE not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Short value1, Short value2) {
            addCriterion("ENABLE between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Short value1, Short value2) {
            addCriterion("ENABLE not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveIsNull() {
            addCriterion("NORMAL_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveIsNotNull() {
            addCriterion("NORMAL_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveEqualTo(String value) {
            addCriterion("NORMAL_RECEIVE =", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveNotEqualTo(String value) {
            addCriterion("NORMAL_RECEIVE <>", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveGreaterThan(String value) {
            addCriterion("NORMAL_RECEIVE >", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("NORMAL_RECEIVE >=", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveLessThan(String value) {
            addCriterion("NORMAL_RECEIVE <", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveLessThanOrEqualTo(String value) {
            addCriterion("NORMAL_RECEIVE <=", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveLike(String value) {
            addCriterion("NORMAL_RECEIVE like", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveNotLike(String value) {
            addCriterion("NORMAL_RECEIVE not like", value, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveIn(List<String> values) {
            addCriterion("NORMAL_RECEIVE in", values, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveNotIn(List<String> values) {
            addCriterion("NORMAL_RECEIVE not in", values, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveBetween(String value1, String value2) {
            addCriterion("NORMAL_RECEIVE between", value1, value2, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andNormalReceiveNotBetween(String value1, String value2) {
            addCriterion("NORMAL_RECEIVE not between", value1, value2, "normalReceive");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNull() {
            addCriterion("OPERATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("OPERATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(String value) {
            addCriterion("OPERATION_ID =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(String value) {
            addCriterion("OPERATION_ID <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(String value) {
            addCriterion("OPERATION_ID >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_ID >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(String value) {
            addCriterion("OPERATION_ID <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_ID <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLike(String value) {
            addCriterion("OPERATION_ID like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotLike(String value) {
            addCriterion("OPERATION_ID not like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<String> values) {
            addCriterion("OPERATION_ID in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<String> values) {
            addCriterion("OPERATION_ID not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(String value1, String value2) {
            addCriterion("OPERATION_ID between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(String value1, String value2) {
            addCriterion("OPERATION_ID not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("OPERATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("OPERATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("OPERATION_NAME =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("OPERATION_NAME <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("OPERATION_NAME >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_NAME >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("OPERATION_NAME <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_NAME <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("OPERATION_NAME like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("OPERATION_NAME not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("OPERATION_NAME in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("OPERATION_NAME not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("OPERATION_NAME between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("OPERATION_NAME not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("OPERATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("OPERATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("OPERATION_TIME =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("OPERATION_TIME <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("OPERATION_TIME >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATION_TIME >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("OPERATION_TIME <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATION_TIME <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("OPERATION_TIME in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("OPERATION_TIME not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATION_TIME between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATION_TIME not between", value1, value2, "operationTime");
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
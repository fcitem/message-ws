package com.message.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefreshRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefreshRecordExample() {
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

        public Criteria andBusinessNoIsNull() {
            addCriterion("BUSINESS_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIsNotNull() {
            addCriterion("BUSINESS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoEqualTo(String value) {
            addCriterion("BUSINESS_NO =", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotEqualTo(String value) {
            addCriterion("BUSINESS_NO <>", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoGreaterThan(String value) {
            addCriterion("BUSINESS_NO >", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_NO >=", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLessThan(String value) {
            addCriterion("BUSINESS_NO <", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_NO <=", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLike(String value) {
            addCriterion("BUSINESS_NO like", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotLike(String value) {
            addCriterion("BUSINESS_NO not like", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIn(List<String> values) {
            addCriterion("BUSINESS_NO in", values, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotIn(List<String> values) {
            addCriterion("BUSINESS_NO not in", values, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoBetween(String value1, String value2) {
            addCriterion("BUSINESS_NO between", value1, value2, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_NO not between", value1, value2, "businessNo");
            return (Criteria) this;
        }

        public Criteria andExtcodeIsNull() {
            addCriterion("EXTCODE is null");
            return (Criteria) this;
        }

        public Criteria andExtcodeIsNotNull() {
            addCriterion("EXTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andExtcodeEqualTo(String value) {
            addCriterion("EXTCODE =", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotEqualTo(String value) {
            addCriterion("EXTCODE <>", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeGreaterThan(String value) {
            addCriterion("EXTCODE >", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXTCODE >=", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeLessThan(String value) {
            addCriterion("EXTCODE <", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeLessThanOrEqualTo(String value) {
            addCriterion("EXTCODE <=", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeLike(String value) {
            addCriterion("EXTCODE like", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotLike(String value) {
            addCriterion("EXTCODE not like", value, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeIn(List<String> values) {
            addCriterion("EXTCODE in", values, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotIn(List<String> values) {
            addCriterion("EXTCODE not in", values, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeBetween(String value1, String value2) {
            addCriterion("EXTCODE between", value1, value2, "extcode");
            return (Criteria) this;
        }

        public Criteria andExtcodeNotBetween(String value1, String value2) {
            addCriterion("EXTCODE not between", value1, value2, "extcode");
            return (Criteria) this;
        }

        public Criteria andRksjcIsNull() {
            addCriterion("RKSJC is null");
            return (Criteria) this;
        }

        public Criteria andRksjcIsNotNull() {
            addCriterion("RKSJC is not null");
            return (Criteria) this;
        }

        public Criteria andRksjcEqualTo(Date value) {
            addCriterion("RKSJC =", value, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcNotEqualTo(Date value) {
            addCriterion("RKSJC <>", value, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcGreaterThan(Date value) {
            addCriterion("RKSJC >", value, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcGreaterThanOrEqualTo(Date value) {
            addCriterion("RKSJC >=", value, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcLessThan(Date value) {
            addCriterion("RKSJC <", value, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcLessThanOrEqualTo(Date value) {
            addCriterion("RKSJC <=", value, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcIn(List<Date> values) {
            addCriterion("RKSJC in", values, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcNotIn(List<Date> values) {
            addCriterion("RKSJC not in", values, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcBetween(Date value1, Date value2) {
            addCriterion("RKSJC between", value1, value2, "rksjc");
            return (Criteria) this;
        }

        public Criteria andRksjcNotBetween(Date value1, Date value2) {
            addCriterion("RKSJC not between", value1, value2, "rksjc");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("PHONENO is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("PHONENO is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(String value) {
            addCriterion("PHONENO =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(String value) {
            addCriterion("PHONENO <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(String value) {
            addCriterion("PHONENO >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONENO >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(String value) {
            addCriterion("PHONENO <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(String value) {
            addCriterion("PHONENO <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLike(String value) {
            addCriterion("PHONENO like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotLike(String value) {
            addCriterion("PHONENO not like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<String> values) {
            addCriterion("PHONENO in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<String> values) {
            addCriterion("PHONENO not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(String value1, String value2) {
            addCriterion("PHONENO between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(String value1, String value2) {
            addCriterion("PHONENO not between", value1, value2, "phoneno");
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
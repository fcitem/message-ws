package com.message.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TabMsgBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TabMsgBackExample() {
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

        public Criteria andContactsIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("CONTACTS =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("CONTACTS <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("CONTACTS like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("CONTACTS not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("CONTACTS in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("CONTACTS_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("CONTACTS_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("CONTACTS_PHONE =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("CONTACTS_PHONE <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("CONTACTS_PHONE >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS_PHONE >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("CONTACTS_PHONE <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS_PHONE <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("CONTACTS_PHONE like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("CONTACTS_PHONE not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("CONTACTS_PHONE in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("CONTACTS_PHONE not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("CONTACTS_PHONE between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACTS_PHONE not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("SPONSOR is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("SPONSOR is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("SPONSOR =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("SPONSOR <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("SPONSOR >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("SPONSOR >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("SPONSOR <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("SPONSOR <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("SPONSOR like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("SPONSOR not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("SPONSOR in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("SPONSOR not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("SPONSOR between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("SPONSOR not between", value1, value2, "sponsor");
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

        public Criteria andSmsStateIsNull() {
            addCriterion("SMS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSmsStateIsNotNull() {
            addCriterion("SMS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsStateEqualTo(Short value) {
            addCriterion("SMS_STATE =", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateNotEqualTo(Short value) {
            addCriterion("SMS_STATE <>", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateGreaterThan(Short value) {
            addCriterion("SMS_STATE >", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateGreaterThanOrEqualTo(Short value) {
            addCriterion("SMS_STATE >=", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateLessThan(Short value) {
            addCriterion("SMS_STATE <", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateLessThanOrEqualTo(Short value) {
            addCriterion("SMS_STATE <=", value, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateIn(List<Short> values) {
            addCriterion("SMS_STATE in", values, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateNotIn(List<Short> values) {
            addCriterion("SMS_STATE not in", values, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateBetween(Short value1, Short value2) {
            addCriterion("SMS_STATE between", value1, value2, "smsState");
            return (Criteria) this;
        }

        public Criteria andSmsStateNotBetween(Short value1, Short value2) {
            addCriterion("SMS_STATE not between", value1, value2, "smsState");
            return (Criteria) this;
        }
        //smsType
        public Criteria andSmsTypeIsNull() {
            addCriterion("SMS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSmsTypeIsNotNull() {
            addCriterion("SMS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsTypeEqualTo(Short value) {
            addCriterion("SMS_TYPE =", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotEqualTo(Short value) {
            addCriterion("SMS_TYPE <>", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeGreaterThan(Short value) {
            addCriterion("SMS_TYPE >", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SMS_TYPE >=", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeLessThan(Short value) {
            addCriterion("SMS_TYPE <", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeLessThanOrEqualTo(Short value) {
            addCriterion("SMS_TYPE <=", value, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeIn(List<Short> values) {
            addCriterion("SMS_TYPE in", values, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotIn(List<Short> values) {
            addCriterion("SMS_TYPE not in", values, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeBetween(Short value1, Short value2) {
            addCriterion("SMS_TYPE between", value1, value2, "smsType");
            return (Criteria) this;
        }

        public Criteria andSmsTypeNotBetween(Short value1, Short value2) {
            addCriterion("SMS_TYPE not between", value1, value2, "smsType");
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
package com.message.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InceptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InceptExample() {
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

        public Criteria andIiddIsNull() {
            addCriterion("IIDD is null");
            return (Criteria) this;
        }

        public Criteria andIiddIsNotNull() {
            addCriterion("IIDD is not null");
            return (Criteria) this;
        }

        public Criteria andIiddEqualTo(String value) {
            addCriterion("IIDD =", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddNotEqualTo(String value) {
            addCriterion("IIDD <>", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddGreaterThan(String value) {
            addCriterion("IIDD >", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddGreaterThanOrEqualTo(String value) {
            addCriterion("IIDD >=", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddLessThan(String value) {
            addCriterion("IIDD <", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddLessThanOrEqualTo(String value) {
            addCriterion("IIDD <=", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddLike(String value) {
            addCriterion("IIDD like", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddNotLike(String value) {
            addCriterion("IIDD not like", value, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddIn(List<String> values) {
            addCriterion("IIDD in", values, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddNotIn(List<String> values) {
            addCriterion("IIDD not in", values, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddBetween(String value1, String value2) {
            addCriterion("IIDD between", value1, value2, "iidd");
            return (Criteria) this;
        }

        public Criteria andIiddNotBetween(String value1, String value2) {
            addCriterion("IIDD not between", value1, value2, "iidd");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("ISDEL =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("ISDEL <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("ISDEL >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEL >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("ISDEL <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("ISDEL <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("ISDEL like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("ISDEL not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("ISDEL in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("ISDEL not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("ISDEL between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("ISDEL not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeIsNull() {
            addCriterion("ADDDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeIsNotNull() {
            addCriterion("ADDDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeEqualTo(Date value) {
            addCriterion("ADDDATETIME =", value, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeNotEqualTo(Date value) {
            addCriterion("ADDDATETIME <>", value, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeGreaterThan(Date value) {
            addCriterion("ADDDATETIME >", value, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADDDATETIME >=", value, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeLessThan(Date value) {
            addCriterion("ADDDATETIME <", value, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ADDDATETIME <=", value, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeIn(List<Date> values) {
            addCriterion("ADDDATETIME in", values, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeNotIn(List<Date> values) {
            addCriterion("ADDDATETIME not in", values, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeBetween(Date value1, Date value2) {
            addCriterion("ADDDATETIME between", value1, value2, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andAdddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ADDDATETIME not between", value1, value2, "adddatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andJjbhIsNull() {
            addCriterion("JJBH is null");
            return (Criteria) this;
        }

        public Criteria andJjbhIsNotNull() {
            addCriterion("JJBH is not null");
            return (Criteria) this;
        }

        public Criteria andJjbhEqualTo(String value) {
            addCriterion("JJBH =", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotEqualTo(String value) {
            addCriterion("JJBH <>", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhGreaterThan(String value) {
            addCriterion("JJBH >", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhGreaterThanOrEqualTo(String value) {
            addCriterion("JJBH >=", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhLessThan(String value) {
            addCriterion("JJBH <", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhLessThanOrEqualTo(String value) {
            addCriterion("JJBH <=", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhLike(String value) {
            addCriterion("JJBH like", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotLike(String value) {
            addCriterion("JJBH not like", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhIn(List<String> values) {
            addCriterion("JJBH in", values, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotIn(List<String> values) {
            addCriterion("JJBH not in", values, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhBetween(String value1, String value2) {
            addCriterion("JJBH between", value1, value2, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotBetween(String value1, String value2) {
            addCriterion("JJBH not between", value1, value2, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhIsNull() {
            addCriterion("JJDBH is null");
            return (Criteria) this;
        }

        public Criteria andJjdbhIsNotNull() {
            addCriterion("JJDBH is not null");
            return (Criteria) this;
        }

        public Criteria andJjdbhEqualTo(String value) {
            addCriterion("JJDBH =", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotEqualTo(String value) {
            addCriterion("JJDBH <>", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhGreaterThan(String value) {
            addCriterion("JJDBH >", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhGreaterThanOrEqualTo(String value) {
            addCriterion("JJDBH >=", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhLessThan(String value) {
            addCriterion("JJDBH <", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhLessThanOrEqualTo(String value) {
            addCriterion("JJDBH <=", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhLike(String value) {
            addCriterion("JJDBH like", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotLike(String value) {
            addCriterion("JJDBH not like", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhIn(List<String> values) {
            addCriterion("JJDBH in", values, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotIn(List<String> values) {
            addCriterion("JJDBH not in", values, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhBetween(String value1, String value2) {
            addCriterion("JJDBH between", value1, value2, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotBetween(String value1, String value2) {
            addCriterion("JJDBH not between", value1, value2, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhIsNull() {
            addCriterion("PJDBH is null");
            return (Criteria) this;
        }

        public Criteria andPjdbhIsNotNull() {
            addCriterion("PJDBH is not null");
            return (Criteria) this;
        }

        public Criteria andPjdbhEqualTo(String value) {
            addCriterion("PJDBH =", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhNotEqualTo(String value) {
            addCriterion("PJDBH <>", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhGreaterThan(String value) {
            addCriterion("PJDBH >", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhGreaterThanOrEqualTo(String value) {
            addCriterion("PJDBH >=", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhLessThan(String value) {
            addCriterion("PJDBH <", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhLessThanOrEqualTo(String value) {
            addCriterion("PJDBH <=", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhLike(String value) {
            addCriterion("PJDBH like", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhNotLike(String value) {
            addCriterion("PJDBH not like", value, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhIn(List<String> values) {
            addCriterion("PJDBH in", values, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhNotIn(List<String> values) {
            addCriterion("PJDBH not in", values, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhBetween(String value1, String value2) {
            addCriterion("PJDBH between", value1, value2, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andPjdbhNotBetween(String value1, String value2) {
            addCriterion("PJDBH not between", value1, value2, "pjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhIsNull() {
            addCriterion("GLJJDBH is null");
            return (Criteria) this;
        }

        public Criteria andGljjdbhIsNotNull() {
            addCriterion("GLJJDBH is not null");
            return (Criteria) this;
        }

        public Criteria andGljjdbhEqualTo(String value) {
            addCriterion("GLJJDBH =", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhNotEqualTo(String value) {
            addCriterion("GLJJDBH <>", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhGreaterThan(String value) {
            addCriterion("GLJJDBH >", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhGreaterThanOrEqualTo(String value) {
            addCriterion("GLJJDBH >=", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhLessThan(String value) {
            addCriterion("GLJJDBH <", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhLessThanOrEqualTo(String value) {
            addCriterion("GLJJDBH <=", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhLike(String value) {
            addCriterion("GLJJDBH like", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhNotLike(String value) {
            addCriterion("GLJJDBH not like", value, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhIn(List<String> values) {
            addCriterion("GLJJDBH in", values, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhNotIn(List<String> values) {
            addCriterion("GLJJDBH not in", values, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhBetween(String value1, String value2) {
            addCriterion("GLJJDBH between", value1, value2, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andGljjdbhNotBetween(String value1, String value2) {
            addCriterion("GLJJDBH not between", value1, value2, "gljjdbh");
            return (Criteria) this;
        }

        public Criteria andJjlyhIsNull() {
            addCriterion("JJLYH is null");
            return (Criteria) this;
        }

        public Criteria andJjlyhIsNotNull() {
            addCriterion("JJLYH is not null");
            return (Criteria) this;
        }

        public Criteria andJjlyhEqualTo(String value) {
            addCriterion("JJLYH =", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhNotEqualTo(String value) {
            addCriterion("JJLYH <>", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhGreaterThan(String value) {
            addCriterion("JJLYH >", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhGreaterThanOrEqualTo(String value) {
            addCriterion("JJLYH >=", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhLessThan(String value) {
            addCriterion("JJLYH <", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhLessThanOrEqualTo(String value) {
            addCriterion("JJLYH <=", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhLike(String value) {
            addCriterion("JJLYH like", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhNotLike(String value) {
            addCriterion("JJLYH not like", value, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhIn(List<String> values) {
            addCriterion("JJLYH in", values, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhNotIn(List<String> values) {
            addCriterion("JJLYH not in", values, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhBetween(String value1, String value2) {
            addCriterion("JJLYH between", value1, value2, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andJjlyhNotBetween(String value1, String value2) {
            addCriterion("JJLYH not between", value1, value2, "jjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhIsNull() {
            addCriterion("PJLYH is null");
            return (Criteria) this;
        }

        public Criteria andPjlyhIsNotNull() {
            addCriterion("PJLYH is not null");
            return (Criteria) this;
        }

        public Criteria andPjlyhEqualTo(String value) {
            addCriterion("PJLYH =", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhNotEqualTo(String value) {
            addCriterion("PJLYH <>", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhGreaterThan(String value) {
            addCriterion("PJLYH >", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhGreaterThanOrEqualTo(String value) {
            addCriterion("PJLYH >=", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhLessThan(String value) {
            addCriterion("PJLYH <", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhLessThanOrEqualTo(String value) {
            addCriterion("PJLYH <=", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhLike(String value) {
            addCriterion("PJLYH like", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhNotLike(String value) {
            addCriterion("PJLYH not like", value, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhIn(List<String> values) {
            addCriterion("PJLYH in", values, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhNotIn(List<String> values) {
            addCriterion("PJLYH not in", values, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhBetween(String value1, String value2) {
            addCriterion("PJLYH between", value1, value2, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andPjlyhNotBetween(String value1, String value2) {
            addCriterion("PJLYH not between", value1, value2, "pjlyh");
            return (Criteria) this;
        }

        public Criteria andLdgbhIsNull() {
            addCriterion("LDGBH is null");
            return (Criteria) this;
        }

        public Criteria andLdgbhIsNotNull() {
            addCriterion("LDGBH is not null");
            return (Criteria) this;
        }

        public Criteria andLdgbhEqualTo(String value) {
            addCriterion("LDGBH =", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhNotEqualTo(String value) {
            addCriterion("LDGBH <>", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhGreaterThan(String value) {
            addCriterion("LDGBH >", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhGreaterThanOrEqualTo(String value) {
            addCriterion("LDGBH >=", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhLessThan(String value) {
            addCriterion("LDGBH <", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhLessThanOrEqualTo(String value) {
            addCriterion("LDGBH <=", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhLike(String value) {
            addCriterion("LDGBH like", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhNotLike(String value) {
            addCriterion("LDGBH not like", value, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhIn(List<String> values) {
            addCriterion("LDGBH in", values, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhNotIn(List<String> values) {
            addCriterion("LDGBH not in", values, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhBetween(String value1, String value2) {
            addCriterion("LDGBH between", value1, value2, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andLdgbhNotBetween(String value1, String value2) {
            addCriterion("LDGBH not between", value1, value2, "ldgbh");
            return (Criteria) this;
        }

        public Criteria andJjyxmIsNull() {
            addCriterion("JJYXM is null");
            return (Criteria) this;
        }

        public Criteria andJjyxmIsNotNull() {
            addCriterion("JJYXM is not null");
            return (Criteria) this;
        }

        public Criteria andJjyxmEqualTo(String value) {
            addCriterion("JJYXM =", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmNotEqualTo(String value) {
            addCriterion("JJYXM <>", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmGreaterThan(String value) {
            addCriterion("JJYXM >", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmGreaterThanOrEqualTo(String value) {
            addCriterion("JJYXM >=", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmLessThan(String value) {
            addCriterion("JJYXM <", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmLessThanOrEqualTo(String value) {
            addCriterion("JJYXM <=", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmLike(String value) {
            addCriterion("JJYXM like", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmNotLike(String value) {
            addCriterion("JJYXM not like", value, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmIn(List<String> values) {
            addCriterion("JJYXM in", values, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmNotIn(List<String> values) {
            addCriterion("JJYXM not in", values, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmBetween(String value1, String value2) {
            addCriterion("JJYXM between", value1, value2, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andJjyxmNotBetween(String value1, String value2) {
            addCriterion("JJYXM not between", value1, value2, "jjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmIsNull() {
            addCriterion("PJYXM is null");
            return (Criteria) this;
        }

        public Criteria andPjyxmIsNotNull() {
            addCriterion("PJYXM is not null");
            return (Criteria) this;
        }

        public Criteria andPjyxmEqualTo(String value) {
            addCriterion("PJYXM =", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmNotEqualTo(String value) {
            addCriterion("PJYXM <>", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmGreaterThan(String value) {
            addCriterion("PJYXM >", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmGreaterThanOrEqualTo(String value) {
            addCriterion("PJYXM >=", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmLessThan(String value) {
            addCriterion("PJYXM <", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmLessThanOrEqualTo(String value) {
            addCriterion("PJYXM <=", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmLike(String value) {
            addCriterion("PJYXM like", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmNotLike(String value) {
            addCriterion("PJYXM not like", value, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmIn(List<String> values) {
            addCriterion("PJYXM in", values, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmNotIn(List<String> values) {
            addCriterion("PJYXM not in", values, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmBetween(String value1, String value2) {
            addCriterion("PJYXM between", value1, value2, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andPjyxmNotBetween(String value1, String value2) {
            addCriterion("PJYXM not between", value1, value2, "pjyxm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmIsNull() {
            addCriterion("LHLBDM is null");
            return (Criteria) this;
        }

        public Criteria andLhlbdmIsNotNull() {
            addCriterion("LHLBDM is not null");
            return (Criteria) this;
        }

        public Criteria andLhlbdmEqualTo(String value) {
            addCriterion("LHLBDM =", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmNotEqualTo(String value) {
            addCriterion("LHLBDM <>", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmGreaterThan(String value) {
            addCriterion("LHLBDM >", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmGreaterThanOrEqualTo(String value) {
            addCriterion("LHLBDM >=", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmLessThan(String value) {
            addCriterion("LHLBDM <", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmLessThanOrEqualTo(String value) {
            addCriterion("LHLBDM <=", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmLike(String value) {
            addCriterion("LHLBDM like", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmNotLike(String value) {
            addCriterion("LHLBDM not like", value, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmIn(List<String> values) {
            addCriterion("LHLBDM in", values, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmNotIn(List<String> values) {
            addCriterion("LHLBDM not in", values, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmBetween(String value1, String value2) {
            addCriterion("LHLBDM between", value1, value2, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andLhlbdmNotBetween(String value1, String value2) {
            addCriterion("LHLBDM not between", value1, value2, "lhlbdm");
            return (Criteria) this;
        }

        public Criteria andBjdhsjIsNull() {
            addCriterion("BJDHSJ is null");
            return (Criteria) this;
        }

        public Criteria andBjdhsjIsNotNull() {
            addCriterion("BJDHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjdhsjEqualTo(String value) {
            addCriterion("BJDHSJ =", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotEqualTo(String value) {
            addCriterion("BJDHSJ <>", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjGreaterThan(String value) {
            addCriterion("BJDHSJ >", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjGreaterThanOrEqualTo(String value) {
            addCriterion("BJDHSJ >=", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjLessThan(String value) {
            addCriterion("BJDHSJ <", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjLessThanOrEqualTo(String value) {
            addCriterion("BJDHSJ <=", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjLike(String value) {
            addCriterion("BJDHSJ like", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotLike(String value) {
            addCriterion("BJDHSJ not like", value, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjIn(List<String> values) {
            addCriterion("BJDHSJ in", values, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotIn(List<String> values) {
            addCriterion("BJDHSJ not in", values, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjBetween(String value1, String value2) {
            addCriterion("BJDHSJ between", value1, value2, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhsjNotBetween(String value1, String value2) {
            addCriterion("BJDHSJ not between", value1, value2, "bjdhsj");
            return (Criteria) this;
        }

        public Criteria andBjdhIsNull() {
            addCriterion("BJDH is null");
            return (Criteria) this;
        }

        public Criteria andBjdhIsNotNull() {
            addCriterion("BJDH is not null");
            return (Criteria) this;
        }

        public Criteria andBjdhEqualTo(String value) {
            addCriterion("BJDH =", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotEqualTo(String value) {
            addCriterion("BJDH <>", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhGreaterThan(String value) {
            addCriterion("BJDH >", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhGreaterThanOrEqualTo(String value) {
            addCriterion("BJDH >=", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhLessThan(String value) {
            addCriterion("BJDH <", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhLessThanOrEqualTo(String value) {
            addCriterion("BJDH <=", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhLike(String value) {
            addCriterion("BJDH like", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotLike(String value) {
            addCriterion("BJDH not like", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhIn(List<String> values) {
            addCriterion("BJDH in", values, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotIn(List<String> values) {
            addCriterion("BJDH not in", values, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhBetween(String value1, String value2) {
            addCriterion("BJDH between", value1, value2, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotBetween(String value1, String value2) {
            addCriterion("BJDH not between", value1, value2, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhhmIsNull() {
            addCriterion("BJDHHM is null");
            return (Criteria) this;
        }

        public Criteria andBjdhhmIsNotNull() {
            addCriterion("BJDHHM is not null");
            return (Criteria) this;
        }

        public Criteria andBjdhhmEqualTo(String value) {
            addCriterion("BJDHHM =", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmNotEqualTo(String value) {
            addCriterion("BJDHHM <>", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmGreaterThan(String value) {
            addCriterion("BJDHHM >", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmGreaterThanOrEqualTo(String value) {
            addCriterion("BJDHHM >=", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmLessThan(String value) {
            addCriterion("BJDHHM <", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmLessThanOrEqualTo(String value) {
            addCriterion("BJDHHM <=", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmLike(String value) {
            addCriterion("BJDHHM like", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmNotLike(String value) {
            addCriterion("BJDHHM not like", value, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmIn(List<String> values) {
            addCriterion("BJDHHM in", values, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmNotIn(List<String> values) {
            addCriterion("BJDHHM not in", values, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmBetween(String value1, String value2) {
            addCriterion("BJDHHM between", value1, value2, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhhmNotBetween(String value1, String value2) {
            addCriterion("BJDHHM not between", value1, value2, "bjdhhm");
            return (Criteria) this;
        }

        public Criteria andBjdhdzIsNull() {
            addCriterion("BJDHDZ is null");
            return (Criteria) this;
        }

        public Criteria andBjdhdzIsNotNull() {
            addCriterion("BJDHDZ is not null");
            return (Criteria) this;
        }

        public Criteria andBjdhdzEqualTo(String value) {
            addCriterion("BJDHDZ =", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzNotEqualTo(String value) {
            addCriterion("BJDHDZ <>", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzGreaterThan(String value) {
            addCriterion("BJDHDZ >", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzGreaterThanOrEqualTo(String value) {
            addCriterion("BJDHDZ >=", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzLessThan(String value) {
            addCriterion("BJDHDZ <", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzLessThanOrEqualTo(String value) {
            addCriterion("BJDHDZ <=", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzLike(String value) {
            addCriterion("BJDHDZ like", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzNotLike(String value) {
            addCriterion("BJDHDZ not like", value, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzIn(List<String> values) {
            addCriterion("BJDHDZ in", values, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzNotIn(List<String> values) {
            addCriterion("BJDHDZ not in", values, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzBetween(String value1, String value2) {
            addCriterion("BJDHDZ between", value1, value2, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andBjdhdzNotBetween(String value1, String value2) {
            addCriterion("BJDHDZ not between", value1, value2, "bjdhdz");
            return (Criteria) this;
        }

        public Criteria andThscIsNull() {
            addCriterion("THSC is null");
            return (Criteria) this;
        }

        public Criteria andThscIsNotNull() {
            addCriterion("THSC is not null");
            return (Criteria) this;
        }

        public Criteria andThscEqualTo(String value) {
            addCriterion("THSC =", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscNotEqualTo(String value) {
            addCriterion("THSC <>", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscGreaterThan(String value) {
            addCriterion("THSC >", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscGreaterThanOrEqualTo(String value) {
            addCriterion("THSC >=", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscLessThan(String value) {
            addCriterion("THSC <", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscLessThanOrEqualTo(String value) {
            addCriterion("THSC <=", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscLike(String value) {
            addCriterion("THSC like", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscNotLike(String value) {
            addCriterion("THSC not like", value, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscIn(List<String> values) {
            addCriterion("THSC in", values, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscNotIn(List<String> values) {
            addCriterion("THSC not in", values, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscBetween(String value1, String value2) {
            addCriterion("THSC between", value1, value2, "thsc");
            return (Criteria) this;
        }

        public Criteria andThscNotBetween(String value1, String value2) {
            addCriterion("THSC not between", value1, value2, "thsc");
            return (Criteria) this;
        }

        public Criteria andBjrIsNull() {
            addCriterion("BJR is null");
            return (Criteria) this;
        }

        public Criteria andBjrIsNotNull() {
            addCriterion("BJR is not null");
            return (Criteria) this;
        }

        public Criteria andBjrEqualTo(String value) {
            addCriterion("BJR =", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotEqualTo(String value) {
            addCriterion("BJR <>", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrGreaterThan(String value) {
            addCriterion("BJR >", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrGreaterThanOrEqualTo(String value) {
            addCriterion("BJR >=", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrLessThan(String value) {
            addCriterion("BJR <", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrLessThanOrEqualTo(String value) {
            addCriterion("BJR <=", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrLike(String value) {
            addCriterion("BJR like", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotLike(String value) {
            addCriterion("BJR not like", value, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrIn(List<String> values) {
            addCriterion("BJR in", values, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotIn(List<String> values) {
            addCriterion("BJR not in", values, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrBetween(String value1, String value2) {
            addCriterion("BJR between", value1, value2, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrNotBetween(String value1, String value2) {
            addCriterion("BJR not between", value1, value2, "bjr");
            return (Criteria) this;
        }

        public Criteria andBjrxbIsNull() {
            addCriterion("BJRXB is null");
            return (Criteria) this;
        }

        public Criteria andBjrxbIsNotNull() {
            addCriterion("BJRXB is not null");
            return (Criteria) this;
        }

        public Criteria andBjrxbEqualTo(String value) {
            addCriterion("BJRXB =", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbNotEqualTo(String value) {
            addCriterion("BJRXB <>", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbGreaterThan(String value) {
            addCriterion("BJRXB >", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbGreaterThanOrEqualTo(String value) {
            addCriterion("BJRXB >=", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbLessThan(String value) {
            addCriterion("BJRXB <", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbLessThanOrEqualTo(String value) {
            addCriterion("BJRXB <=", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbLike(String value) {
            addCriterion("BJRXB like", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbNotLike(String value) {
            addCriterion("BJRXB not like", value, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbIn(List<String> values) {
            addCriterion("BJRXB in", values, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbNotIn(List<String> values) {
            addCriterion("BJRXB not in", values, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbBetween(String value1, String value2) {
            addCriterion("BJRXB between", value1, value2, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andBjrxbNotBetween(String value1, String value2) {
            addCriterion("BJRXB not between", value1, value2, "bjrxb");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andBjxsIsNull() {
            addCriterion("BJXS is null");
            return (Criteria) this;
        }

        public Criteria andBjxsIsNotNull() {
            addCriterion("BJXS is not null");
            return (Criteria) this;
        }

        public Criteria andBjxsEqualTo(String value) {
            addCriterion("BJXS =", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsNotEqualTo(String value) {
            addCriterion("BJXS <>", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsGreaterThan(String value) {
            addCriterion("BJXS >", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsGreaterThanOrEqualTo(String value) {
            addCriterion("BJXS >=", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsLessThan(String value) {
            addCriterion("BJXS <", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsLessThanOrEqualTo(String value) {
            addCriterion("BJXS <=", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsLike(String value) {
            addCriterion("BJXS like", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsNotLike(String value) {
            addCriterion("BJXS not like", value, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsIn(List<String> values) {
            addCriterion("BJXS in", values, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsNotIn(List<String> values) {
            addCriterion("BJXS not in", values, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsBetween(String value1, String value2) {
            addCriterion("BJXS between", value1, value2, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjxsNotBetween(String value1, String value2) {
            addCriterion("BJXS not between", value1, value2, "bjxs");
            return (Criteria) this;
        }

        public Criteria andBjlxIsNull() {
            addCriterion("BJLX is null");
            return (Criteria) this;
        }

        public Criteria andBjlxIsNotNull() {
            addCriterion("BJLX is not null");
            return (Criteria) this;
        }

        public Criteria andBjlxEqualTo(String value) {
            addCriterion("BJLX =", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotEqualTo(String value) {
            addCriterion("BJLX <>", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxGreaterThan(String value) {
            addCriterion("BJLX >", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxGreaterThanOrEqualTo(String value) {
            addCriterion("BJLX >=", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxLessThan(String value) {
            addCriterion("BJLX <", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxLessThanOrEqualTo(String value) {
            addCriterion("BJLX <=", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxLike(String value) {
            addCriterion("BJLX like", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotLike(String value) {
            addCriterion("BJLX not like", value, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxIn(List<String> values) {
            addCriterion("BJLX in", values, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotIn(List<String> values) {
            addCriterion("BJLX not in", values, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxBetween(String value1, String value2) {
            addCriterion("BJLX between", value1, value2, "bjlx");
            return (Criteria) this;
        }

        public Criteria andBjlxNotBetween(String value1, String value2) {
            addCriterion("BJLX not between", value1, value2, "bjlx");
            return (Criteria) this;
        }

        public Criteria andSfddIsNull() {
            addCriterion("SFDD is null");
            return (Criteria) this;
        }

        public Criteria andSfddIsNotNull() {
            addCriterion("SFDD is not null");
            return (Criteria) this;
        }

        public Criteria andSfddEqualTo(String value) {
            addCriterion("SFDD =", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotEqualTo(String value) {
            addCriterion("SFDD <>", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddGreaterThan(String value) {
            addCriterion("SFDD >", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddGreaterThanOrEqualTo(String value) {
            addCriterion("SFDD >=", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddLessThan(String value) {
            addCriterion("SFDD <", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddLessThanOrEqualTo(String value) {
            addCriterion("SFDD <=", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddLike(String value) {
            addCriterion("SFDD like", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotLike(String value) {
            addCriterion("SFDD not like", value, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddIn(List<String> values) {
            addCriterion("SFDD in", values, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotIn(List<String> values) {
            addCriterion("SFDD not in", values, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddBetween(String value1, String value2) {
            addCriterion("SFDD between", value1, value2, "sfdd");
            return (Criteria) this;
        }

        public Criteria andSfddNotBetween(String value1, String value2) {
            addCriterion("SFDD not between", value1, value2, "sfdd");
            return (Criteria) this;
        }

        public Criteria andBjnrIsNull() {
            addCriterion("BJNR is null");
            return (Criteria) this;
        }

        public Criteria andBjnrIsNotNull() {
            addCriterion("BJNR is not null");
            return (Criteria) this;
        }

        public Criteria andBjnrEqualTo(String value) {
            addCriterion("BJNR =", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotEqualTo(String value) {
            addCriterion("BJNR <>", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrGreaterThan(String value) {
            addCriterion("BJNR >", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrGreaterThanOrEqualTo(String value) {
            addCriterion("BJNR >=", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLessThan(String value) {
            addCriterion("BJNR <", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLessThanOrEqualTo(String value) {
            addCriterion("BJNR <=", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLike(String value) {
            addCriterion("BJNR like", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotLike(String value) {
            addCriterion("BJNR not like", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrIn(List<String> values) {
            addCriterion("BJNR in", values, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotIn(List<String> values) {
            addCriterion("BJNR not in", values, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrBetween(String value1, String value2) {
            addCriterion("BJNR between", value1, value2, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotBetween(String value1, String value2) {
            addCriterion("BJNR not between", value1, value2, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrIsNull() {
            addCriterion("BCJJNR is null");
            return (Criteria) this;
        }

        public Criteria andBcjjnrIsNotNull() {
            addCriterion("BCJJNR is not null");
            return (Criteria) this;
        }

        public Criteria andBcjjnrEqualTo(String value) {
            addCriterion("BCJJNR =", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrNotEqualTo(String value) {
            addCriterion("BCJJNR <>", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrGreaterThan(String value) {
            addCriterion("BCJJNR >", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrGreaterThanOrEqualTo(String value) {
            addCriterion("BCJJNR >=", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrLessThan(String value) {
            addCriterion("BCJJNR <", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrLessThanOrEqualTo(String value) {
            addCriterion("BCJJNR <=", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrLike(String value) {
            addCriterion("BCJJNR like", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrNotLike(String value) {
            addCriterion("BCJJNR not like", value, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrIn(List<String> values) {
            addCriterion("BCJJNR in", values, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrNotIn(List<String> values) {
            addCriterion("BCJJNR not in", values, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrBetween(String value1, String value2) {
            addCriterion("BCJJNR between", value1, value2, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andBcjjnrNotBetween(String value1, String value2) {
            addCriterion("BCJJNR not between", value1, value2, "bcjjnr");
            return (Criteria) this;
        }

        public Criteria andSjcphIsNull() {
            addCriterion("SJCPH is null");
            return (Criteria) this;
        }

        public Criteria andSjcphIsNotNull() {
            addCriterion("SJCPH is not null");
            return (Criteria) this;
        }

        public Criteria andSjcphEqualTo(String value) {
            addCriterion("SJCPH =", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphNotEqualTo(String value) {
            addCriterion("SJCPH <>", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphGreaterThan(String value) {
            addCriterion("SJCPH >", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphGreaterThanOrEqualTo(String value) {
            addCriterion("SJCPH >=", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphLessThan(String value) {
            addCriterion("SJCPH <", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphLessThanOrEqualTo(String value) {
            addCriterion("SJCPH <=", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphLike(String value) {
            addCriterion("SJCPH like", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphNotLike(String value) {
            addCriterion("SJCPH not like", value, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphIn(List<String> values) {
            addCriterion("SJCPH in", values, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphNotIn(List<String> values) {
            addCriterion("SJCPH not in", values, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphBetween(String value1, String value2) {
            addCriterion("SJCPH between", value1, value2, "sjcph");
            return (Criteria) this;
        }

        public Criteria andSjcphNotBetween(String value1, String value2) {
            addCriterion("SJCPH not between", value1, value2, "sjcph");
            return (Criteria) this;
        }

        public Criteria andCllxIsNull() {
            addCriterion("CLLX is null");
            return (Criteria) this;
        }

        public Criteria andCllxIsNotNull() {
            addCriterion("CLLX is not null");
            return (Criteria) this;
        }

        public Criteria andCllxEqualTo(String value) {
            addCriterion("CLLX =", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotEqualTo(String value) {
            addCriterion("CLLX <>", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThan(String value) {
            addCriterion("CLLX >", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThanOrEqualTo(String value) {
            addCriterion("CLLX >=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThan(String value) {
            addCriterion("CLLX <", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThanOrEqualTo(String value) {
            addCriterion("CLLX <=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLike(String value) {
            addCriterion("CLLX like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotLike(String value) {
            addCriterion("CLLX not like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxIn(List<String> values) {
            addCriterion("CLLX in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotIn(List<String> values) {
            addCriterion("CLLX not in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxBetween(String value1, String value2) {
            addCriterion("CLLX between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotBetween(String value1, String value2) {
            addCriterion("CLLX not between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andSyqxIsNull() {
            addCriterion("SYQX is null");
            return (Criteria) this;
        }

        public Criteria andSyqxIsNotNull() {
            addCriterion("SYQX is not null");
            return (Criteria) this;
        }

        public Criteria andSyqxEqualTo(String value) {
            addCriterion("SYQX =", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotEqualTo(String value) {
            addCriterion("SYQX <>", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThan(String value) {
            addCriterion("SYQX >", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxGreaterThanOrEqualTo(String value) {
            addCriterion("SYQX >=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThan(String value) {
            addCriterion("SYQX <", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLessThanOrEqualTo(String value) {
            addCriterion("SYQX <=", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxLike(String value) {
            addCriterion("SYQX like", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotLike(String value) {
            addCriterion("SYQX not like", value, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxIn(List<String> values) {
            addCriterion("SYQX in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotIn(List<String> values) {
            addCriterion("SYQX not in", values, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxBetween(String value1, String value2) {
            addCriterion("SYQX between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andSyqxNotBetween(String value1, String value2) {
            addCriterion("SYQX not between", value1, value2, "syqx");
            return (Criteria) this;
        }

        public Criteria andClqxIsNull() {
            addCriterion("CLQX is null");
            return (Criteria) this;
        }

        public Criteria andClqxIsNotNull() {
            addCriterion("CLQX is not null");
            return (Criteria) this;
        }

        public Criteria andClqxEqualTo(String value) {
            addCriterion("CLQX =", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxNotEqualTo(String value) {
            addCriterion("CLQX <>", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxGreaterThan(String value) {
            addCriterion("CLQX >", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxGreaterThanOrEqualTo(String value) {
            addCriterion("CLQX >=", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxLessThan(String value) {
            addCriterion("CLQX <", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxLessThanOrEqualTo(String value) {
            addCriterion("CLQX <=", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxLike(String value) {
            addCriterion("CLQX like", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxNotLike(String value) {
            addCriterion("CLQX not like", value, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxIn(List<String> values) {
            addCriterion("CLQX in", values, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxNotIn(List<String> values) {
            addCriterion("CLQX not in", values, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxBetween(String value1, String value2) {
            addCriterion("CLQX between", value1, value2, "clqx");
            return (Criteria) this;
        }

        public Criteria andClqxNotBetween(String value1, String value2) {
            addCriterion("CLQX not between", value1, value2, "clqx");
            return (Criteria) this;
        }

        public Criteria andHzdjIsNull() {
            addCriterion("HZDJ is null");
            return (Criteria) this;
        }

        public Criteria andHzdjIsNotNull() {
            addCriterion("HZDJ is not null");
            return (Criteria) this;
        }

        public Criteria andHzdjEqualTo(String value) {
            addCriterion("HZDJ =", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjNotEqualTo(String value) {
            addCriterion("HZDJ <>", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjGreaterThan(String value) {
            addCriterion("HZDJ >", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjGreaterThanOrEqualTo(String value) {
            addCriterion("HZDJ >=", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjLessThan(String value) {
            addCriterion("HZDJ <", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjLessThanOrEqualTo(String value) {
            addCriterion("HZDJ <=", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjLike(String value) {
            addCriterion("HZDJ like", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjNotLike(String value) {
            addCriterion("HZDJ not like", value, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjIn(List<String> values) {
            addCriterion("HZDJ in", values, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjNotIn(List<String> values) {
            addCriterion("HZDJ not in", values, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjBetween(String value1, String value2) {
            addCriterion("HZDJ between", value1, value2, "hzdj");
            return (Criteria) this;
        }

        public Criteria andHzdjNotBetween(String value1, String value2) {
            addCriterion("HZDJ not between", value1, value2, "hzdj");
            return (Criteria) this;
        }

        public Criteria andSfzddwIsNull() {
            addCriterion("SFZDDW is null");
            return (Criteria) this;
        }

        public Criteria andSfzddwIsNotNull() {
            addCriterion("SFZDDW is not null");
            return (Criteria) this;
        }

        public Criteria andSfzddwEqualTo(String value) {
            addCriterion("SFZDDW =", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwNotEqualTo(String value) {
            addCriterion("SFZDDW <>", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwGreaterThan(String value) {
            addCriterion("SFZDDW >", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwGreaterThanOrEqualTo(String value) {
            addCriterion("SFZDDW >=", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwLessThan(String value) {
            addCriterion("SFZDDW <", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwLessThanOrEqualTo(String value) {
            addCriterion("SFZDDW <=", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwLike(String value) {
            addCriterion("SFZDDW like", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwNotLike(String value) {
            addCriterion("SFZDDW not like", value, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwIn(List<String> values) {
            addCriterion("SFZDDW in", values, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwNotIn(List<String> values) {
            addCriterion("SFZDDW not in", values, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwBetween(String value1, String value2) {
            addCriterion("SFZDDW between", value1, value2, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andSfzddwNotBetween(String value1, String value2) {
            addCriterion("SFZDDW not between", value1, value2, "sfzddw");
            return (Criteria) this;
        }

        public Criteria andZddwbmIsNull() {
            addCriterion("ZDDWBM is null");
            return (Criteria) this;
        }

        public Criteria andZddwbmIsNotNull() {
            addCriterion("ZDDWBM is not null");
            return (Criteria) this;
        }

        public Criteria andZddwbmEqualTo(String value) {
            addCriterion("ZDDWBM =", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmNotEqualTo(String value) {
            addCriterion("ZDDWBM <>", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmGreaterThan(String value) {
            addCriterion("ZDDWBM >", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDDWBM >=", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmLessThan(String value) {
            addCriterion("ZDDWBM <", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmLessThanOrEqualTo(String value) {
            addCriterion("ZDDWBM <=", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmLike(String value) {
            addCriterion("ZDDWBM like", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmNotLike(String value) {
            addCriterion("ZDDWBM not like", value, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmIn(List<String> values) {
            addCriterion("ZDDWBM in", values, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmNotIn(List<String> values) {
            addCriterion("ZDDWBM not in", values, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmBetween(String value1, String value2) {
            addCriterion("ZDDWBM between", value1, value2, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andZddwbmNotBetween(String value1, String value2) {
            addCriterion("ZDDWBM not between", value1, value2, "zddwbm");
            return (Criteria) this;
        }

        public Criteria andJzlbIsNull() {
            addCriterion("JZLB is null");
            return (Criteria) this;
        }

        public Criteria andJzlbIsNotNull() {
            addCriterion("JZLB is not null");
            return (Criteria) this;
        }

        public Criteria andJzlbEqualTo(String value) {
            addCriterion("JZLB =", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbNotEqualTo(String value) {
            addCriterion("JZLB <>", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbGreaterThan(String value) {
            addCriterion("JZLB >", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbGreaterThanOrEqualTo(String value) {
            addCriterion("JZLB >=", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbLessThan(String value) {
            addCriterion("JZLB <", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbLessThanOrEqualTo(String value) {
            addCriterion("JZLB <=", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbLike(String value) {
            addCriterion("JZLB like", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbNotLike(String value) {
            addCriterion("JZLB not like", value, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbIn(List<String> values) {
            addCriterion("JZLB in", values, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbNotIn(List<String> values) {
            addCriterion("JZLB not in", values, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbBetween(String value1, String value2) {
            addCriterion("JZLB between", value1, value2, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzlbNotBetween(String value1, String value2) {
            addCriterion("JZLB not between", value1, value2, "jzlb");
            return (Criteria) this;
        }

        public Criteria andJzjgIsNull() {
            addCriterion("JZJG is null");
            return (Criteria) this;
        }

        public Criteria andJzjgIsNotNull() {
            addCriterion("JZJG is not null");
            return (Criteria) this;
        }

        public Criteria andJzjgEqualTo(String value) {
            addCriterion("JZJG =", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgNotEqualTo(String value) {
            addCriterion("JZJG <>", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgGreaterThan(String value) {
            addCriterion("JZJG >", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgGreaterThanOrEqualTo(String value) {
            addCriterion("JZJG >=", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgLessThan(String value) {
            addCriterion("JZJG <", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgLessThanOrEqualTo(String value) {
            addCriterion("JZJG <=", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgLike(String value) {
            addCriterion("JZJG like", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgNotLike(String value) {
            addCriterion("JZJG not like", value, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgIn(List<String> values) {
            addCriterion("JZJG in", values, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgNotIn(List<String> values) {
            addCriterion("JZJG not in", values, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgBetween(String value1, String value2) {
            addCriterion("JZJG between", value1, value2, "jzjg");
            return (Criteria) this;
        }

        public Criteria andJzjgNotBetween(String value1, String value2) {
            addCriterion("JZJG not between", value1, value2, "jzjg");
            return (Criteria) this;
        }

        public Criteria andQhcsIsNull() {
            addCriterion("QHCS is null");
            return (Criteria) this;
        }

        public Criteria andQhcsIsNotNull() {
            addCriterion("QHCS is not null");
            return (Criteria) this;
        }

        public Criteria andQhcsEqualTo(String value) {
            addCriterion("QHCS =", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsNotEqualTo(String value) {
            addCriterion("QHCS <>", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsGreaterThan(String value) {
            addCriterion("QHCS >", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsGreaterThanOrEqualTo(String value) {
            addCriterion("QHCS >=", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsLessThan(String value) {
            addCriterion("QHCS <", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsLessThanOrEqualTo(String value) {
            addCriterion("QHCS <=", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsLike(String value) {
            addCriterion("QHCS like", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsNotLike(String value) {
            addCriterion("QHCS not like", value, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsIn(List<String> values) {
            addCriterion("QHCS in", values, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsNotIn(List<String> values) {
            addCriterion("QHCS not in", values, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsBetween(String value1, String value2) {
            addCriterion("QHCS between", value1, value2, "qhcs");
            return (Criteria) this;
        }

        public Criteria andQhcsNotBetween(String value1, String value2) {
            addCriterion("QHCS not between", value1, value2, "qhcs");
            return (Criteria) this;
        }

        public Criteria andBzwqkIsNull() {
            addCriterion("BZWQK is null");
            return (Criteria) this;
        }

        public Criteria andBzwqkIsNotNull() {
            addCriterion("BZWQK is not null");
            return (Criteria) this;
        }

        public Criteria andBzwqkEqualTo(String value) {
            addCriterion("BZWQK =", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkNotEqualTo(String value) {
            addCriterion("BZWQK <>", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkGreaterThan(String value) {
            addCriterion("BZWQK >", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkGreaterThanOrEqualTo(String value) {
            addCriterion("BZWQK >=", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkLessThan(String value) {
            addCriterion("BZWQK <", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkLessThanOrEqualTo(String value) {
            addCriterion("BZWQK <=", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkLike(String value) {
            addCriterion("BZWQK like", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkNotLike(String value) {
            addCriterion("BZWQK not like", value, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkIn(List<String> values) {
            addCriterion("BZWQK in", values, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkNotIn(List<String> values) {
            addCriterion("BZWQK not in", values, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkBetween(String value1, String value2) {
            addCriterion("BZWQK between", value1, value2, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBzwqkNotBetween(String value1, String value2) {
            addCriterion("BZWQK not between", value1, value2, "bzwqk");
            return (Criteria) this;
        }

        public Criteria andBlqkIsNull() {
            addCriterion("BLQK is null");
            return (Criteria) this;
        }

        public Criteria andBlqkIsNotNull() {
            addCriterion("BLQK is not null");
            return (Criteria) this;
        }

        public Criteria andBlqkEqualTo(String value) {
            addCriterion("BLQK =", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkNotEqualTo(String value) {
            addCriterion("BLQK <>", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkGreaterThan(String value) {
            addCriterion("BLQK >", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkGreaterThanOrEqualTo(String value) {
            addCriterion("BLQK >=", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkLessThan(String value) {
            addCriterion("BLQK <", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkLessThanOrEqualTo(String value) {
            addCriterion("BLQK <=", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkLike(String value) {
            addCriterion("BLQK like", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkNotLike(String value) {
            addCriterion("BLQK not like", value, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkIn(List<String> values) {
            addCriterion("BLQK in", values, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkNotIn(List<String> values) {
            addCriterion("BLQK not in", values, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkBetween(String value1, String value2) {
            addCriterion("BLQK between", value1, value2, "blqk");
            return (Criteria) this;
        }

        public Criteria andBlqkNotBetween(String value1, String value2) {
            addCriterion("BLQK not between", value1, value2, "blqk");
            return (Criteria) this;
        }

        public Criteria andSfbwIsNull() {
            addCriterion("SFBW is null");
            return (Criteria) this;
        }

        public Criteria andSfbwIsNotNull() {
            addCriterion("SFBW is not null");
            return (Criteria) this;
        }

        public Criteria andSfbwEqualTo(String value) {
            addCriterion("SFBW =", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwNotEqualTo(String value) {
            addCriterion("SFBW <>", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwGreaterThan(String value) {
            addCriterion("SFBW >", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwGreaterThanOrEqualTo(String value) {
            addCriterion("SFBW >=", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwLessThan(String value) {
            addCriterion("SFBW <", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwLessThanOrEqualTo(String value) {
            addCriterion("SFBW <=", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwLike(String value) {
            addCriterion("SFBW like", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwNotLike(String value) {
            addCriterion("SFBW not like", value, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwIn(List<String> values) {
            addCriterion("SFBW in", values, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwNotIn(List<String> values) {
            addCriterion("SFBW not in", values, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwBetween(String value1, String value2) {
            addCriterion("SFBW between", value1, value2, "sfbw");
            return (Criteria) this;
        }

        public Criteria andSfbwNotBetween(String value1, String value2) {
            addCriterion("SFBW not between", value1, value2, "sfbw");
            return (Criteria) this;
        }

        public Criteria andRswxzIsNull() {
            addCriterion("RSWXZ is null");
            return (Criteria) this;
        }

        public Criteria andRswxzIsNotNull() {
            addCriterion("RSWXZ is not null");
            return (Criteria) this;
        }

        public Criteria andRswxzEqualTo(String value) {
            addCriterion("RSWXZ =", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzNotEqualTo(String value) {
            addCriterion("RSWXZ <>", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzGreaterThan(String value) {
            addCriterion("RSWXZ >", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzGreaterThanOrEqualTo(String value) {
            addCriterion("RSWXZ >=", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzLessThan(String value) {
            addCriterion("RSWXZ <", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzLessThanOrEqualTo(String value) {
            addCriterion("RSWXZ <=", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzLike(String value) {
            addCriterion("RSWXZ like", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzNotLike(String value) {
            addCriterion("RSWXZ not like", value, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzIn(List<String> values) {
            addCriterion("RSWXZ in", values, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzNotIn(List<String> values) {
            addCriterion("RSWXZ not in", values, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzBetween(String value1, String value2) {
            addCriterion("RSWXZ between", value1, value2, "rswxz");
            return (Criteria) this;
        }

        public Criteria andRswxzNotBetween(String value1, String value2) {
            addCriterion("RSWXZ not between", value1, value2, "rswxz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzIsNull() {
            addCriterion("YFWXWZ is null");
            return (Criteria) this;
        }

        public Criteria andYfwxwzIsNotNull() {
            addCriterion("YFWXWZ is not null");
            return (Criteria) this;
        }

        public Criteria andYfwxwzEqualTo(String value) {
            addCriterion("YFWXWZ =", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzNotEqualTo(String value) {
            addCriterion("YFWXWZ <>", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzGreaterThan(String value) {
            addCriterion("YFWXWZ >", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzGreaterThanOrEqualTo(String value) {
            addCriterion("YFWXWZ >=", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzLessThan(String value) {
            addCriterion("YFWXWZ <", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzLessThanOrEqualTo(String value) {
            addCriterion("YFWXWZ <=", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzLike(String value) {
            addCriterion("YFWXWZ like", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzNotLike(String value) {
            addCriterion("YFWXWZ not like", value, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzIn(List<String> values) {
            addCriterion("YFWXWZ in", values, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzNotIn(List<String> values) {
            addCriterion("YFWXWZ not in", values, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzBetween(String value1, String value2) {
            addCriterion("YFWXWZ between", value1, value2, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYfwxwzNotBetween(String value1, String value2) {
            addCriterion("YFWXWZ not between", value1, value2, "yfwxwz");
            return (Criteria) this;
        }

        public Criteria andYwbzxlIsNull() {
            addCriterion("YWBZXL is null");
            return (Criteria) this;
        }

        public Criteria andYwbzxlIsNotNull() {
            addCriterion("YWBZXL is not null");
            return (Criteria) this;
        }

        public Criteria andYwbzxlEqualTo(String value) {
            addCriterion("YWBZXL =", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlNotEqualTo(String value) {
            addCriterion("YWBZXL <>", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlGreaterThan(String value) {
            addCriterion("YWBZXL >", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlGreaterThanOrEqualTo(String value) {
            addCriterion("YWBZXL >=", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlLessThan(String value) {
            addCriterion("YWBZXL <", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlLessThanOrEqualTo(String value) {
            addCriterion("YWBZXL <=", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlLike(String value) {
            addCriterion("YWBZXL like", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlNotLike(String value) {
            addCriterion("YWBZXL not like", value, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlIn(List<String> values) {
            addCriterion("YWBZXL in", values, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlNotIn(List<String> values) {
            addCriterion("YWBZXL not in", values, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlBetween(String value1, String value2) {
            addCriterion("YWBZXL between", value1, value2, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYwbzxlNotBetween(String value1, String value2) {
            addCriterion("YWBZXL not between", value1, value2, "ywbzxl");
            return (Criteria) this;
        }

        public Criteria andYftyIsNull() {
            addCriterion("YFTY is null");
            return (Criteria) this;
        }

        public Criteria andYftyIsNotNull() {
            addCriterion("YFTY is not null");
            return (Criteria) this;
        }

        public Criteria andYftyEqualTo(String value) {
            addCriterion("YFTY =", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyNotEqualTo(String value) {
            addCriterion("YFTY <>", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyGreaterThan(String value) {
            addCriterion("YFTY >", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyGreaterThanOrEqualTo(String value) {
            addCriterion("YFTY >=", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyLessThan(String value) {
            addCriterion("YFTY <", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyLessThanOrEqualTo(String value) {
            addCriterion("YFTY <=", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyLike(String value) {
            addCriterion("YFTY like", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyNotLike(String value) {
            addCriterion("YFTY not like", value, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyIn(List<String> values) {
            addCriterion("YFTY in", values, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyNotIn(List<String> values) {
            addCriterion("YFTY not in", values, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyBetween(String value1, String value2) {
            addCriterion("YFTY between", value1, value2, "yfty");
            return (Criteria) this;
        }

        public Criteria andYftyNotBetween(String value1, String value2) {
            addCriterion("YFTY not between", value1, value2, "yfty");
            return (Criteria) this;
        }

        public Criteria andYwbkryIsNull() {
            addCriterion("YWBKRY is null");
            return (Criteria) this;
        }

        public Criteria andYwbkryIsNotNull() {
            addCriterion("YWBKRY is not null");
            return (Criteria) this;
        }

        public Criteria andYwbkryEqualTo(String value) {
            addCriterion("YWBKRY =", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryNotEqualTo(String value) {
            addCriterion("YWBKRY <>", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryGreaterThan(String value) {
            addCriterion("YWBKRY >", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryGreaterThanOrEqualTo(String value) {
            addCriterion("YWBKRY >=", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryLessThan(String value) {
            addCriterion("YWBKRY <", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryLessThanOrEqualTo(String value) {
            addCriterion("YWBKRY <=", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryLike(String value) {
            addCriterion("YWBKRY like", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryNotLike(String value) {
            addCriterion("YWBKRY not like", value, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryIn(List<String> values) {
            addCriterion("YWBKRY in", values, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryNotIn(List<String> values) {
            addCriterion("YWBKRY not in", values, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryBetween(String value1, String value2) {
            addCriterion("YWBKRY between", value1, value2, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andYwbkryNotBetween(String value1, String value2) {
            addCriterion("YWBKRY not between", value1, value2, "ywbkry");
            return (Criteria) this;
        }

        public Criteria andGisXIsNull() {
            addCriterion("GIS_X is null");
            return (Criteria) this;
        }

        public Criteria andGisXIsNotNull() {
            addCriterion("GIS_X is not null");
            return (Criteria) this;
        }

        public Criteria andGisXEqualTo(String value) {
            addCriterion("GIS_X =", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXNotEqualTo(String value) {
            addCriterion("GIS_X <>", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXGreaterThan(String value) {
            addCriterion("GIS_X >", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXGreaterThanOrEqualTo(String value) {
            addCriterion("GIS_X >=", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXLessThan(String value) {
            addCriterion("GIS_X <", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXLessThanOrEqualTo(String value) {
            addCriterion("GIS_X <=", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXLike(String value) {
            addCriterion("GIS_X like", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXNotLike(String value) {
            addCriterion("GIS_X not like", value, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXIn(List<String> values) {
            addCriterion("GIS_X in", values, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXNotIn(List<String> values) {
            addCriterion("GIS_X not in", values, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXBetween(String value1, String value2) {
            addCriterion("GIS_X between", value1, value2, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisXNotBetween(String value1, String value2) {
            addCriterion("GIS_X not between", value1, value2, "gisX");
            return (Criteria) this;
        }

        public Criteria andGisYIsNull() {
            addCriterion("GIS_Y is null");
            return (Criteria) this;
        }

        public Criteria andGisYIsNotNull() {
            addCriterion("GIS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andGisYEqualTo(String value) {
            addCriterion("GIS_Y =", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYNotEqualTo(String value) {
            addCriterion("GIS_Y <>", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYGreaterThan(String value) {
            addCriterion("GIS_Y >", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYGreaterThanOrEqualTo(String value) {
            addCriterion("GIS_Y >=", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYLessThan(String value) {
            addCriterion("GIS_Y <", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYLessThanOrEqualTo(String value) {
            addCriterion("GIS_Y <=", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYLike(String value) {
            addCriterion("GIS_Y like", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYNotLike(String value) {
            addCriterion("GIS_Y not like", value, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYIn(List<String> values) {
            addCriterion("GIS_Y in", values, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYNotIn(List<String> values) {
            addCriterion("GIS_Y not in", values, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYBetween(String value1, String value2) {
            addCriterion("GIS_Y between", value1, value2, "gisY");
            return (Criteria) this;
        }

        public Criteria andGisYNotBetween(String value1, String value2) {
            addCriterion("GIS_Y not between", value1, value2, "gisY");
            return (Criteria) this;
        }

        public Criteria andSfzxxsIsNull() {
            addCriterion("SFZXXS is null");
            return (Criteria) this;
        }

        public Criteria andSfzxxsIsNotNull() {
            addCriterion("SFZXXS is not null");
            return (Criteria) this;
        }

        public Criteria andSfzxxsEqualTo(String value) {
            addCriterion("SFZXXS =", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsNotEqualTo(String value) {
            addCriterion("SFZXXS <>", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsGreaterThan(String value) {
            addCriterion("SFZXXS >", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsGreaterThanOrEqualTo(String value) {
            addCriterion("SFZXXS >=", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsLessThan(String value) {
            addCriterion("SFZXXS <", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsLessThanOrEqualTo(String value) {
            addCriterion("SFZXXS <=", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsLike(String value) {
            addCriterion("SFZXXS like", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsNotLike(String value) {
            addCriterion("SFZXXS not like", value, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsIn(List<String> values) {
            addCriterion("SFZXXS in", values, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsNotIn(List<String> values) {
            addCriterion("SFZXXS not in", values, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsBetween(String value1, String value2) {
            addCriterion("SFZXXS between", value1, value2, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andSfzxxsNotBetween(String value1, String value2) {
            addCriterion("SFZXXS not between", value1, value2, "sfzxxs");
            return (Criteria) this;
        }

        public Criteria andBjtdyyIsNull() {
            addCriterion("BJTDYY is null");
            return (Criteria) this;
        }

        public Criteria andBjtdyyIsNotNull() {
            addCriterion("BJTDYY is not null");
            return (Criteria) this;
        }

        public Criteria andBjtdyyEqualTo(String value) {
            addCriterion("BJTDYY =", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyNotEqualTo(String value) {
            addCriterion("BJTDYY <>", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyGreaterThan(String value) {
            addCriterion("BJTDYY >", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyGreaterThanOrEqualTo(String value) {
            addCriterion("BJTDYY >=", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyLessThan(String value) {
            addCriterion("BJTDYY <", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyLessThanOrEqualTo(String value) {
            addCriterion("BJTDYY <=", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyLike(String value) {
            addCriterion("BJTDYY like", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyNotLike(String value) {
            addCriterion("BJTDYY not like", value, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyIn(List<String> values) {
            addCriterion("BJTDYY in", values, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyNotIn(List<String> values) {
            addCriterion("BJTDYY not in", values, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyBetween(String value1, String value2) {
            addCriterion("BJTDYY between", value1, value2, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andBjtdyyNotBetween(String value1, String value2) {
            addCriterion("BJTDYY not between", value1, value2, "bjtdyy");
            return (Criteria) this;
        }

        public Criteria andPjsjIsNull() {
            addCriterion("PJSJ is null");
            return (Criteria) this;
        }

        public Criteria andPjsjIsNotNull() {
            addCriterion("PJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPjsjEqualTo(String value) {
            addCriterion("PJSJ =", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjNotEqualTo(String value) {
            addCriterion("PJSJ <>", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjGreaterThan(String value) {
            addCriterion("PJSJ >", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjGreaterThanOrEqualTo(String value) {
            addCriterion("PJSJ >=", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjLessThan(String value) {
            addCriterion("PJSJ <", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjLessThanOrEqualTo(String value) {
            addCriterion("PJSJ <=", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjLike(String value) {
            addCriterion("PJSJ like", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjNotLike(String value) {
            addCriterion("PJSJ not like", value, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjIn(List<String> values) {
            addCriterion("PJSJ in", values, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjNotIn(List<String> values) {
            addCriterion("PJSJ not in", values, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjBetween(String value1, String value2) {
            addCriterion("PJSJ between", value1, value2, "pjsj");
            return (Criteria) this;
        }

        public Criteria andPjsjNotBetween(String value1, String value2) {
            addCriterion("PJSJ not between", value1, value2, "pjsj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjIsNull() {
            addCriterion("BJCJYJ is null");
            return (Criteria) this;
        }

        public Criteria andBjcjyjIsNotNull() {
            addCriterion("BJCJYJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjcjyjEqualTo(String value) {
            addCriterion("BJCJYJ =", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjNotEqualTo(String value) {
            addCriterion("BJCJYJ <>", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjGreaterThan(String value) {
            addCriterion("BJCJYJ >", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjGreaterThanOrEqualTo(String value) {
            addCriterion("BJCJYJ >=", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjLessThan(String value) {
            addCriterion("BJCJYJ <", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjLessThanOrEqualTo(String value) {
            addCriterion("BJCJYJ <=", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjLike(String value) {
            addCriterion("BJCJYJ like", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjNotLike(String value) {
            addCriterion("BJCJYJ not like", value, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjIn(List<String> values) {
            addCriterion("BJCJYJ in", values, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjNotIn(List<String> values) {
            addCriterion("BJCJYJ not in", values, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjBetween(String value1, String value2) {
            addCriterion("BJCJYJ between", value1, value2, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andBjcjyjNotBetween(String value1, String value2) {
            addCriterion("BJCJYJ not between", value1, value2, "bjcjyj");
            return (Criteria) this;
        }

        public Criteria andEjddsjIsNull() {
            addCriterion("EJDDSJ is null");
            return (Criteria) this;
        }

        public Criteria andEjddsjIsNotNull() {
            addCriterion("EJDDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andEjddsjEqualTo(String value) {
            addCriterion("EJDDSJ =", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjNotEqualTo(String value) {
            addCriterion("EJDDSJ <>", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjGreaterThan(String value) {
            addCriterion("EJDDSJ >", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjGreaterThanOrEqualTo(String value) {
            addCriterion("EJDDSJ >=", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjLessThan(String value) {
            addCriterion("EJDDSJ <", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjLessThanOrEqualTo(String value) {
            addCriterion("EJDDSJ <=", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjLike(String value) {
            addCriterion("EJDDSJ like", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjNotLike(String value) {
            addCriterion("EJDDSJ not like", value, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjIn(List<String> values) {
            addCriterion("EJDDSJ in", values, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjNotIn(List<String> values) {
            addCriterion("EJDDSJ not in", values, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjBetween(String value1, String value2) {
            addCriterion("EJDDSJ between", value1, value2, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjddsjNotBetween(String value1, String value2) {
            addCriterion("EJDDSJ not between", value1, value2, "ejddsj");
            return (Criteria) this;
        }

        public Criteria andEjjssjIsNull() {
            addCriterion("EJJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andEjjssjIsNotNull() {
            addCriterion("EJJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andEjjssjEqualTo(String value) {
            addCriterion("EJJSSJ =", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjNotEqualTo(String value) {
            addCriterion("EJJSSJ <>", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjGreaterThan(String value) {
            addCriterion("EJJSSJ >", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjGreaterThanOrEqualTo(String value) {
            addCriterion("EJJSSJ >=", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjLessThan(String value) {
            addCriterion("EJJSSJ <", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjLessThanOrEqualTo(String value) {
            addCriterion("EJJSSJ <=", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjLike(String value) {
            addCriterion("EJJSSJ like", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjNotLike(String value) {
            addCriterion("EJJSSJ not like", value, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjIn(List<String> values) {
            addCriterion("EJJSSJ in", values, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjNotIn(List<String> values) {
            addCriterion("EJJSSJ not in", values, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjBetween(String value1, String value2) {
            addCriterion("EJJSSJ between", value1, value2, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjjssjNotBetween(String value1, String value2) {
            addCriterion("EJJSSJ not between", value1, value2, "ejjssj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjIsNull() {
            addCriterion("EJXFSJ is null");
            return (Criteria) this;
        }

        public Criteria andEjxfsjIsNotNull() {
            addCriterion("EJXFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andEjxfsjEqualTo(String value) {
            addCriterion("EJXFSJ =", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjNotEqualTo(String value) {
            addCriterion("EJXFSJ <>", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjGreaterThan(String value) {
            addCriterion("EJXFSJ >", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjGreaterThanOrEqualTo(String value) {
            addCriterion("EJXFSJ >=", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjLessThan(String value) {
            addCriterion("EJXFSJ <", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjLessThanOrEqualTo(String value) {
            addCriterion("EJXFSJ <=", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjLike(String value) {
            addCriterion("EJXFSJ like", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjNotLike(String value) {
            addCriterion("EJXFSJ not like", value, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjIn(List<String> values) {
            addCriterion("EJXFSJ in", values, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjNotIn(List<String> values) {
            addCriterion("EJXFSJ not in", values, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjBetween(String value1, String value2) {
            addCriterion("EJXFSJ between", value1, value2, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjxfsjNotBetween(String value1, String value2) {
            addCriterion("EJXFSJ not between", value1, value2, "ejxfsj");
            return (Criteria) this;
        }

        public Criteria andEjjsrIsNull() {
            addCriterion("EJJSR is null");
            return (Criteria) this;
        }

        public Criteria andEjjsrIsNotNull() {
            addCriterion("EJJSR is not null");
            return (Criteria) this;
        }

        public Criteria andEjjsrEqualTo(String value) {
            addCriterion("EJJSR =", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrNotEqualTo(String value) {
            addCriterion("EJJSR <>", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrGreaterThan(String value) {
            addCriterion("EJJSR >", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrGreaterThanOrEqualTo(String value) {
            addCriterion("EJJSR >=", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrLessThan(String value) {
            addCriterion("EJJSR <", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrLessThanOrEqualTo(String value) {
            addCriterion("EJJSR <=", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrLike(String value) {
            addCriterion("EJJSR like", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrNotLike(String value) {
            addCriterion("EJJSR not like", value, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrIn(List<String> values) {
            addCriterion("EJJSR in", values, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrNotIn(List<String> values) {
            addCriterion("EJJSR not in", values, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrBetween(String value1, String value2) {
            addCriterion("EJJSR between", value1, value2, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrNotBetween(String value1, String value2) {
            addCriterion("EJJSR not between", value1, value2, "ejjsr");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmIsNull() {
            addCriterion("EJJSRXM is null");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmIsNotNull() {
            addCriterion("EJJSRXM is not null");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmEqualTo(String value) {
            addCriterion("EJJSRXM =", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmNotEqualTo(String value) {
            addCriterion("EJJSRXM <>", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmGreaterThan(String value) {
            addCriterion("EJJSRXM >", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmGreaterThanOrEqualTo(String value) {
            addCriterion("EJJSRXM >=", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmLessThan(String value) {
            addCriterion("EJJSRXM <", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmLessThanOrEqualTo(String value) {
            addCriterion("EJJSRXM <=", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmLike(String value) {
            addCriterion("EJJSRXM like", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmNotLike(String value) {
            addCriterion("EJJSRXM not like", value, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmIn(List<String> values) {
            addCriterion("EJJSRXM in", values, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmNotIn(List<String> values) {
            addCriterion("EJJSRXM not in", values, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmBetween(String value1, String value2) {
            addCriterion("EJJSRXM between", value1, value2, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsrxmNotBetween(String value1, String value2) {
            addCriterion("EJJSRXM not between", value1, value2, "ejjsrxm");
            return (Criteria) this;
        }

        public Criteria andEjjsdwIsNull() {
            addCriterion("EJJSDW is null");
            return (Criteria) this;
        }

        public Criteria andEjjsdwIsNotNull() {
            addCriterion("EJJSDW is not null");
            return (Criteria) this;
        }

        public Criteria andEjjsdwEqualTo(String value) {
            addCriterion("EJJSDW =", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwNotEqualTo(String value) {
            addCriterion("EJJSDW <>", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwGreaterThan(String value) {
            addCriterion("EJJSDW >", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwGreaterThanOrEqualTo(String value) {
            addCriterion("EJJSDW >=", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwLessThan(String value) {
            addCriterion("EJJSDW <", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwLessThanOrEqualTo(String value) {
            addCriterion("EJJSDW <=", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwLike(String value) {
            addCriterion("EJJSDW like", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwNotLike(String value) {
            addCriterion("EJJSDW not like", value, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwIn(List<String> values) {
            addCriterion("EJJSDW in", values, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwNotIn(List<String> values) {
            addCriterion("EJJSDW not in", values, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwBetween(String value1, String value2) {
            addCriterion("EJJSDW between", value1, value2, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwNotBetween(String value1, String value2) {
            addCriterion("EJJSDW not between", value1, value2, "ejjsdw");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcIsNull() {
            addCriterion("EJJSDWMC is null");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcIsNotNull() {
            addCriterion("EJJSDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcEqualTo(String value) {
            addCriterion("EJJSDWMC =", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcNotEqualTo(String value) {
            addCriterion("EJJSDWMC <>", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcGreaterThan(String value) {
            addCriterion("EJJSDWMC >", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("EJJSDWMC >=", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcLessThan(String value) {
            addCriterion("EJJSDWMC <", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcLessThanOrEqualTo(String value) {
            addCriterion("EJJSDWMC <=", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcLike(String value) {
            addCriterion("EJJSDWMC like", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcNotLike(String value) {
            addCriterion("EJJSDWMC not like", value, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcIn(List<String> values) {
            addCriterion("EJJSDWMC in", values, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcNotIn(List<String> values) {
            addCriterion("EJJSDWMC not in", values, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcBetween(String value1, String value2) {
            addCriterion("EJJSDWMC between", value1, value2, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andEjjsdwmcNotBetween(String value1, String value2) {
            addCriterion("EJJSDWMC not between", value1, value2, "ejjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjddsjIsNull() {
            addCriterion("SJDDSJ is null");
            return (Criteria) this;
        }

        public Criteria andSjddsjIsNotNull() {
            addCriterion("SJDDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjddsjEqualTo(String value) {
            addCriterion("SJDDSJ =", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjNotEqualTo(String value) {
            addCriterion("SJDDSJ <>", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjGreaterThan(String value) {
            addCriterion("SJDDSJ >", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjGreaterThanOrEqualTo(String value) {
            addCriterion("SJDDSJ >=", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjLessThan(String value) {
            addCriterion("SJDDSJ <", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjLessThanOrEqualTo(String value) {
            addCriterion("SJDDSJ <=", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjLike(String value) {
            addCriterion("SJDDSJ like", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjNotLike(String value) {
            addCriterion("SJDDSJ not like", value, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjIn(List<String> values) {
            addCriterion("SJDDSJ in", values, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjNotIn(List<String> values) {
            addCriterion("SJDDSJ not in", values, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjBetween(String value1, String value2) {
            addCriterion("SJDDSJ between", value1, value2, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjddsjNotBetween(String value1, String value2) {
            addCriterion("SJDDSJ not between", value1, value2, "sjddsj");
            return (Criteria) this;
        }

        public Criteria andSjjssjIsNull() {
            addCriterion("SJJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSjjssjIsNotNull() {
            addCriterion("SJJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjjssjEqualTo(String value) {
            addCriterion("SJJSSJ =", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjNotEqualTo(String value) {
            addCriterion("SJJSSJ <>", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjGreaterThan(String value) {
            addCriterion("SJJSSJ >", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjGreaterThanOrEqualTo(String value) {
            addCriterion("SJJSSJ >=", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjLessThan(String value) {
            addCriterion("SJJSSJ <", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjLessThanOrEqualTo(String value) {
            addCriterion("SJJSSJ <=", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjLike(String value) {
            addCriterion("SJJSSJ like", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjNotLike(String value) {
            addCriterion("SJJSSJ not like", value, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjIn(List<String> values) {
            addCriterion("SJJSSJ in", values, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjNotIn(List<String> values) {
            addCriterion("SJJSSJ not in", values, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjBetween(String value1, String value2) {
            addCriterion("SJJSSJ between", value1, value2, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjssjNotBetween(String value1, String value2) {
            addCriterion("SJJSSJ not between", value1, value2, "sjjssj");
            return (Criteria) this;
        }

        public Criteria andSjjsrIsNull() {
            addCriterion("SJJSR is null");
            return (Criteria) this;
        }

        public Criteria andSjjsrIsNotNull() {
            addCriterion("SJJSR is not null");
            return (Criteria) this;
        }

        public Criteria andSjjsrEqualTo(String value) {
            addCriterion("SJJSR =", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrNotEqualTo(String value) {
            addCriterion("SJJSR <>", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrGreaterThan(String value) {
            addCriterion("SJJSR >", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrGreaterThanOrEqualTo(String value) {
            addCriterion("SJJSR >=", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrLessThan(String value) {
            addCriterion("SJJSR <", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrLessThanOrEqualTo(String value) {
            addCriterion("SJJSR <=", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrLike(String value) {
            addCriterion("SJJSR like", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrNotLike(String value) {
            addCriterion("SJJSR not like", value, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrIn(List<String> values) {
            addCriterion("SJJSR in", values, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrNotIn(List<String> values) {
            addCriterion("SJJSR not in", values, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrBetween(String value1, String value2) {
            addCriterion("SJJSR between", value1, value2, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrNotBetween(String value1, String value2) {
            addCriterion("SJJSR not between", value1, value2, "sjjsr");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmIsNull() {
            addCriterion("SJJSRXM is null");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmIsNotNull() {
            addCriterion("SJJSRXM is not null");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmEqualTo(String value) {
            addCriterion("SJJSRXM =", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmNotEqualTo(String value) {
            addCriterion("SJJSRXM <>", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmGreaterThan(String value) {
            addCriterion("SJJSRXM >", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmGreaterThanOrEqualTo(String value) {
            addCriterion("SJJSRXM >=", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmLessThan(String value) {
            addCriterion("SJJSRXM <", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmLessThanOrEqualTo(String value) {
            addCriterion("SJJSRXM <=", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmLike(String value) {
            addCriterion("SJJSRXM like", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmNotLike(String value) {
            addCriterion("SJJSRXM not like", value, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmIn(List<String> values) {
            addCriterion("SJJSRXM in", values, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmNotIn(List<String> values) {
            addCriterion("SJJSRXM not in", values, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmBetween(String value1, String value2) {
            addCriterion("SJJSRXM between", value1, value2, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsrxmNotBetween(String value1, String value2) {
            addCriterion("SJJSRXM not between", value1, value2, "sjjsrxm");
            return (Criteria) this;
        }

        public Criteria andSjjsdIsNull() {
            addCriterion("SJJSD is null");
            return (Criteria) this;
        }

        public Criteria andSjjsdIsNotNull() {
            addCriterion("SJJSD is not null");
            return (Criteria) this;
        }

        public Criteria andSjjsdEqualTo(String value) {
            addCriterion("SJJSD =", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdNotEqualTo(String value) {
            addCriterion("SJJSD <>", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdGreaterThan(String value) {
            addCriterion("SJJSD >", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdGreaterThanOrEqualTo(String value) {
            addCriterion("SJJSD >=", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdLessThan(String value) {
            addCriterion("SJJSD <", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdLessThanOrEqualTo(String value) {
            addCriterion("SJJSD <=", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdLike(String value) {
            addCriterion("SJJSD like", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdNotLike(String value) {
            addCriterion("SJJSD not like", value, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdIn(List<String> values) {
            addCriterion("SJJSD in", values, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdNotIn(List<String> values) {
            addCriterion("SJJSD not in", values, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdBetween(String value1, String value2) {
            addCriterion("SJJSD between", value1, value2, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdNotBetween(String value1, String value2) {
            addCriterion("SJJSD not between", value1, value2, "sjjsd");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcIsNull() {
            addCriterion("SJJSDWMC is null");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcIsNotNull() {
            addCriterion("SJJSDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcEqualTo(String value) {
            addCriterion("SJJSDWMC =", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcNotEqualTo(String value) {
            addCriterion("SJJSDWMC <>", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcGreaterThan(String value) {
            addCriterion("SJJSDWMC >", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("SJJSDWMC >=", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcLessThan(String value) {
            addCriterion("SJJSDWMC <", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcLessThanOrEqualTo(String value) {
            addCriterion("SJJSDWMC <=", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcLike(String value) {
            addCriterion("SJJSDWMC like", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcNotLike(String value) {
            addCriterion("SJJSDWMC not like", value, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcIn(List<String> values) {
            addCriterion("SJJSDWMC in", values, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcNotIn(List<String> values) {
            addCriterion("SJJSDWMC not in", values, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcBetween(String value1, String value2) {
            addCriterion("SJJSDWMC between", value1, value2, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andSjjsdwmcNotBetween(String value1, String value2) {
            addCriterion("SJJSDWMC not between", value1, value2, "sjjsdwmc");
            return (Criteria) this;
        }

        public Criteria andCjbsIsNull() {
            addCriterion("CJBS is null");
            return (Criteria) this;
        }

        public Criteria andCjbsIsNotNull() {
            addCriterion("CJBS is not null");
            return (Criteria) this;
        }

        public Criteria andCjbsEqualTo(String value) {
            addCriterion("CJBS =", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotEqualTo(String value) {
            addCriterion("CJBS <>", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsGreaterThan(String value) {
            addCriterion("CJBS >", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsGreaterThanOrEqualTo(String value) {
            addCriterion("CJBS >=", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsLessThan(String value) {
            addCriterion("CJBS <", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsLessThanOrEqualTo(String value) {
            addCriterion("CJBS <=", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsLike(String value) {
            addCriterion("CJBS like", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotLike(String value) {
            addCriterion("CJBS not like", value, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsIn(List<String> values) {
            addCriterion("CJBS in", values, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotIn(List<String> values) {
            addCriterion("CJBS not in", values, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsBetween(String value1, String value2) {
            addCriterion("CJBS between", value1, value2, "cjbs");
            return (Criteria) this;
        }

        public Criteria andCjbsNotBetween(String value1, String value2) {
            addCriterion("CJBS not between", value1, value2, "cjbs");
            return (Criteria) this;
        }

        public Criteria andDjdwIsNull() {
            addCriterion("DJDW is null");
            return (Criteria) this;
        }

        public Criteria andDjdwIsNotNull() {
            addCriterion("DJDW is not null");
            return (Criteria) this;
        }

        public Criteria andDjdwEqualTo(String value) {
            addCriterion("DJDW =", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwNotEqualTo(String value) {
            addCriterion("DJDW <>", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwGreaterThan(String value) {
            addCriterion("DJDW >", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwGreaterThanOrEqualTo(String value) {
            addCriterion("DJDW >=", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwLessThan(String value) {
            addCriterion("DJDW <", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwLessThanOrEqualTo(String value) {
            addCriterion("DJDW <=", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwLike(String value) {
            addCriterion("DJDW like", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwNotLike(String value) {
            addCriterion("DJDW not like", value, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwIn(List<String> values) {
            addCriterion("DJDW in", values, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwNotIn(List<String> values) {
            addCriterion("DJDW not in", values, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwBetween(String value1, String value2) {
            addCriterion("DJDW between", value1, value2, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjdwNotBetween(String value1, String value2) {
            addCriterion("DJDW not between", value1, value2, "djdw");
            return (Criteria) this;
        }

        public Criteria andDjrIsNull() {
            addCriterion("DJR is null");
            return (Criteria) this;
        }

        public Criteria andDjrIsNotNull() {
            addCriterion("DJR is not null");
            return (Criteria) this;
        }

        public Criteria andDjrEqualTo(String value) {
            addCriterion("DJR =", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrNotEqualTo(String value) {
            addCriterion("DJR <>", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrGreaterThan(String value) {
            addCriterion("DJR >", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrGreaterThanOrEqualTo(String value) {
            addCriterion("DJR >=", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrLessThan(String value) {
            addCriterion("DJR <", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrLessThanOrEqualTo(String value) {
            addCriterion("DJR <=", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrLike(String value) {
            addCriterion("DJR like", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrNotLike(String value) {
            addCriterion("DJR not like", value, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrIn(List<String> values) {
            addCriterion("DJR in", values, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrNotIn(List<String> values) {
            addCriterion("DJR not in", values, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrBetween(String value1, String value2) {
            addCriterion("DJR between", value1, value2, "djr");
            return (Criteria) this;
        }

        public Criteria andDjrNotBetween(String value1, String value2) {
            addCriterion("DJR not between", value1, value2, "djr");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(String value) {
            addCriterion("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(String value) {
            addCriterion("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(String value) {
            addCriterion("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(String value) {
            addCriterion("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(String value) {
            addCriterion("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(String value) {
            addCriterion("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLike(String value) {
            addCriterion("DJSJ like", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotLike(String value) {
            addCriterion("DJSJ not like", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<String> values) {
            addCriterion("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<String> values) {
            addCriterion("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(String value1, String value2) {
            addCriterion("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(String value1, String value2) {
            addCriterion("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andXgrIsNull() {
            addCriterion("XGR is null");
            return (Criteria) this;
        }

        public Criteria andXgrIsNotNull() {
            addCriterion("XGR is not null");
            return (Criteria) this;
        }

        public Criteria andXgrEqualTo(String value) {
            addCriterion("XGR =", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotEqualTo(String value) {
            addCriterion("XGR <>", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThan(String value) {
            addCriterion("XGR >", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThanOrEqualTo(String value) {
            addCriterion("XGR >=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThan(String value) {
            addCriterion("XGR <", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThanOrEqualTo(String value) {
            addCriterion("XGR <=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLike(String value) {
            addCriterion("XGR like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotLike(String value) {
            addCriterion("XGR not like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrIn(List<String> values) {
            addCriterion("XGR in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotIn(List<String> values) {
            addCriterion("XGR not in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrBetween(String value1, String value2) {
            addCriterion("XGR between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotBetween(String value1, String value2) {
            addCriterion("XGR not between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNull() {
            addCriterion("XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNotNull() {
            addCriterion("XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXgsjEqualTo(String value) {
            addCriterion("XGSJ =", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotEqualTo(String value) {
            addCriterion("XGSJ <>", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThan(String value) {
            addCriterion("XGSJ >", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThanOrEqualTo(String value) {
            addCriterion("XGSJ >=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThan(String value) {
            addCriterion("XGSJ <", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThanOrEqualTo(String value) {
            addCriterion("XGSJ <=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLike(String value) {
            addCriterion("XGSJ like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotLike(String value) {
            addCriterion("XGSJ not like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjIn(List<String> values) {
            addCriterion("XGSJ in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotIn(List<String> values) {
            addCriterion("XGSJ not in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjBetween(String value1, String value2) {
            addCriterion("XGSJ between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotBetween(String value1, String value2) {
            addCriterion("XGSJ not between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgdwIsNull() {
            addCriterion("XGDW is null");
            return (Criteria) this;
        }

        public Criteria andXgdwIsNotNull() {
            addCriterion("XGDW is not null");
            return (Criteria) this;
        }

        public Criteria andXgdwEqualTo(String value) {
            addCriterion("XGDW =", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwNotEqualTo(String value) {
            addCriterion("XGDW <>", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwGreaterThan(String value) {
            addCriterion("XGDW >", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwGreaterThanOrEqualTo(String value) {
            addCriterion("XGDW >=", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwLessThan(String value) {
            addCriterion("XGDW <", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwLessThanOrEqualTo(String value) {
            addCriterion("XGDW <=", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwLike(String value) {
            addCriterion("XGDW like", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwNotLike(String value) {
            addCriterion("XGDW not like", value, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwIn(List<String> values) {
            addCriterion("XGDW in", values, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwNotIn(List<String> values) {
            addCriterion("XGDW not in", values, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwBetween(String value1, String value2) {
            addCriterion("XGDW between", value1, value2, "xgdw");
            return (Criteria) this;
        }

        public Criteria andXgdwNotBetween(String value1, String value2) {
            addCriterion("XGDW not between", value1, value2, "xgdw");
            return (Criteria) this;
        }

        public Criteria andDjrxmIsNull() {
            addCriterion("DJRXM is null");
            return (Criteria) this;
        }

        public Criteria andDjrxmIsNotNull() {
            addCriterion("DJRXM is not null");
            return (Criteria) this;
        }

        public Criteria andDjrxmEqualTo(String value) {
            addCriterion("DJRXM =", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmNotEqualTo(String value) {
            addCriterion("DJRXM <>", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmGreaterThan(String value) {
            addCriterion("DJRXM >", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmGreaterThanOrEqualTo(String value) {
            addCriterion("DJRXM >=", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmLessThan(String value) {
            addCriterion("DJRXM <", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmLessThanOrEqualTo(String value) {
            addCriterion("DJRXM <=", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmLike(String value) {
            addCriterion("DJRXM like", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmNotLike(String value) {
            addCriterion("DJRXM not like", value, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmIn(List<String> values) {
            addCriterion("DJRXM in", values, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmNotIn(List<String> values) {
            addCriterion("DJRXM not in", values, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmBetween(String value1, String value2) {
            addCriterion("DJRXM between", value1, value2, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjrxmNotBetween(String value1, String value2) {
            addCriterion("DJRXM not between", value1, value2, "djrxm");
            return (Criteria) this;
        }

        public Criteria andDjdwmcIsNull() {
            addCriterion("DJDWMC is null");
            return (Criteria) this;
        }

        public Criteria andDjdwmcIsNotNull() {
            addCriterion("DJDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjdwmcEqualTo(String value) {
            addCriterion("DJDWMC =", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcNotEqualTo(String value) {
            addCriterion("DJDWMC <>", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcGreaterThan(String value) {
            addCriterion("DJDWMC >", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("DJDWMC >=", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcLessThan(String value) {
            addCriterion("DJDWMC <", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcLessThanOrEqualTo(String value) {
            addCriterion("DJDWMC <=", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcLike(String value) {
            addCriterion("DJDWMC like", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcNotLike(String value) {
            addCriterion("DJDWMC not like", value, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcIn(List<String> values) {
            addCriterion("DJDWMC in", values, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcNotIn(List<String> values) {
            addCriterion("DJDWMC not in", values, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcBetween(String value1, String value2) {
            addCriterion("DJDWMC between", value1, value2, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andDjdwmcNotBetween(String value1, String value2) {
            addCriterion("DJDWMC not between", value1, value2, "djdwmc");
            return (Criteria) this;
        }

        public Criteria andXgrxmIsNull() {
            addCriterion("XGRXM is null");
            return (Criteria) this;
        }

        public Criteria andXgrxmIsNotNull() {
            addCriterion("XGRXM is not null");
            return (Criteria) this;
        }

        public Criteria andXgrxmEqualTo(String value) {
            addCriterion("XGRXM =", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmNotEqualTo(String value) {
            addCriterion("XGRXM <>", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmGreaterThan(String value) {
            addCriterion("XGRXM >", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmGreaterThanOrEqualTo(String value) {
            addCriterion("XGRXM >=", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmLessThan(String value) {
            addCriterion("XGRXM <", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmLessThanOrEqualTo(String value) {
            addCriterion("XGRXM <=", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmLike(String value) {
            addCriterion("XGRXM like", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmNotLike(String value) {
            addCriterion("XGRXM not like", value, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmIn(List<String> values) {
            addCriterion("XGRXM in", values, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmNotIn(List<String> values) {
            addCriterion("XGRXM not in", values, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmBetween(String value1, String value2) {
            addCriterion("XGRXM between", value1, value2, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgrxmNotBetween(String value1, String value2) {
            addCriterion("XGRXM not between", value1, value2, "xgrxm");
            return (Criteria) this;
        }

        public Criteria andXgdwmcIsNull() {
            addCriterion("XGDWMC is null");
            return (Criteria) this;
        }

        public Criteria andXgdwmcIsNotNull() {
            addCriterion("XGDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andXgdwmcEqualTo(String value) {
            addCriterion("XGDWMC =", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcNotEqualTo(String value) {
            addCriterion("XGDWMC <>", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcGreaterThan(String value) {
            addCriterion("XGDWMC >", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("XGDWMC >=", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcLessThan(String value) {
            addCriterion("XGDWMC <", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcLessThanOrEqualTo(String value) {
            addCriterion("XGDWMC <=", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcLike(String value) {
            addCriterion("XGDWMC like", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcNotLike(String value) {
            addCriterion("XGDWMC not like", value, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcIn(List<String> values) {
            addCriterion("XGDWMC in", values, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcNotIn(List<String> values) {
            addCriterion("XGDWMC not in", values, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcBetween(String value1, String value2) {
            addCriterion("XGDWMC between", value1, value2, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andXgdwmcNotBetween(String value1, String value2) {
            addCriterion("XGDWMC not between", value1, value2, "xgdwmc");
            return (Criteria) this;
        }

        public Criteria andJjrqsjIsNull() {
            addCriterion("JJRQSJ is null");
            return (Criteria) this;
        }

        public Criteria andJjrqsjIsNotNull() {
            addCriterion("JJRQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJjrqsjEqualTo(String value) {
            addCriterion("JJRQSJ =", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotEqualTo(String value) {
            addCriterion("JJRQSJ <>", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjGreaterThan(String value) {
            addCriterion("JJRQSJ >", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjGreaterThanOrEqualTo(String value) {
            addCriterion("JJRQSJ >=", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjLessThan(String value) {
            addCriterion("JJRQSJ <", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjLessThanOrEqualTo(String value) {
            addCriterion("JJRQSJ <=", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjLike(String value) {
            addCriterion("JJRQSJ like", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotLike(String value) {
            addCriterion("JJRQSJ not like", value, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjIn(List<String> values) {
            addCriterion("JJRQSJ in", values, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotIn(List<String> values) {
            addCriterion("JJRQSJ not in", values, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjBetween(String value1, String value2) {
            addCriterion("JJRQSJ between", value1, value2, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjrqsjNotBetween(String value1, String value2) {
            addCriterion("JJRQSJ not between", value1, value2, "jjrqsj");
            return (Criteria) this;
        }

        public Criteria andJjdwIsNull() {
            addCriterion("JJDW is null");
            return (Criteria) this;
        }

        public Criteria andJjdwIsNotNull() {
            addCriterion("JJDW is not null");
            return (Criteria) this;
        }

        public Criteria andJjdwEqualTo(String value) {
            addCriterion("JJDW =", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotEqualTo(String value) {
            addCriterion("JJDW <>", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwGreaterThan(String value) {
            addCriterion("JJDW >", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwGreaterThanOrEqualTo(String value) {
            addCriterion("JJDW >=", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwLessThan(String value) {
            addCriterion("JJDW <", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwLessThanOrEqualTo(String value) {
            addCriterion("JJDW <=", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwLike(String value) {
            addCriterion("JJDW like", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotLike(String value) {
            addCriterion("JJDW not like", value, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwIn(List<String> values) {
            addCriterion("JJDW in", values, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotIn(List<String> values) {
            addCriterion("JJDW not in", values, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwBetween(String value1, String value2) {
            addCriterion("JJDW between", value1, value2, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwNotBetween(String value1, String value2) {
            addCriterion("JJDW not between", value1, value2, "jjdw");
            return (Criteria) this;
        }

        public Criteria andJjdwmcIsNull() {
            addCriterion("JJDWMC is null");
            return (Criteria) this;
        }

        public Criteria andJjdwmcIsNotNull() {
            addCriterion("JJDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andJjdwmcEqualTo(String value) {
            addCriterion("JJDWMC =", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcNotEqualTo(String value) {
            addCriterion("JJDWMC <>", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcGreaterThan(String value) {
            addCriterion("JJDWMC >", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("JJDWMC >=", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcLessThan(String value) {
            addCriterion("JJDWMC <", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcLessThanOrEqualTo(String value) {
            addCriterion("JJDWMC <=", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcLike(String value) {
            addCriterion("JJDWMC like", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcNotLike(String value) {
            addCriterion("JJDWMC not like", value, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcIn(List<String> values) {
            addCriterion("JJDWMC in", values, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcNotIn(List<String> values) {
            addCriterion("JJDWMC not in", values, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcBetween(String value1, String value2) {
            addCriterion("JJDWMC between", value1, value2, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjdwmcNotBetween(String value1, String value2) {
            addCriterion("JJDWMC not between", value1, value2, "jjdwmc");
            return (Criteria) this;
        }

        public Criteria andJjrIsNull() {
            addCriterion("JJR is null");
            return (Criteria) this;
        }

        public Criteria andJjrIsNotNull() {
            addCriterion("JJR is not null");
            return (Criteria) this;
        }

        public Criteria andJjrEqualTo(String value) {
            addCriterion("JJR =", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrNotEqualTo(String value) {
            addCriterion("JJR <>", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrGreaterThan(String value) {
            addCriterion("JJR >", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrGreaterThanOrEqualTo(String value) {
            addCriterion("JJR >=", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrLessThan(String value) {
            addCriterion("JJR <", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrLessThanOrEqualTo(String value) {
            addCriterion("JJR <=", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrLike(String value) {
            addCriterion("JJR like", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrNotLike(String value) {
            addCriterion("JJR not like", value, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrIn(List<String> values) {
            addCriterion("JJR in", values, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrNotIn(List<String> values) {
            addCriterion("JJR not in", values, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrBetween(String value1, String value2) {
            addCriterion("JJR between", value1, value2, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrNotBetween(String value1, String value2) {
            addCriterion("JJR not between", value1, value2, "jjr");
            return (Criteria) this;
        }

        public Criteria andJjrxmIsNull() {
            addCriterion("JJRXM is null");
            return (Criteria) this;
        }

        public Criteria andJjrxmIsNotNull() {
            addCriterion("JJRXM is not null");
            return (Criteria) this;
        }

        public Criteria andJjrxmEqualTo(String value) {
            addCriterion("JJRXM =", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotEqualTo(String value) {
            addCriterion("JJRXM <>", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmGreaterThan(String value) {
            addCriterion("JJRXM >", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmGreaterThanOrEqualTo(String value) {
            addCriterion("JJRXM >=", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmLessThan(String value) {
            addCriterion("JJRXM <", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmLessThanOrEqualTo(String value) {
            addCriterion("JJRXM <=", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmLike(String value) {
            addCriterion("JJRXM like", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotLike(String value) {
            addCriterion("JJRXM not like", value, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmIn(List<String> values) {
            addCriterion("JJRXM in", values, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotIn(List<String> values) {
            addCriterion("JJRXM not in", values, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmBetween(String value1, String value2) {
            addCriterion("JJRXM between", value1, value2, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andJjrxmNotBetween(String value1, String value2) {
            addCriterion("JJRXM not between", value1, value2, "jjrxm");
            return (Criteria) this;
        }

        public Criteria andYjdwIsNull() {
            addCriterion("YJDW is null");
            return (Criteria) this;
        }

        public Criteria andYjdwIsNotNull() {
            addCriterion("YJDW is not null");
            return (Criteria) this;
        }

        public Criteria andYjdwEqualTo(String value) {
            addCriterion("YJDW =", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwNotEqualTo(String value) {
            addCriterion("YJDW <>", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwGreaterThan(String value) {
            addCriterion("YJDW >", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwGreaterThanOrEqualTo(String value) {
            addCriterion("YJDW >=", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwLessThan(String value) {
            addCriterion("YJDW <", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwLessThanOrEqualTo(String value) {
            addCriterion("YJDW <=", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwLike(String value) {
            addCriterion("YJDW like", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwNotLike(String value) {
            addCriterion("YJDW not like", value, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwIn(List<String> values) {
            addCriterion("YJDW in", values, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwNotIn(List<String> values) {
            addCriterion("YJDW not in", values, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwBetween(String value1, String value2) {
            addCriterion("YJDW between", value1, value2, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjdwNotBetween(String value1, String value2) {
            addCriterion("YJDW not between", value1, value2, "yjdw");
            return (Criteria) this;
        }

        public Criteria andYjsjIsNull() {
            addCriterion("YJSJ is null");
            return (Criteria) this;
        }

        public Criteria andYjsjIsNotNull() {
            addCriterion("YJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYjsjEqualTo(String value) {
            addCriterion("YJSJ =", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjNotEqualTo(String value) {
            addCriterion("YJSJ <>", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjGreaterThan(String value) {
            addCriterion("YJSJ >", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjGreaterThanOrEqualTo(String value) {
            addCriterion("YJSJ >=", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjLessThan(String value) {
            addCriterion("YJSJ <", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjLessThanOrEqualTo(String value) {
            addCriterion("YJSJ <=", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjLike(String value) {
            addCriterion("YJSJ like", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjNotLike(String value) {
            addCriterion("YJSJ not like", value, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjIn(List<String> values) {
            addCriterion("YJSJ in", values, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjNotIn(List<String> values) {
            addCriterion("YJSJ not in", values, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjBetween(String value1, String value2) {
            addCriterion("YJSJ between", value1, value2, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsjNotBetween(String value1, String value2) {
            addCriterion("YJSJ not between", value1, value2, "yjsj");
            return (Criteria) this;
        }

        public Criteria andYjsmIsNull() {
            addCriterion("YJSM is null");
            return (Criteria) this;
        }

        public Criteria andYjsmIsNotNull() {
            addCriterion("YJSM is not null");
            return (Criteria) this;
        }

        public Criteria andYjsmEqualTo(String value) {
            addCriterion("YJSM =", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmNotEqualTo(String value) {
            addCriterion("YJSM <>", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmGreaterThan(String value) {
            addCriterion("YJSM >", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmGreaterThanOrEqualTo(String value) {
            addCriterion("YJSM >=", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmLessThan(String value) {
            addCriterion("YJSM <", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmLessThanOrEqualTo(String value) {
            addCriterion("YJSM <=", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmLike(String value) {
            addCriterion("YJSM like", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmNotLike(String value) {
            addCriterion("YJSM not like", value, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmIn(List<String> values) {
            addCriterion("YJSM in", values, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmNotIn(List<String> values) {
            addCriterion("YJSM not in", values, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmBetween(String value1, String value2) {
            addCriterion("YJSM between", value1, value2, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjsmNotBetween(String value1, String value2) {
            addCriterion("YJSM not between", value1, value2, "yjsm");
            return (Criteria) this;
        }

        public Criteria andYjrIsNull() {
            addCriterion("YJR is null");
            return (Criteria) this;
        }

        public Criteria andYjrIsNotNull() {
            addCriterion("YJR is not null");
            return (Criteria) this;
        }

        public Criteria andYjrEqualTo(String value) {
            addCriterion("YJR =", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrNotEqualTo(String value) {
            addCriterion("YJR <>", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrGreaterThan(String value) {
            addCriterion("YJR >", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrGreaterThanOrEqualTo(String value) {
            addCriterion("YJR >=", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrLessThan(String value) {
            addCriterion("YJR <", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrLessThanOrEqualTo(String value) {
            addCriterion("YJR <=", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrLike(String value) {
            addCriterion("YJR like", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrNotLike(String value) {
            addCriterion("YJR not like", value, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrIn(List<String> values) {
            addCriterion("YJR in", values, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrNotIn(List<String> values) {
            addCriterion("YJR not in", values, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrBetween(String value1, String value2) {
            addCriterion("YJR between", value1, value2, "yjr");
            return (Criteria) this;
        }

        public Criteria andYjrNotBetween(String value1, String value2) {
            addCriterion("YJR not between", value1, value2, "yjr");
            return (Criteria) this;
        }

        public Criteria andJjxzqhIsNull() {
            addCriterion("JJXZQH is null");
            return (Criteria) this;
        }

        public Criteria andJjxzqhIsNotNull() {
            addCriterion("JJXZQH is not null");
            return (Criteria) this;
        }

        public Criteria andJjxzqhEqualTo(String value) {
            addCriterion("JJXZQH =", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhNotEqualTo(String value) {
            addCriterion("JJXZQH <>", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhGreaterThan(String value) {
            addCriterion("JJXZQH >", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhGreaterThanOrEqualTo(String value) {
            addCriterion("JJXZQH >=", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhLessThan(String value) {
            addCriterion("JJXZQH <", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhLessThanOrEqualTo(String value) {
            addCriterion("JJXZQH <=", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhLike(String value) {
            addCriterion("JJXZQH like", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhNotLike(String value) {
            addCriterion("JJXZQH not like", value, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhIn(List<String> values) {
            addCriterion("JJXZQH in", values, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhNotIn(List<String> values) {
            addCriterion("JJXZQH not in", values, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhBetween(String value1, String value2) {
            addCriterion("JJXZQH between", value1, value2, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjxzqhNotBetween(String value1, String value2) {
            addCriterion("JJXZQH not between", value1, value2, "jjxzqh");
            return (Criteria) this;
        }

        public Criteria andJjgxdwIsNull() {
            addCriterion("JJGXDW is null");
            return (Criteria) this;
        }

        public Criteria andJjgxdwIsNotNull() {
            addCriterion("JJGXDW is not null");
            return (Criteria) this;
        }

        public Criteria andJjgxdwEqualTo(String value) {
            addCriterion("JJGXDW =", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwNotEqualTo(String value) {
            addCriterion("JJGXDW <>", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwGreaterThan(String value) {
            addCriterion("JJGXDW >", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwGreaterThanOrEqualTo(String value) {
            addCriterion("JJGXDW >=", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwLessThan(String value) {
            addCriterion("JJGXDW <", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwLessThanOrEqualTo(String value) {
            addCriterion("JJGXDW <=", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwLike(String value) {
            addCriterion("JJGXDW like", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwNotLike(String value) {
            addCriterion("JJGXDW not like", value, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwIn(List<String> values) {
            addCriterion("JJGXDW in", values, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwNotIn(List<String> values) {
            addCriterion("JJGXDW not in", values, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwBetween(String value1, String value2) {
            addCriterion("JJGXDW between", value1, value2, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andJjgxdwNotBetween(String value1, String value2) {
            addCriterion("JJGXDW not between", value1, value2, "jjgxdw");
            return (Criteria) this;
        }

        public Criteria andFkyqIsNull() {
            addCriterion("FKYQ is null");
            return (Criteria) this;
        }

        public Criteria andFkyqIsNotNull() {
            addCriterion("FKYQ is not null");
            return (Criteria) this;
        }

        public Criteria andFkyqEqualTo(String value) {
            addCriterion("FKYQ =", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqNotEqualTo(String value) {
            addCriterion("FKYQ <>", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqGreaterThan(String value) {
            addCriterion("FKYQ >", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqGreaterThanOrEqualTo(String value) {
            addCriterion("FKYQ >=", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqLessThan(String value) {
            addCriterion("FKYQ <", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqLessThanOrEqualTo(String value) {
            addCriterion("FKYQ <=", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqLike(String value) {
            addCriterion("FKYQ like", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqNotLike(String value) {
            addCriterion("FKYQ not like", value, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqIn(List<String> values) {
            addCriterion("FKYQ in", values, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqNotIn(List<String> values) {
            addCriterion("FKYQ not in", values, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqBetween(String value1, String value2) {
            addCriterion("FKYQ between", value1, value2, "fkyq");
            return (Criteria) this;
        }

        public Criteria andFkyqNotBetween(String value1, String value2) {
            addCriterion("FKYQ not between", value1, value2, "fkyq");
            return (Criteria) this;
        }

        public Criteria andSfyfdxIsNull() {
            addCriterion("SFYFDX is null");
            return (Criteria) this;
        }

        public Criteria andSfyfdxIsNotNull() {
            addCriterion("SFYFDX is not null");
            return (Criteria) this;
        }

        public Criteria andSfyfdxEqualTo(String value) {
            addCriterion("SFYFDX =", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxNotEqualTo(String value) {
            addCriterion("SFYFDX <>", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxGreaterThan(String value) {
            addCriterion("SFYFDX >", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxGreaterThanOrEqualTo(String value) {
            addCriterion("SFYFDX >=", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxLessThan(String value) {
            addCriterion("SFYFDX <", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxLessThanOrEqualTo(String value) {
            addCriterion("SFYFDX <=", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxLike(String value) {
            addCriterion("SFYFDX like", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxNotLike(String value) {
            addCriterion("SFYFDX not like", value, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxIn(List<String> values) {
            addCriterion("SFYFDX in", values, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxNotIn(List<String> values) {
            addCriterion("SFYFDX not in", values, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxBetween(String value1, String value2) {
            addCriterion("SFYFDX between", value1, value2, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andSfyfdxNotBetween(String value1, String value2) {
            addCriterion("SFYFDX not between", value1, value2, "sfyfdx");
            return (Criteria) this;
        }

        public Criteria andJjdxnrIsNull() {
            addCriterion("JJDXNR is null");
            return (Criteria) this;
        }

        public Criteria andJjdxnrIsNotNull() {
            addCriterion("JJDXNR is not null");
            return (Criteria) this;
        }

        public Criteria andJjdxnrEqualTo(String value) {
            addCriterion("JJDXNR =", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrNotEqualTo(String value) {
            addCriterion("JJDXNR <>", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrGreaterThan(String value) {
            addCriterion("JJDXNR >", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrGreaterThanOrEqualTo(String value) {
            addCriterion("JJDXNR >=", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrLessThan(String value) {
            addCriterion("JJDXNR <", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrLessThanOrEqualTo(String value) {
            addCriterion("JJDXNR <=", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrLike(String value) {
            addCriterion("JJDXNR like", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrNotLike(String value) {
            addCriterion("JJDXNR not like", value, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrIn(List<String> values) {
            addCriterion("JJDXNR in", values, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrNotIn(List<String> values) {
            addCriterion("JJDXNR not in", values, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrBetween(String value1, String value2) {
            addCriterion("JJDXNR between", value1, value2, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxnrNotBetween(String value1, String value2) {
            addCriterion("JJDXNR not between", value1, value2, "jjdxnr");
            return (Criteria) this;
        }

        public Criteria andJjdxsjIsNull() {
            addCriterion("JJDXSJ is null");
            return (Criteria) this;
        }

        public Criteria andJjdxsjIsNotNull() {
            addCriterion("JJDXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJjdxsjEqualTo(String value) {
            addCriterion("JJDXSJ =", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjNotEqualTo(String value) {
            addCriterion("JJDXSJ <>", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjGreaterThan(String value) {
            addCriterion("JJDXSJ >", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjGreaterThanOrEqualTo(String value) {
            addCriterion("JJDXSJ >=", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjLessThan(String value) {
            addCriterion("JJDXSJ <", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjLessThanOrEqualTo(String value) {
            addCriterion("JJDXSJ <=", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjLike(String value) {
            addCriterion("JJDXSJ like", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjNotLike(String value) {
            addCriterion("JJDXSJ not like", value, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjIn(List<String> values) {
            addCriterion("JJDXSJ in", values, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjNotIn(List<String> values) {
            addCriterion("JJDXSJ not in", values, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjBetween(String value1, String value2) {
            addCriterion("JJDXSJ between", value1, value2, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andJjdxsjNotBetween(String value1, String value2) {
            addCriterion("JJDXSJ not between", value1, value2, "jjdxsj");
            return (Criteria) this;
        }

        public Criteria andSbsjIsNull() {
            addCriterion("SBSJ is null");
            return (Criteria) this;
        }

        public Criteria andSbsjIsNotNull() {
            addCriterion("SBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSbsjEqualTo(String value) {
            addCriterion("SBSJ =", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotEqualTo(String value) {
            addCriterion("SBSJ <>", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjGreaterThan(String value) {
            addCriterion("SBSJ >", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjGreaterThanOrEqualTo(String value) {
            addCriterion("SBSJ >=", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjLessThan(String value) {
            addCriterion("SBSJ <", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjLessThanOrEqualTo(String value) {
            addCriterion("SBSJ <=", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjLike(String value) {
            addCriterion("SBSJ like", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotLike(String value) {
            addCriterion("SBSJ not like", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjIn(List<String> values) {
            addCriterion("SBSJ in", values, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotIn(List<String> values) {
            addCriterion("SBSJ not in", values, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjBetween(String value1, String value2) {
            addCriterion("SBSJ between", value1, value2, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotBetween(String value1, String value2) {
            addCriterion("SBSJ not between", value1, value2, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbnrIsNull() {
            addCriterion("SBNR is null");
            return (Criteria) this;
        }

        public Criteria andSbnrIsNotNull() {
            addCriterion("SBNR is not null");
            return (Criteria) this;
        }

        public Criteria andSbnrEqualTo(String value) {
            addCriterion("SBNR =", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrNotEqualTo(String value) {
            addCriterion("SBNR <>", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrGreaterThan(String value) {
            addCriterion("SBNR >", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrGreaterThanOrEqualTo(String value) {
            addCriterion("SBNR >=", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrLessThan(String value) {
            addCriterion("SBNR <", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrLessThanOrEqualTo(String value) {
            addCriterion("SBNR <=", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrLike(String value) {
            addCriterion("SBNR like", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrNotLike(String value) {
            addCriterion("SBNR not like", value, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrIn(List<String> values) {
            addCriterion("SBNR in", values, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrNotIn(List<String> values) {
            addCriterion("SBNR not in", values, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrBetween(String value1, String value2) {
            addCriterion("SBNR between", value1, value2, "sbnr");
            return (Criteria) this;
        }

        public Criteria andSbnrNotBetween(String value1, String value2) {
            addCriterion("SBNR not between", value1, value2, "sbnr");
            return (Criteria) this;
        }

        public Criteria andCdclbmIsNull() {
            addCriterion("CDCLBM is null");
            return (Criteria) this;
        }

        public Criteria andCdclbmIsNotNull() {
            addCriterion("CDCLBM is not null");
            return (Criteria) this;
        }

        public Criteria andCdclbmEqualTo(String value) {
            addCriterion("CDCLBM =", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmNotEqualTo(String value) {
            addCriterion("CDCLBM <>", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmGreaterThan(String value) {
            addCriterion("CDCLBM >", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmGreaterThanOrEqualTo(String value) {
            addCriterion("CDCLBM >=", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmLessThan(String value) {
            addCriterion("CDCLBM <", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmLessThanOrEqualTo(String value) {
            addCriterion("CDCLBM <=", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmLike(String value) {
            addCriterion("CDCLBM like", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmNotLike(String value) {
            addCriterion("CDCLBM not like", value, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmIn(List<String> values) {
            addCriterion("CDCLBM in", values, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmNotIn(List<String> values) {
            addCriterion("CDCLBM not in", values, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmBetween(String value1, String value2) {
            addCriterion("CDCLBM between", value1, value2, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andCdclbmNotBetween(String value1, String value2) {
            addCriterion("CDCLBM not between", value1, value2, "cdclbm");
            return (Criteria) this;
        }

        public Criteria andJjlxIsNull() {
            addCriterion("JJLX is null");
            return (Criteria) this;
        }

        public Criteria andJjlxIsNotNull() {
            addCriterion("JJLX is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxEqualTo(String value) {
            addCriterion("JJLX =", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxNotEqualTo(String value) {
            addCriterion("JJLX <>", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxGreaterThan(String value) {
            addCriterion("JJLX >", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxGreaterThanOrEqualTo(String value) {
            addCriterion("JJLX >=", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxLessThan(String value) {
            addCriterion("JJLX <", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxLessThanOrEqualTo(String value) {
            addCriterion("JJLX <=", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxLike(String value) {
            addCriterion("JJLX like", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxNotLike(String value) {
            addCriterion("JJLX not like", value, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxIn(List<String> values) {
            addCriterion("JJLX in", values, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxNotIn(List<String> values) {
            addCriterion("JJLX not in", values, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxBetween(String value1, String value2) {
            addCriterion("JJLX between", value1, value2, "jjlx");
            return (Criteria) this;
        }

        public Criteria andJjlxNotBetween(String value1, String value2) {
            addCriterion("JJLX not between", value1, value2, "jjlx");
            return (Criteria) this;
        }

        public Criteria andZdyjrIsNull() {
            addCriterion("ZDYJR is null");
            return (Criteria) this;
        }

        public Criteria andZdyjrIsNotNull() {
            addCriterion("ZDYJR is not null");
            return (Criteria) this;
        }

        public Criteria andZdyjrEqualTo(String value) {
            addCriterion("ZDYJR =", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrNotEqualTo(String value) {
            addCriterion("ZDYJR <>", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrGreaterThan(String value) {
            addCriterion("ZDYJR >", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrGreaterThanOrEqualTo(String value) {
            addCriterion("ZDYJR >=", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrLessThan(String value) {
            addCriterion("ZDYJR <", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrLessThanOrEqualTo(String value) {
            addCriterion("ZDYJR <=", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrLike(String value) {
            addCriterion("ZDYJR like", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrNotLike(String value) {
            addCriterion("ZDYJR not like", value, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrIn(List<String> values) {
            addCriterion("ZDYJR in", values, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrNotIn(List<String> values) {
            addCriterion("ZDYJR not in", values, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrBetween(String value1, String value2) {
            addCriterion("ZDYJR between", value1, value2, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjrNotBetween(String value1, String value2) {
            addCriterion("ZDYJR not between", value1, value2, "zdyjr");
            return (Criteria) this;
        }

        public Criteria andZdyjdwIsNull() {
            addCriterion("ZDYJDW is null");
            return (Criteria) this;
        }

        public Criteria andZdyjdwIsNotNull() {
            addCriterion("ZDYJDW is not null");
            return (Criteria) this;
        }

        public Criteria andZdyjdwEqualTo(String value) {
            addCriterion("ZDYJDW =", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwNotEqualTo(String value) {
            addCriterion("ZDYJDW <>", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwGreaterThan(String value) {
            addCriterion("ZDYJDW >", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwGreaterThanOrEqualTo(String value) {
            addCriterion("ZDYJDW >=", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwLessThan(String value) {
            addCriterion("ZDYJDW <", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwLessThanOrEqualTo(String value) {
            addCriterion("ZDYJDW <=", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwLike(String value) {
            addCriterion("ZDYJDW like", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwNotLike(String value) {
            addCriterion("ZDYJDW not like", value, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwIn(List<String> values) {
            addCriterion("ZDYJDW in", values, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwNotIn(List<String> values) {
            addCriterion("ZDYJDW not in", values, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwBetween(String value1, String value2) {
            addCriterion("ZDYJDW between", value1, value2, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjdwNotBetween(String value1, String value2) {
            addCriterion("ZDYJDW not between", value1, value2, "zdyjdw");
            return (Criteria) this;
        }

        public Criteria andZdyjsjIsNull() {
            addCriterion("ZDYJSJ is null");
            return (Criteria) this;
        }

        public Criteria andZdyjsjIsNotNull() {
            addCriterion("ZDYJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZdyjsjEqualTo(String value) {
            addCriterion("ZDYJSJ =", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjNotEqualTo(String value) {
            addCriterion("ZDYJSJ <>", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjGreaterThan(String value) {
            addCriterion("ZDYJSJ >", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjGreaterThanOrEqualTo(String value) {
            addCriterion("ZDYJSJ >=", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjLessThan(String value) {
            addCriterion("ZDYJSJ <", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjLessThanOrEqualTo(String value) {
            addCriterion("ZDYJSJ <=", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjLike(String value) {
            addCriterion("ZDYJSJ like", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjNotLike(String value) {
            addCriterion("ZDYJSJ not like", value, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjIn(List<String> values) {
            addCriterion("ZDYJSJ in", values, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjNotIn(List<String> values) {
            addCriterion("ZDYJSJ not in", values, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjBetween(String value1, String value2) {
            addCriterion("ZDYJSJ between", value1, value2, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsjNotBetween(String value1, String value2) {
            addCriterion("ZDYJSJ not between", value1, value2, "zdyjsj");
            return (Criteria) this;
        }

        public Criteria andZdyjsmIsNull() {
            addCriterion("ZDYJSM is null");
            return (Criteria) this;
        }

        public Criteria andZdyjsmIsNotNull() {
            addCriterion("ZDYJSM is not null");
            return (Criteria) this;
        }

        public Criteria andZdyjsmEqualTo(String value) {
            addCriterion("ZDYJSM =", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmNotEqualTo(String value) {
            addCriterion("ZDYJSM <>", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmGreaterThan(String value) {
            addCriterion("ZDYJSM >", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDYJSM >=", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmLessThan(String value) {
            addCriterion("ZDYJSM <", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmLessThanOrEqualTo(String value) {
            addCriterion("ZDYJSM <=", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmLike(String value) {
            addCriterion("ZDYJSM like", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmNotLike(String value) {
            addCriterion("ZDYJSM not like", value, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmIn(List<String> values) {
            addCriterion("ZDYJSM in", values, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmNotIn(List<String> values) {
            addCriterion("ZDYJSM not in", values, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmBetween(String value1, String value2) {
            addCriterion("ZDYJSM between", value1, value2, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andZdyjsmNotBetween(String value1, String value2) {
            addCriterion("ZDYJSM not between", value1, value2, "zdyjsm");
            return (Criteria) this;
        }

        public Criteria andSfbddhIsNull() {
            addCriterion("SFBDDH is null");
            return (Criteria) this;
        }

        public Criteria andSfbddhIsNotNull() {
            addCriterion("SFBDDH is not null");
            return (Criteria) this;
        }

        public Criteria andSfbddhEqualTo(String value) {
            addCriterion("SFBDDH =", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhNotEqualTo(String value) {
            addCriterion("SFBDDH <>", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhGreaterThan(String value) {
            addCriterion("SFBDDH >", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhGreaterThanOrEqualTo(String value) {
            addCriterion("SFBDDH >=", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhLessThan(String value) {
            addCriterion("SFBDDH <", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhLessThanOrEqualTo(String value) {
            addCriterion("SFBDDH <=", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhLike(String value) {
            addCriterion("SFBDDH like", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhNotLike(String value) {
            addCriterion("SFBDDH not like", value, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhIn(List<String> values) {
            addCriterion("SFBDDH in", values, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhNotIn(List<String> values) {
            addCriterion("SFBDDH not in", values, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhBetween(String value1, String value2) {
            addCriterion("SFBDDH between", value1, value2, "sfbddh");
            return (Criteria) this;
        }

        public Criteria andSfbddhNotBetween(String value1, String value2) {
            addCriterion("SFBDDH not between", value1, value2, "sfbddh");
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
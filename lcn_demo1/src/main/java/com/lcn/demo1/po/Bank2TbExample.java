package com.lcn.demo1.po;

import java.util.ArrayList;
import java.util.List;

public class Bank2TbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Bank2TbExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Long value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Long value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Long value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Long value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Long value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Long> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Long> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Long value1, Long value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Long value1, Long value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankMoneyIsNull() {
            addCriterion("bank_money is null");
            return (Criteria) this;
        }

        public Criteria andBankMoneyIsNotNull() {
            addCriterion("bank_money is not null");
            return (Criteria) this;
        }

        public Criteria andBankMoneyEqualTo(Integer value) {
            addCriterion("bank_money =", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyNotEqualTo(Integer value) {
            addCriterion("bank_money <>", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyGreaterThan(Integer value) {
            addCriterion("bank_money >", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_money >=", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyLessThan(Integer value) {
            addCriterion("bank_money <", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("bank_money <=", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyIn(List<Integer> values) {
            addCriterion("bank_money in", values, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyNotIn(List<Integer> values) {
            addCriterion("bank_money not in", values, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyBetween(Integer value1, Integer value2) {
            addCriterion("bank_money between", value1, value2, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_money not between", value1, value2, "bankMoney");
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
package org.spring.springboot.example.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountDetailInfoExample {
    /**
     * account_detail_info
     */
    protected String orderByClause;

    /**
     * account_detail_info
     */
    protected boolean distinct;

    /**
     * account_detail_info
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public AccountDetailInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * account_detail_info 2018-02-01
     */
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

        public Criteria andTrafficAmountIsNull() {
            addCriterion("traffic_amount is null");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountIsNotNull() {
            addCriterion("traffic_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountEqualTo(BigDecimal value) {
            addCriterion("traffic_amount =", value, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountNotEqualTo(BigDecimal value) {
            addCriterion("traffic_amount <>", value, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountGreaterThan(BigDecimal value) {
            addCriterion("traffic_amount >", value, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_amount >=", value, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountLessThan(BigDecimal value) {
            addCriterion("traffic_amount <", value, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_amount <=", value, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountIn(List<BigDecimal> values) {
            addCriterion("traffic_amount in", values, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountNotIn(List<BigDecimal> values) {
            addCriterion("traffic_amount not in", values, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_amount between", value1, value2, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andTrafficAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_amount not between", value1, value2, "trafficAmount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountIsNull() {
            addCriterion("house_account is null");
            return (Criteria) this;
        }

        public Criteria andHouseAccountIsNotNull() {
            addCriterion("house_account is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAccountEqualTo(BigDecimal value) {
            addCriterion("house_account =", value, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountNotEqualTo(BigDecimal value) {
            addCriterion("house_account <>", value, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountGreaterThan(BigDecimal value) {
            addCriterion("house_account >", value, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_account >=", value, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountLessThan(BigDecimal value) {
            addCriterion("house_account <", value, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_account <=", value, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountIn(List<BigDecimal> values) {
            addCriterion("house_account in", values, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountNotIn(List<BigDecimal> values) {
            addCriterion("house_account not in", values, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_account between", value1, value2, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andHouseAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_account not between", value1, value2, "houseAccount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountIsNull() {
            addCriterion("medical_amount is null");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountIsNotNull() {
            addCriterion("medical_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountEqualTo(BigDecimal value) {
            addCriterion("medical_amount =", value, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountNotEqualTo(BigDecimal value) {
            addCriterion("medical_amount <>", value, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountGreaterThan(BigDecimal value) {
            addCriterion("medical_amount >", value, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_amount >=", value, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountLessThan(BigDecimal value) {
            addCriterion("medical_amount <", value, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_amount <=", value, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountIn(List<BigDecimal> values) {
            addCriterion("medical_amount in", values, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountNotIn(List<BigDecimal> values) {
            addCriterion("medical_amount not in", values, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_amount between", value1, value2, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMedicalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_amount not between", value1, value2, "medicalAmount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountIsNull() {
            addCriterion("message_account is null");
            return (Criteria) this;
        }

        public Criteria andMessageAccountIsNotNull() {
            addCriterion("message_account is not null");
            return (Criteria) this;
        }

        public Criteria andMessageAccountEqualTo(BigDecimal value) {
            addCriterion("message_account =", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotEqualTo(BigDecimal value) {
            addCriterion("message_account <>", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountGreaterThan(BigDecimal value) {
            addCriterion("message_account >", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("message_account >=", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountLessThan(BigDecimal value) {
            addCriterion("message_account <", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("message_account <=", value, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountIn(List<BigDecimal> values) {
            addCriterion("message_account in", values, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotIn(List<BigDecimal> values) {
            addCriterion("message_account not in", values, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("message_account between", value1, value2, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andMessageAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("message_account not between", value1, value2, "messageAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIsNull() {
            addCriterion("other_account is null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIsNotNull() {
            addCriterion("other_account is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAccountEqualTo(BigDecimal value) {
            addCriterion("other_account =", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotEqualTo(BigDecimal value) {
            addCriterion("other_account <>", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountGreaterThan(BigDecimal value) {
            addCriterion("other_account >", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_account >=", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLessThan(BigDecimal value) {
            addCriterion("other_account <", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_account <=", value, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountIn(List<BigDecimal> values) {
            addCriterion("other_account in", values, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotIn(List<BigDecimal> values) {
            addCriterion("other_account not in", values, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_account between", value1, value2, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOtherAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_account not between", value1, value2, "otherAccount");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
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
    }

    /**
     * account_detail_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * account_detail_info 2018-02-01
     */
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
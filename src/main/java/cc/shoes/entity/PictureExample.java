package cc.shoes.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPicidIsNull() {
            addCriterion("picId is null");
            return (Criteria) this;
        }

        public Criteria andPicidIsNotNull() {
            addCriterion("picId is not null");
            return (Criteria) this;
        }

        public Criteria andPicidEqualTo(Integer value) {
            addCriterion("picId =", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotEqualTo(Integer value) {
            addCriterion("picId <>", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThan(Integer value) {
            addCriterion("picId >", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("picId >=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThan(Integer value) {
            addCriterion("picId <", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidLessThanOrEqualTo(Integer value) {
            addCriterion("picId <=", value, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidIn(List<Integer> values) {
            addCriterion("picId in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotIn(List<Integer> values) {
            addCriterion("picId not in", values, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidBetween(Integer value1, Integer value2) {
            addCriterion("picId between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andPicidNotBetween(Integer value1, Integer value2) {
            addCriterion("picId not between", value1, value2, "picid");
            return (Criteria) this;
        }

        public Criteria andPicnumIsNull() {
            addCriterion("picNum is null");
            return (Criteria) this;
        }

        public Criteria andPicnumIsNotNull() {
            addCriterion("picNum is not null");
            return (Criteria) this;
        }

        public Criteria andPicnumEqualTo(String value) {
            addCriterion("picNum =", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumNotEqualTo(String value) {
            addCriterion("picNum <>", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumGreaterThan(String value) {
            addCriterion("picNum >", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumGreaterThanOrEqualTo(String value) {
            addCriterion("picNum >=", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumLessThan(String value) {
            addCriterion("picNum <", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumLessThanOrEqualTo(String value) {
            addCriterion("picNum <=", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumLike(String value) {
            addCriterion("picNum like", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumNotLike(String value) {
            addCriterion("picNum not like", value, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumIn(List<String> values) {
            addCriterion("picNum in", values, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumNotIn(List<String> values) {
            addCriterion("picNum not in", values, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumBetween(String value1, String value2) {
            addCriterion("picNum between", value1, value2, "picnum");
            return (Criteria) this;
        }

        public Criteria andPicnumNotBetween(String value1, String value2) {
            addCriterion("picNum not between", value1, value2, "picnum");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNull() {
            addCriterion("isFirst is null");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNotNull() {
            addCriterion("isFirst is not null");
            return (Criteria) this;
        }

        public Criteria andIsfirstEqualTo(Integer value) {
            addCriterion("isFirst =", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotEqualTo(Integer value) {
            addCriterion("isFirst <>", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThan(Integer value) {
            addCriterion("isFirst >", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFirst >=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThan(Integer value) {
            addCriterion("isFirst <", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThanOrEqualTo(Integer value) {
            addCriterion("isFirst <=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstIn(List<Integer> values) {
            addCriterion("isFirst in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotIn(List<Integer> values) {
            addCriterion("isFirst not in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstBetween(Integer value1, Integer value2) {
            addCriterion("isFirst between", value1, value2, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotBetween(Integer value1, Integer value2) {
            addCriterion("isFirst not between", value1, value2, "isfirst");
            return (Criteria) this;
        }

        public Criteria andMallidIsNull() {
            addCriterion("mallId is null");
            return (Criteria) this;
        }

        public Criteria andMallidIsNotNull() {
            addCriterion("mallId is not null");
            return (Criteria) this;
        }

        public Criteria andMallidEqualTo(Integer value) {
            addCriterion("mallId =", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidNotEqualTo(Integer value) {
            addCriterion("mallId <>", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidGreaterThan(Integer value) {
            addCriterion("mallId >", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallId >=", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidLessThan(Integer value) {
            addCriterion("mallId <", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidLessThanOrEqualTo(Integer value) {
            addCriterion("mallId <=", value, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidIn(List<Integer> values) {
            addCriterion("mallId in", values, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidNotIn(List<Integer> values) {
            addCriterion("mallId not in", values, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidBetween(Integer value1, Integer value2) {
            addCriterion("mallId between", value1, value2, "mallid");
            return (Criteria) this;
        }

        public Criteria andMallidNotBetween(Integer value1, Integer value2) {
            addCriterion("mallId not between", value1, value2, "mallid");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picPath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picPath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picPath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picPath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picPath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picPath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picPath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picPath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picPath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picPath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picPath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picPath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picPath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picPath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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
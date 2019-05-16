package cc.shoes.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageidIsNull() {
            addCriterion("imageId is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageId is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(Integer value) {
            addCriterion("imageId =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(Integer value) {
            addCriterion("imageId <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(Integer value) {
            addCriterion("imageId >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageId >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(Integer value) {
            addCriterion("imageId <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(Integer value) {
            addCriterion("imageId <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<Integer> values) {
            addCriterion("imageId in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<Integer> values) {
            addCriterion("imageId not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(Integer value1, Integer value2) {
            addCriterion("imageId between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(Integer value1, Integer value2) {
            addCriterion("imageId not between", value1, value2, "imageid");
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

        public Criteria andImagenumIsNull() {
            addCriterion("imageNum is null");
            return (Criteria) this;
        }

        public Criteria andImagenumIsNotNull() {
            addCriterion("imageNum is not null");
            return (Criteria) this;
        }

        public Criteria andImagenumEqualTo(Integer value) {
            addCriterion("imageNum =", value, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumNotEqualTo(Integer value) {
            addCriterion("imageNum <>", value, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumGreaterThan(Integer value) {
            addCriterion("imageNum >", value, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageNum >=", value, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumLessThan(Integer value) {
            addCriterion("imageNum <", value, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumLessThanOrEqualTo(Integer value) {
            addCriterion("imageNum <=", value, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumIn(List<Integer> values) {
            addCriterion("imageNum in", values, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumNotIn(List<Integer> values) {
            addCriterion("imageNum not in", values, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumBetween(Integer value1, Integer value2) {
            addCriterion("imageNum between", value1, value2, "imagenum");
            return (Criteria) this;
        }

        public Criteria andImagenumNotBetween(Integer value1, Integer value2) {
            addCriterion("imageNum not between", value1, value2, "imagenum");
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
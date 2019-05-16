package cc.shoes.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallExample() {
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

        public Criteria andMallnumIsNull() {
            addCriterion("mallNum is null");
            return (Criteria) this;
        }

        public Criteria andMallnumIsNotNull() {
            addCriterion("mallNum is not null");
            return (Criteria) this;
        }

        public Criteria andMallnumEqualTo(String value) {
            addCriterion("mallNum =", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumNotEqualTo(String value) {
            addCriterion("mallNum <>", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumGreaterThan(String value) {
            addCriterion("mallNum >", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumGreaterThanOrEqualTo(String value) {
            addCriterion("mallNum >=", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumLessThan(String value) {
            addCriterion("mallNum <", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumLessThanOrEqualTo(String value) {
            addCriterion("mallNum <=", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumLike(String value) {
            addCriterion("mallNum like", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumNotLike(String value) {
            addCriterion("mallNum not like", value, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumIn(List<String> values) {
            addCriterion("mallNum in", values, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumNotIn(List<String> values) {
            addCriterion("mallNum not in", values, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumBetween(String value1, String value2) {
            addCriterion("mallNum between", value1, value2, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMallnumNotBetween(String value1, String value2) {
            addCriterion("mallNum not between", value1, value2, "mallnum");
            return (Criteria) this;
        }

        public Criteria andMalldesIsNull() {
            addCriterion("mallDes is null");
            return (Criteria) this;
        }

        public Criteria andMalldesIsNotNull() {
            addCriterion("mallDes is not null");
            return (Criteria) this;
        }

        public Criteria andMalldesEqualTo(String value) {
            addCriterion("mallDes =", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesNotEqualTo(String value) {
            addCriterion("mallDes <>", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesGreaterThan(String value) {
            addCriterion("mallDes >", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesGreaterThanOrEqualTo(String value) {
            addCriterion("mallDes >=", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesLessThan(String value) {
            addCriterion("mallDes <", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesLessThanOrEqualTo(String value) {
            addCriterion("mallDes <=", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesLike(String value) {
            addCriterion("mallDes like", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesNotLike(String value) {
            addCriterion("mallDes not like", value, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesIn(List<String> values) {
            addCriterion("mallDes in", values, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesNotIn(List<String> values) {
            addCriterion("mallDes not in", values, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesBetween(String value1, String value2) {
            addCriterion("mallDes between", value1, value2, "malldes");
            return (Criteria) this;
        }

        public Criteria andMalldesNotBetween(String value1, String value2) {
            addCriterion("mallDes not between", value1, value2, "malldes");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andMalltypeIsNull() {
            addCriterion("mallType is null");
            return (Criteria) this;
        }

        public Criteria andMalltypeIsNotNull() {
            addCriterion("mallType is not null");
            return (Criteria) this;
        }

        public Criteria andMalltypeEqualTo(Integer value) {
            addCriterion("mallType =", value, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeNotEqualTo(Integer value) {
            addCriterion("mallType <>", value, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeGreaterThan(Integer value) {
            addCriterion("mallType >", value, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallType >=", value, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeLessThan(Integer value) {
            addCriterion("mallType <", value, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeLessThanOrEqualTo(Integer value) {
            addCriterion("mallType <=", value, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeIn(List<Integer> values) {
            addCriterion("mallType in", values, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeNotIn(List<Integer> values) {
            addCriterion("mallType not in", values, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeBetween(Integer value1, Integer value2) {
            addCriterion("mallType between", value1, value2, "malltype");
            return (Criteria) this;
        }

        public Criteria andMalltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mallType not between", value1, value2, "malltype");
            return (Criteria) this;
        }

        public Criteria andMallcolorIsNull() {
            addCriterion("mallColor is null");
            return (Criteria) this;
        }

        public Criteria andMallcolorIsNotNull() {
            addCriterion("mallColor is not null");
            return (Criteria) this;
        }

        public Criteria andMallcolorEqualTo(Integer value) {
            addCriterion("mallColor =", value, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorNotEqualTo(Integer value) {
            addCriterion("mallColor <>", value, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorGreaterThan(Integer value) {
            addCriterion("mallColor >", value, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallColor >=", value, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorLessThan(Integer value) {
            addCriterion("mallColor <", value, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorLessThanOrEqualTo(Integer value) {
            addCriterion("mallColor <=", value, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorIn(List<Integer> values) {
            addCriterion("mallColor in", values, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorNotIn(List<Integer> values) {
            addCriterion("mallColor not in", values, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorBetween(Integer value1, Integer value2) {
            addCriterion("mallColor between", value1, value2, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallcolorNotBetween(Integer value1, Integer value2) {
            addCriterion("mallColor not between", value1, value2, "mallcolor");
            return (Criteria) this;
        }

        public Criteria andMallbrandIsNull() {
            addCriterion("mallBrand is null");
            return (Criteria) this;
        }

        public Criteria andMallbrandIsNotNull() {
            addCriterion("mallBrand is not null");
            return (Criteria) this;
        }

        public Criteria andMallbrandEqualTo(Integer value) {
            addCriterion("mallBrand =", value, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandNotEqualTo(Integer value) {
            addCriterion("mallBrand <>", value, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandGreaterThan(Integer value) {
            addCriterion("mallBrand >", value, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallBrand >=", value, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandLessThan(Integer value) {
            addCriterion("mallBrand <", value, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandLessThanOrEqualTo(Integer value) {
            addCriterion("mallBrand <=", value, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandIn(List<Integer> values) {
            addCriterion("mallBrand in", values, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandNotIn(List<Integer> values) {
            addCriterion("mallBrand not in", values, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandBetween(Integer value1, Integer value2) {
            addCriterion("mallBrand between", value1, value2, "mallbrand");
            return (Criteria) this;
        }

        public Criteria andMallbrandNotBetween(Integer value1, Integer value2) {
            addCriterion("mallBrand not between", value1, value2, "mallbrand");
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
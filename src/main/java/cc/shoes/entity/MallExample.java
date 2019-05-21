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

        public Criteria andMallIdIsNull() {
            addCriterion("mallId is null");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNotNull() {
            addCriterion("mallId is not null");
            return (Criteria) this;
        }

        public Criteria andMallIdEqualTo(Integer value) {
            addCriterion("mallId =", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotEqualTo(Integer value) {
            addCriterion("mallId <>", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThan(Integer value) {
            addCriterion("mallId >", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallId >=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThan(Integer value) {
            addCriterion("mallId <", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThanOrEqualTo(Integer value) {
            addCriterion("mallId <=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdIn(List<Integer> values) {
            addCriterion("mallId in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotIn(List<Integer> values) {
            addCriterion("mallId not in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdBetween(Integer value1, Integer value2) {
            addCriterion("mallId between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mallId not between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallNumIsNull() {
            addCriterion("mallNum is null");
            return (Criteria) this;
        }

        public Criteria andMallNumIsNotNull() {
            addCriterion("mallNum is not null");
            return (Criteria) this;
        }

        public Criteria andMallNumEqualTo(String value) {
            addCriterion("mallNum =", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumNotEqualTo(String value) {
            addCriterion("mallNum <>", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumGreaterThan(String value) {
            addCriterion("mallNum >", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumGreaterThanOrEqualTo(String value) {
            addCriterion("mallNum >=", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumLessThan(String value) {
            addCriterion("mallNum <", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumLessThanOrEqualTo(String value) {
            addCriterion("mallNum <=", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumLike(String value) {
            addCriterion("mallNum like", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumNotLike(String value) {
            addCriterion("mallNum not like", value, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumIn(List<String> values) {
            addCriterion("mallNum in", values, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumNotIn(List<String> values) {
            addCriterion("mallNum not in", values, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumBetween(String value1, String value2) {
            addCriterion("mallNum between", value1, value2, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallNumNotBetween(String value1, String value2) {
            addCriterion("mallNum not between", value1, value2, "mallNum");
            return (Criteria) this;
        }

        public Criteria andMallDesIsNull() {
            addCriterion("mallDes is null");
            return (Criteria) this;
        }

        public Criteria andMallDesIsNotNull() {
            addCriterion("mallDes is not null");
            return (Criteria) this;
        }

        public Criteria andMallDesEqualTo(String value) {
            addCriterion("mallDes =", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesNotEqualTo(String value) {
            addCriterion("mallDes <>", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesGreaterThan(String value) {
            addCriterion("mallDes >", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesGreaterThanOrEqualTo(String value) {
            addCriterion("mallDes >=", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesLessThan(String value) {
            addCriterion("mallDes <", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesLessThanOrEqualTo(String value) {
            addCriterion("mallDes <=", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesLike(String value) {
            addCriterion("mallDes like", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesNotLike(String value) {
            addCriterion("mallDes not like", value, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesIn(List<String> values) {
            addCriterion("mallDes in", values, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesNotIn(List<String> values) {
            addCriterion("mallDes not in", values, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesBetween(String value1, String value2) {
            addCriterion("mallDes between", value1, value2, "mallDes");
            return (Criteria) this;
        }

        public Criteria andMallDesNotBetween(String value1, String value2) {
            addCriterion("mallDes not between", value1, value2, "mallDes");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNull() {
            addCriterion("currentPrice is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNotNull() {
            addCriterion("currentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceEqualTo(Integer value) {
            addCriterion("currentPrice =", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotEqualTo(Integer value) {
            addCriterion("currentPrice <>", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThan(Integer value) {
            addCriterion("currentPrice >", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentPrice >=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThan(Integer value) {
            addCriterion("currentPrice <", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("currentPrice <=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIn(List<Integer> values) {
            addCriterion("currentPrice in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotIn(List<Integer> values) {
            addCriterion("currentPrice not in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceBetween(Integer value1, Integer value2) {
            addCriterion("currentPrice between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("currentPrice not between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("costPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("costPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Integer value) {
            addCriterion("costPrice =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Integer value) {
            addCriterion("costPrice <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Integer value) {
            addCriterion("costPrice >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("costPrice >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Integer value) {
            addCriterion("costPrice <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("costPrice <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Integer> values) {
            addCriterion("costPrice in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Integer> values) {
            addCriterion("costPrice not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("costPrice between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("costPrice not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andMallTypeIsNull() {
            addCriterion("mallType is null");
            return (Criteria) this;
        }

        public Criteria andMallTypeIsNotNull() {
            addCriterion("mallType is not null");
            return (Criteria) this;
        }

        public Criteria andMallTypeEqualTo(Integer value) {
            addCriterion("mallType =", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotEqualTo(Integer value) {
            addCriterion("mallType <>", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeGreaterThan(Integer value) {
            addCriterion("mallType >", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallType >=", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeLessThan(Integer value) {
            addCriterion("mallType <", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mallType <=", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeIn(List<Integer> values) {
            addCriterion("mallType in", values, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotIn(List<Integer> values) {
            addCriterion("mallType not in", values, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeBetween(Integer value1, Integer value2) {
            addCriterion("mallType between", value1, value2, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mallType not between", value1, value2, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallColorIsNull() {
            addCriterion("mallColor is null");
            return (Criteria) this;
        }

        public Criteria andMallColorIsNotNull() {
            addCriterion("mallColor is not null");
            return (Criteria) this;
        }

        public Criteria andMallColorEqualTo(Integer value) {
            addCriterion("mallColor =", value, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorNotEqualTo(Integer value) {
            addCriterion("mallColor <>", value, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorGreaterThan(Integer value) {
            addCriterion("mallColor >", value, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallColor >=", value, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorLessThan(Integer value) {
            addCriterion("mallColor <", value, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorLessThanOrEqualTo(Integer value) {
            addCriterion("mallColor <=", value, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorIn(List<Integer> values) {
            addCriterion("mallColor in", values, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorNotIn(List<Integer> values) {
            addCriterion("mallColor not in", values, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorBetween(Integer value1, Integer value2) {
            addCriterion("mallColor between", value1, value2, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallColorNotBetween(Integer value1, Integer value2) {
            addCriterion("mallColor not between", value1, value2, "mallColor");
            return (Criteria) this;
        }

        public Criteria andMallBrandIsNull() {
            addCriterion("mallBrand is null");
            return (Criteria) this;
        }

        public Criteria andMallBrandIsNotNull() {
            addCriterion("mallBrand is not null");
            return (Criteria) this;
        }

        public Criteria andMallBrandEqualTo(Integer value) {
            addCriterion("mallBrand =", value, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandNotEqualTo(Integer value) {
            addCriterion("mallBrand <>", value, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandGreaterThan(Integer value) {
            addCriterion("mallBrand >", value, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("mallBrand >=", value, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandLessThan(Integer value) {
            addCriterion("mallBrand <", value, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandLessThanOrEqualTo(Integer value) {
            addCriterion("mallBrand <=", value, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandIn(List<Integer> values) {
            addCriterion("mallBrand in", values, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandNotIn(List<Integer> values) {
            addCriterion("mallBrand not in", values, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandBetween(Integer value1, Integer value2) {
            addCriterion("mallBrand between", value1, value2, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andMallBrandNotBetween(Integer value1, Integer value2) {
            addCriterion("mallBrand not between", value1, value2, "mallBrand");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("isRecommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("isRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Integer value) {
            addCriterion("isRecommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Integer value) {
            addCriterion("isRecommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Integer value) {
            addCriterion("isRecommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRecommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Integer value) {
            addCriterion("isRecommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("isRecommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Integer> values) {
            addCriterion("isRecommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Integer> values) {
            addCriterion("isRecommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Integer value1, Integer value2) {
            addCriterion("isRecommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("isRecommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andParentPriceIsNull() {
            addCriterion("parentPrice is null");
            return (Criteria) this;
        }

        public Criteria andParentPriceIsNotNull() {
            addCriterion("parentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andParentPriceEqualTo(Integer value) {
            addCriterion("parentPrice =", value, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceNotEqualTo(Integer value) {
            addCriterion("parentPrice <>", value, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceGreaterThan(Integer value) {
            addCriterion("parentPrice >", value, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentPrice >=", value, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceLessThan(Integer value) {
            addCriterion("parentPrice <", value, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("parentPrice <=", value, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceIn(List<Integer> values) {
            addCriterion("parentPrice in", values, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceNotIn(List<Integer> values) {
            addCriterion("parentPrice not in", values, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceBetween(Integer value1, Integer value2) {
            addCriterion("parentPrice between", value1, value2, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andParentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("parentPrice not between", value1, value2, "parentPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
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
package cc.shoes.entity;

import java.util.Date;

public class Mall {
    private Integer mallId;

    private String mallNum;

    private String mallDes;

    private Integer currentPrice;

    private Integer costPrice;

    private Integer mallType;

    private Integer mallColor;

    private Integer mallBrand;

    private Date createTime;

    private Date updateTime;

    private Integer isRecommend;

    private Integer parentPrice;

    private Double discount;

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public String getMallNum() {
        return mallNum;
    }

    public void setMallNum(String mallNum) {
        this.mallNum = mallNum == null ? null : mallNum.trim();
    }

    public String getMallDes() {
        return mallDes;
    }

    public void setMallDes(String mallDes) {
        this.mallDes = mallDes == null ? null : mallDes.trim();
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getMallType() {
        return mallType;
    }

    public void setMallType(Integer mallType) {
        this.mallType = mallType;
    }

    public Integer getMallColor() {
        return mallColor;
    }

    public void setMallColor(Integer mallColor) {
        this.mallColor = mallColor;
    }

    public Integer getMallBrand() {
        return mallBrand;
    }

    public void setMallBrand(Integer mallBrand) {
        this.mallBrand = mallBrand;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getParentPrice() {
        return parentPrice;
    }

    public void setParentPrice(Integer parentPrice) {
        this.parentPrice = parentPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
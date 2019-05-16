package cc.shoes.entity;

import java.util.Date;

public class Mall {
    private Integer mallid;

    private String mallnum;

    private String malldes;

    private Integer price;

    private Integer cost;

    private Integer malltype;

    private Integer mallcolor;

    private Integer mallbrand;

    private Date createtime;

    private Date updatetime;

    public Integer getMallid() {
        return mallid;
    }

    public void setMallid(Integer mallid) {
        this.mallid = mallid;
    }

    public String getMallnum() {
        return mallnum;
    }

    public void setMallnum(String mallnum) {
        this.mallnum = mallnum == null ? null : mallnum.trim();
    }

    public String getMalldes() {
        return malldes;
    }

    public void setMalldes(String malldes) {
        this.malldes = malldes == null ? null : malldes.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getMalltype() {
        return malltype;
    }

    public void setMalltype(Integer malltype) {
        this.malltype = malltype;
    }

    public Integer getMallcolor() {
        return mallcolor;
    }

    public void setMallcolor(Integer mallcolor) {
        this.mallcolor = mallcolor;
    }

    public Integer getMallbrand() {
        return mallbrand;
    }

    public void setMallbrand(Integer mallbrand) {
        this.mallbrand = mallbrand;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
package cc.shoes.entity;

import java.io.Serializable;
import java.util.Date;

public class MallCart implements Serializable {
    private Integer cartid;

    private Integer mallid;

    private String userid;

    private Integer status;

    private Integer mallcount;

    private Integer totalprice;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getMallid() {
        return mallid;
    }

    public void setMallid(Integer mallid) {
        this.mallid = mallid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMallcount() {
        return mallcount;
    }

    public void setMallcount(Integer mallcount) {
        this.mallcount = mallcount;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
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
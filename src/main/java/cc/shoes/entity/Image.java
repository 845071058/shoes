package cc.shoes.entity;

import java.util.Date;

public class Image {
    private Integer imageid;

    private Integer mallid;

    private Integer isfirst;

    private Integer imagenum;

    private Date createtime;

    private Date updatetime;

    private String imagebase;

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public Integer getMallid() {
        return mallid;
    }

    public void setMallid(Integer mallid) {
        this.mallid = mallid;
    }

    public Integer getIsfirst() {
        return isfirst;
    }

    public void setIsfirst(Integer isfirst) {
        this.isfirst = isfirst;
    }

    public Integer getImagenum() {
        return imagenum;
    }

    public void setImagenum(Integer imagenum) {
        this.imagenum = imagenum;
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

    public String getImagebase() {
        return imagebase;
    }

    public void setImagebase(String imagebase) {
        this.imagebase = imagebase;
    }
}
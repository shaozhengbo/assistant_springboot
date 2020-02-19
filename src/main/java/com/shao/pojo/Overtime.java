package com.shao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Overtime extends OvertimeKey implements Serializable {
    private Float time;

    private Float used;

    private Float unused;

    private Byte status;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public Float getUsed() {
        return used;
    }

    public void setUsed(Float used) {
        this.used = used;
    }

    public Float getUnused() {
        return unused;
    }

    public void setUnused(Float unused) {
        this.unused = unused;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    /**
     * 转换成主键对象
     * @return 主键对象
     */
    public OvertimeKey getOvertimeKey() {
        OvertimeKey key = new OvertimeKey();
        key.setUid(this.getUid());
        key.setYear(this.getYear());
        key.setMonth(this.getMonth());
        key.setDay(this.getDay());
        return key;
    }
}
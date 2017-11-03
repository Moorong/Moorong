package com.unioncast.common.user.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 易通系统信息
 *
 * @auther wangyao
 * @date 2017-02-15 14:55
 */
@MyTable("common_system")
public class UnioncastSystem implements Serializable {

    private static final long serialVersionUID = 2474871963642034047L;
    public static String PROPERTIES = "id, system_name, update_time, create_time, remark";
    public static String TABLE_NAME = "common_system";
    // id
    @MyId
    @MyColumn("id")
    private Long id;

    // 系统名称
    @MyColumn("system_name")
    private String systemName;

    // 更新时间
    @MyColumn("update_time")
    private Date updateTime;

    // 创建时间
    @MyColumn("create_time")
    private Date createTime;

    // 备注
    @MyColumn("remark")
    private String remark;

    public UnioncastSystem() {
    }

    public UnioncastSystem(Long id, String systemName, Date updateTime, Date createTime, String remark) {
        this.id = id;
        this.systemName = systemName;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "UnioncastSystem{" + "id=" + id + ", systemName='" + systemName + '\'' + ", updateTime=" + updateTime
                + ", createTime=" + createTime + ", remark='" + remark + '\'' + '}';
    }
}

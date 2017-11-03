package com.unioncast.common.user.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 鉴权信息
 * <p>
 * 对应的表：common_authentication
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(Long)</li>
 * <li>system_id(int)</li>
 * <li>token(varchar)</li>
 * <li>create_time(datetime)</li>
 * <li>expire(datetime)</li>
 * <li>apiInfo_id(bigint)</li>
 * <li>remark(varchar)</li>
 * <li>update_time(datetime)</li>
 * </ul>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:09:56
 */

@MyTable("common_authentication")
public class Authentication implements Serializable {

    private static final long serialVersionUID = 944428174210667402L;

    // 主键id
    @MyId
    @MyColumn("id")
    private Long id;

    // 系统id，指的是哪个系统来调用api，如dsp前端、第三方dsp（dspId）
    @MyColumn("system_id")
    private Integer systemId;

    // 名称
    @MyColumn("name")
    private String name;

    // 系统对应token
    @MyColumn("token")
    private String token;

    // 创建时间
    @MyColumn("create_time")
    private Date createTime;

    // 失效时间，为null不失效
    @MyColumn("expire")
    private Date expire;

    // 鉴权时所需的系统前缀 可访问多个系统
    //@MyColumn("")
    private List<ApiInfo> apiInfoList;

    // 备注
    @MyColumn("remark")
    private String remark;

    // 更新时间
    @MyColumn("update_time")
    private Date updateTime;

    public Authentication() {

    }

    public Authentication(Long id, Integer systemId, String name, String token,
                          Date createTime, Date expire, List<ApiInfo> apiInfoList,
                          String remark, Date updateTime) {
        super();
        this.id = id;
        this.systemId = systemId;
        this.name = name;
        this.token = token;
        this.createTime = createTime;
        this.expire = expire;
        this.apiInfoList = apiInfoList;
        this.remark = remark;
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }


    public List<ApiInfo> getApiInfoList() {
        return apiInfoList;
    }

    public void setApiInfoList(List<ApiInfo> apiInfoList) {
        this.apiInfoList = apiInfoList;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Authentication [id=" + id + ", systemId=" + systemId
            + ", token=" + token + ", createTime=" + createTime
            + ", expire=" + expire + ", apiInfoList=" + apiInfoList
            + ", remark=" + remark + ", updateTime=" + updateTime + "]";
    }


}
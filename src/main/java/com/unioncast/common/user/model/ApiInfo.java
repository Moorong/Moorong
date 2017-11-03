package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 系统信息
 * <p>
 * 对应的表：common_apiInfo
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>system_id(int)</li>
 * <li>system_name(varchar)</li>
 * <li>prefix(varchar)</li>
 * <li>remark(varchar)</li>
 * <li>create_time(datetime)</li>
 * <li>update_time(datetime)</li>
 * <li>ip_white_list(varchar)</li>
 * </ul>
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月10日
 */
@MyTable("common_apiInfo")
public class ApiInfo implements Serializable {

	private static final long serialVersionUID = 8934251290040770125L;

	// 主键Id
	@MyId
	@MyColumn("id")
	private Long id;

	// 系统id 我们自己系统的id 如ssp系统前后端 adx系统前后端 dsp系统前后端
	@MyColumn("system_id")
	private Integer systemId;

	// 系统名称
	@MyColumn("system_name")
	private String systemName;

	// 我们自己系统的前缀 如 sspFront sspBack adxFront 鉴权所需参数之一
	@MyColumn("prefix")
	private String prefix;

	// 备注
	@MyColumn("remark")
	private String remark;

	// 创建时间
	@MyColumn("create_time")
	private Date createTime;

	// 更新时间
	@MyColumn("update_time")
	private Date updateTime;

	// ip白名单
	@MyColumn("ip_white_list")
	private String ipWhiteList;

	public ApiInfo() {

	}

	public ApiInfo(Long id, Integer systemId, String systemName, String prefix, String remark, Date createTime,
			Date updateTime, String ipWhiteList) {
		super();
		this.id = id;
		this.systemId = systemId;
		this.systemName = systemName;
		this.prefix = prefix;
		this.remark = remark;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.ipWhiteList = ipWhiteList;
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

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getIpWhiteList() {
		return ipWhiteList;
	}

	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
	}

	@Override
	public String toString() {
		return "ApiInfo [id=" + id + ", systemId=" + systemId + ", systemName=" + systemName + ", prefix=" + prefix
				+ ", remark=" + remark + ", createTime=" + createTime + ", updateTime=" + updateTime + ", ipWhiteList="
				+ ipWhiteList + "]";
	}

}

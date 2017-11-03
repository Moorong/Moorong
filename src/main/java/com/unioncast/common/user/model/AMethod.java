package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 模块信息
 * <p>
 * 对应的表：common_method
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>system_id(bigint)</li>
 * <li>name(varchar)</li>
 * <li>prefix_url(varchar)</li>
 * <li>url(varchar)</li>
 * <li>description(varchar)</li>
 * <li>level(int)</li>
 * <li>parent_id(bigint)</li>
 * <li>state(int)</li>
 * <li>create_time(datetime)</li>
 * <li>sort(int)</li>
 * <li>remark(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @author changguobin
 * @date 2016年10月10日上午10:09:56
 */
@MyTable("common_method")
public class AMethod implements Serializable {

	private static final long serialVersionUID = -3126486117551102096L;

	// 主键id
	@MyId
	@MyColumn("id")
	private Long id;
	
	// 系统id
	@MyColumn("system_id")
	private Long systemId;

	// 模块名称
	@MyColumn("name")
	private String name;
	//前缀
	@MyColumn("prefix_url")
	private String prefixUrl;
	
	// 对应接路径
	@MyColumn("url")
	private String url;

	// 模块描述
	@MyColumn("description")
	private String description;

	// 层次级别
	@MyColumn("level")
	private Integer level;

	// 父id
	@MyColumn("parent_id")
	private Long parentId;

	// 模块状态 0-未删除,1-已删除
	@MyColumn("state")
	private Integer state;

	// 创建时间
	@MyColumn("create_time")
	private Date createTime;

	// 排序
	@MyColumn("sort")
	private Integer sort;

	// 备注
	@MyColumn("remark")
	private String remark;

	// 子方法
	private List<AMethod> subMethod;

	// 更新时间
	@MyColumn("update_time")
	private Date updateTime;

	public AMethod() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSystemId() {
		return systemId;
	}

	public void setSystemId(Long systemId) {
		this.systemId = systemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public List<AMethod> getSubsubMethods() {
		return subMethod;
	}

	public void setSubModules(List<AMethod> subsubMethods) {
		this.subMethod = subMethod;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AMethod [id=" + id + ", systemId=" + systemId + ", name=" + name + ", prefixUrl=" + prefixUrl + ", url="
				+ url + ", description=" + description + ", level=" + level + ", parentId=" + parentId + ", state="
				+ state + ", createTime=" + createTime + ", sort=" + sort + ", remark=" + remark + ", subMethod="
				+ subMethod + ", updateTime=" + updateTime + "]";
	}
}
package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 角色信息
 * <p>
 * 对应的表：common_role
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>system_id(int)</li>
 * <li>name(varchar)</li>
 * <li>description(varchar)</li>
 * <li>create_time(datetime)</li>
 * <li>remark(varchar)</li>
 * <li>update_time(datetime)</li>
 * </ul>
 * </p>
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:18:27
 */
@MyTable("common_role")
public class Role implements Serializable {

	private static final long serialVersionUID = -5089010595189108746L;

	public static String TABLE_NAME = "common_role";
	public static String PROPERTIES = "id, system_id, name, description, create_time, remark, update_time";
	
	//主键id
	@MyId("id")
	@MyColumn("id")
	private Long id;

	//系统id 1：ssp 2：adx 3：dsp
	@MyColumn("system_id")
	private Integer systemId;

	//角色名称
	@MyColumn("name")
	private String name;

	//角色描述
	@MyColumn("description")
	private String description;

	//创建时间
	@MyColumn("create_time")
	private Date createTime;

	//备注
	@MyColumn("remark")
	private String remark;
	
	//更新时间
	@MyColumn("update_time")
	private Date updateTime;
	
	//@MyColumn("")
	private List<Module> modules;
	
	public Role() {
		
	}

	public Role(Long id, Integer systemId, String name, String description,
			Date createTime, String remark, Date updateTime, List<Module> modules) {
		super();
		this.id = id;
		this.systemId = systemId;
		this.name = name;
		this.description = description;
		this.createTime = createTime;
		this.remark = remark;
		this.updateTime = updateTime;
		this.modules = modules;
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
		this.remark = remark == null ? null : remark.trim();
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", systemId=" + systemId + ", name=" + name + ", description=" + description
				+ ", createTime=" + createTime + ", remark=" + remark + ", updateTime=" + updateTime + ", modules="
				+ modules + "]";
	}
}
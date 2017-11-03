package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色与模块对应信息
 * <p>
 * 对应的表：common_role_module
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>role_module_id(varchar)</li>
 * <li>role_id(bigint)</li>
 * <li>module_id(bigint)</li>
 * <li>create_time(datetime)</li>
 * <li>sort(int)</li>
 * <li>remark(varchar)</li>
 * <li>update_time(datetime)</li>
 * </ul>
 * </p>
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:18:27
 */
public class RoleModule implements Serializable {

	private static final long serialVersionUID = 2937744301683592482L;

	//系统主键编号UUID
	private String roleModuleId;

	//角色id
	private Long roleId;

	//模块ID
	private Long moduleId;

	//创建时间
	private Date createTime;

	//排序位置
	private Integer sort;

	//备注
	private String remark;
	
	//创建时间
	private Date updateTime;
	
	public RoleModule() {
		
	}

	public RoleModule(String roleModuleId, Long roleId, Long moduleId,
			Date createTime, Integer sort, String remark, Date updateTime) {
		super();
		this.roleModuleId = roleModuleId;
		this.roleId = roleId;
		this.moduleId = moduleId;
		this.createTime = createTime;
		this.sort = sort;
		this.remark = remark;
		this.updateTime = updateTime;
	}

	public String getRoleModuleId() {
		return roleModuleId;
	}

	public void setRoleModuleId(String roleModuleId) {
		this.roleModuleId = roleModuleId == null ? null : roleModuleId.trim();
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "RoleModule [roleModuleId=" + roleModuleId + ", roleId="
				+ roleId + ", moduleId=" + moduleId + ", createTime="
				+ createTime + ", sort=" + sort + ", remark=" + remark
				+ ", updateTime=" + updateTime + "]";
	}
	
}
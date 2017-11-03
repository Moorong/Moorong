package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户与角色对应信息
 * <p>
 * 对应的表：common_user_role
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>user_role_id(varchar)</li>
 * <li>role_id(bigint)</li>
 * <li>user_id(bigint)</li>
 * <li>create_time(datetime)</li>
 * <li>remark(varchar)</li>
 * <li>update_time(datetime)</li>
 * </ul>
 * </p>
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:18:27
 */
public class UserRole implements Serializable {

	private static final long serialVersionUID = 7327136752333642914L;

	//系统主键编号UUID
	private String userRoleId;

	//角色id
	private Long roleId;

	//用户id
	private Long userId;

	//创建时间
	private Date createTime;

	//备注
	private String remark;
	
	//创建时间
	private Date updateTime;
	
	public UserRole() {
		
	}

	public UserRole(String userRoleId, Long roleId, Long userId,
			Date createTime, String remark, Date updateTime) {
		super();
		this.userRoleId = userRoleId;
		this.roleId = roleId;
		this.userId = userId;
		this.createTime = createTime;
		this.remark = remark;
		this.updateTime = updateTime;
	}



	public String getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId == null ? null : userRoleId.trim();
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", roleId=" + roleId
				+ ", userId=" + userId + ", createTime=" + createTime
				+ ", remark=" + remark + ", updateTime=" + updateTime + "]";
	}
	
}
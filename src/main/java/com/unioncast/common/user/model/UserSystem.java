package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户系统关联关系
 * 
 * @auther wangyao
 * @date 2017-02-15 15:19
 */

public class UserSystem implements Serializable {

	private static final long serialVersionUID = 2732768519049824642L;
	// 系统主键编号UUID
	private String userSystemId;

	// 系统id
	private Long systemId;

	// 用户id
	private Long userId;

	// 创建时间
	private Date createTime;

	// 创建时间
	private Date updateTime;

	public UserSystem() {
	}

	public UserSystem(String userSystemId, Long systemId, Long userId, Date createTime, Date updateTime) {
		this.userSystemId = userSystemId;
		this.systemId = systemId;
		this.userId = userId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserSystemId() {
		return userSystemId;
	}

	public void setUserSystemId(String userSystemId) {
		this.userSystemId = userSystemId;
	}

	public Long getSystemId() {
		return systemId;
	}

	public void setSystemId(Long systemId) {
		this.systemId = systemId;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "UserSystem{" + "userSystemId='" + userSystemId + '\'' + ", systemId=" + systemId + ", userId=" + userId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
	}
}

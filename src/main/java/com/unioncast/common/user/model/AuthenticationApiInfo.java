package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 鉴权与系统信息对应信息
 * <p>
 * 对应的表：common_authentication_apiInfo
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>authentication_apiInfo_id(varchar)</li>
 * <li>authentication_id(bigint)</li>
 * <li>apiInfo_id(bigint)</li>
 * <li>sort(int)</li>
 * <li>remark(varchar)</li>
 * <li>create_time(datetime)</li>
 * <li>update_time(datetime)</li>
 * </ul>
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月10日 下午7:43:21
 */
public class AuthenticationApiInfo implements Serializable {

	private static final long serialVersionUID = 8132587912293117403L;
	// 主键id
	private String authenApiInfoId;
	// 鉴权id
	private Long authenId;
	// 系统信息id
	private Long apiInfoId;
	// 排序位置
	private Integer sort;
	// 备注
	private String remark;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
	
	public AuthenticationApiInfo() {
	}

	public AuthenticationApiInfo(String authenApiInfoId, Long authenId,
			Long apiInfoId, Integer sort, String remark, Date createTime,
			Date updateTime) {
		super();
		this.authenApiInfoId = authenApiInfoId;
		this.authenId = authenId;
		this.apiInfoId = apiInfoId;
		this.sort = sort;
		this.remark = remark;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public String getAuthenApiInfoId() {
		return authenApiInfoId;
	}

	public void setAuthenApiInfoId(String authenApiInfoId) {
		this.authenApiInfoId = authenApiInfoId;
	}

	public Long getAuthenId() {
		return authenId;
	}

	public void setAuthenId(Long authenId) {
		this.authenId = authenId;
	}

	public Long getApiInfoId() {
		return apiInfoId;
	}

	public void setApiInfoId(Long apiInfoId) {
		this.apiInfoId = apiInfoId;
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

	@Override
	public String toString() {
		return "AuthenticationApiInfo [authenApiInfoId=" + authenApiInfoId
				+ ", authenId=" + authenId + ", apiInfoId=" + apiInfoId
				+ ", sort=" + sort + ", remark=" + remark + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
	
}

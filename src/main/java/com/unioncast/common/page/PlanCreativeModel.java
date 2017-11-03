package com.unioncast.common.page;

import java.io.Serializable;

public class PlanCreativeModel implements Serializable {

	private static final long serialVersionUID = 7303095967449043886L;
	
	private Integer currentPageNo;
	private Integer pageSize;
	private String name;
	private Long planId;
	private Long accountId;
	private Long advertiserId;
	private Integer creativeState;
	private Integer creativeType;
	private Long creativeGroupId;
	
	public PlanCreativeModel() {
		
	}

	public PlanCreativeModel(Integer currentPageNo, Integer pageSize,
			String name, Long planId, Long accountId, Long advertiserId,
			Integer creativeState, Integer creativeType, Long creativeGroupId) {
		super();
		this.currentPageNo = currentPageNo;
		this.pageSize = pageSize;
		this.name = name;
		this.planId = planId;
		this.accountId = accountId;
		this.advertiserId = advertiserId;
		this.creativeState = creativeState;
		this.creativeType = creativeType;
		this.creativeGroupId = creativeGroupId;
	}

	public Integer getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(Integer currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAdvertiserId() {
		return advertiserId;
	}

	public void setAdvertiserId(Long advertiserId) {
		this.advertiserId = advertiserId;
	}

	public Integer getCreativeState() {
		return creativeState;
	}

	public void setCreativeState(Integer creativeState) {
		this.creativeState = creativeState;
	}

	public Integer getCreativeType() {
		return creativeType;
	}

	public void setCreativeType(Integer creativeType) {
		this.creativeType = creativeType;
	}

	public Long getCreativeGroupId() {
		return creativeGroupId;
	}

	public void setCreativeGroupId(Long creativeGroupId) {
		this.creativeGroupId = creativeGroupId;
	}

}

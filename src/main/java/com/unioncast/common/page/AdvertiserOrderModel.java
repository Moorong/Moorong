package com.unioncast.common.page;

import java.io.Serializable;
import java.util.Date;

public class AdvertiserOrderModel implements Serializable{

	
	private static final long serialVersionUID = -7346664092656516013L;
	
	private String orderName;
	private Integer adPutState;
	private String pushStartTime;
	private String pushEndTime;
	private Integer advertiserState;
	private int currentPageNo;
	private int pageSize;
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Integer getAdPutState() {
		return adPutState;
	}
	public void setAdPutState(Integer adPutState) {
		this.adPutState = adPutState;
	}
	
	public String getPushStartTime() {
		return pushStartTime;
	}
	public void setPushStartTime(String pushStartTime) {
		this.pushStartTime = pushStartTime;
	}
	public String getPushEndTime() {
		return pushEndTime;
	}
	public void setPushEndTime(String pushEndTime) {
		this.pushEndTime = pushEndTime;
	}
	public Integer getAdvertiserState() {
		return advertiserState;
	}
	public void setAdvertiserState(Integer advertiserState) {
		this.advertiserState = advertiserState;
	}
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

}

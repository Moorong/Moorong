package com.unioncast.common.adx.model;

/**
 *<p>
 *
 *</p>
 *@author dmpliufengjiao
 *@date 2016年11月10日  上午11:16:52
 */
public class AdxDspBiddingParam2 {
	private Long dspId;
	private Integer flowType;
	private String beginTime;
	private String endTime;
	
	public Long getDspId() {
		return dspId;
	}
	public void setDspId(Long dspId) {
		this.dspId = dspId;
	}
	public Integer getFlowType() {
		return flowType;
	}
	public void setFlowType(Integer flowType) {
		this.flowType = flowType;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}

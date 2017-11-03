package com.unioncast.common.ssp.model;

import java.io.Serializable;
import java.util.Date;

public class SspDayOrHourReport implements Serializable {

	private static final long serialVersionUID = 8049543150977345188L;

	private String id;

	private Date startTime;

	private Date endTime;
	
	private Long accountId;  //用户id

	// 广告主
	private Long advertiserId;

	// 订单
	private Long orderId;

	// 计划
	private Long planId;

	// 创意
	private Long creativeId;

	// 曝光
	private Integer showTimes = 0;

	// 消耗
	private Double consumption = 0.0;

	private Double cpm = 0.0;

	private Integer clickTimes = 0;

	private Double clickRatio = 0.0;

	private Double cpc = 0.0;

	private Long arrival = 0L;

	private Double transform = 0.0;

	private Long cpa = 0L;

	private Long secondJump = 0L;

	private Double secondJumpRatio = 0.0;

	private Double arrivalRatio = 0.0;

	private Long clickTransform = 0L;

	private Double clickTransformRatio = 0.0;

	private Long dayOrHour; // 20170222 2017022219

	private Double ecpm = 0.0;

	private Double avgPrice = 0.0;

	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public Long getCreativeId() {
		return creativeId;
	}

	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}

	public Integer getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(Integer showTimes) {
		this.showTimes = showTimes;
	}

	public Double getConsumption() {
		return consumption;
	}

	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}

	public Double getCpm() {
		return cpm;
	}

	public void setCpm(Double cpm) {
		this.cpm = cpm;
	}

	public Integer getClickTimes() {
		return clickTimes;
	}

	public void setClickTimes(Integer clickTimes) {
		this.clickTimes = clickTimes;
	}

	public Double getClickRatio() {
		return clickRatio;
	}

	public void setClickRatio(Double clickRatio) {
		this.clickRatio = clickRatio;
	}

	public Double getCpc() {
		return cpc;
	}

	public void setCpc(Double cpc) {
		this.cpc = cpc;
	}

	public Long getArrival() {
		return arrival;
	}

	public void setArrival(Long arrival) {
		this.arrival = arrival;
	}

	public Double getTransform() {
		return transform;
	}

	public void setTransform(Double transform) {
		this.transform = transform;
	}

	public Long getCpa() {
		return cpa;
	}

	public void setCpa(Long cpa) {
		this.cpa = cpa;
	}

	public Long getSecondJump() {
		return secondJump;
	}

	public void setSecondJump(Long secondJump) {
		this.secondJump = secondJump;
	}

	public Double getSecondJumpRatio() {
		return secondJumpRatio;
	}

	public void setSecondJumpRatio(Double secondJumpRatio) {
		this.secondJumpRatio = secondJumpRatio;
	}

	public Double getArrivalRatio() {
		return arrivalRatio;
	}

	public void setArrivalRatio(Double arrivalRatio) {
		this.arrivalRatio = arrivalRatio;
	}

	public Long getClickTransform() {
		return clickTransform;
	}

	public void setClickTransform(Long clickTransform) {
		this.clickTransform = clickTransform;
	}

	public Double getClickTransformRatio() {
		return clickTransformRatio;
	}

	public void setClickTransformRatio(Double clickTransformRatio) {
		this.clickTransformRatio = clickTransformRatio;
	}

	public Long getDayOrHour() {
		return dayOrHour;
	}

	public void setDayOrHour(Long dayOrHour) {
		this.dayOrHour = dayOrHour;
	}

	public Double getEcpm() {
		return ecpm;
	}

	public void setEcpm(Double ecpm) {
		this.ecpm = ecpm;
	}

	public Double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}

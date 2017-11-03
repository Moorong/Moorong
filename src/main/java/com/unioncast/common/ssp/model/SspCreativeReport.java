package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告报表 ssp_creative_report
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:17:09
 */
@MyTable("ssp_creative_report")
public class SspCreativeReport implements Serializable {

	private static final long serialVersionUID = -4983267312946158992L;

	public static String PROPERTIES = "id, start_time, end_time, advertiser_id, order_id, plan_id, creative_id, show_times, consumption, cpm, click_times, click_ratio, cpc, arrival, transform, cpa, second_jump, second_jump_ratio, arrival_ratio, click_transform, click_transform_ratio, update_time";
	public static String TABLE_NAME = "ssp_creative_report";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	@MyColumn("start_time")
	private Date startTime;

	@MyColumn("end_time")
	private Date endTime;

	// 广告主
	@MyColumn("advertiser_id")
	private SspAdvertiser sspAdvertiser;

	// 订单
	@MyColumn("order_id")
	private SspOrder sspOrder;

	// 计划
	@MyColumn("plan_id")
	private SspPlan sspPlan;

	// 创意
	@MyColumn("creative_id")
	private SspCreative sspCreative;

	// 曝光
	@MyColumn("show_times")
	private Integer showTimes;

	// 消耗
	@MyColumn("consumption")
	private Double consumption;

	@MyColumn("cpm")
	private Double cpm;

	@MyColumn("click_times")
	private Integer clickTimes;

	@MyColumn("click_ratio")
	private Double clickRatio;

	@MyColumn("cpc")
	private Double cpc;

	@MyColumn("arrival")
	private Long arrival;

	@MyColumn("transform")
	private Double transform;

	@MyColumn("cpa")
	private Long cpa;

	@MyColumn("second_jump")
	private Long secondJump;

	@MyColumn("second_jump_ratio")
	private Double secondJumpRatio;

	@MyColumn("arrival_ratio")
	private Double arrivalRatio;

	@MyColumn("click_transform")
	private Long clickTransform;

	@MyColumn("click_transform_ratio")
	private Double clickTransformRatio;

	@MyColumn("update_time")
	private Date updateTime;

	public SspCreativeReport() {
	}

	public SspCreativeReport(Long id, Date startTime, Date endTime,
			SspAdvertiser sspAdvertiser, SspOrder sspOrder, SspPlan sspPlan,
			SspCreative sspCreative, Integer showTimes, Double consumption,
			Double cpm, Integer clickTimes, Double clickRatio, Double cpc,
			Long arrival, Double transform, Long cpa, Long secondJump,
			Double secondJumpRatio, Double arrivalRatio, Long clickTransform,
			Double clickTransformRatio, Date updateTime) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.sspAdvertiser = sspAdvertiser;
		this.sspOrder = sspOrder;
		this.sspPlan = sspPlan;
		this.sspCreative = sspCreative;
		this.showTimes = showTimes;
		this.consumption = consumption;
		this.cpm = cpm;
		this.clickTimes = clickTimes;
		this.clickRatio = clickRatio;
		this.cpc = cpc;
		this.arrival = arrival;
		this.transform = transform;
		this.cpa = cpa;
		this.secondJump = secondJump;
		this.secondJumpRatio = secondJumpRatio;
		this.arrivalRatio = arrivalRatio;
		this.clickTransform = clickTransform;
		this.clickTransformRatio = clickTransformRatio;
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public SspAdvertiser getSspAdvertiser() {
		return sspAdvertiser;
	}

	public void setSspAdvertiser(SspAdvertiser sspAdvertiser) {
		this.sspAdvertiser = sspAdvertiser;
	}

	public SspOrder getSspOrder() {
		return sspOrder;
	}

	public void setSspOrder(SspOrder sspOrder) {
		this.sspOrder = sspOrder;
	}

	public SspPlan getSspPlan() {
		return sspPlan;
	}

	public void setSspPlan(SspPlan sspPlan) {
		this.sspPlan = sspPlan;
	}

	public SspCreative getSspCreative() {
		return sspCreative;
	}

	public void setSspCreative(SspCreative sspCreative) {
		this.sspCreative = sspCreative;
	}

	public Double getConsumption() {
		return consumption;
	}

	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}

	public Double getClickRatio() {
		return clickRatio;
	}

	public void setClickRatio(Double clickRatio) {
		this.clickRatio = clickRatio;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(Integer showTimes) {
		this.showTimes = showTimes;
	}

	public Integer getClickTimes() {
		return clickTimes;
	}

	public void setClickTimes(Integer clickTimes) {
		this.clickTimes = clickTimes;
	}

	public Double getCpm() {
		return cpm;
	}

	public void setCpm(Double cpm) {
		this.cpm = cpm;
	}

	public Double getCpc() {
		return cpc;
	}

	public void setCpc(Double cpc) {
		this.cpc = cpc;
	}

}
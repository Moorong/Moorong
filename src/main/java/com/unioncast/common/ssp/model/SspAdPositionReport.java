package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告位报表 ssp_ad_position_report
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:04:46
 */
@MyTable("ssp_ad_position_report")
public class SspAdPositionReport implements Serializable {

	private static final long serialVersionUID = -2834166094342801438L;

	public static String PROPERTIES = "id, start_time, end_time,developer_id, app_id, ad_position_id,show_times, income, cpm,click_times, click_ratio, cpc,arrival, transform, cpa,second_jump, second_jump_ratio, arrival_ratio,click_transform, click_transform_ratio, fill_ratio,epcm, update_time";
	public static String TABLE_NAME = "ssp_ad_position_report";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	// 统计的开始时间
	@MyColumn("start_time")
	private Date startTime;

	// 统计的结束时间
	@MyColumn("end_time")
	private Date endTime;

	// 开发者
	@MyColumn("developer_id")
	private User user;

	// 应用
	@MyColumn("app_id")
	private SspAppInfo sspAppInfo;

	// 广告位
	@MyColumn("ad_position_id")
	private SspAdPositionInfo sspAdPositionInfo;

	// 曝光
	@MyColumn("show_times")
	private Long showTimes;

	// 收入
	@MyColumn("income")
	private Double income;

	@MyColumn("cpm")
	private Long cpm;

	// 点击
	@MyColumn("click_times")
	private Long clickTimes;

	// 点击率
	@MyColumn("click_ratio")
	private Double clickRatio;

	@MyColumn("cpc")
	private Long cpc;

	// 到达
	@MyColumn("arrival")
	private Long arrival;

	@MyColumn("transform")
	private Double transform;

	@MyColumn("cpa")
	private Long cpa;

	// 二跳
	@MyColumn("second_jump")
	private Long secondJump;

	// 二跳率
	@MyColumn("second_jump_ratio")
	private Double secondJumpRatio;

	// 到达率
	@MyColumn("arrival_ratio")
	private Double arrivalRatio;

	// 点击转化
	@MyColumn("click_transform")
	private Long clickTransform;

	// 点击转化率
	@MyColumn("click_transform_ratio")
	private Double clickTransformRatio;

	// 填充率
	@MyColumn("fill_ratio")
	private Double fillRatio;

	@MyColumn("epcm")
	private Long epcm;

	@MyColumn("update_time")
	private Date updateTime;

	public SspAdPositionReport() {
	}

	public SspAdPositionReport(Long id, Date startTime, Date endTime, User user, SspAppInfo sspAppInfo,
			SspAdPositionInfo sspAdPositionInfo, Long showTimes, Double income, Long cpm, Long clickTimes,
			Double clickRatio, Long cpc, Long arrival, Double transform, Long cpa, Long secondJump,
			Double secondJumpRatio, Double arrivalRatio, Long clickTransform, Double clickTransformRatio,
			Double fillRatio, Long epcm, Date updateTime) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
		this.sspAppInfo = sspAppInfo;
		this.sspAdPositionInfo = sspAdPositionInfo;
		this.showTimes = showTimes;
		this.income = income;
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
		this.fillRatio = fillRatio;
		this.epcm = epcm;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SspAppInfo getSspAppInfo() {
		return sspAppInfo;
	}

	public void setSspAppInfo(SspAppInfo sspAppInfo) {
		this.sspAppInfo = sspAppInfo;
	}

	public SspAdPositionInfo getSspAdPositionInfo() {
		return sspAdPositionInfo;
	}

	public void setSspAdPositionInfo(SspAdPositionInfo sspAdPositionInfo) {
		this.sspAdPositionInfo = sspAdPositionInfo;
	}

	public Long getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(Long showTimes) {
		this.showTimes = showTimes;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Long getCpm() {
		return cpm;
	}

	public void setCpm(Long cpm) {
		this.cpm = cpm;
	}

	public Long getClickTimes() {
		return clickTimes;
	}

	public void setClickTimes(Long clickTimes) {
		this.clickTimes = clickTimes;
	}

	public Double getClickRatio() {
		return clickRatio;
	}

	public void setClickRatio(Double clickRatio) {
		this.clickRatio = clickRatio;
	}

	public Long getCpc() {
		return cpc;
	}

	public void setCpc(Long cpc) {
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

	public Double getFillRatio() {
		return fillRatio;
	}

	public void setFillRatio(Double fillRatio) {
		this.fillRatio = fillRatio;
	}

	public Long getEpcm() {
		return epcm;
	}

	public void setEpcm(Long epcm) {
		this.epcm = epcm;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
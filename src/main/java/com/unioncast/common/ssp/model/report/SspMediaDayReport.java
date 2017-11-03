package com.unioncast.common.ssp.model.report;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SspMediaDayReport implements Serializable {

	private static final long serialVersionUID = -8418171235420191282L;

	// ID 数据库字段: id
	@Id
	private Integer id;

	// 开发者ID 数据库字段: account_id
	private Integer accountId;

	// 应用ID 数据库字段: app_id
	private String appId;

	// 广告位id 数据库字段: adslot_id
	private String adslotId;

	// 广告尺寸 数据库字段: adslot_size
	private String adslotSize;

	// 广告类型 数据库字段: adslot_type
	private String adslotType;

	// 所属平台 数据库字段: platform
	private String platform;

	// 曝光量 数据库字段: impression
	private Long impression;

	// 收益 数据库字段: profit
	private Double profit;

	// cpm 数据库字段: cpm
	private Double cpm;

	// 点击量 数据库字段: click
	private Long click;

	// 点击率 数据库字段: click_ratio
	private Double clickRatio;

	// cpc 数据库字段: cpc
	private Double cpc;

	// 转化 数据库字段: transform
	private String transform;

	// 转化率 数据库字段: transform_ratio
	private Double transformRatio;

	// cpa 数据库字段: cpa
	private Double cpa;

	// 二跳 数据库字段: second_jump
	private Long secondJump;

	// 二跳率 数据库字段: second_jump_ratio
	private Double secondJumpRatio;

	// 到达 数据库字段: arrival
	private Long arrival;

	// 到达率 数据库字段: arrival_ratio
	private Double arrivalRatio;

	// 曝光转化 数据库字段: impression_transform
	private String impressionTransform;

	// 曝光转化率 数据库字段: impression_transform_ratio
	private Double impressionTransformRatio;

	// 点击转化 数据库字段: click_transform
	private String clickTransform;

	// 点击转化率 数据库字段: click_transform_ratio
	private Double clickTransformRatio;

	// day/时间/yyyy-mm-dd 数据库字段: day
	private String day;

	// 修改时间 数据库字段: last_modify_time
	private Date lastModifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAdslotId() {
		return adslotId;
	}

	public void setAdslotId(String adslotId) {
		this.adslotId = adslotId;
	}

	public String getAdslotSize() {
		return adslotSize;
	}

	public void setAdslotSize(String adslotSize) {
		this.adslotSize = adslotSize;
	}

	public String getAdslotType() {
		return adslotType;
	}

	public void setAdslotType(String adslotType) {
		this.adslotType = adslotType;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Long getImpression() {
		return impression;
	}

	public void setImpression(Long impression) {
		this.impression = impression;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Double getCpm() {
		return cpm;
	}

	public void setCpm(Double cpm) {
		this.cpm = cpm;
	}

	public Long getClick() {
		return click;
	}

	public void setClick(Long click) {
		this.click = click;
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

	public String getTransform() {
		return transform;
	}

	public void setTransform(String transform) {
		this.transform = transform;
	}

	public Double getTransformRatio() {
		return transformRatio;
	}

	public void setTransformRatio(Double transformRatio) {
		this.transformRatio = transformRatio;
	}

	public Double getCpa() {
		return cpa;
	}

	public void setCpa(Double cpa) {
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

	public Long getArrival() {
		return arrival;
	}

	public void setArrival(Long arrival) {
		this.arrival = arrival;
	}

	public Double getArrivalRatio() {
		return arrivalRatio;
	}

	public void setArrivalRatio(Double arrivalRatio) {
		this.arrivalRatio = arrivalRatio;
	}

	public String getImpressionTransform() {
		return impressionTransform;
	}

	public void setImpressionTransform(String impressionTransform) {
		this.impressionTransform = impressionTransform;
	}

	public Double getImpressionTransformRatio() {
		return impressionTransformRatio;
	}

	public void setImpressionTransformRatio(Double impressionTransformRatio) {
		this.impressionTransformRatio = impressionTransformRatio;
	}

	public String getClickTransform() {
		return clickTransform;
	}

	public void setClickTransform(String clickTransform) {
		this.clickTransform = clickTransform;
	}

	public Double getClickTransformRatio() {
		return clickTransformRatio;
	}

	public void setClickTransformRatio(Double clickTransformRatio) {
		this.clickTransformRatio = clickTransformRatio;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
}

package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台报表 ssp_platform_report
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:45:01
 */
@MyTable("ssp_platform_report")
public class SspPlatformReport implements Serializable {

    private static final long serialVersionUID = 6352967631810776350L;

    public static String PROPERTIES = "id, start_time, end_time, platform, advertiser_id, order_id, plan_id, creative_id, show_times, income, cpm, click_times, click_ratio, cpc, arrival, transform, cpa, second_jump, second_jump_ratio, arrival_ratio, click_transform, click_transform_ratio, update_time";
    public static String TABLE_NAME = "ssp_platform_report";
    @MyId("id")
    @MyColumn("id")
    private Long id;
    @MyColumn("start_time")
    private Date startTime;
    @MyColumn("end_time")
    private Date endTime;
    @MyColumn("platform")
    private String platform;
    @MyColumn("advertiser_id")
    private SspAdvertiser sspAdvertiser;
    @MyColumn("order_id")
    private SspOrder sspOrder;
    @MyColumn("plan_id")
    private SspPlan sspPlan;
    @MyColumn("creative_id")
    private SspCreative sspCreative;
    @MyColumn("show_times")
    private Long showTimes;
    @MyColumn("income")
    private Double income;
    @MyColumn("cpm")
    private Long cpm;
    @MyColumn("click_times")
    private Long clickTimes;
    @MyColumn("click_ratio")
    private Double clickRatio;
    @MyColumn("cpc")
    private Long cpc;
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

    public SspPlatformReport() {
    }

    public SspPlatformReport(Long id, Date startTime, Date endTime, String platform, SspAdvertiser sspAdvertiser, SspOrder sspOrder, SspPlan sspPlan, SspCreative sspCreative, Long showTimes, Double income, Long cpm, Long clickTimes, Double clickRatio, Long cpc, Long arrival, Double transform, Long cpa, Long secondJump, Double secondJumpRatio, Double arrivalRatio, Long clickTransform, Double clickTransformRatio, Date updateTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.platform = platform;
        this.sspAdvertiser = sspAdvertiser;
        this.sspOrder = sspOrder;
        this.sspPlan = sspPlan;
        this.sspCreative = sspCreative;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
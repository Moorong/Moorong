/**
 *
 */
package com.unioncast.common.adx.model;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * adx-dsp流量接入设置
 * <p>
 * 对应的表: adx_dsp_flow_access_setting
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>time_interval(varchar)</li>
 * <li>advertising_position(varchar)</li>
 * <li>advertising_size(varchar)</li>
 * <li>page_type(int)</varchar>
 * <li>web_shield(varchar)</li>
 * <li>region(varchar)</li>
 * <li>interest(varchar)</li>
 * <li>equipment(varchar)</li>
 * <li>cookie(varchar)</li>
 * <li>advertising_type(varchar)</li>
 * <li>app_type(varchar)</li>
 * <li>channel(varchar)</li>
 * <li>remarks(varchar)</li>
 * <li>flow_type(int)</li>
 * <li>dsp_id(bigint)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 *
 * @author juchaochao
 */
@MyTable("adx_dsp_flow_access_setting")
public class AdxDspFlowAccessSetting implements Serializable {

    private static final long serialVersionUID = -5359910446141583841L;
    public static String PROPERTIES = "id,time_interval,advertising_position,advertising_size,page_type,web_shield,region,interest,equipment,cookie,advertising_type,app_type,channel,remarks,flow_type,dsp_id,update_time";
    public static String TABLE_NAME = "adx_dsp_flow_access_setting";
    /**
     * 流量接入设置id
     */
    @MyId
    @MyColumn("id")
    private Long id;
    /**
     * 时段
     */
    @MyColumn("time_interval")
    private String timeInterval;
    /**
     * 广告相对位置(第一屏,第二屏,其他)
     */
    @MyColumn("advertising_position")
    private String advertisingPosition;
    /**
     * 广告尺寸
     */
    @MyColumn("advertising_size")
    private String advertisingSize;
    /**
     * 页面分类
     */
    @MyColumn("page_type")
    private String pageType;
    /**
     * 网站屏蔽(主域名,耳机域名)
     */
    @MyColumn("web_shield")
    private String webShield;
    /**
     * 地域
     */
    @MyColumn("region")
    private String region;
    /**
     * 兴趣
     */
    @MyColumn("interest")
    private String interest;
    /**
     * 设备(pc,平板,手机,未识别)
     */
    @MyColumn("equipment")
    private String equipment;
    /**
     * COOKIE
     */
    @MyColumn("cookie")
    private String cookie;
    /**
     * 广告位类型(横幅，插屏，开屏)
     */
    @MyColumn("advertising_type")
    private String advertisingType;
    /**
     * APP分类
     */
    @MyColumn("app_type")
    private String appType;
    /**
     * 频道
     */
    @MyColumn("channel")
    private String channel;
    /**
     * 冗余
     */
    @MyColumn("remarks")
    private String remarks;
    @MyColumn("flow_type")
    private Integer flowType;
    @MyColumn("dsp_id")
    private Long dspId;
    @MyColumn("update_time")
    private Date updateTime;

    public AdxDspFlowAccessSetting() {

    }

    public AdxDspFlowAccessSetting(Long id, String timeInterval, String advertisingPosition, String advertisingSize,
                                   String pageType, String webShield, String region, String interest, String equipment, String cookie,
                                   String advertisingType, String appType, String channel, String remarks, Integer flowType, Long dspId,
                                   Date updateTime) {
        super();
        this.id = id;
        this.timeInterval = timeInterval;
        this.advertisingPosition = advertisingPosition;
        this.advertisingSize = advertisingSize;
        this.pageType = pageType;
        this.webShield = webShield;
        this.region = region;
        this.interest = interest;
        this.equipment = equipment;
        this.cookie = cookie;
        this.advertisingType = advertisingType;
        this.appType = appType;
        this.channel = channel;
        this.remarks = remarks;
        this.flowType = flowType;
        this.dspId = dspId;
        this.updateTime = updateTime;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxDspFlowAccessSetting entity = new AdxDspFlowAccessSetting();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getAdvertisingPosition() {
        return advertisingPosition;
    }

    public void setAdvertisingPosition(String advertisingPosition) {
        this.advertisingPosition = advertisingPosition;
    }

    public String getAdvertisingSize() {
        return advertisingSize;
    }

    public void setAdvertisingSize(String advertisingSize) {
        this.advertisingSize = advertisingSize;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getWebShield() {
        return webShield;
    }

    public void setWebShield(String webShield) {
        this.webShield = webShield;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getAdvertisingType() {
        return advertisingType;
    }

    public void setAdvertisingType(String advertisingType) {
        this.advertisingType = advertisingType;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public Long getDspId() {
        return dspId;
    }

    public void setDspId(Long dspId) {
        this.dspId = dspId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AdxDspFlowAccessSetting [id=" + id + ", timeInterval=" + timeInterval + ", advertisingPosition="
                + advertisingPosition + ", advertisingSize=" + advertisingSize + ", pageType=" + pageType
                + ", webShield=" + webShield + ", region=" + region + ", interest=" + interest + ", equipment="
                + equipment + ", cookie=" + cookie + ", advertisingType=" + advertisingType + ", appType=" + appType
                + ", channel=" + channel + ", remarks=" + remarks + ", flowType=" + flowType + ", dspId=" + dspId
                + ", updateTime=" + updateTime + "]";
    }

}

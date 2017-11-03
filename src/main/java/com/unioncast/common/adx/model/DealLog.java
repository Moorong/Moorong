package com.unioncast.common.adx.model;

import java.io.Serializable;

/**
 * 点击、展示日志记录
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2016年10月20日下午5:55:41
 */
public class DealLog implements Serializable {
	
	private static final long serialVersionUID = -4096612774884492909L;
	
	//主键
	private Long id;

	//dsp用户id
	private Long dspId;
	
	//广告主id
	private String advertiserId;
	
	//请求唯一id
	private String bid;
	
	//广告位id
	private String slotId;
	
	//设备id
	private String deviceId;
	
	//dsp用户的创意id
	private String creativeId;
	
	//adx系统中保存的dsp创意id
	private String adxCreativeId;
	
	//创意尺寸
	private String size;
	
	//底价
	private Integer minCpmPrice;
	
	//dsp出价
	private Integer maxCpmPrice;
	
	//加密的成交价
	private String settlePrice;
	
	//解析后的成交价
	private Integer price;
	
	//appId
	private String appId;
	
	//app名称
	private String appName;
	
	//扩展字段
	private String ext;
	
	//点击、展示、竞价成功标志 1：展示 2：点击 3：竞价成功
	private Integer adxType;
	
	//平台 ios、android 1：ios 2：android
	private Integer platform;
	
	//流量类型 app、web、video 1：app 2：web 3：video
	private Integer flowType;
	
	//adx/ssp名称 1：Tanx，2：BES，3：Tencent，4：电信炫彩，5：小沃科技，6：21CN，7：天彩汇诚 ；8：adView 9:chance 10:咪咕 11：ssp
	private Integer eventType;
	
	public DealLog() {
		
	}
	
	public DealLog(Long dspId, String advertiserId, String bid, String slotId,
			String deviceId, String creativeId, String adxCreativeId,
			String size, Integer minCpmPrice, Integer maxCpmPrice,
			String settlePrice, Integer price, String appId, String appName,
			String ext, Integer adxType, Integer platform, Integer flowType,
			Integer eventType) {
		super();
		this.dspId = dspId;
		this.advertiserId = advertiserId;
		this.bid = bid;
		this.slotId = slotId;
		this.deviceId = deviceId;
		this.creativeId = creativeId;
		this.adxCreativeId = adxCreativeId;
		this.size = size;
		this.minCpmPrice = minCpmPrice;
		this.maxCpmPrice = maxCpmPrice;
		this.settlePrice = settlePrice;
		this.price = price;
		this.appId = appId;
		this.appName = appName;
		this.ext = ext;
		this.adxType = adxType;
		this.platform = platform;
		this.flowType = flowType;
		this.eventType = eventType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDspId() {
		return dspId;
	}

	public void setDspId(Long dspId) {
		this.dspId = dspId;
	}

	public String getAdvertiserId() {
		return advertiserId;
	}

	public void setAdvertiserId(String advertiserId) {
		this.advertiserId = advertiserId;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCreativeId() {
		return creativeId;
	}

	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
	}

	public String getAdxCreativeId() {
		return adxCreativeId;
	}

	public void setAdxCreativeId(String adxCreativeId) {
		this.adxCreativeId = adxCreativeId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getMinCpmPrice() {
		return minCpmPrice;
	}

	public void setMinCpmPrice(Integer minCpmPrice) {
		this.minCpmPrice = minCpmPrice;
	}

	public Integer getMaxCpmPrice() {
		return maxCpmPrice;
	}

	public void setMaxCpmPrice(Integer maxCpmPrice) {
		this.maxCpmPrice = maxCpmPrice;
	}

	public String getSettlePrice() {
		return settlePrice;
	}

	public void setSettlePrice(String settlePrice) {
		this.settlePrice = settlePrice;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public Integer getAdxType() {
		return adxType;
	}

	public void setAdxType(Integer adxType) {
		this.adxType = adxType;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Integer getFlowType() {
		return flowType;
	}

	public void setFlowType(Integer flowType) {
		this.flowType = flowType;
	}

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "DealLog [id=" + id + ", dspId=" + dspId + ", advertiserId="
				+ advertiserId + ", bid=" + bid + ", slotId=" + slotId
				+ ", deviceId=" + deviceId + ", creativeId=" + creativeId
				+ ", adxCreativeId=" + adxCreativeId + ", size=" + size
				+ ", minCpmPrice=" + minCpmPrice + ", maxCpmPrice="
				+ maxCpmPrice + ", settlePrice=" + settlePrice + ", price="
				+ price + ", appId=" + appId + ", appName=" + appName
				+ ", ext=" + ext + ", adxType=" + adxType + ", platform="
				+ platform + ", flowType=" + flowType + ", eventType="
				+ eventType + "]";
	}
	
}

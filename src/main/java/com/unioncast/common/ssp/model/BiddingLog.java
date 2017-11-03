package com.unioncast.common.ssp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 竞价日志
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年2月13日下午4:21:14
 */
public class BiddingLog implements Serializable {

	private static final long serialVersionUID = -5270672316575910180L;
	private Long id;
	private Integer type; // 1:竞价 2：展示 3：点击 4：win通知
	private String bid; // 竞价id
	private Long advertiserId; // 广告主id
	private Long orderId; // 订单id
	private Long planId; // 策略id
	private Long creativeId; // 创意id
	private String size; // 创意尺寸
	private Integer minPrice; // 竞价请求传的底价
	private Integer maxPrice; // 出的最大价格
	private String adslotId; // 广告位id
	private String appId; // 媒体id
	private Integer creativeType; // 创意类型
	private Integer os; // 操作系统
	private String imei; // 用户终端的IMEI，
	private String mac; // 用户终端的eth0 接口的 MAC 地址（大写去除冒号分隔符）
	private String idfa; // 适用于IOS6以上
	private String aaid; // Android Advertising ID
	private String udid; // iOS终端设备识别号的开源实现
	private String androidId; // 用户终端的AndroidID
	private String duid; // WindowsPhone 用户终端的DUID
	private String ip; // ip地址
	private String ua; // User agent
	private Long ts; // 客户端触发监测的时间，用亍计算离线监测时间
	private Date updateTime;
	private Long dateNum;  //时间数字类型，主要用来范围查询
	
	public BiddingLog() {
		
	}

	public BiddingLog(Integer type, String bid, Long advertiserId,
			Long orderId, Long planId, Long creativeId, String size,
			Integer minPrice, Integer maxPrice, String adslotId, String appId,
			Integer creativeType, Integer os, String imei, String mac,
			String idfa, String aaid, String udid, String androidId,
			String duid, String ip, String ua, Long ts, Date updateTime , Long dateNum) {
		super();
		this.type = type;
		this.bid = bid;
		this.advertiserId = advertiserId;
		this.orderId = orderId;
		this.planId = planId;
		this.creativeId = creativeId;
		this.size = size;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.adslotId = adslotId;
		this.appId = appId;
		this.creativeType = creativeType;
		this.os = os;
		this.imei = imei;
		this.mac = mac;
		this.idfa = idfa;
		this.aaid = aaid;
		this.udid = udid;
		this.androidId = androidId;
		this.duid = duid;
		this.ip = ip;
		this.ua = ua;
		this.ts = ts;
		this.updateTime = updateTime;
		this.dateNum = dateNum;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}

	public Integer getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getAdslotId() {
		return adslotId;
	}

	public void setAdslotId(String adslotId) {
		this.adslotId = adslotId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Integer getCreativeType() {
		return creativeType;
	}

	public void setCreativeType(Integer creativeType) {
		this.creativeType = creativeType;
	}

	public Integer getOs() {
		return os;
	}

	public void setOs(Integer os) {
		this.os = os;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getAaid() {
		return aaid;
	}

	public void setAaid(String aaid) {
		this.aaid = aaid;
	}

	public String getUdid() {
		return udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getAndroidId() {
		return androidId;
	}

	public void setAndroidId(String androidId) {
		this.androidId = androidId;
	}

	public String getDuid() {
		return duid;
	}

	public void setDuid(String duid) {
		this.duid = duid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getDateNum() {
		return dateNum;
	}

	public void setDateNum(Long dateNum) {
		this.dateNum = dateNum;
	}
}

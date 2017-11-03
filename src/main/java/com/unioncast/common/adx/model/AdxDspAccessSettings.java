package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * dsp接入设置
 * 
 * @pdOid fd03be24-9f7f-4822-8256-b1ab06654663
 */
@MyTable("adx_dsp_access_settings")
public class AdxDspAccessSettings implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5146568841310394184L;

	public static final String TABLE_NAME = "adx_dsp_access_settings";
	public static final String PROPERTIES = "id, dsp_id, token, ip, current_key, check_key, dsp_qps_web, bes_qps_web, dsp_qps_mobile, bes_qps_mobile, dsp_qps_video, bes_qps_video, remarks, cookie_mapping_url, rtb_url, click_monitoring, exposure_monitoring, delivery_status, update_time";
	/**
	 * 接入设置ID
	 * 
	 * @pdOid 7c390e56-adae-4936-8acf-314abfd3ed4e
	 */
	@MyId("id")
	@MyColumn("id")
	private long id;
	/**
	 * dspID
	 * 
	 * @pdOid 70011ce4-89f9-42ea-b0a1-7f2ba86c8837
	 */
	@MyColumn("dsp_id")
	private long dspId;
	/**
	 * token
	 * 
	 * @pdOid 5a6a5043-98aa-4c78-bc60-e22e345ff7f4
	 */
	@MyColumn("token")
	private String token;
	/**
	 * IP
	 * 
	 * @pdOid 07858afa-d118-4009-b701-64a91747039e
	 */
	@MyColumn("ip")
	private String ip;
	/**
	 * 当前密钥
	 * 
	 * @pdOid 3e8d8286-f21f-4225-8079-5471e62f35fc
	 */
	@MyColumn("current_key")
	private String currentKey;
	/**
	 * 校验密钥
	 * 
	 * @pdOid c68cc0fe-d5d0-46cb-b8a1-d0705132e3df
	 */
	@MyColumn("check_key")
	private String checkKey;
	/**
	 * dsp设置qps-web流量
	 * 
	 * @pdOid cb86a68a-a870-4b0a-891b-34ae6e3c6545
	 */
	@MyColumn("dsp_qps_web")
	private int dspQpsWeb;
	/**
	 * bes设置qps-web流量
	 * 
	 * @pdOid ee84abbe-beec-42e7-b60b-aa3a6f2242f5
	 */
	@MyColumn("bes_qps_web")
	private int besQpsWeb;
	/**
	 * dsp设置qbs-mobile流量
	 * 
	 * @pdOid f33ce782-3ba5-4121-90e7-c2dc8d42b9fb
	 */
	@MyColumn("dsp_qps_mobile")
	private int dspQpsMobile;
	/**
	 * bes设置qps-mobile流量
	 * 
	 * @pdOid a505b850-4f30-4a76-8844-2d379cfbf7b4
	 */
	@MyColumn("bes_qps_mobile")
	private int besQpsMobile;
	/**
	 * dsp设置qps-video流量
	 * 
	 * @pdOid 9ece429d-1b37-4448-9298-a6612c0bf431
	 */
	@MyColumn("dsp_qps_video")
	private int dspQpsVideo;
	/**
	 * bes设置qps-video流量
	 * 
	 * @pdOid ae4dfaf0-88dc-4628-ab70-ea87dfd8e8ba
	 */
	@MyColumn("bes_qps_video")
	private int besQpsVideo;
	/**
	 * 冗余
	 * 
	 * @pdOid aa5be768-add2-4f90-a879-661b65300558
	 */
	@MyColumn("remarks")
	private String remarks;
	/** @pdOid 582d1c79-83e2-4c9e-9faf-ac614f61b695 */
	@MyColumn("update_time")
	private Date updateTime;
	/**
	 * cookie映射地址
	 * 
	 * @pdOid 11212de6-7ae2-4783-965e-861cdf0d7088
	 */
	@MyColumn("cookie_mapping_url")
	private String cookieMappingUrl;
	/**
	 * rtbURL
	 * 
	 * @pdOid 4bd65004-6b92-4728-862a-f1a704665b08
	 */
	@MyColumn("rtb_url")
	private String rtbUrl;
	/**
	 * 点击监测域
	 * 
	 * @pdOid 0a433eb9-8b1d-45a4-9c4c-2499c18a92fa
	 */
	@MyColumn("click_monitoring")
	private String clickMonitoring;
	/**
	 * 曝光监测域
	 * 
	 * @pdOid c1a41a9a-eec6-485d-a834-816dfb890bc3
	 */
	@MyColumn("exposure_monitoring")
	private String exposureMonitoring;
	/**
	 * 投放状态
	 * 
	 * @pdOid 78913256-ca0e-42cb-842b-8aeb03203817
	 */
	@MyColumn("delivery_status")
	private String deliveryStatus;

	public AdxDspAccessSettings(long id, long dspId, String token, String ip, String currentKey, String checkKey,
			int dspQpsWeb, int besQpsWeb, int dspQpsMobile, int besQpsMobile, int dspQpsVideo, int besQpsVideo,
			String remarks, Date updateTime, String cookieMappingUrl, String rtbUrl, String clickMonitoring,
			String exposureMonitoring, String deliveryStatus) {
		super();
		this.id = id;
		this.dspId = dspId;
		this.token = token;
		this.ip = ip;
		this.currentKey = currentKey;
		this.checkKey = checkKey;
		this.dspQpsWeb = dspQpsWeb;
		this.besQpsWeb = besQpsWeb;
		this.dspQpsMobile = dspQpsMobile;
		this.besQpsMobile = besQpsMobile;
		this.dspQpsVideo = dspQpsVideo;
		this.besQpsVideo = besQpsVideo;
		this.remarks = remarks;
		this.updateTime = updateTime;
		this.cookieMappingUrl = cookieMappingUrl;
		this.rtbUrl = rtbUrl;
		this.clickMonitoring = clickMonitoring;
		this.exposureMonitoring = exposureMonitoring;
		this.deliveryStatus = deliveryStatus;
	}

	public AdxDspAccessSettings() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDspId() {
		return dspId;
	}

	public void setDspId(long dspId) {
		this.dspId = dspId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCurrentKey() {
		return currentKey;
	}

	public void setCurrentKey(String currentKey) {
		this.currentKey = currentKey;
	}

	public String getCheckKey() {
		return checkKey;
	}

	public void setCheckKey(String checkKey) {
		this.checkKey = checkKey;
	}

	public int getDspQpsWeb() {
		return dspQpsWeb;
	}

	public void setDspQpsWeb(int dspQpsWeb) {
		this.dspQpsWeb = dspQpsWeb;
	}

	public int getBesQpsWeb() {
		return besQpsWeb;
	}

	public void setBesQpsWeb(int besQpsWeb) {
		this.besQpsWeb = besQpsWeb;
	}

	public int getDspQpsMobile() {
		return dspQpsMobile;
	}

	public void setDspQpsMobile(int dspQpsMobile) {
		this.dspQpsMobile = dspQpsMobile;
	}

	public int getBesQpsMobile() {
		return besQpsMobile;
	}

	public void setBesQpsMobile(int besQpsMobile) {
		this.besQpsMobile = besQpsMobile;
	}

	public int getDspQpsVideo() {
		return dspQpsVideo;
	}

	public void setDspQpsVideo(int dspQpsVideo) {
		this.dspQpsVideo = dspQpsVideo;
	}

	public int getBesQpsVideo() {
		return besQpsVideo;
	}

	public void setBesQpsVideo(int besQpsVideo) {
		this.besQpsVideo = besQpsVideo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCookieMappingUrl() {
		return cookieMappingUrl;
	}

	public void setCookieMappingUrl(String cookieMappingUrl) {
		this.cookieMappingUrl = cookieMappingUrl;
	}

	public String getRtbUrl() {
		return rtbUrl;
	}

	public void setRtbUrl(String rtbUrl) {
		this.rtbUrl = rtbUrl;
	}

	public String getClickMonitoring() {
		return clickMonitoring;
	}

	public void setClickMonitoring(String clickMonitoring) {
		this.clickMonitoring = clickMonitoring;
	}

	public String getExposureMonitoring() {
		return exposureMonitoring;
	}

	public void setExposureMonitoring(String exposureMonitoring) {
		this.exposureMonitoring = exposureMonitoring;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String toString() {
		return "AdxDspAccessSettings [id=" + id + ", dspId=" + dspId + ", token=" + token + ", ip=" + ip
				+ ", currentKey=" + currentKey + ", checkKey=" + checkKey + ", dspQpsWeb=" + dspQpsWeb + ", besQpsWeb="
				+ besQpsWeb + ", dspQpsMobile=" + dspQpsMobile + ", besQpsMobile=" + besQpsMobile + ", dspQpsVideo="
				+ dspQpsVideo + ", besQpsVideo=" + besQpsVideo + ", remarks=" + remarks + ", updateTime=" + updateTime
				+ ", cookieMappingUrl=" + cookieMappingUrl + ", rtbUrl=" + rtbUrl + ", clickMonitoring="
				+ clickMonitoring + ", exposureMonitoring=" + exposureMonitoring + ", deliveryStatus=" + deliveryStatus
				+ "]";
	}

}

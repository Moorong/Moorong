package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AdxFlowSetting implements Serializable {
	
	private static final long serialVersionUID = -3767411686783578192L;

	private Long id;// primary key
	
	private AdxDspAccessSettings account;// 所属dsp用户
	
	private String putHours;// 投放时段，用json格式存储
	
	private String instl;  //广告位相对位置，用逗号隔开；   1：横屏       2：插屏      3：竖屏
	
	private String deviceType;  //设备类型，用逗号隔开；   1：手机      2：平板      3：未检测
	
	private Set<AdxDeviceSize> adxDeviceSizeSet;// 广告尺寸
	
	private Set<AdxAppCategorys> appTypeSet;// app类别
	
	private String districtWebsites;
	
	private Set<Province> provinceSet;// 省级行政区域

	private Integer putStatus;// 投放状态，0：关闭，1：开启
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AdxDspAccessSettings getAccount() {
		return account;
	}

	public void setAccount(AdxDspAccessSettings account) {
		this.account = account;
	}

	public String getPutHours() {
		return putHours;
	}

	public void setPutHours(String putHours) {
		this.putHours = putHours;
	}

	public Set<AdxDeviceSize> getAdxDeviceSizeSet() {
		return adxDeviceSizeSet;
	}

	public void setAdxDeviceSizeSet(Set<AdxDeviceSize> adxDeviceSizeSet) {
		this.adxDeviceSizeSet = adxDeviceSizeSet;
	}

	public Set<AdxAppCategorys> getAppTypeSet() {
		return appTypeSet;
	}

	public void setAppTypeSet(Set<AdxAppCategorys> appTypeSet) {
		this.appTypeSet = appTypeSet;
	}

	public Set<Province> getProvinceSet() {
		return provinceSet;
	}

	public void setProvinceSet(Set<Province> provinceSet) {
		this.provinceSet = provinceSet;
	}

	public Integer getPutStatus() {
		return putStatus;
	}

	public void setPutStatus(Integer putStatus) {
		this.putStatus = putStatus;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDistrictWebsites() {
		return districtWebsites;
	}

	public void setDistrictWebsites(String districtWebsites) {
		this.districtWebsites = districtWebsites;
	}

	public String getInstl() {
		return instl;
	}

	public void setInstl(String instl) {
		this.instl = instl;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}

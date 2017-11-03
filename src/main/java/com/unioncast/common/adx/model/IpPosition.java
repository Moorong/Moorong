package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

public class IpPosition implements Serializable {
	
	private static final long serialVersionUID = 8407965049839717248L;

	private Long id; // 主键

	private String ip; // ip

	private Long provinceId; // 省份id，跟dsp_province中id对应

	private Long cityId; // 城市id，跟dsp_city中id对应

	private Date updatetime; // 更新时间
	
	private int ipint;
	
	public IpPosition() {
		
	}
	
	public IpPosition(Long id , String ip) {
		this.id = id;
		this.ip = ip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	public int getIpint() {
		return ipint;
	}

	public void setIpint(int ipint) {
		this.ipint = ipint;
	}

	@Override
	public String toString() {
		return "IpPosition [id=" + id + ", ip=" + ip + ", provinceId=" + provinceId + ", cityId=" + cityId + ", updatetime=" + updatetime + ", ipint=" + ipint + "]";
	}
}

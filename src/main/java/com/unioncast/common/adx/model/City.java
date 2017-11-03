package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 城市信息
 * 
 * @author liutiejun
 * @date 2016年2月27日 下午4:47:42
 *
 */
public class City implements Serializable {

	private static final long serialVersionUID = 6664799485673225103L;

	private Long id;// primary key

	private Province province;// 所属省级行政区域

	private String cityName;// 城市名称

	private Integer cityLevel;// 城市等级

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;// 数据更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getCityLevel() {
		return cityLevel;
	}

	public void setCityLevel(Integer cityLevel) {
		this.cityLevel = cityLevel;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}

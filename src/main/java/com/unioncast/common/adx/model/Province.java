package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 34省级行政区，包括4个直辖市、23个省、5个自治区、2个特别行政区
 * 
 * @author liutiejun
 * @date 2016年2月27日 下午4:29:33
 *
 */
public class Province implements Serializable {

	private static final long serialVersionUID = -3611893148553367836L;

	private Long id;// primary key

	private Region region;// 所属地区

	private String name;// 行政区域名称

	private String code;// 行政区域编码

	private Set<City> citySet;// 所有的城市信息

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;// 数据更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set<City> getCitySet() {
		return citySet;
	}

	public void setCitySet(Set<City> citySet) {
		this.citySet = citySet;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}

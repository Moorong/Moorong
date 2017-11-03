package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 地区信息
 * 
 * @author liutiejun
 * @date 2016年2月27日 下午3:49:03
 *
 */
public class Region implements Serializable {

	private static final long serialVersionUID = -9158711489877437018L;

	private Long id;// primary key

	// 地区名称，华东、华北、华南、华中、东北、西南、西北、港澳台
	private String name;

	private String code;// 地区编码

	private Set<Province> provinceSet;// 所有的省级行政区

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;// 数据更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<Province> getProvinceSet() {
		return provinceSet;
	}

	public void setProvinceSet(Set<Province> provinceSet) {
		this.provinceSet = provinceSet;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}

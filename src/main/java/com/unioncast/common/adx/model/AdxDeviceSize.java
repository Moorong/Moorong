package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 设备尺寸信息
 * 
 * @author liutiejun
 * @date 2016年2月27日 下午2:05:39
 *
 */
public class AdxDeviceSize implements Serializable {

	private static final long serialVersionUID = 5237602305514902321L;

	private Long id;// primary key

	private String size;// 尺寸

	private String flowDistrict;// 尺寸流量限制

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;// 数据更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFlowDistrict() {
		return flowDistrict;
	}

	public void setFlowDistrict(String flowDistrict) {
		this.flowDistrict = flowDistrict;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}

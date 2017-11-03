package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 行业信息
 * 
 * @author liutiejun
 * @date 2016年2月27日 下午3:41:19
 *
 */
public class Industry implements Serializable {

	private static final long serialVersionUID = -2421228102387281235L;

	private Long id;// primary key

	private Industry parent;// 父类

	private String name;// 行业名称

	private String code;// 行业编码

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;// 数据更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Industry getParent() {
		return parent;
	}

	public void setParent(Industry parent) {
		this.parent = parent;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Industry {\"id\":\"" + id + "\",\"name\":\"" + name + "\",\"code\":\"" + code + "\",\"updateTime\":\""
				+ updateTime + "\"}  ";
	}

}

package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 行业类型 ssp_dict_industry
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:23:43
 */
@MyTable("ssp_dict_industry")
public class SspDictIndustry implements Serializable {

	private static final long serialVersionUID = 7124946094669428923L;

	public static String PROPERTIES = "id, code, level, name, update_time";
	public static String TABLE_NAME = "ssp_dict_industry";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	//1000     游戏	100001       儿童	100002       体育	1100     系统	110001       内存清理	110002       安全防护	1200     生活	120001
	@MyColumn("code")
	private Long code;

	//1--1级，2,--2级
	@MyColumn("level")
	private Long level;

	@MyColumn("name")
	private String name;

	@MyColumn("update_time")
	private Date updateTime;

	public SspDictIndustry() {
	}

	public SspDictIndustry(Long id, Long code, Long level, String name, Date updateTime) {
		this.id = id;
		this.code = code;
		this.level = level;
		this.name = name;
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
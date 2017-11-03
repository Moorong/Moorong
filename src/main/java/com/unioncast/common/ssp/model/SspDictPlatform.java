package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 所属平台 ssp_dict_platform
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:25:30
 */
@MyTable("ssp_dict_platform")
public class SspDictPlatform implements Serializable {

	private static final long serialVersionUID = 2768478142225272790L;

	public static String PROPERTIES = "id, code, level, name, update_time";
	public static String TABLE_NAME = "ssp_dict_platform";
	@MyId("id")
	@MyColumn("id")
	private Long id;

	// 1000 android全部 100001 android--手机 100002 android--平板 2000 ios全部 200001
	// ios--手机 200002 ios--平板
	@MyColumn("code")
	private Long code;

	// 1-android，2-ios
	@MyColumn("level")
	private Integer level;

	// 平台类型名称
	@MyColumn("name")
	private String name;

	@MyColumn("update_time")
	private Date updateTime;

	public SspDictPlatform() {
	}

	public SspDictPlatform(Long id, Long code, Integer level, String name, Date updateTime) {
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
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
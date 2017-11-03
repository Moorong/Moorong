package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告类型 ssp_dict_ad_type
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:20:09
 */
@MyTable("ssp_dict_ad_type")
public class SspDictAdType implements Serializable {

	private static final long serialVersionUID = -5386062194453140317L;

	public static String PROPERTIES = "id, code, level, name, update_time";
	public static String TABLE_NAME = "ssp_dict_ad_type";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	// 100001 展示--banner 100002 展示--全屏 100003 展示--插屏 100004 展示--开屏 100005 展示--图文
	// 200001 视频--贴片 200002
	@MyColumn("code")
	private Long code;

	// 1-展示广告，2-视频广告，3-原生广告
	@MyColumn("level")
	private Integer level;

	// 广告类型名称
	@MyColumn("name")
	private String name;

	@MyColumn("update_time")
	private Date updateTime;

	public SspDictAdType() {
	}

	public SspDictAdType(Long id, Long code, Integer level, String name, Date updateTime) {
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

	@Override
	public String toString() {
		return "SspDictAdType{" +
				"id=" + id +
				", code=" + code +
				", level=" + level +
				", name='" + name + '\'' +
				", updateTime=" + updateTime +
				'}';
	}
}
package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;

import java.io.Serializable;
import java.util.Date;

/**
 * 城市信息 ssp_city_info
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:12:26
 */
public class SspCityInfo implements Serializable {

	private static final long serialVersionUID = 6552849328037045100L;

	public static String PROPERTIES = "id, code, name, update_time";
	public static String TABLE_NAME = "ssp_city_info";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	/**
	 * 100     湖北
	 * 100001       武汉
	100002       襄樊
	110     江苏
	110001       南京
	120    北京
	120001       朝阳
	 */
	@MyColumn("code")
	private String code;

	@MyColumn("name")
	private String name;

	@MyColumn("update_time")
	private Date updateTime;

	public SspCityInfo() {
	}

	public SspCityInfo(Long id, String code, String name, Date updateTime) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
		return "SspCityInfo{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", updateTime=" + updateTime +
				'}';
	}
}
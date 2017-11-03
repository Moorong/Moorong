package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 状态审核 ssp_dict_audit
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:21:23
 */
@MyTable("ssp_dict_audit")
public class SspDictAudit implements Serializable {

	private static final long serialVersionUID = 1397707634196498399L;

	public static String PROPERTIES = "id, code, name, update_time";
	public static String TABLE_NAME = "ssp_dict_audit";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	//1-审核中，2-审核通过，3-未通过
	@MyColumn("code")
	private Integer code;

	//状态
	@MyColumn("name")
	private String name;

	@MyColumn("update_time")
	private Date updateTime;

	public SspDictAudit() {
	}

	public SspDictAudit(Long id, Integer code, String name, Date updateTime) {
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

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
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
}
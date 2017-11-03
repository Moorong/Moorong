package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

public class AdxAppCategorys implements Serializable {

	private static final long serialVersionUID = -4172964913983811195L;

	private Long id;

	private String name;

	private Date updatetime;

	private String adviewCode;

	private String besCode;

	private String tanxCode;

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
		this.name = name == null ? null : name.trim();
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getAdviewCode() {
		return adviewCode;
	}

	public void setAdviewCode(String adviewCode) {
		this.adviewCode = adviewCode == null ? null : adviewCode.trim();
	}

	public String getBesCode() {
		return besCode;
	}

	public void setBesCode(String besCode) {
		this.besCode = besCode == null ? null : besCode.trim();
	}

	public String getTanxCode() {
		return tanxCode;
	}

	public void setTanxCode(String tanxCode) {
		this.tanxCode = tanxCode == null ? null : tanxCode.trim();
	}
}
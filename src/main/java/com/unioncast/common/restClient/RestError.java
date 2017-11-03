package com.unioncast.common.restClient;

import java.io.Serializable;

public class RestError implements Serializable {

	private static final long serialVersionUID = 3971338051541614352L;
	private int index;
	/**
	 * 错误码
	 */
	private int code;
	/**
	 * 错误信息
	 */
	private String message;
	/**
	 * 错误字段
	 */
	private String filed;

	public RestError() {
		super();
	}

	public RestError(int index, int code, String message, String filed) {
		super();
		this.index = index;
		this.code = code;
		this.message = message;
		this.filed = filed;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFiled() {
		return filed;
	}

	public void setFiled(String filed) {
		this.filed = filed;
	}

}

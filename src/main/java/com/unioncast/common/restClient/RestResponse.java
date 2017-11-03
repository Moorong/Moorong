package com.unioncast.common.restClient;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.unioncast.common.ssp.model.SspOrder;

public class RestResponse implements Serializable {

	private static final long serialVersionUID = -5209756949372897702L;

	public static final int OK = 0;

	public static final int FAIL = 1;

	/**
	 * 状态码，0：调用成功，1：调用失败
	 */
	private int status;
	/**
	 * 异常信息
	 */
	private RestError[] restErrors;
	/**
	 * 正常的返回结果
	 */
	protected Object result;

	public RestResponse() {
		super();
	}

	public RestResponse(int status, RestError[] restErrors, Object result) {
		super();
		this.status = status;
		this.restErrors = restErrors;
		this.result = result;
	}
	
	public boolean isSuccess(){
		return OK == status;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public RestError[] getRestErrors() {
		return restErrors;
	}

	public void setRestErrors(RestError[] restErrors) {
		this.restErrors = restErrors;
	}

	public Object getResult() {
		return result;
	}
	public <T> T getResultT(Class<T> clazz){
		try {
			return JSONObject.parseObject(JSONObject.toJSONString(result),clazz);
		} catch (Exception e) {
			return null;
		}
	}
	public <T> List<T> getResultArr(Class<T> clazz){
		try {
			return JSONObject.parseArray(JSONObject.toJSONString(result),clazz);
		} catch (Exception e) {
			return null;
		}
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "RestResponse [status=" + status + ", restErrors=" + Arrays.toString(restErrors) + ", result=" + result
				+ "]";
	}

}
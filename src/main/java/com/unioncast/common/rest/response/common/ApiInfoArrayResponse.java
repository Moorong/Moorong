package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.ApiInfo;

/**
 * @author : wangyao
 * @Date ：2016年11月8日 下午3:30:18
 * 
 *
 */
public class ApiInfoArrayResponse extends RestResponse {

	private static final long serialVersionUID = 765855482346869697L;

	public ApiInfo[] result;

	public ApiInfo[] getResult() {
		return result;
	}

	public void setResult(ApiInfo[] result) {
		this.result = result;
	}

}

package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.ApiInfo;

/** 
* @author : wangyao
* @Date ：2016年11月1日 下午5:01:17
* 系统数据 
*/
public class ApiInfoResponse extends RestResponse {

	private static final long serialVersionUID = -5939409920753578821L;
	
	public ApiInfo result;

	public ApiInfo getResult() {
		return result;
	}

	public void setResult(ApiInfo result) {
		this.result = result;
	}

}

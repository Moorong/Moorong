package com.unioncast.common.rest.response.common;

import java.util.List;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.ApiInfo;

/** 
* @author : wangyao
* @Date ：2016年11月1日 下午5:01:17
* 
* 系统信息（list）
*/
public class ApiInfoListResponse extends RestResponse {

	private static final long serialVersionUID = 5955888981006287400L;
	
	public List<ApiInfo> result;

	public List<ApiInfo> getResult() {
		return result;
	}

	public void setResult(List<ApiInfo> result) {
		this.result = result;
	}

}

package com.unioncast.common.rest.response.common;

import java.util.List;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Authentication;

/** 
* @author : wangyao
* @Date ：2016年11月1日 下午5:01:17
* 鉴权数据（list）
*/
public class AuthenticationListResponse extends RestResponse {

	private static final long serialVersionUID = 3491138147574466155L;
	
	public List<Authentication> result;

	public List<Authentication> getResult() {
		return result;
	}

	public void setResult(List<Authentication> result) {
		this.result = result;
	}

}

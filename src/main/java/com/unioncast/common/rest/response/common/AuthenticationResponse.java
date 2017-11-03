package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Authentication;

/** 
* @author : wangyao
* @Date ：2016年11月1日 下午5:01:17
* 鉴权数据
*/
public class AuthenticationResponse extends RestResponse {

	private static final long serialVersionUID = 1808439748820424445L;
	
	public Authentication result;

	public Authentication getResult() {
		return result;
	}

	public void setResult(Authentication result) {
		this.result = result;
	}

}

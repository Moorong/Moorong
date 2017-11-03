package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Authentication;

/**
 * @author : wangyao
 * @Date ：2016年11月8日 下午4:47:13
 * 
 *
 */
public class AuthenticationArrayResponse extends RestResponse {

	private static final long serialVersionUID = -7235980559228066643L;

	public Authentication[] result;

	public Authentication[] getResult() {
		return result;
	}

	public void setResult(Authentication[] result) {
		this.result = result;
	}

}

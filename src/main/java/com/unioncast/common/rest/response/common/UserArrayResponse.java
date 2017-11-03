package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.User;

/**
 * @author : wangyao
 * @Date ：2016年11月8日 下午3:28:24
 * 
 * 
 */
public class UserArrayResponse extends RestResponse {

	private static final long serialVersionUID = 2553430991042810594L;

	public User[] result;

	public User[] getResult() {
		return result;
	}

	public void setResult(User[] result) {
		this.result = result;
	}

}

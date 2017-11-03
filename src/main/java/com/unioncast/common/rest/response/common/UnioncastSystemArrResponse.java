package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.UnioncastSystem;
import com.unioncast.common.user.model.User;

/**
 * @auther wangyao
 * @date 2017-02-16 10:49
 */

public class UnioncastSystemArrResponse extends RestResponse {

	private static final long serialVersionUID = 6965147534367605014L;
	public UnioncastSystem[] result;

	@Override
	public UnioncastSystem[] getResult() {
		return result;
	}

	public void setResult(UnioncastSystem[] result) {
		this.result = result;
	}
}

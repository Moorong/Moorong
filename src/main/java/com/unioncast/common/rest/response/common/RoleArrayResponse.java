package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Role;

/**
 * @author : wangyao
 * @Date ：2016年11月8日 下午4:49:24
 * 
 *
 */
public class RoleArrayResponse extends RestResponse {

	private static final long serialVersionUID = -3550295588458079854L;
	
	public Role[] result;

	public Role[] getResult() {
		return result;
	}

	public void setResult(Role[] result) {
		this.result = result;
	}

}

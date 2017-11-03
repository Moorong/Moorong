package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.User;

/** 
* @author : wangyao
* @Date ：2016年10月11日 下午2:17:38 
* 用户Response信息
*/
public class UserResponse extends RestResponse {

	private static final long serialVersionUID = 1839291467907437501L;
	
	public User result;

	public User getResult() {
		return result;
	}

	public void setResult(User result) {
		this.result = result;
	}

}

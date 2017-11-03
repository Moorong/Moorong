package com.unioncast.common.rest.response.common;

import java.util.List;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.User;

/** 
* @author : wangyao
* @Date ：2016年10月11日 下午2:25:59 
* 用户Response（list集合）
*/
public class UserListResponse extends RestResponse {

	private static final long serialVersionUID = -4613620721052675263L;

	public List<User> result;

	public List<User> getResult() {
		return result;
	}

	public void setResult(List<User> result) {
		this.result = result;
	}
}

package com.unioncast.common.rest.response.common;

import java.util.List;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Role;

/**
 * @author : wangyao
 * @Date ：2016年10月31日 上午9:39:22 角色数据（list）
 */
public class RoleListResponse extends RestResponse {

	private static final long serialVersionUID = 3489165488736116999L;

	public List<Role> result;

	public List<Role> getResult() {
		return result;
	}

	public void setResult(List<Role> result) {
		this.result = result;
	}

}

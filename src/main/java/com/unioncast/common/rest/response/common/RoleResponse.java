package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Role;

/**
 * @author : wangyao
 * @Date ：2016年10月31日 上午9:39:22 角色数据
 */
public class RoleResponse extends RestResponse {

	private static final long serialVersionUID = -2678464483516112332L;

	public Role result;

	public Role getResult() {
		return result;
	}

	public void setResult(Role result) {
		this.result = result;
	}

}

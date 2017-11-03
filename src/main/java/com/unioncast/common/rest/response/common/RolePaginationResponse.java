package com.unioncast.common.rest.response.common;

import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Role;

/**
 * @author : wangyao
 * @Date ：2016年10月31日 上午9:39:22 角色分页数据
 */
public class RolePaginationResponse extends RestResponse {

	private static final long serialVersionUID = -8511174981250236820L;

	public Pagination<Role> result;

	public Pagination<Role> getResult() {
		return result;
	}

	public void setResult(Pagination<Role> result) {
		this.result = result;
	}

}

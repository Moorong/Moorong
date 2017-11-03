package com.unioncast.common.rest.response.common;

import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.User;

/** 
* @author : wangyao
* @Date ：2016年10月11日 下午3:33:53 
* 用户分页数据
*/
public class UserPaginationResponse extends RestResponse {

	private static final long serialVersionUID = -1905478653363096754L;
	
	public Pagination<User> result;

	public Pagination<User> getResult() {
		return result;
	}

	public void setResult(Pagination<User> result) {
		this.result = result;
	}

}

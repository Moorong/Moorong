package com.unioncast.common.rest.response.common;

import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Authentication;

/** 
* @author : wangyao
* @Date ：2016年11月1日 下午5:01:17
* 鉴权分页数据
*/
public class AuthenticationPaginationResponse extends RestResponse {

	private static final long serialVersionUID = -2917274217140988404L;
	
	public Pagination<Authentication> result;

	public Pagination<Authentication> getResult() {
		return result;
	}

	public void setResult(Pagination<Authentication> result) {
		this.result = result;
	}

}

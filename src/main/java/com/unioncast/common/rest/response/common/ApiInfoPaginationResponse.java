package com.unioncast.common.rest.response.common;

import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.ApiInfo;

/** 
* @author : wangyao
* @Date ：2016年11月1日 下午5:01:17
* 
*
*/
public class ApiInfoPaginationResponse extends RestResponse {

	private static final long serialVersionUID = 5103908735992983622L;
	
	public Pagination<ApiInfo> result;

	public Pagination<ApiInfo> getResult() {
		return result;
	}

	public void setResult(Pagination<ApiInfo> result) {
		this.result = result;
	}

}

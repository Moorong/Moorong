package com.unioncast.common.rest.response.common;

import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Module;

/** 
* @author : wangyao
* @Date ：2016年10月11日 下午4:26:51 
* 模块分页数据
*/
public class ModulePaginationReponse extends RestResponse {

	private static final long serialVersionUID = 3212930723909897672L;
	
	public Pagination<Module> result;

	public Pagination<Module> getResult() {
		return result;
	}

	public void setResult(Pagination<Module> result) {
		this.result = result;
	}

}

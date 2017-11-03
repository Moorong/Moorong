package com.unioncast.common.rest.response.common;

import java.util.List;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Module;

/** 
* @author : wangyao
* @Date ：2016年10月11日 下午4:24:01 
* 模块数据（list） 
*/
public class ModuleListResponse extends RestResponse {

	private static final long serialVersionUID = -6283229044114710270L;
	
	public List<Module> result;

	public List<Module> getResult() {
		return result;
	}

	public void setResult(List<Module> result) {
		this.result = result;
	}

}

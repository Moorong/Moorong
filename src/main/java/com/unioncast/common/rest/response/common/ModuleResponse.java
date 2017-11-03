package com.unioncast.common.rest.response.common;


import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Module;

/** 
* @author : wangyao
* @Date ：2016年10月11日 下午4:21:09 
* 模块数据
*/
public class ModuleResponse extends RestResponse {

	private static final long serialVersionUID = -2965282891063604446L;
	
	public Module result;

	public Module getResult() {
		return result;
	}

	public void setResult(Module result) {
		this.result = result;
	}

	
}

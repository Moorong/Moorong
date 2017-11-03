package com.unioncast.common.rest.response.common;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.user.model.Module;

/**
 * @author : wangyao
 * @Date ：2016年11月8日 下午4:48:23
 * 
 *
 */
public class ModuleArrayResponse extends RestResponse {

	private static final long serialVersionUID = 4320553798263936154L;

	public Module[] result;

	public Module[] getResult() {
		return result;
	}

	public void setResult(Module[] result) {
		this.result = result;
	}

}

package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspCityInfo;

/**
 * @auther wangyao
 * @date 2017-03-10 17:10
 */

public class SspCityInfoArrResponse extends RestResponse {
	private static final long serialVersionUID = -133661566088965107L;
	public SspCityInfo[] result;

	public SspCityInfo[] getResult() {
		return result;
	}

	public void setResult(SspCityInfo[] result) {
		this.result = result;
	}
}

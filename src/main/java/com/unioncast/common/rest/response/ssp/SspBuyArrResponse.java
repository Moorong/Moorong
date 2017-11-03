package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictBuyTarget;

public class SspBuyArrResponse extends RestResponse {

	private static final long serialVersionUID = -5226843062066594467L;

	public SspDictBuyTarget[] result;

	public SspDictBuyTarget[] getResult() {
		return result;
	}

	public void setResult(SspDictBuyTarget[] result) {
		this.result = result;
	}

}

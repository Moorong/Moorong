package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictMarriageTarget;

public class SspMarriageArrResponse extends RestResponse {

	private static final long serialVersionUID = 6276793733714389945L;

	public SspDictMarriageTarget[] result;

	public SspDictMarriageTarget[] getResult() {
		return result;
	}

	public void setResult(SspDictMarriageTarget[] result) {
		this.result = result;
	}

}

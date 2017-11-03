package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictInterestsTarget;

public class SspInterestsArrResponse extends RestResponse {

	private static final long serialVersionUID = -5624202261798219632L;
	public SspDictInterestsTarget[] result;

	public SspDictInterestsTarget[] getResult() {
		return result;
	}

	public void setResult(SspDictInterestsTarget[] result) {
		this.result = result;
	}

}

package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictAgeTarget;

public class SspAgeTypeArrResponse extends RestResponse {
	private static final long serialVersionUID = -4406891402199281016L;
	public SspDictAgeTarget[] result;

	public SspDictAgeTarget[] getResult() {
		return result;
	}

	public void setResult(SspDictAgeTarget[] result) {
		this.result = result;
	}

}

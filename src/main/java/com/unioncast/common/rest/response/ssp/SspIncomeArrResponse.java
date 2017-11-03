package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictIncomeTarget;

public class SspIncomeArrResponse extends RestResponse {

	private static final long serialVersionUID = 8823524441036660041L;
	public SspDictIncomeTarget[] result;

	public SspDictIncomeTarget[] getResult() {
		return result;
	}

	public void setResult(SspDictIncomeTarget[] result) {
		this.result = result;
	}

}

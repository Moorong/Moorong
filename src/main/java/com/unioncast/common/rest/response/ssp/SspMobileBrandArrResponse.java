package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictMobileBrandType;

public class SspMobileBrandArrResponse extends RestResponse {

	private static final long serialVersionUID = 8831913265984664069L;

	public SspDictMobileBrandType[] result;

	public SspDictMobileBrandType[] getResult() {
		return result;
	}

	public void setResult(SspDictMobileBrandType[] result) {
		this.result = result;
	}

}

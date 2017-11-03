package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictCrowdSexType;

public class SspSexTypeArrResponse extends RestResponse{

	private static final long serialVersionUID = -6288259261886850974L;

	public SspDictCrowdSexType[] result ;

	public SspDictCrowdSexType[] getResult() {
		return result;
	}

	public void setResult(SspDictCrowdSexType[] result) {
		this.result = result;
	}
	
}

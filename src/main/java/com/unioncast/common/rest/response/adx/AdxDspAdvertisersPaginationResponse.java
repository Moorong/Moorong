package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxDspAdvertisers;
import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;

public class AdxDspAdvertisersPaginationResponse extends RestResponse{
	
	private static final long serialVersionUID = 53665126284123231L;
	
	private Pagination<AdxDspAdvertisers> result;

	public Pagination<AdxDspAdvertisers> getResult() {
		return result;
	}

	public void setResult(Pagination<AdxDspAdvertisers> result) {
		this.result = result;
	}
	
}

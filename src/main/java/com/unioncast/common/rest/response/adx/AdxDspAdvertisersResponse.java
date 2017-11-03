package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxDspAdvertisers;
import com.unioncast.common.restClient.RestResponse;

/**
 * @ClassName:     AdxDspAdvertisersResponse.java
 * @Description:   广告主
 * @author         feng
 * @Date           2016年10月18日 下午12:12:34
 */
public class AdxDspAdvertisersResponse extends RestResponse{

	private static final long serialVersionUID = 50794126284123231L;
	
	private AdxDspAdvertisers result;

	public AdxDspAdvertisers getResult() {
		return result;
	}

	public void setResult(AdxDspAdvertisers result) {
		this.result = result;
	}
}

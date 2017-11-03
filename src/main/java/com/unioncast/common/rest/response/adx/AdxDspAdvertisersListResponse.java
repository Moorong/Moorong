package com.unioncast.common.rest.response.adx;

import java.util.List;

import com.unioncast.common.adx.model.AdxDspAdvertisers;
import com.unioncast.common.restClient.RestResponse;

/**
 * @ClassName:     AdxDspAdvertisersListResponse.java
 * @Description:   广告主List对象
 * @author         feng
 * @Date           2016年10月18日 下午1:59:58
 */
public class AdxDspAdvertisersListResponse extends RestResponse{

	private static final long serialVersionUID = 50765126284123231L;
	
	private List<AdxDspAdvertisers> result;

	public List<AdxDspAdvertisers> getResult() {
		return result;
	}

	public void setResult(List<AdxDspAdvertisers> result) {
		this.result = result;
	}

}

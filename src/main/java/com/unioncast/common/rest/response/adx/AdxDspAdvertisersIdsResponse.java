package com.unioncast.common.rest.response.adx;

import java.util.List;

import com.unioncast.common.adx.model.AdxDspAdvertisers;
import com.unioncast.common.restClient.RestResponse;

/**
 * @ClassName:     AdxDspAdvertisersListResponse.java
 * @Description:   广告主ids
 * @author         feng
 * @Date           2016年10月18日 下午1:59:58
 */
public class AdxDspAdvertisersIdsResponse extends RestResponse{

	private static final long serialVersionUID = 50765126284123231L;
	
	private Long[] result;

	public Long[] getResult() {
		return result;
	}

	public void setResult(Long[] result) {
		this.result = result;
	}
}

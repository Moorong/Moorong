/**
 * 
 */
package com.unioncast.common.rest.response.common;

import com.unioncast.common.adx.model.AdxSspAdvertisingPosition;
import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;

/**
 * @author dxy
 *
 */
public class AdvertisingPaginationResponse extends RestResponse {

	private static final long serialVersionUID = -4376691347426172271L;

	public Pagination<AdxSspAdvertisingPosition> result;

	public Pagination<AdxSspAdvertisingPosition> getResult() {
		return result;
	}

	public void setResult(Pagination<AdxSspAdvertisingPosition> result) {
		this.result = result;
	}

}

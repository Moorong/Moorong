package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxDspBiddingParams;
import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 竞价参数分页结果集
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月27日 下午4:29:30
 */
public class AdxDspBiddingParamsPaginationResponse extends RestResponse {

	private static final long serialVersionUID = 5492508350488733239L;
	// 竞价参数分页结果集
	private Pagination<AdxDspBiddingParams> result;

	public Pagination<AdxDspBiddingParams> getResult() {
		return result;
	}

	public void setResult(Pagination<AdxDspBiddingParams> result) {
		this.result = result;
	}

}

package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxDspBiddingParams;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 竞价参数结果
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月27日 下午4:26:51
 */
public class AdxDspBiddingParamsResponse extends RestResponse {

	private static final long serialVersionUID = 4772768862056008348L;
	// 竞价参数结果
	private AdxDspBiddingParams result;

	public AdxDspBiddingParams getResult() {
		return result;
	}

	public void setResult(AdxDspBiddingParams result) {
		this.result = result;
	}

}

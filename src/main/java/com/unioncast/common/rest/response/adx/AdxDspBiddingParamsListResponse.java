package com.unioncast.common.rest.response.adx;

import java.util.List;

import com.unioncast.common.adx.model.AdxDspBiddingParams;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 竞价参数结果集
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月27日 下午4:24:02
 */
public class AdxDspBiddingParamsListResponse extends RestResponse {

	private static final long serialVersionUID = -1689646785046510700L;
	// 竞价参数结果集
	private List<AdxDspBiddingParams> result;

	public List<AdxDspBiddingParams> getResult() {
		return result;
	}

	public void setResult(List<AdxDspBiddingParams> result) {
		this.result = result;
	}

}

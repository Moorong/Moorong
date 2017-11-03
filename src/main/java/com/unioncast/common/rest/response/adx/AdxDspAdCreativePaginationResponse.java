package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxDspAdcreative;
import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 广告创意分页结果集对象
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月19日 上午9:53:38
 */
public class AdxDspAdCreativePaginationResponse extends RestResponse {

	private static final long serialVersionUID = 8041372418552839119L;
	// 广告创意分页结果集
	private Pagination<AdxDspAdcreative> result;

	public Pagination<AdxDspAdcreative> getResult() {
		return result;
	}

	public void setResult(Pagination<AdxDspAdcreative> result) {
		this.result = result;
	}

}

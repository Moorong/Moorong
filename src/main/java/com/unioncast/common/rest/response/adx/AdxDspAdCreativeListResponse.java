package com.unioncast.common.rest.response.adx;

import java.util.List;

import com.unioncast.common.adx.model.AdxDspAdcreative;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 广告创意list结果集对象
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月19日 上午9:50:40
 */
public class AdxDspAdCreativeListResponse extends RestResponse {

	private static final long serialVersionUID = 5690654590854222246L;
	// 广告创意结果集
	private List<AdxDspAdcreative> result;

	public List<AdxDspAdcreative> getResult() {
		return result;
	}

	public void setResult(List<AdxDspAdcreative> result) {
		this.result = result;
	}

}

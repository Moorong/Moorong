package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictEducationTarget;

/**
 * 
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 *
 * @author dsp2liufengjiao
 * @date 2017年4月7日 下午4:43:35
 *
 */
public class SspEducationArrResponse extends RestResponse {

	private static final long serialVersionUID = -7138975423050584164L;
	public SspDictEducationTarget[] result;

	public SspDictEducationTarget[] getResult() {
		return result;
	}

	public void setResult(SspDictEducationTarget[] result) {
		this.result = result;
	}

}

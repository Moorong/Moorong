package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.restClient.RestResponse;
import com.unioncast.common.ssp.model.SspDictCreativeSize;

/**
 * @author : wangyao
 * @Date ：2016年11月8日 下午3:30:18
 * 
 *
 */
public class SspDictCreativeSizeArrayResponse extends RestResponse {

	private static final long serialVersionUID = 765855482346869697L;

	public SspDictCreativeSize[] result;

	public SspDictCreativeSize[] getResult() {
		return result;
	}

	public void setResult(SspDictCreativeSize[] result) {
		this.result = result;
	}

}

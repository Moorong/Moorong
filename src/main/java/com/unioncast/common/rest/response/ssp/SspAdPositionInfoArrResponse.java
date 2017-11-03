package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.ssp.model.SspAdPositionInfo;

import java.io.Serializable;

/**
 * @auther wangyao
 * @date 2017-04-05 14:01
 */

public class SspAdPositionInfoArrResponse implements Serializable {
	private static final long serialVersionUID = -1313934679342195233L;
	public SspAdPositionInfo[] result;

	public SspAdPositionInfo[] getResult() {
		return result;
	}

	public void setResult(SspAdPositionInfo[] result) {
		this.result = result;
	}
}

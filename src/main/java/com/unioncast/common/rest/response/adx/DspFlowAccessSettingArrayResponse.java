/**
 * 
 */
package com.unioncast.common.rest.response.adx;

import java.util.List;

import com.unioncast.common.adx.model.AdxDspFlowAccessSetting;
import com.unioncast.common.restClient.RestResponse;

/**
 * @ClassName:     DspFlowAccessSettingListResponse.java
 * @Description:   dsp流量接入设置（List）
 * @author         feng
 * @Date           2016年10月21日 下午3:48:14
 */
public class DspFlowAccessSettingArrayResponse extends RestResponse{
	
	private static final long serialVersionUID = 5690654578854772246L;

	private AdxDspFlowAccessSetting[] result;

	public AdxDspFlowAccessSetting[] getResult() {
		return result;
	}

	public void setResult(AdxDspFlowAccessSetting[] result) {
		this.result = result;
	}
	

}

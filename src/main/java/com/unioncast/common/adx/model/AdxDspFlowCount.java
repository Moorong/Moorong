package com.unioncast.common.adx.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 存放adx-dsp流量相关信息
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月26日 下午3:12:42
 */
public class AdxDspFlowCount extends RestResponse {
	private static final long serialVersionUID = -2196200492063747686L;
	// 存储向dsp的流量发送量
	private  Map<String, Map<Long, AdxDspBiddingParams>> dspFlow = new HashMap<String, Map<Long, AdxDspBiddingParams>>();
	//当前时间当前用户当前流量类型下的记录
	private Map<String, Map<Long, Map<Integer, AdxDspBiddingParams>>> dspFlow2 = new HashMap<String, Map<Long, Map<Integer, AdxDspBiddingParams>>>();
	public Map<String, Map<Long, AdxDspBiddingParams>> getDspFlow() {
		return dspFlow;
	}
	public void setDspFlow(Map<String, Map<Long, AdxDspBiddingParams>> dspFlow) {
		this.dspFlow = dspFlow;
	}
	public Map<String, Map<Long, Map<Integer, AdxDspBiddingParams>>> getDspFlow2() {
		return dspFlow2;
	}
	public void setDspFlow2(
			Map<String, Map<Long, Map<Integer, AdxDspBiddingParams>>> dspFlow2) {
		this.dspFlow2 = dspFlow2;
	}

	

}

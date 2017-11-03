package com.unioncast.common.adx.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 *存储流量接入设置参数
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年11月1日 下午4:09:33
 */
public class AdxDspAccessSettingsCount extends RestResponse {

	private static final long serialVersionUID = -2472324355002907793L;
	// 记录向dsp用户下的当前时间下的请求发送次数
	public static Map<Date, Map<Long, AdxDspAccessSettings>> dspFlowCount = new HashMap<Date, Map<Long, AdxDspAccessSettings>>();

	public static Map<Date, Map<Long, AdxDspAccessSettings>> getDspFlowCount() {
		return dspFlowCount;
	}

	public static void setDspFlowCount(
			Map<Date, Map<Long, AdxDspAccessSettings>> dspFlowCount) {
		AdxDspAccessSettingsCount.dspFlowCount = dspFlowCount;
	}

}

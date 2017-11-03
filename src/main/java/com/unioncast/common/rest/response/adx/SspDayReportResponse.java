package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxSspReportFormDay;
import com.unioncast.common.restClient.RestResponse;

public class SspDayReportResponse extends RestResponse {
	
	private static final long serialVersionUID = -25702545665555334L;
	
	private AdxSspReportFormDay adxSspReportFormDay;

	public AdxSspReportFormDay getAdxSspReportFormDay() {
		return adxSspReportFormDay;
	}

	public void setAdxSspReportFormDay(AdxSspReportFormDay adxSspReportFormDay) {
		this.adxSspReportFormDay = adxSspReportFormDay;
	}
}

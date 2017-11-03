package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxSspReportFormDay;
import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;

public class SspDayReportPaginationResponse extends RestResponse {
	
	private static final long serialVersionUID = -3360368676154229215L;
	
	private Pagination<AdxSspReportFormDay> adxSspReportFormDayList;

	public Pagination<AdxSspReportFormDay> getAdxSspReportFormDayList() {
		return adxSspReportFormDayList;
	}

	public void setAdxSspReportFormDayList(
			Pagination<AdxSspReportFormDay> adxSspReportFormDayList) {
		this.adxSspReportFormDayList = adxSspReportFormDayList;
	}
	
}

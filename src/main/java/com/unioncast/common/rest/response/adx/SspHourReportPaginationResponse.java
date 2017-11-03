package com.unioncast.common.rest.response.adx;

import com.unioncast.common.adx.model.AdxSspReportFormHour;
import com.unioncast.common.page.Pagination;
import com.unioncast.common.restClient.RestResponse;

public class SspHourReportPaginationResponse extends RestResponse {
	
	private static final long serialVersionUID = 5923632348774955905L;
	
	private Pagination<AdxSspReportFormHour> adxSspReportFormHourList;

	public Pagination<AdxSspReportFormHour> getAdxSspReportFormHourList() {
		return adxSspReportFormHourList;
	}

	public void setAdxSspReportFormHourList(
			Pagination<AdxSspReportFormHour> adxSspReportFormHourList) {
		this.adxSspReportFormHourList = adxSspReportFormHourList;
	} 

}

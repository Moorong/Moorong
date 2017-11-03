package com.unioncast.common.rest.response.adx;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unioncast.common.adx.model.AdxDspAdcreative;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 广告创意响应实体类
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月18日 下午4:47:13
 */
public class AdxDspAdCreativeResponse extends RestResponse {

	private static final long serialVersionUID = 2692329704622978376L;
	// 审核状态
	private int checkStatus;
	// 审核时间
	private Date checkTime;
	// 如果审核失败时，错误信息
	private String errorMsg;
	// 创意信息
	private AdxDspAdcreative result;

	public int getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public AdxDspAdcreative getResult() {
		return result;
	}

	public void setResult(AdxDspAdcreative result) {
		this.result = result;
	}

}

package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * <p>
 * adx-dsp竞价参数实体类
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月26日 上午11:19:54
 */
@MyTable("adx_dsp_bidding_params")
public class AdxDspBiddingParams implements Serializable {

	private static final long serialVersionUID = -4220438612089761361L;
	public static final String TABLE_NAME = "adx_dsp_bidding_params";
	public static final String PROPERTIES = "id, flow_type, dsp_id, can_send_request_num, actual_send_num, do_bidding_num, bidding_success_num, bidding_timeout_num, parse_error_num, day_time, create_time, remarks, update_time";
	// 竞价参数id
	@MyId("id")
	@MyColumn("id")
	private Long id;
	// 流量类型
	@MyColumn("flow_type")
	private Integer flowType;
	// 流量去处 ： dsp用户
	@MyColumn("dsp_id")
	private Long dspId;
	// 可发送请求量
	@MyColumn("can_send_request_num")
	private long canSendRequestNum;
	// 实际发送量：
	@MyColumn("actual_send_num")
	private long actualSendNum;
	// 参与竞价次数
	@MyColumn("do_bidding_num")
	private long doBiddingNum;
	// 竞价成功次数
	@MyColumn("bidding_success_num")
	private long biddingSuccessNum;
	// 竞价超时次数
	@MyColumn("bidding_timeout_num")
	private long biddingTimeOutNum;
	// 解析错误次数
	@MyColumn("parse_error_num")
	private long parseErrorNum;
	// 展示时选择的时间段
	@MyColumn("day_time")
	private String dayTime;
	// 创建时间
	@MyColumn("create_time")
	private Date createTime;
	// 更新时间
	@MyColumn("update_time")
	private Date updateTime;
	// 冗余
	@MyColumn("remarks")
	private String remarks;

	public AdxDspBiddingParams() {
		super();
	}

	public AdxDspBiddingParams(Long id, Integer flowType, Long dspId,
			long canSendRequestNum, long actualSendNum, long doBiddingNum,
			long biddingSuccessNum, long biddingTimeOutNum, long parseErrorNum,
			String dayTime, Date createTime, Date updateTime, String remarks) {
		super();
		this.id = id;
		this.flowType = flowType;
		this.dspId = dspId;
		this.canSendRequestNum = canSendRequestNum;
		this.actualSendNum = actualSendNum;
		this.doBiddingNum = doBiddingNum;
		this.biddingSuccessNum = biddingSuccessNum;
		this.biddingTimeOutNum = biddingTimeOutNum;
		this.parseErrorNum = parseErrorNum;
		this.dayTime = dayTime;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.remarks = remarks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFlowType() {
		return flowType;
	}

	public void setFlowType(Integer flowType) {
		this.flowType = flowType;
	}

	public Long getDspId() {
		return dspId;
	}

	public void setDspId(Long dspId) {
		this.dspId = dspId;
	}

	public long getCanSendRequestNum() {
		return canSendRequestNum;
	}

	public void setCanSendRequestNum(long canSendRequestNum) {
		this.canSendRequestNum = canSendRequestNum;
	}

	public long getActualSendNum() {
		return actualSendNum;
	}

	public void setActualSendNum(long actualSendNum) {
		this.actualSendNum = actualSendNum;
	}

	public long getDoBiddingNum() {
		return doBiddingNum;
	}

	public void setDoBiddingNum(long doBiddingNum) {
		this.doBiddingNum = doBiddingNum;
	}

	public long getBiddingSuccessNum() {
		return biddingSuccessNum;
	}

	public void setBiddingSuccessNum(long biddingSuccessNum) {
		this.biddingSuccessNum = biddingSuccessNum;
	}

	public long getBiddingTimeOutNum() {
		return biddingTimeOutNum;
	}

	public void setBiddingTimeOutNum(long biddingTimeOutNum) {
		this.biddingTimeOutNum = biddingTimeOutNum;
	}

	public long getParseErrorNum() {
		return parseErrorNum;
	}

	public void setParseErrorNum(long parseErrorNum) {
		this.parseErrorNum = parseErrorNum;
	}

	public String getDayTime() {
		return dayTime;
	}

	public void setDayTime(String dayTime) {
		this.dayTime = dayTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AdxDspBiddingParams [id=" + id + ", flowType=" + flowType
				+ ", dspId=" + dspId + ", canSendRequestNum="
				+ canSendRequestNum + ", actualSendNum=" + actualSendNum
				+ ", doBiddingNum=" + doBiddingNum + ", biddingSuccessNum="
				+ biddingSuccessNum + ", biddingTimeOutNum="
				+ biddingTimeOutNum + ", parseErrorNum=" + parseErrorNum
				+ ", dayTime=" + dayTime + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", remarks=" + remarks + "]";
	}

}

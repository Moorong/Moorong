package com.unioncast.common.rest.request;

import java.io.Serializable;
import java.util.Date;

/**
 * 竞价消费请求参数
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2016年10月21日上午10:13:44
 */
public class ConsumeReportRequest implements Serializable {
	
	private static final long serialVersionUID = -5888528624205773134L;

	//统计起始日期
	private Date startDate;
	
	//统计结束日期
	private Date endDate;
	
	//流量类型 1：app(默认) 2：web 3：video
	private int flowType;
	
	private Long dspId;
	
	//查询页数
	private Integer pageIndex;
	
	//每页数量
	private Integer pageSize;
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getFlowType() {
		return flowType;
	}

	public void setFlowType(int flowType) {
		this.flowType = flowType;
	}

	public Long getDspId() {
		return dspId;
	}

	public void setDspId(Long dspId) {
		this.dspId = dspId;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}

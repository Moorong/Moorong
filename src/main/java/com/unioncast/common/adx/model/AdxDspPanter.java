package com.unioncast.common.adx.model;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;
import java.io.Serializable;

/**
 * ADX_DSP_伙伴
 *
 * <p>
 * 对应的表：adx_dsp_panter
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigInteger)</li>
 * <li>dsp_id(bigInteger)</li>
 * <li>name(varchar)</li>
 * <li>bidding_url(varchar)</li>
 * <li>max_flow_psecond(Integer)</li>
 * <li>status(Integer)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 */

public class AdxDspPanter implements Serializable {

	public static final String PROPERTIES = "id,dsp_id,name,bidding_url,max_flow_psecond,status,update_time";
	public static final String TABLE_NAME = "adx_dsp_panter";

	private static final long serialVersionUID = 3272765397651948214L;

	private Long id;
	private Long dspId; // dspId
	private String name; // DSP名称
	private String biddingUrl; // 竞价URL
	private Integer maxFlowPSecond; // 每秒最大流量
	private Integer status; // 投放状态
	private Date updateTime;

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDspId() {
		return dspId;
	}

	public void setDspId(Long dspId) {
		this.dspId = dspId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiddingUrl() {
		return biddingUrl;
	}

	public void setBiddingUrl(String biddingUrl) {
		this.biddingUrl = biddingUrl;
	}

	public Integer getMaxFlowPSecond() {
		return maxFlowPSecond;
	}

	public void setMaxFlowPSecond(Integer maxFlowPSecond) {
		this.maxFlowPSecond = maxFlowPSecond;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AdxDspPanter{" +
				"id=" + id +
				", dspId=" + dspId +
				", name='" + name + '\'' +
				", biddingUrl='" + biddingUrl + '\'' +
				", maxFlowPSecond=" + maxFlowPSecond +
				", status=" + status +
				", updateTime=" + updateTime +
				'}';
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		AdxDspPanter entity = new AdxDspPanter();
		mapper.writeValue(System.out, entity);
	}
}

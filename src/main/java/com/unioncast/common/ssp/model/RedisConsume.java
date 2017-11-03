package com.unioncast.common.ssp.model;

import java.util.Map;

import com.unioncast.common.ssp.model.SspDayOrHourReport;

public class RedisConsume {

	private Map<Long, SspDayOrHourReport> planConsumeMap;
	// 统计每个订单的计划，展示数，点击数
	private Map<Long, SspDayOrHourReport> orderConsumeMap;
	
	public RedisConsume() {
		
	}

	public RedisConsume(Map<Long, SspDayOrHourReport> planConsumeMap,
			Map<Long, SspDayOrHourReport> orderConsumeMap) {
		super();
		this.planConsumeMap = planConsumeMap;
		this.orderConsumeMap = orderConsumeMap;
	}

	public Map<Long, SspDayOrHourReport> getPlanConsumeMap() {
		return planConsumeMap;
	}

	public void setPlanConsumeMap(Map<Long, SspDayOrHourReport> planConsumeMap) {
		this.planConsumeMap = planConsumeMap;
	}

	public Map<Long, SspDayOrHourReport> getOrderConsumeMap() {
		return orderConsumeMap;
	}

	public void setOrderConsumeMap(Map<Long, SspDayOrHourReport> orderConsumeMap) {
		this.orderConsumeMap = orderConsumeMap;
	}

}

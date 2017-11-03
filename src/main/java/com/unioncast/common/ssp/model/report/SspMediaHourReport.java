package com.unioncast.common.ssp.model.report;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class SspMediaHourReport extends SspMediaDayReport implements Serializable {

	private static final long serialVersionUID = -7464283491838771203L;

	// 小时 数据库字段: hour
	private Integer hour;

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
}

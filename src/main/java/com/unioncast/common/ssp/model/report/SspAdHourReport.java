package com.unioncast.common.ssp.model.report;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class SspAdHourReport extends SspAdDayReport implements Serializable {


	private static final long serialVersionUID = 1418701051782304023L;


	// 小时 数据库字段: hour
	@Column
	private Integer hour;

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
}

package com.unioncast.common.ssp.model.report;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class SspMediaRegionDayReport extends SspMediaDayReport implements Serializable {

	private static final long serialVersionUID = -8688551425087677187L;

	// 地域 数据库字段: region
	private Long region;

	public Long getRegion() {
		return region;
	}

	public void setRegion(Long region) {
		this.region = region;
	}
}

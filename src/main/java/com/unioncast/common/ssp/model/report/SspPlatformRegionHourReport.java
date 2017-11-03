package com.unioncast.common.ssp.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SspPlatformRegionHourReport extends SspPlatformHourReport implements Serializable {

	private static final long serialVersionUID = -8514541251306108383L;

	// 地域 数据库字段: region
	private Long region;

	public Long getRegion() {
		return region;
	}

	public void setRegion(Long region) {
		this.region = region;
	}

}

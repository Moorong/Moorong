package com.unioncast.common.ip;

public class IpPrefixIndex {
	// ip首段开始位置
	private Long start_index;
	// ip首段结束位置
	private Long end_index;

	public Long getStart_index() {
		return start_index;
	}

	public void setStart_index(Long start_index) {
		this.start_index = start_index;
	}

	public Long getEnd_index() {
		return end_index;
	}

	public void setEnd_index(Long end_index) {
		this.end_index = end_index;
	}

}

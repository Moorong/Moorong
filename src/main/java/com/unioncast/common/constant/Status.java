package com.unioncast.common.constant;

/**
 * 审核状态
 * 
 * @author juchaochao
 * @date 2016年12月21日 上午10:01:01
 *
 */
public enum Status {
	OFF(0), CLOSE(0), NO(0), UNSETTLED(0), ON(1), ONLINE(1), OK(1), SETTLED(1);
	private int status;

	private Status(int status) {
		this.setStatus(status);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
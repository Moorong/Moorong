package com.unioncast.common.constant;

/**
 * 审核状态
 * 
 * @author juchaochao
 * @date 2016年12月21日 上午10:01:01
 *
 */
public enum Verify {
	UNVERIFIED(0), VERIFIED(1);
	private int isVerify;

	private Verify(int isVerify) {
		this.setVerify(isVerify);
	}

	public int getVerify() {
		return isVerify;
	}

	public void setVerify(int isVerify) {
		this.isVerify = isVerify;
	}
}
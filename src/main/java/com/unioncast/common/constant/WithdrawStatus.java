package com.unioncast.common.constant;

/**
 * 体现状态
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月10日下午4:55:19
 */
public enum WithdrawStatus {
	
	WITHDRAW_ING(1 , "提现中"),
	
	WITHDRAW_OK(2 , "体现成功"),
	
	WITHDRAW_FAIL(3 , "体现失败");
	
	int code;
	
	String name;
	
	WithdrawStatus(int code , String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

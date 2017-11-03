package com.unioncast.common.user.model;

/**
 * 系统模块枚举类
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2016年12月23日下午2:46:18
 */
public enum SystemModule {

	USER_SYSTEM(0, "用户系统"), SSP_SYSTEM(1, "SSP"), ADX_SYSTEM(2, "ADX"), DSP_SYSTEM(3, "DSP");

	private int code;
	private String name;

	private SystemModule(int code, String name) {
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

package com.unioncast.common.constant;

/**
 * 删除状态 1：未删除 2：已删除
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月10日下午4:42:25
 */
public enum DeleteStatus {
	
	NOT_DELETE(1 , "未删除"),
	
	DELETED(2 , "已删除");
	
	//删除状态
	int status;
	
	String name;
	
	DeleteStatus(int status , String name) {
		this.status = status;
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

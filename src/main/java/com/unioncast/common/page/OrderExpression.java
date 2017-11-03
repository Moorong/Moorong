package com.unioncast.common.page;

import java.io.Serializable;

/**
 * 对查询结果进行排序
 * 
 * @author liutiejun
 * @date 2016年8月31日 下午1:44:12
 *
 */
public class OrderExpression implements Serializable {

	private static final long serialVersionUID = -7015591510609220126L;

	/** 排序的字段 */
	private String propertyName;
	/** 字段的排序方式：ASC、DESC */
	private String op;

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return "OrderExpression [propertyName=" + propertyName + ", op=" + op + "]";
	}

}

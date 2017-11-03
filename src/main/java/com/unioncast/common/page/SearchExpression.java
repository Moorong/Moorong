package com.unioncast.common.page;

import java.io.Serializable;

/**
 * 条件查询表达式
 * 
 * @author liutiejun
 * @date 2016年8月31日 下午1:26:32
 *
 */
public class SearchExpression implements Serializable {

	private static final long serialVersionUID = -3063940406941049227L;

	private String propertyName;
	/**
	 * 查询的字段值
	 */
	private Object value;
	/**
	 * 字段的类型
	 */
	private String valueType;
	/**
	 * 字段的查询方式
	 */
	private Operation operation;

	public SearchExpression() {
		super();
	}

	public SearchExpression(String propertyName, Object value, Operation operation) {
		this(propertyName, value, null, operation);
	}

	public SearchExpression(String propertyName, Object value, String valueType, Operation operation) {
		super();
		this.propertyName = propertyName;
		this.value = value;
		this.valueType = valueType;
		this.operation = operation;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "SearchExpression1 [propertyName=" + propertyName + ", value=" + value + ", valueType=" + valueType
				+ ", operation=" + operation + "]";
	}

}

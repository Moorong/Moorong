package com.unioncast.common.page;

/**
 * @author juchaochao
 * @date 2016年11月8日 下午5:21:52
 *
 */
public enum Operation {

	GT(">"), LT("<"), LIKE("like"), EQ("="), NE("!"), NEQ("<>"), GE(">="), LE("<="), BETWEEN("between"), IN("in"), AND(
			"and"), OR("or"),IS("is");

	private String operator;

	Operation(String operator) {
		this.setOperator(operator);
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}

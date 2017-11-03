/**
 * 
 */
package com.unioncast.common.constant;

/**
 * @author juchaochao
 * @date 2016年12月21日 上午11:33:43
 *
 */
public enum AccountType {
	PERSONAL(0), COMPANY(1);

	private int accountType;

	private AccountType(int accountType) {
		this.setAccountType(accountType);
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	};

}

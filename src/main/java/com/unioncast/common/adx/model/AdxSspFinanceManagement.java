package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * asd-ssp 财务管理表
 * <p>
 * 对应的表：adx_ssp_finance_management
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>wd_amount(double)</li>
 * <li>wd_date_time(datetime)</li>
 * <li>wd_status(int)</li>
 * <li>wd_account_number(varchar)</li>
 * <li>company_personal_name(int)</li>
 * <li>bank_account(varchar)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @pdOid 07bd2022-de54-4059-a042-5f8bf039f3e7
 */
@MyTable("adx_ssp_finance_management")
public class AdxSspFinanceManagement implements Serializable {

	public static final String PROPERTIES = "id,wd_amount,wd_date_time,wd_status,wd_account_number,company_personal_name,bank_account,remarks,update_time";
	public static final String TABLE_NAME = "adx_ssp_finance_management";

	public static final String ID = "id";
	public static final String WD_AMOUNT = "wd_amount";
	public static final String WD_DATE_TIME = "wd_date_time";
	public static final String WD_STATUS = "wd_status";
	public static final String WD_ACCOUNT_NUMBER = "wd_account_number";
	public static final String COMPANY_PERSONAL_NAME = "company_personal_name";
	public static final String BANK_ACCOUNT = "bank_account";
	public static final String REMARKS = "remarks";
	public static final String UPDATE_TIME = "update_time";

	private static final long serialVersionUID = -1787453038956317841L;
	/**
	 * 财务id
	 * 
	 * @pdOid 63d119ab-f9d8-44ce-9971-17ab896e2bc9
	 */
	@MyId
	@MyColumn("id")
	private Long id;
	/**
	 * 提现金额
	 * 
	 * @pdOid 84c65615-8158-4ef1-9bec-210edaba2bce
	 */
	@MyColumn("wd_amount")
	private Double wdAmount;
	/**
	 * 时间
	 * 
	 * @pdOid 61c495df-6181-4cb7-89c9-d6492ea54245
	 */
	@MyColumn("wd_date_time")
	private Date wdDateTime;
	/**
	 * 提现状态
	 * 
	 * @pdOid 59a4cb29-7bfd-4f66-902e-802d516cda73
	 */
	@MyColumn("wd_status")
	private Integer wdStatus;
	/**
	 * 提现到账号
	 * 
	 * @pdOid 7f264a8b-17f4-4038-8a58-aa409a8a186a
	 */
	@MyColumn("wd_account_number")
	private String wdAccountNumber;
	/**
	 * 公司或者个人名称
	 * 
	 * @pdOid d4af2d03-3714-4eba-8e32-29aa895fb426
	 */
	@MyColumn("company_personal_name")
	private Integer companyPersonalName;
	/**
	 * 开户银行名称
	 * 
	 * @pdOid 0f030767-fc65-4fec-9e30-b35c2caddf2d
	 */
	@MyColumn("bank_account")
	private String bankAccount;
	/**
	 * 冗余
	 * 
	 * @pdOid 14594e0f-bae2-48ff-ad30-0b96f6808e81
	 */
	@MyColumn("remarks")
	private String remarks;

	/**
	 * 更新时间
	 */
	@MyColumn("update_time")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getWdAmount() {
		return wdAmount;
	}

	public void setWdAmount(Double wdAmount) {
		this.wdAmount = wdAmount;
	}

	public Date getWdDateTime() {
		return wdDateTime;
	}

	public void setWdDateTime(Date wdDateTime) {
		this.wdDateTime = wdDateTime;
	}

	public Integer getWdStatus() {
		return wdStatus;
	}

	public void setWdStatus(Integer wdStatus) {
		this.wdStatus = wdStatus;
	}

	public String getWdAccountNumber() {
		return wdAccountNumber;
	}

	public void setWdAccountNumber(String wdAccountNumber) {
		this.wdAccountNumber = wdAccountNumber;
	}

	public Integer getCompanyPersonalName() {
		return companyPersonalName;
	}

	public void setCompanyPersonalName(Integer companyPersonalName) {
		this.companyPersonalName = companyPersonalName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AdxSspFinanceManagement [id=" + id + ", wdAmount=" + wdAmount + ", wdDateTime=" + wdDateTime
				+ ", wdStatus=" + wdStatus + ", wdAccountNumber=" + wdAccountNumber + ", companyPersonalName="
				+ companyPersonalName + ", bankAccount=" + bankAccount + ", remarks=" + remarks + ", updateTime="
				+ updateTime + "]";
	}

}

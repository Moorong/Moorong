package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 财务信息 ssp_finance_info
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:26:29
 */
@MyTable("ssp_finance_info")
public class SspFinanceInfo implements Serializable {

	private static final long serialVersionUID = 9177283272588865177L;
	public static String PROPERTIES = "id, finance_type, city_info_id, recipient_bank, bank_account, invoice_type, tax_num, recipient_name, recipient_identity_num, create_time, update_time, state, account_id, delete_state";
	public static String TABLE_NAME = "ssp_finance_info";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	// 1-个人，2-企业
	@MyColumn("finance_type")
	private Integer financeType;

	@MyColumn("city_info_id")
	private SspCityInfo sspCityInfo;

	// 收款银行
	@MyColumn("recipient_bank")
	private String recipientBank;

	// 银行账号
	@MyColumn("bank_account")
	private String bankAccount;

	// 发票类型 1-增值税普通发票,2-增值税专用发票,3-境外发票
	@MyColumn("invoice_type")
	private Integer invoiceType;

	// 税号
	@MyColumn("tax_num")
	private String taxNum;

	// 收款人姓名
	@MyColumn("recipient_name")
	private String recipientName;

	// 收款人身份证
	@MyColumn("recipient_identity_num")
	private String recipientIdentityNum;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;

	// 1-有效，2-作废 用户每次修改后新增一条有效记录，之前的作废
	@MyColumn("state")
	private Integer state;

	@MyColumn("account_id")
	private User user;

	// 删除状态，1 - 未删除，2 - 已删除
	@MyColumn("delete_state")
	private Integer deleteState;

	public SspFinanceInfo() {
	}

	public SspFinanceInfo(Long id, Integer financeType, SspCityInfo sspCityInfo, String recipientBank, String bankAccount, Integer invoiceType, String taxNum, String recipientName, String recipientIdentityNum, Date createTime, Date updateTime, Integer state, User user, Integer deleteState) {
		this.id = id;
		this.financeType = financeType;
		this.sspCityInfo = sspCityInfo;
		this.recipientBank = recipientBank;
		this.bankAccount = bankAccount;
		this.invoiceType = invoiceType;
		this.taxNum = taxNum;
		this.recipientName = recipientName;
		this.recipientIdentityNum = recipientIdentityNum;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.state = state;
		this.user = user;
		this.deleteState = deleteState;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecipientBank() {
		return recipientBank;
	}

	public void setRecipientBank(String recipientBank) {
		this.recipientBank = recipientBank == null ? null : recipientBank
				.trim();
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount == null ? null : bankAccount.trim();
	}

	public String getTaxNum() {
		return taxNum;
	}

	public void setTaxNum(String taxNum) {
		this.taxNum = taxNum == null ? null : taxNum.trim();
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName == null ? null : recipientName
				.trim();
	}

	public String getRecipientIdentityNum() {
		return recipientIdentityNum;
	}

	public void setRecipientIdentityNum(String recipientIdentityNum) {
		this.recipientIdentityNum = recipientIdentityNum == null ? null
				: recipientIdentityNum.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public SspCityInfo getSspCityInfo() {
		return sspCityInfo;
	}

	public void setSspCityInfo(SspCityInfo sspCityInfo) {
		this.sspCityInfo = sspCityInfo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getFinanceType() {
		return financeType;
	}

	public void setFinanceType(Integer financeType) {
		this.financeType = financeType;
	}

	public Integer getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}

}
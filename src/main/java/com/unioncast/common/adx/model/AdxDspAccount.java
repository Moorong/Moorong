package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * adx-dsp-账户
 * 
 * @pdOid ee7fdbc0-ad12-4e1f-a8ea-e68de2f15f0f
 */
@MyTable("adx_dsp_account")
public class AdxDspAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7355378046853471806L;
	
	public static String TABLE_NAME = "adx_dsp_account";
	public static String PROPERTIES = "id, account_name, dsp_full_name, registration_time, contacts, fixed_telephone, mobile, email, company_name, company_address, company_code, company_fax, remarks, update_time";
	/**
	 * 账户id
	 * 
	 * @pdOid a6c9bcd0-33bf-443b-bac1-e709fa92940d
	 */
	@MyId("id")
	@MyColumn("id")
	private long id;
	/**
	 * 账户名
	 * 
	 * @pdOid 790f636c-5472-4456-8af4-07550ec5ba19
	 */
	@MyColumn("account_name")
	private String accountName;
	/**
	 * dsp全称
	 * 
	 * @pdOid 50b31369-74a4-4eae-96a6-8daa8a1d4eda
	 */
	@MyColumn("dsp_full_name")
	private String dspFullName;
	/**
	 * 注册时间
	 * 
	 * @pdOid 5d8347f6-1385-4e12-81fd-962fcc0ddc2f
	 */
	@MyColumn("registration_time")
	private Date registrationTime;
	/**
	 * 联系人
	 * 
	 * @pdOid 77fda7c2-0393-4cc2-a53f-cdb9fe4807ab
	 */
	@MyColumn("contacts")
	private String contacts;
	/**
	 * 固定电话
	 * 
	 * @pdOid 05a8113f-c065-47f5-be53-f72e3df4f1fe
	 */
	@MyColumn("fixed_telephone")
	private String fixedTelephone;
	/**
	 * 手机
	 * 
	 * @pdOid 83ac9556-411b-4605-8e31-c7dd794edb96
	 */
	@MyColumn("mobile")
	private String mobile;
	/**
	 * 联系邮箱
	 * 
	 * @pdOid 4262bcc0-2266-4129-9018-33f8a9718f72
	 */
	@MyColumn("email")
	private String email;
	/**
	 * 公司全称
	 * 
	 * @pdOid c7bc5cfd-40b4-41fd-be4c-eb40a76ba3a2
	 */
	@MyColumn("company_name")
	private String companyName;
	/**
	 * 公司地址
	 * 
	 * @pdOid 3f213b44-344b-4368-a076-6d9a95e00d8c
	 */
	@MyColumn("company_address")
	private String companyAddress;
	/**
	 * 公司邮编
	 * 
	 * @pdOid c07a8591-b37c-4b9c-9f52-b8af21ad9bdc
	 */
	@MyColumn("company_code")
	private String companyCode;
	/**
	 * 公司传真
	 * 
	 * @pdOid c7cdab05-4f0b-48fb-9b9b-2811b5df21c2
	 */
	@MyColumn("company_fax")
	private String companyFax;
	/**
	 * 冗余
	 * 
	 * @pdOid 90b47cd5-9bd4-417b-aa74-46ee137e3612
	 */
	@MyColumn("remarks")
	private String remarks;
	
	/**
	 * 更新时间
	 */
	@MyColumn("update_time")
	private Date updateTime;
	
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public AdxDspAccount() {
		super();
	}
	
	public AdxDspAccount(long id, String accountName, String dspFullName, Date registrationTime, String contacts,
			String fixedTelephone, String mobile, String email, String companyName, String companyAddress,
			String companyCode, String companyFax, String remarks, Date updateTime) {
		super();
		this.id = id;
		this.accountName = accountName;
		this.dspFullName = dspFullName;
		this.registrationTime = registrationTime;
		this.contacts = contacts;
		this.fixedTelephone = fixedTelephone;
		this.mobile = mobile;
		this.email = email;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyCode = companyCode;
		this.companyFax = companyFax;
		this.remarks = remarks;
		this.updateTime = updateTime;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getDspFullName() {
		return dspFullName;
	}
	public void setDspFullName(String dspFullName) {
		this.dspFullName = dspFullName;
	}
	public Date getRegistrationTime() {
		return registrationTime;
	}
	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getFixedTelephone() {
		return fixedTelephone;
	}
	public void setFixedTelephone(String fixedTelephone) {
		this.fixedTelephone = fixedTelephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyFax() {
		return companyFax;
	}
	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AdxDspAccount [id=" + id + ", accountName=" + accountName + ", dspFullName=" + dspFullName
				+ ", registrationTime=" + registrationTime + ", contacts=" + contacts + ", fixedTelephone="
				+ fixedTelephone + ", mobile=" + mobile + ", email=" + email + ", companyName=" + companyName
				+ ", companyAddress=" + companyAddress + ", companyCode=" + companyCode + ", companyFax=" + companyFax
				+ ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
	}
	
}

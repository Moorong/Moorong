package com.unioncast.common.adx.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * adx-dsp 用户表
 * <p>
 * 对应的表：adx_dsp_user
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigInteger)</li>
 * <li>companyaddress(varchar)</li>
 * <li>companyname(varchar)</li>
 * <li>companywebsite(varchar)</li>
 * <li>contactperson(varchar)</li>
 * <li>deletestatus(Integer)</li>
 * <li>fax(varchar)</li>
 * <li>fixtelephone(varchar)</li>
 * <li>loginstatus(Integer)</li>
 * <li>mail(varchar)</li>
 * <li>mobilephone(varchar)</li>
 * <li>password(varchar)</li>
 * <li>qq(varchar)</li>
 * <li>signuptime(datetime)</li>
 * <li>updatetime(datetime)</li>
 * <li>username(varchar)</li>
 * <li>zipcode(varchar)</li>
 * <li>industry_id(bigInteger)</li>
 * <li>parent_id(bigInteger)</li>
 * <li>balance(Double)</li>
 * <li>qualifications_id(bigInteger)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li> </ul
 * </p>
 * 
 * @pdOid 1cd14173-dc47-496f-a576-a9f7fd5d5c71
 */
@MyTable("adx_dsp_user")
public class AdxDspUser implements Serializable {

	public static String PROPERTIES = "id,companyaddress,companyname,companywebsite,contactperson,deletestatus,fax,fixtelephone,loginstatus,mail,mobilephone,password,qq,signuptime,updatetime,username,zipcode,industry_id,parent_id,balance,qualifications_id,remarks,update_time";
	public static String TABLE_NAME = "adx_dsp_user";

	private static final long serialVersionUID = 1960504131727222601L;

	public static String ID = "id";
	public static String COMPANYADDRESS = "companyaddress";
	public static String COMPANYNAME = "companyname";
	public static String COMPANYWEBSITE = "companywebsite";
	public static String CONTACTPERSON = "contactperson";
	public static String DELETESTATUS = "deletestatus";
	public static String FAX = "fax";
	public static String FIXTELEPHONE = "fixtelephone";
	public static String LOGINSTATUS = "loginstatus";
	public static String MAIL = "mail";
	public static String MOBILEPHONE = "mobilephone";
	public static String PASSWORD = "password";
	public static String QQ = "qq";
	public static String SIGNUPTIME = "signuptime";
	public static String UPDATETIME = "updatetime";
	public static String USERNAME = "username";
	public static String ZIPCODE = "zipcode";
	public static String INDUSTRY_ID = "industry_id";
	public static String PARENT_ID = "parent_id";
	public static String BALANCE = "balance";
	public static String QUALIFICATIONS_ID = "qualifications_id";
	public static String REMARKS = "remarks";
	public static String UPDATE_TIME = "update_time";

	@MyId
	@MyColumn("id")
	private Long id;
	@MyColumn("companyaddress")
	private java.lang.String companyaddress;
	@MyColumn("companyname")
	private java.lang.String companyname;
	@MyColumn("companywebsite")
	private java.lang.String companywebsite;
	@MyColumn("contactperson")
	private java.lang.String contactperson;
	@MyColumn("deletestatus")
	private Integer deletestatus;
	@MyColumn("fax")
	private java.lang.String fax;
	@MyColumn("fixtelephone")
	private java.lang.String fixtelephone;
	@MyColumn("loginstatus")
	private Integer loginstatus;
	@MyColumn("mail")
	private java.lang.String mail;
	@MyColumn("mobilephone")
	private java.lang.String mobilephone;
	@MyColumn("password")
	private java.lang.String password;
	@MyColumn("qq")
	private java.lang.String qq;
	@MyColumn("signuptime")
	private java.util.Date signuptime;
	@MyColumn("updatetime")
	private java.util.Date updatetime;
	@MyColumn("username")
	private java.lang.String username;
	@MyColumn("zipcode")
	private java.lang.String zipcode;
	@MyColumn("industry_id")
	private Long industryId;
	@MyColumn("parent_id")
	private Long parentId;
	@MyColumn("balance")
	private Double balance;
	@MyColumn("qualifications_id")
	private Long qualificationsId;
	@MyColumn("remarks")
	private java.lang.String remarks;
	@MyColumn("update_time")
	private java.util.Date updateTime;

	public AdxDspUser() {
		super();
	}

	public AdxDspUser(Long id, String companyaddress, String companyname, String companywebsite, String contactperson,
			Integer deletestatus, String fax, String fixtelephone, Integer loginstatus, String mail, String mobilephone,
			String password, String qq, Date signuptime, Date updatetime, String username, String zipcode,
			Long industryId, Long parentId, Double balance, Long qualificationsId, String remarks, Date updateTime2) {
		super();
		this.id = id;
		this.companyaddress = companyaddress;
		this.companyname = companyname;
		this.companywebsite = companywebsite;
		this.contactperson = contactperson;
		this.deletestatus = deletestatus;
		this.fax = fax;
		this.fixtelephone = fixtelephone;
		this.loginstatus = loginstatus;
		this.mail = mail;
		this.mobilephone = mobilephone;
		this.password = password;
		this.qq = qq;
		this.signuptime = signuptime;
		this.updatetime = updatetime;
		this.username = username;
		this.zipcode = zipcode;
		this.industryId = industryId;
		this.parentId = parentId;
		this.balance = balance;
		this.qualificationsId = qualificationsId;
		this.remarks = remarks;
		updateTime = updateTime2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.lang.String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(java.lang.String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public java.lang.String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(java.lang.String companyname) {
		this.companyname = companyname;
	}

	public java.lang.String getCompanywebsite() {
		return companywebsite;
	}

	public void setCompanywebsite(java.lang.String companywebsite) {
		this.companywebsite = companywebsite;
	}

	public java.lang.String getContactperson() {
		return contactperson;
	}

	public void setContactperson(java.lang.String contactperson) {
		this.contactperson = contactperson;
	}

	public Integer getDeletestatus() {
		return deletestatus;
	}

	public void setDeletestatus(Integer deletestatus) {
		this.deletestatus = deletestatus;
	}

	public java.lang.String getFax() {
		return fax;
	}

	public void setFax(java.lang.String fax) {
		this.fax = fax;
	}

	public java.lang.String getFixtelephone() {
		return fixtelephone;
	}

	public void setFixtelephone(java.lang.String fixtelephone) {
		this.fixtelephone = fixtelephone;
	}

	public Integer getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(Integer loginstatus) {
		this.loginstatus = loginstatus;
	}

	public java.lang.String getMail() {
		return mail;
	}

	public void setMail(java.lang.String mail) {
		this.mail = mail;
	}

	public java.lang.String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(java.lang.String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public java.lang.String getPassword() {
		return password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getQq() {
		return qq;
	}

	public void setQq(java.lang.String qq) {
		this.qq = qq;
	}

	public java.util.Date getSignuptime() {
		return signuptime;
	}

	public void setSignuptime(java.util.Date signuptime) {
		this.signuptime = signuptime;
	}

	public java.util.Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(java.util.Date updatetime) {
		this.updatetime = updatetime;
	}

	public java.lang.String getUsername() {
		return username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	public java.lang.String getZipcode() {
		return zipcode;
	}

	public void setZipcode(java.lang.String zipcode) {
		this.zipcode = zipcode;
	}

	public Long getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getQualificationsId() {
		return qualificationsId;
	}

	public void setQualificationsId(Long qualificationsId) {
		this.qualificationsId = qualificationsId;
	}

	public java.lang.String getRemarks() {
		return remarks;
	}

	public void setRemarks(java.lang.String remarks) {
		this.remarks = remarks;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AdxDspUser [id=" + id + ", companyaddress=" + companyaddress + ", companyname=" + companyname
				+ ", companywebsite=" + companywebsite + ", contactperson=" + contactperson + ", deletestatus="
				+ deletestatus + ", fax=" + fax + ", fixtelephone=" + fixtelephone + ", loginstatus=" + loginstatus
				+ ", mail=" + mail + ", mobilephone=" + mobilephone + ", password=" + password + ", qq=" + qq
				+ ", signuptime=" + signuptime + ", updatetime=" + updatetime + ", username=" + username + ", zipcode="
				+ zipcode + ", industryId=" + industryId + ", parentId=" + parentId + ", balance=" + balance
				+ ", qualificationsId=" + qualificationsId + ", remarks=" + remarks + ", updateTime=" + updateTime
				+ "]";
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		AdxDspUser entity = new AdxDspUser();
		mapper.writeValue(System.out, entity);
	}

}

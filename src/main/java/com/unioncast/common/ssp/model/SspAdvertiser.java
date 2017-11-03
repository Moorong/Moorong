package com.unioncast.common.ssp.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

/**
 * 广告主 ssp_advertiser
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:07:24
 */
@MyTable("ssp_advertiser")
public class SspAdvertiser implements Serializable {

	private static final long serialVersionUID = -8645467545806487745L;
	public static String PROPERTIES = "id, account_id, advertiser_identifying, name,"
			+ "company_reg_name, contract_id, put_allowed_state, put_already_state, url,"
			+ "corner_mark_state, contacts, phone, email, business_license_pic,"
			+ "business_reg_certificate_pic, legal_person_certificate_pic, organization_code,"
			+ "organization_pic, icp_pic, tax_certificate_pic, telecom_oper_license_pic,"
			+ "logo_name, logo_pic, keywords, service_fee, create_time, update_time, delete_state";
	public static String TABLE_NAME = "ssp_advertiser";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	@MyColumn("account_id")
	private User user;

	// 广告主唯一编号
	@MyColumn("advertiser_identifying")
	private String advertiserIdentifying;

	// 广告主名称
	@MyColumn("name")
	private String name;

	// 公司注册名称
	@MyColumn("company_reg_name")
	private String companyRegName;

	// 外部关联ID--合同
	@MyColumn("contract_id")
	private String contractId;

	// 状态1-on,2-off,是否可以进行投放
	@MyColumn("put_allowed_state")
	private Long putAllowedState;

	// 状态1-已经,2-没有,是否已经投放
	@MyColumn("put_already_state")
	private Long putAlreadyState;

	@MyColumn("url")
	private String url;

	// 是否开启创意角标,1-开启，2关闭
	@MyColumn("corner_mark_state")
	private Long cornerMarkState;

	// 联系人
	@MyColumn("contacts")
	private String contacts;

	@MyColumn("phone")
	private String phone;

	@MyColumn("email")
	private String email;

	// 营业执照---图片
	@MyColumn("business_license_pic")
	private String businessLicensePic;

	// 商务登记证---图片
	@MyColumn("business_reg_certificate_pic")
	private String businessRegCertificatePic;

	// 法人身份证---图片
	@MyColumn("legal_person_certificate_pic")
	private String legalPersonCertificatePic;

	// 组织机构代码证号
	@MyColumn("organization_code")
	private String organizationCode;

	// 组织机构代码证---图片
	@MyColumn("organization_pic")
	private String organizationPic;

	// ICP证---图片
	@MyColumn("icp_pic")
	private String icpPic;

	// 税务登记证---图片
	@MyColumn("tax_certificate_pic")
	private String taxCertificatePic;

	// 增值电信运营许可证---图片
	@MyColumn("telecom_oper_license_pic")
	private String telecomOperLicensePic;

	// logo名称
	@MyColumn("logo_name")
	private String logoName;

	// logo名称---图片
	@MyColumn("logo_pic")
	private String logoPic;

	// 关键词
	@MyColumn("keywords")
	private String keywords;

	// 服务费
	@MyColumn("service_fee")
	private Double serviceFee;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;

	// 删除状态，1-未删除，2-已删除
	@MyColumn("delete_state")
	private Long deleteState;
	
	//订单数
	private int orderNumber;
	
	public SspAdvertiser(Long id, User user, String advertiserIdentifying, String name, String companyRegName,
			String contractId, Long putAllowedState, Long putAlreadyState, String url, Long cornerMarkState,
			String contacts, String phone, String email, String businessLicensePic, String businessRegCertificatePic,
			String legalPersonCertificatePic, String organizationCode, String organizationPic, String icpPic,
			String taxCertificatePic, String telecomOperLicensePic, String logoName, String logoPic, String keywords,
			Double serviceFee, Date createTime, Date updateTime, Long deleteState) {
		super();
		this.id = id;
		this.user = user;
		this.advertiserIdentifying = advertiserIdentifying;
		this.name = name;
		this.companyRegName = companyRegName;
		this.contractId = contractId;
		this.putAllowedState = putAllowedState;
		this.putAlreadyState = putAlreadyState;
		this.url = url;
		this.cornerMarkState = cornerMarkState;
		this.contacts = contacts;
		this.phone = phone;
		this.email = email;
		this.businessLicensePic = businessLicensePic;
		this.businessRegCertificatePic = businessRegCertificatePic;
		this.legalPersonCertificatePic = legalPersonCertificatePic;
		this.organizationCode = organizationCode;
		this.organizationPic = organizationPic;
		this.icpPic = icpPic;
		this.taxCertificatePic = taxCertificatePic;
		this.telecomOperLicensePic = telecomOperLicensePic;
		this.logoName = logoName;
		this.logoPic = logoPic;
		this.keywords = keywords;
		this.serviceFee = serviceFee;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.deleteState = deleteState;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public SspAdvertiser() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAdvertiserIdentifying() {
		return advertiserIdentifying;
	}

	public void setAdvertiserIdentifying(String advertiserIdentifying) {
		this.advertiserIdentifying = advertiserIdentifying == null ? null
				: advertiserIdentifying.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCompanyRegName() {
		return companyRegName;
	}

	public void setCompanyRegName(String companyRegName) {
		this.companyRegName = companyRegName == null ? null : companyRegName
				.trim();
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId == null ? null : contractId.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public Long getCornerMarkState() {
		return cornerMarkState;
	}

	public void setCornerMarkState(Long cornerMarkState) {
		this.cornerMarkState = cornerMarkState;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts == null ? null : contacts.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getBusinessLicensePic() {
		return businessLicensePic;
	}

	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic == null ? null
				: businessLicensePic.trim();
	}

	public String getBusinessRegCertificatePic() {
		return businessRegCertificatePic;
	}

	public void setBusinessRegCertificatePic(String businessRegCertificatePic) {
		this.businessRegCertificatePic = businessRegCertificatePic == null ? null
				: businessRegCertificatePic.trim();
	}

	public String getLegalPersonCertificatePic() {
		return legalPersonCertificatePic;
	}

	public void setLegalPersonCertificatePic(String legalPersonCertificatePic) {
		this.legalPersonCertificatePic = legalPersonCertificatePic == null ? null
				: legalPersonCertificatePic.trim();
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode == null ? null
				: organizationCode.trim();
	}

	public String getOrganizationPic() {
		return organizationPic;
	}

	public void setOrganizationPic(String organizationPic) {
		this.organizationPic = organizationPic == null ? null : organizationPic
				.trim();
	}

	public String getIcpPic() {
		return icpPic;
	}

	public void setIcpPic(String icpPic) {
		this.icpPic = icpPic == null ? null : icpPic.trim();
	}

	public String getTaxCertificatePic() {
		return taxCertificatePic;
	}

	public void setTaxCertificatePic(String taxCertificatePic) {
		this.taxCertificatePic = taxCertificatePic == null ? null
				: taxCertificatePic.trim();
	}

	public String getTelecomOperLicensePic() {
		return telecomOperLicensePic;
	}

	public void setTelecomOperLicensePic(String telecomOperLicensePic) {
		this.telecomOperLicensePic = telecomOperLicensePic == null ? null
				: telecomOperLicensePic.trim();
	}

	public String getLogoName() {
		return logoName;
	}

	public void setLogoName(String logoName) {
		this.logoName = logoName == null ? null : logoName.trim();
	}

	public String getLogoPic() {
		return logoPic;
	}

	public void setLogoPic(String logoPic) {
		this.logoPic = logoPic == null ? null : logoPic.trim();
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords == null ? null : keywords.trim();
	}

	public Double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
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

	public Long getPutAllowedState() {
		return putAllowedState;
	}

	public void setPutAllowedState(Long putAllowedState) {
		this.putAllowedState = putAllowedState;
	}

	public Long getPutAlreadyState() {
		return putAlreadyState;
	}

	public void setPutAlreadyState(Long putAlreadyState) {
		this.putAlreadyState = putAlreadyState;
	}

	public Long getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Long deleteState) {
		this.deleteState = deleteState;
	}

	@Override
	public String toString() {
		return "SspAdvertiser [id=" + id + ", user=" + user + ", advertiserIdentifying=" + advertiserIdentifying
				+ ", name=" + name + ", companyRegName=" + companyRegName + ", contractId=" + contractId
				+ ", putAllowedState=" + putAllowedState + ", putAlreadyState=" + putAlreadyState + ", url=" + url
				+ ", cornerMarkState=" + cornerMarkState + ", contacts=" + contacts + ", phone=" + phone + ", email="
				+ email + ", businessLicensePic=" + businessLicensePic + ", businessRegCertificatePic="
				+ businessRegCertificatePic + ", legalPersonCertificatePic=" + legalPersonCertificatePic
				+ ", organizationCode=" + organizationCode + ", organizationPic=" + organizationPic + ", icpPic="
				+ icpPic + ", taxCertificatePic=" + taxCertificatePic + ", telecomOperLicensePic="
				+ telecomOperLicensePic + ", logoName=" + logoName + ", logoPic=" + logoPic + ", keywords=" + keywords
				+ ", serviceFee=" + serviceFee + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", deleteState=" + deleteState + ", orderNumber=" + orderNumber + "]";
	}
	
}
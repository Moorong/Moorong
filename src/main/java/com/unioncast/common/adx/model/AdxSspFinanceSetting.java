package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.user.model.User;

/**
 * ADX-SSP-财务设置
 * <p>
 * 对应的表：adx_ssp_finance_setting
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>account_type(int)</li>
 * <li>certification_status(int)</li>
 * <li>name(varchar)</li>
 * <li>bank_name(varchar)</li>
 * <li>bank_account(varchar)</li>
 * <li>document_type(int)</li>
 * <li>identification_number(varchar)</li>
 * <li>certificates_file(text)</li>
 * <li>business_license(text)</li>
 * <li>tax_reg_certificate(text)</li>
 * <li>org_ins_certificates(text)</li>
 * <li>user_id(bigint)</li></li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @author juchaochao
 * @date 2016年10月24日 下午3:07:08
 *
 */
public class AdxSspFinanceSetting implements Serializable {

	private static final long serialVersionUID = -8497298242173898655L;

	public static final String PROPERTIES = "id,account_type,certification_status,name,bank_name,bank_account,document_type,identification_number,certificates_file,business_license,tax_reg_certificate,org_ins_certificates,user_id,remarks,update_time";
	public static final String TABLE_NAME = "adx_ssp_finance_setting";

	/**
	 * 财务设置id
	 */
	private Long id;

	/**
	 * 账户类型(个人,公司)
	 */
	private Integer accountType;

	/**
	 * 认证状态(个人,公司,未认证)
	 */
	private Integer certificationStatus;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 开户行名称
	 */
	private String bankName;

	/**
	 * 银行账号
	 */
	private String bankAccount;

	/**
	 * 证件类型
	 */
	private Integer documentType;

	/**
	 * 证件号码
	 */
	private String identificationNumber;

	/**
	 * 上传证件
	 */
	private String certificatesFile;

	/**
	 * 营业执照
	 */
	private String businessLicense;

	/**
	 * 税务登记证
	 */
	private String taxRegCertificate;

	/**
	 * 组织机构证
	 */
	private String orgInsCertificates;

	/**
	 * 用户
	 */
	private User user;

	/**
	 * 冗余
	 */
	private String remarks;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public Integer getCertificationStatus() {
		return certificationStatus;
	}

	public void setCertificationStatus(Integer certificationStatus) {
		this.certificationStatus = certificationStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Integer getDocumentType() {
		return documentType;
	}

	public void setDocumentType(Integer documentType) {
		this.documentType = documentType;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getCertificatesFile() {
		return certificatesFile;
	}

	public void setCertificatesFile(String certificatesFile) {
		this.certificatesFile = certificatesFile;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getTaxRegCertificate() {
		return taxRegCertificate;
	}

	public void setTaxRegCertificate(String taxRegCertificate) {
		this.taxRegCertificate = taxRegCertificate;
	}

	public String getOrgInsCertificates() {
		return orgInsCertificates;
	}

	public void setOrgInsCertificates(String orgInsCertificates) {
		this.orgInsCertificates = orgInsCertificates;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		return "AdxSspFinanceSetting [id=" + id + ", accountType=" + accountType + ", certificationStatus="
				+ certificationStatus + ", name=" + name + ", bankName=" + bankName + ", bankAccount=" + bankAccount
				+ ", documentType=" + documentType + ", identificationNumber=" + identificationNumber
				+ ", certificatesFile=" + certificatesFile + ", businessLicense=" + businessLicense
				+ ", taxRegCertificate=" + taxRegCertificate + ", orgInsCertificates=" + orgInsCertificates + ", user="
				+ user + ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
	}

	// public static void main(String[] args) throws JsonGenerationException,
	// JsonMappingException, IOException {
	// ObjectMapper mapper = new ObjectMapper();
	// AdxSspFinanceSetting entity = new AdxSspFinanceSetting();
	// mapper.writeValue(System.out, entity);
	// }

}

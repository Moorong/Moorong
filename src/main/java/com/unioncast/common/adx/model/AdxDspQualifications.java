package com.unioncast.common.adx.model;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * ADX-DSP-资质
 * <p>
 * 对应的表：adx_dsp_qualifications
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>qualification_doc_number(varchar)</li>
 * <li>qualification_file_name(varchar)</li>
 * <li>qualification_file(text)</li>
 * <li>begin_date(date)</li>
 * <li>end_date(date)</li>
 * <li>legalpersion_name(varchar)</li>
 * <li>enterprise_type(varchar)</li>
 * <li>business_address(varchar)</li>
 * <li>business_scope(varchar)</li>
 * <li>registered_capital(double)</li>
 * <li>issuing_authority(varchar)</li>
 * <li>establish_date(date)</li>
 * <li>business_begin_date(date)</li>
 * <li>business_end_date(date)</li>
 * <li>issue_of_date(date)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 *
 * @pdOid 09638116-2c7b-4fd7-86d2-9641438c137b
 */
@MyTable("adx_dsp_qualifications")
public class AdxDspQualifications implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3713919351783176605L;
    public static String PROPERTIES = "id,qualification_doc_number,qualification_file_name,qualification_file,begin_date,end_date,legalpersion_name,enterprise_type,business_address,business_scope,registered_capital,issuing_authority,establish_date,business_begin_date,business_end_date,issue_of_date,remarks,update_time";
    public static String TABLE_NAME = "adx_dsp_qualifications";
    @MyId
    @MyColumn("id")
    private Long id;
    /**
     * 资质文件编号或登记号
     *
     * @pdOid 1f7f2c7b-2276-4620-a8bd-be295ca261b7
     */
    @MyColumn("qualification_doc_number")
    private java.lang.String qualificationDocNumber;
    /**
     * 资质文件名称
     *
     * @pdOid 4cdaf291-4cca-4159-a243-8485c2e53f19
     */
    @MyColumn("qualification_file_name")
    private java.lang.String qualificationFileName;
    /**
     * 资质文件
     *
     * @pdOid 5ecdd94b-8db6-43db-b6a8-de98a5745b3a
     */
    @MyColumn("qualification_file")
    private java.lang.String qualificationFile;
    /**
     * 资质有效开始时间
     *
     * @pdOid 2f51c08d-dee3-4470-9f1f-f65fa70d2e6c
     */
    @MyColumn("begin_date")
    private java.util.Date beginDate;
    /**
     * 资质有效结束时间 资质有效结束时间 资质有效结束时间
     *
     * @pdOid 51ae2dd2-720b-4495-bcfd-b5adcc5b3663
     */
    @MyColumn("end_date")
    private java.util.Date endDate;
    /**
     * 法人代表人名称
     *
     * @pdOid 228ec3ea-7978-4309-86cc-165e1c36babd
     */
    @MyColumn("legalpersion_name")
    private java.lang.String legalpersionName;
    /**
     * 企业类型
     *
     * @pdOid 3fc71b33-8c6f-448a-aa83-b24572ab4ebe
     */
    @MyColumn("enterprise_type")
    private java.lang.String enterpriseType;
    /**
     * 企业住所或者经营场所
     *
     * @pdOid 033e17cd-f484-4ad3-a91b-3c7ee770b565
     */
    @MyColumn("business_address")
    private java.lang.String businessAddress;
    /**
     * 经营范围或方式
     *
     * @pdOid 88cbc4b4-54f4-4273-b0bf-bf980f75a131
     */
    @MyColumn("business_scope")
    private java.lang.String businessScope;
    /**
     * 注册资本（单位万元）
     *
     * @pdOid a3ea7f07-6cfc-4053-b0f6-5c7587086d96
     */
    @MyColumn("registered_capital")
    private Double registeredCapital;
    /**
     * 发证机关或登记机关
     *
     * @pdOid 5cb3ec70-4f2b-4555-9c0d-e6e38488c367
     */
    @MyColumn("issuing_authority")
    private java.lang.String issuingAuthority;
    /**
     * 成立日期
     *
     * @pdOid 79d00043-9840-4268-bab2-5d3c0c146f46
     */
    @MyColumn("establish_date")
    private java.util.Date establishDate;
    /**
     * 营业开始时间
     *
     * @pdOid 862bfe52-f576-4948-8c56-61ab1bef0905
     */
    @MyColumn("business_begin_date")
    private java.util.Date businessBeginDate;
    /**
     * 营业结束时间
     *
     * @pdOid cc7f454d-7159-495b-a92d-6e8079b9b099
     */
    @MyColumn("business_end_date")
    private java.util.Date businessEndDate;
    /**
     * 发照日期
     *
     * @pdOid 54b983da-47b5-452c-8cc5-994d7b3b9ee7
     */
    @MyColumn("issue_of_date")
    private java.util.Date issueOfDate;
    /**
     * 冗余
     *
     * @pdOid d30f8020-eabc-4424-8a81-cadac5342721
     */
    @MyColumn("remarks")
    private java.lang.String remarks;
    @MyColumn("update_time")
    private Date updateTime;

    public AdxDspQualifications() {
        super();
    }

    public AdxDspQualifications(Long id, String qualificationDocNumber, String qualificationFileName,
                                String qualificationFile, Date beginDate, Date endDate, String legalpersionName, String enterpriseType,
                                String businessAddress, String businessScope, Double registeredCapital, String issuingAuthority,
                                Date establishDate, Date businessBeginDate, Date businessEndDate, Date issueOfDate, String remarks,
                                Date updateTime) {
        super();
        this.id = id;
        this.qualificationDocNumber = qualificationDocNumber;
        this.qualificationFileName = qualificationFileName;
        this.qualificationFile = qualificationFile;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.legalpersionName = legalpersionName;
        this.enterpriseType = enterpriseType;
        this.businessAddress = businessAddress;
        this.businessScope = businessScope;
        this.registeredCapital = registeredCapital;
        this.issuingAuthority = issuingAuthority;
        this.establishDate = establishDate;
        this.businessBeginDate = businessBeginDate;
        this.businessEndDate = businessEndDate;
        this.issueOfDate = issueOfDate;
        this.remarks = remarks;
        this.updateTime = updateTime;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxDspQualifications entity = new AdxDspQualifications();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.lang.String getQualificationDocNumber() {
        return qualificationDocNumber;
    }

    public void setQualificationDocNumber(java.lang.String qualificationDocNumber) {
        this.qualificationDocNumber = qualificationDocNumber;
    }

    public java.lang.String getQualificationFileName() {
        return qualificationFileName;
    }

    public void setQualificationFileName(java.lang.String qualificationFileName) {
        this.qualificationFileName = qualificationFileName;
    }

    public java.lang.String getQualificationFile() {
        return qualificationFile;
    }

    public void setQualificationFile(java.lang.String qualificationFile) {
        this.qualificationFile = qualificationFile;
    }

    public java.util.Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(java.util.Date beginDate) {
        this.beginDate = beginDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    public java.lang.String getLegalpersionName() {
        return legalpersionName;
    }

    public void setLegalpersionName(java.lang.String legalpersionName) {
        this.legalpersionName = legalpersionName;
    }

    public java.lang.String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(java.lang.String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public java.lang.String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(java.lang.String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public java.lang.String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(java.lang.String businessScope) {
        this.businessScope = businessScope;
    }

    public Double getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Double registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public java.lang.String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(java.lang.String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public java.util.Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(java.util.Date establishDate) {
        this.establishDate = establishDate;
    }

    public java.util.Date getBusinessBeginDate() {
        return businessBeginDate;
    }

    public void setBusinessBeginDate(java.util.Date businessBeginDate) {
        this.businessBeginDate = businessBeginDate;
    }

    public java.util.Date getBusinessEndDate() {
        return businessEndDate;
    }

    public void setBusinessEndDate(java.util.Date businessEndDate) {
        this.businessEndDate = businessEndDate;
    }

    public java.util.Date getIssueOfDate() {
        return issueOfDate;
    }

    public void setIssueOfDate(java.util.Date issueOfDate) {
        this.issueOfDate = issueOfDate;
    }

    public java.lang.String getRemarks() {
        return remarks;
    }

    public void setRemarks(java.lang.String remarks) {
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
        return "AdxDspQualifications [id=" + id + ", qualificationDocNumber=" + qualificationDocNumber
                + ", qualificationFileName=" + qualificationFileName + ", qualificationFile=" + qualificationFile
                + ", beginDate=" + beginDate + ", endDate=" + endDate + ", legalpersionName=" + legalpersionName
                + ", enterpriseType=" + enterpriseType + ", businessAddress=" + businessAddress + ", businessScope="
                + businessScope + ", registeredCapital=" + registeredCapital + ", issuingAuthority=" + issuingAuthority
                + ", establishDate=" + establishDate + ", businessBeginDate=" + businessBeginDate + ", businessEndDate="
                + businessEndDate + ", issueOfDate=" + issueOfDate + ", remarks=" + remarks + ", updateTime="
                + updateTime + "]";
    }

}

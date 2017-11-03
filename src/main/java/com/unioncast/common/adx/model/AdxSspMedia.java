package com.unioncast.common.adx.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.user.model.User;

/**
 * ADX-SSP_媒体表
 * <p>
 * 对应的表：adx_ssp_media
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>app_or_web_name(varchar)</li>
 * <li>domain_or_package_name(varchar)</li>
 * <li>media_type(int)</li>
 * <li>app_or_web_describe(varchar)</li>
 * <li>industry_id(int)</li>
 * <li>app_platform(varchar)</li>
 * <li>user_id(bigint)</li>
 * <li>audit_status(int)</li>
 * <li>audit_date_time(datetime)</li>
 * <li>access_type(int)</li>
 * <li>download_url(varchar)</li>
 * <li>keywords(varchar)</li>
 * <li>create_time(datetime)</li>
 * <li>app_or_web_id(varchar)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @pdOid a0010d6a-f832-4fb4-959b-7184bbd47a83
 */
public class AdxSspMedia implements Serializable {

	public static final String PROPERTIES = "id,app_or_web_name,domain_or_package_name,media_type,app_or_web_describe,industry_id,app_platform,user_id,audit_status,audit_date_time,access_type,download_url,keywords,create_time,app_or_web_id,remarks,update_time";
	public static final String TABLE_NAME = "adx_ssp_media";

	private static final long serialVersionUID = 485446601824018428L;
	/**
	 * 媒体id
	 * 
	 * @pdOid 1db39a96-608e-4f38-810c-3ec057c324ab
	 */
	private Long id;
	/**
	 * app/web名称
	 * 
	 * @pdOid 5482eed7-e822-4c72-8c13-3ae9ff5a16af
	 */
	private String appOrWebName;
	/**
	 * 域名或包名
	 * 
	 * @pdOid d2bef944-4f24-4a31-837c-0f3237108b3c
	 */
	private String domainOrPackageName;
	/**
	 * 媒体类别
	 * 
	 * @pdOid a6d81999-09ad-423f-bebe-ca679d00ae1e
	 */
	private Integer mediaType;
	/**
	 * app/web描述
	 * 
	 * @pdOid 7880e748-1b79-452d-ac78-5c7b54d99f3b
	 */
	private String appOrWebDescribe;
	/**
	 * 行业
	 * 
	 * @pdOid 5da18280-5adf-4dc9-847e-ef4bc6767200
	 */
	private Integer industryId;
	/**
	 * app平台
	 * 
	 * @pdOid 621f0ceb-285d-4eca-925e-93e65ed40cff
	 */
	private String appPlatform;
	/**
	 * ssp-用户id
	 * 
	 * @pdOid 6cf9a583-9383-4633-b676-4f14dabb642d
	 */
	private User user;
	/**
	 * 审核状态
	 * 
	 * @pdOid 05721c3a-9300-4f36-bcba-03de40b0f4c4
	 */
	private Integer auditStatus;
	/**
	 * 审核时间
	 * 
	 * @pdOid 1dc479a2-65aa-4fe7-a814-76aa85b6050b
	 */
	private Date auditDateTime;

	/**
	 * 访问类型
	 */
	private Integer accessType;

	/**
	 * 下载url
	 */
	private String downloadUrl;

	/**
	 * 关键词
	 */
	private String keywords;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * app或者webId
	 */
	private String appOrWebId;

	/**
	 * 冗余
	 * 
	 * @pdOid 5c1177a9-ed0c-4336-af38-49a9e500bf6a
	 */
	private java.lang.String remarks;

	/**
	 * 更新时间
	 * 
	 * @pdOid 0cc2846b-41a1-4adf-b94e-6090cadaa538
	 */
	private Date updateTime;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the appOrWebName
	 */
	public String getAppOrWebName() {
		return appOrWebName;
	}

	/**
	 * @param appOrWebName
	 *            the appOrWebName to set
	 */
	public void setAppOrWebName(String appOrWebName) {
		this.appOrWebName = appOrWebName;
	}

	/**
	 * @return the domainOrPackageName
	 */
	public String getDomainOrPackageName() {
		return domainOrPackageName;
	}

	/**
	 * @param domainOrPackageName
	 *            the domainOrPackageName to set
	 */
	public void setDomainOrPackageName(String domainOrPackageName) {
		this.domainOrPackageName = domainOrPackageName;
	}

	/**
	 * @return the mediaType
	 */
	public Integer getMediaType() {
		return mediaType;
	}

	/**
	 * @param mediaType
	 *            the mediaType to set
	 */
	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * @return the appOrWebDescribe
	 */
	public String getAppOrWebDescribe() {
		return appOrWebDescribe;
	}

	/**
	 * @param appOrWebDescribe
	 *            the appOrWebDescribe to set
	 */
	public void setAppOrWebDescribe(String appOrWebDescribe) {
		this.appOrWebDescribe = appOrWebDescribe;
	}

	/**
	 * @return the industryId
	 */
	public Integer getIndustryId() {
		return industryId;
	}

	/**
	 * @param industryId
	 *            the industryId to set
	 */
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}

	/**
	 * @return the appPlatform
	 */
	public String getAppPlatform() {
		return appPlatform;
	}

	/**
	 * @param appPlatform
	 *            the appPlatform to set
	 */
	public void setAppPlatform(String appPlatform) {
		this.appPlatform = appPlatform;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the auditStatus
	 */
	public Integer getAuditStatus() {
		return auditStatus;
	}

	/**
	 * @param auditStatus
	 *            the auditStatus to set
	 */
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * @return the auditDateTime
	 */
	public Date getAuditDateTime() {
		return auditDateTime;
	}

	/**
	 * @param auditDateTime
	 *            the auditDateTime to set
	 */
	public void setAuditDateTime(Date auditDateTime) {
		this.auditDateTime = auditDateTime;
	}

	/**
	 * @return the accessType
	 */
	public Integer getAccessType() {
		return accessType;
	}

	/**
	 * @param accessType
	 *            the accessType to set
	 */
	public void setAccessType(Integer accessType) {
		this.accessType = accessType;
	}

	/**
	 * @return the downloadUrl
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * @param downloadUrl
	 *            the downloadUrl to set
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords
	 *            the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the appOrWebId
	 */
	public String getAppOrWebId() {
		return appOrWebId;
	}

	/**
	 * @param appOrWebId
	 *            the appOrWebId to set
	 */
	public void setAppOrWebId(String appOrWebId) {
		this.appOrWebId = appOrWebId;
	}

	/**
	 * @return the remarks
	 */
	public java.lang.String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(java.lang.String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AdxSspMedia [id=" + id + ", appOrWebName=" + appOrWebName + ", domainOrPackageName="
				+ domainOrPackageName + ", mediaType=" + mediaType + ", appOrWebDescribe=" + appOrWebDescribe
				+ ", industryId=" + industryId + ", appPlatform=" + appPlatform + ", user=" + user + ", auditStatus="
				+ auditStatus + ", auditDateTime=" + auditDateTime + ", accessType=" + accessType + ", downloadUrl="
				+ downloadUrl + ", keywords=" + keywords + ", createTime=" + createTime + ", appOrWebId=" + appOrWebId
				+ ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		AdxSspMedia entity = new AdxSspMedia();
		mapper.writeValue(System.out, entity);
	}

}

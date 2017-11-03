package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 应用信息 ssp_app_info
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:10:19
 */
@MyTable("ssp_app_info")
public class SspAppInfo implements Serializable {

	private static final long serialVersionUID = 4295581797777367450L;
	public static String PROPERTIES = "id, app_id, name, dict_industry_id, dict_platform_id, dict_access_way_id, download_url, package_name, itunes_id, app_keywords, app_desc, dict_audit_id, create_time, update_time, ratio, audit_info, creater_id, delete_state,kpi,price_start_time,price_end_time,unified_price";
	public static String TABLE_NAME = "ssp_app_info";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	//app唯一编码
	@MyColumn("app_id")
	private String appId;

	//应用名称
	@MyColumn("name")
	private String name;

	//所属行业
	@MyColumn("dict_industry_id")
	private SspDictIndustry sspDictIndustry;

	//适用终端
	@MyColumn("dict_platform_id")
	private SspDictPlatform sspDictPlatform;

	//接入方式
	@MyColumn("dict_access_way_id")
	private SspDictAccessWay sspDictAccessWay;

	//下载地址
	@MyColumn("download_url")
	private String downloadUrl;

	//android包名
	@MyColumn("package_name")
	private String packageName;

	//itunes的id
	@MyColumn("itunes_id")
	private String itunesId;

	//应用关键词
	@MyColumn("app_keywords")
	private String appKeywords;

	//应用简介
	@MyColumn("app_desc")
	private String appDesc;

	//审核状态
	@MyColumn("dict_audit_id")
	private SspDictAudit sspDictAudit;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;

	//分成比例
	@MyColumn("ratio")
	private Double ratio;

	//审核信息描述
	@MyColumn("audit_info")
	private String auditInfo;

	//创建者
	@MyColumn("creater_id")
	private User user;

	//删除状态，1-未删除，2-已删除
	@MyColumn("delete_state")
	private Integer deleteState;

	@MyColumn("kpi")
	private Long kpi;

	@MyColumn("price_start_time")
	private Date priceStartTime;
	@MyColumn("price_end_time")
	private Date priceEndTime;

	@MyColumn("unified_price")
	private Double unifiedPrice;

	public SspAppInfo() {
	}

	public SspAppInfo(Long id, String appId, String name, SspDictIndustry sspDictIndustry, SspDictPlatform sspDictPlatform, SspDictAccessWay sspDictAccessWay, String downloadUrl, String packageName, String itunesId, String appKeywords, String appDesc, SspDictAudit sspDictAudit, Date createTime, Date updateTime, Double ratio, String auditInfo, User user, Integer deleteState, Long kpi, Date priceStartTime, Date priceEndTime, Double unifiedPrice) {
		this.id = id;
		this.appId = appId;
		this.name = name;
		this.sspDictIndustry = sspDictIndustry;
		this.sspDictPlatform = sspDictPlatform;
		this.sspDictAccessWay = sspDictAccessWay;
		this.downloadUrl = downloadUrl;
		this.packageName = packageName;
		this.itunesId = itunesId;
		this.appKeywords = appKeywords;
		this.appDesc = appDesc;
		this.sspDictAudit = sspDictAudit;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.ratio = ratio;
		this.auditInfo = auditInfo;
		this.user = user;
		this.deleteState = deleteState;
		this.kpi = kpi;
		this.priceStartTime = priceStartTime;
		this.priceEndTime = priceEndTime;
		this.unifiedPrice = unifiedPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName == null ? null : packageName.trim();
	}

	public String getItunesId() {
		return itunesId;
	}

	public void setItunesId(String itunesId) {
		this.itunesId = itunesId == null ? null : itunesId.trim();
	}

	public String getAppKeywords() {
		return appKeywords;
	}

	public void setAppKeywords(String appKeywords) {
		this.appKeywords = appKeywords == null ? null : appKeywords.trim();
	}

	public String getAppDesc() {
		return appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc == null ? null : appDesc.trim();
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

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

	public String getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(String auditInfo) {
		this.auditInfo = auditInfo == null ? null : auditInfo.trim();
	}

	public SspDictIndustry getSspDictIndustry() {
		return sspDictIndustry;
	}

	public void setSspDictIndustry(SspDictIndustry sspDictIndustry) {
		this.sspDictIndustry = sspDictIndustry;
	}

	public SspDictPlatform getSspDictPlatform() {
		return sspDictPlatform;
	}

	public void setSspDictPlatform(SspDictPlatform sspDictPlatform) {
		this.sspDictPlatform = sspDictPlatform;
	}

	public SspDictAccessWay getSspDictAccessWay() {
		return sspDictAccessWay;
	}

	public void setSspDictAccessWay(SspDictAccessWay sspDictAccessWay) {
		this.sspDictAccessWay = sspDictAccessWay;
	}

	public SspDictAudit getSspDictAudit() {
		return sspDictAudit;
	}

	public void setSspDictAudit(SspDictAudit sspDictAudit) {
		this.sspDictAudit = sspDictAudit;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}

	public Long getKpi() {
		return kpi;
	}

	public void setKpi(Long kpi) {
		this.kpi = kpi;
	}

	public Date getPriceStartTime() {
		return priceStartTime;
	}

	public void setPriceStartTime(Date priceStartTime) {
		this.priceStartTime = priceStartTime;
	}

	public Date getPriceEndTime() {
		return priceEndTime;
	}

	public void setPriceEndTime(Date priceEndTime) {
		this.priceEndTime = priceEndTime;
	}

	public Double getUnifiedPrice() {
		return unifiedPrice;
	}

	public void setUnifiedPrice(Double unifiedPrice) {
		this.unifiedPrice = unifiedPrice;
	}
}
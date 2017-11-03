package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * <p>
 * 广告创意实体类
 * </p>
 *
 * @author dmpliufengjiao
 * @date 2016年10月18日 上午11:38:22
 */
@MyTable("adx_dsp_adcreative")
public class AdxDspAdcreative implements Serializable {

	private static final long serialVersionUID = 8823499417398311387L;
	public static String PROPERTIES = "id, title, description, flow_type, industry_type, operating_system, click_landing_page, creative_type, size, creative_url, advert_person_id, advertising_position_type, resolution, play_time, user_id, check_status, check_time, refuse_details, create_time, remarks, update_time";
	public static String TABLE_NAME = "adx_dsp_adcreative";
	// 广告创意id
	@MyId("id")
	@MyColumn("id")
	private long id;
	// 广告创意标题
	@MyColumn("title")
	private String title;
	// 描述
	@MyColumn("description")
	private String description;
	// 流量类型:0:web 1:app 2:video
	@MyColumn("flow_type")
	private Integer flowType;
	// 所属行业类型
	@MyColumn("industry_type")
	private String industryType;
	// 操作系统 对于流量类型为app端来说 如Android ios
	@MyColumn("operating_system")
	private String operatingSystem;
	// 点击落地页
	@MyColumn("click_landing_page")
	private String clickLandingPage;
	// 创意类型 如图文 图片 视频等
	@MyColumn("creative_type")
	private String creativeType;
	// 尺寸
	@MyColumn("size")
	private String size;
	// 创意文件url
	@MyColumn("creative_url")
	private String creativeUrl;
	// 关联广告主id
	@MyColumn("advert_person_id")
	private Long advertPersonId;
	// 广告位类型 横幅 插屏等
	@MyColumn("advertising_position_type")
	private String advertisingPositionType;
	// 分辨率
	@MyColumn("resolution")
	private String resolution;
	// 播放时长
	@MyColumn("play_time")
	private String playTime;
	// 审核人姓名
	@MyColumn("user_id")
	private Long userId;
	// 审核状态 0：未审核，1：审核未通过，2：审核通过
	@MyColumn("check_status")
	private Integer checkStatus;
	// 审核时间
	@MyColumn("check_time")
	private Date checkTime;
	// 拒绝详情
	@MyColumn("refuse_details")
	private String refuseDetails;
	// 创建时间
	@MyColumn("create_time")
	private Date createTime;
	// 更新时间
	@MyColumn("update_time")
	private Date updateTime;
	//冗余
	@MyColumn("remarks")
	private String remarks;

	public AdxDspAdcreative() {
		super();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public AdxDspAdcreative(long id, String title, String description,
			Integer flowType, String industryType, String operatingSystem,
			String clickLandingPage, String creativeType, String size,
			String creativeUrl, Long advertPersonId,
			String advertisingPositionType, String resolution, String playTime,
			Long userId, Integer checkStatus, Date checkTime,
			String refuseDetails, Date createTime, Date updateTime, String remarks) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.flowType = flowType;
		this.industryType = industryType;
		this.operatingSystem = operatingSystem;
		this.clickLandingPage = clickLandingPage;
		this.creativeType = creativeType;
		this.size = size;
		this.creativeUrl = creativeUrl;
		this.advertPersonId  = advertPersonId ;
		this.advertisingPositionType = advertisingPositionType;
		this.resolution = resolution;
		this.playTime = playTime;
		this.userId = userId;
		this.checkStatus = checkStatus;
		this.checkTime = checkTime;
		this.refuseDetails = refuseDetails;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.remarks = remarks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getFlowType() {
		return flowType;
	}

	public void setFlowType(Integer flowType) {
		this.flowType = flowType;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getClickLandingPage() {
		return clickLandingPage;
	}

	public void setClickLandingPage(String clickLandingPage) {
		this.clickLandingPage = clickLandingPage;
	}

	public String getCreativeType() {
		return creativeType;
	}

	public void setCreativeType(String creativeType) {
		this.creativeType = creativeType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCreativeUrl() {
		return creativeUrl;
	}

	public void setCreativeUrl(String creativeUrl) {
		this.creativeUrl = creativeUrl;
	}

	public Long getAdvertPersonId() {
		return advertPersonId;
	}

	public void setAdvertPersonId(Long advertPersonId) {
		this.advertPersonId = advertPersonId;
	}

	public String getAdvertisingPositionType() {
		return advertisingPositionType;
	}

	public void setAdvertisingPositionType(String advertisingPositionType) {
		this.advertisingPositionType = advertisingPositionType;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getPlayTime() {
		return playTime;
	}

	public void setPlayTime(String playTime) {
		this.playTime = playTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getRefuseDetails() {
		return refuseDetails;
	}

	public void setRefuseDetails(String refuseDetails) {
		this.refuseDetails = refuseDetails;
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

	@Override
	public String toString() {
		return "AdxDspAdcreative [id=" + id + ", title=" + title + ", description=" + description + ", flowType="
				+ flowType + ", industryType=" + industryType + ", operatingSystem=" + operatingSystem
				+ ", clickLandingPage=" + clickLandingPage + ", creativeType=" + creativeType + ", size=" + size
				+ ", creativeUrl=" + creativeUrl + ", advertPersonId=" + advertPersonId + ", advertisingPositionType="
				+ advertisingPositionType + ", resolution=" + resolution + ", playTime=" + playTime + ", userId="
				+ userId + ", checkStatus=" + checkStatus + ", checkTime=" + checkTime + ", refuseDetails="
				+ refuseDetails + ", createTime=" + createTime + ", updateTime=" + updateTime + ", remarks=" + remarks
				+ "]";
	}

}

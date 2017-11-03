package com.unioncast.common.ssp.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

/**
 * 创意信息 ssp_creative
 * <p>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:13:21
 */
@MyTable("ssp_creative")
public class SspCreative implements Serializable {

	private static final long serialVersionUID = -8209880578763227070L;
	public static String PROPERTIES = "id, account_id, advertiser_id, creative_type,"
			+ "creative_name, creative_label, creative_state, creative_label_new,"
			+ "creative_size, pic_name, pic_size, creative_format, video_duration,"
			+ "creative_url, creative_click_address, creative_monitor_address,"
			+ "adv_title, create_time, update_time,height,width,creative_source,delete_state";
	public static String TABLE_NAME = "ssp_creative";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	// 账号
	@MyColumn("account_id")
	private User user;

	// 广告主
	@MyColumn("advertiser_id")
	private SspAdvertiser sspAdvertiser;

	// 创意类目，1-图片，2-视频，3-信息流
	@MyColumn("creative_type")
	private Integer creativeType;

	// 当前创意的名字
	@MyColumn("creative_name")
	private String creativeName;

	// 创意标签
	@MyColumn("creative_label")
	private SspDictLabel[] sspDictLabelArr;

	// 创意状态，1：开，2：关
	@MyColumn("creative_state")
	private Integer creativeState;

	// 保存成功要在ssp_dict_label更新
	@MyColumn("creative_label_new")
	private String creativeLabelNew;

	// 创意尺寸
	@MyColumn("creative_size")
	private String creativeSize;

	// 图片名称
	@MyColumn("pic_name")
	private String picName;

	// 27单位默认k 图片需小于150K
	@MyColumn("pic_size")
	private Double picSize;

	// 图片格式 flv ，png，jpg,swf
	@MyColumn("creative_format")
	private String creativeFormat;

	// 视频需小于2M，swf、flv格式，播放时间15秒
	@MyColumn("video_duration")
	private Long videoDuration;

	@MyColumn("creative_url")
	private String creativeUrl;

	// 点击地址
	@MyColumn("creative_click_address")
	private String creativeClickAddress;

	// 监测地址--第三方检测地址
	@MyColumn("creative_monitor_address")
	private String creativeMonitorAddress;

	// 广告标题--对应信息流
	@MyColumn("adv_title")
	private String advTitle;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;

	@MyColumn("height")
	private Integer height;

	@MyColumn("width")
	private Integer width;

	@MyColumn("creative_source")
	private String creativeSource;
//1:未删除  2：已删除
	@MyColumn("delete_state")
	private Integer  deleteState;
	
	public SspCreative(Long id, User user, SspAdvertiser sspAdvertiser, Integer creativeType, String creativeName,
			SspDictLabel[] sspDictLabelArr, Integer creativeState, String creativeLabelNew, String creativeSize,
			String picName, Double picSize, String creativeFormat, Long videoDuration, String creativeUrl,
			String creativeClickAddress, String creativeMonitorAddress, String advTitle, Date createTime,
			Date updateTime, Integer height, Integer width, String creativeSource, Integer deleteState) {
		super();
		this.id = id;
		this.user = user;
		this.sspAdvertiser = sspAdvertiser;
		this.creativeType = creativeType;
		this.creativeName = creativeName;
		this.sspDictLabelArr = sspDictLabelArr;
		this.creativeState = creativeState;
		this.creativeLabelNew = creativeLabelNew;
		this.creativeSize = creativeSize;
		this.picName = picName;
		this.picSize = picSize;
		this.creativeFormat = creativeFormat;
		this.videoDuration = videoDuration;
		this.creativeUrl = creativeUrl;
		this.creativeClickAddress = creativeClickAddress;
		this.creativeMonitorAddress = creativeMonitorAddress;
		this.advTitle = advTitle;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.height = height;
		this.width = width;
		this.creativeSource = creativeSource;
		this.deleteState = deleteState;
	}

	public Integer getCreativeState() {
		return creativeState;
	}

	public void setCreativeState(Integer creativeState) {
		this.creativeState = creativeState;
	}

	public SspCreative() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SspAdvertiser getSspAdvertiser() {
		return sspAdvertiser;
	}

	public void setSspAdvertiser(SspAdvertiser sspAdvertiser) {
		this.sspAdvertiser = sspAdvertiser;
	}

	public Double getPicSize() {
		return picSize;
	}

	public void setPicSize(Double picSize) {
		this.picSize = picSize;
	}

	public Integer getCreativeType() {
		return creativeType;
	}

	public void setCreativeType(Integer creativeType) {
		this.creativeType = creativeType;
	}

	public String getCreativeName() {
		return creativeName;
	}

	public void setCreativeName(String creativeName) {
		this.creativeName = creativeName == null ? null : creativeName.trim();
	}

	public SspDictLabel[] getSspDictLabelArr() {
		return sspDictLabelArr;
	}

	public void setSspDictLabelArr(SspDictLabel[] sspDictLabelArr) {
		this.sspDictLabelArr = sspDictLabelArr;
	}

	public String getCreativeLabelNew() {
		return creativeLabelNew;
	}

	public void setCreativeLabelNew(String creativeLabelNew) {
		this.creativeLabelNew = creativeLabelNew == null ? null : creativeLabelNew.trim();
	}

	public String getCreativeSize() {
		return creativeSize;
	}

	public void setCreativeSize(String creativeSize) {
		this.creativeSize = creativeSize == null ? null : creativeSize.trim();
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName == null ? null : picName.trim();
	}

	public String getCreativeFormat() {
		return creativeFormat;
	}

	public void setCreativeFormat(String creativeFormat) {
		this.creativeFormat = creativeFormat == null ? null : creativeFormat.trim();
	}

	public Long getVideoDuration() {
		return videoDuration;
	}

	public void setVideoDuration(Long videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getCreativeUrl() {
		return creativeUrl;
	}

	public void setCreativeUrl(String creativeUrl) {
		this.creativeUrl = creativeUrl == null ? null : creativeUrl.trim();
	}

	public String getCreativeClickAddress() {
		return creativeClickAddress;
	}

	public void setCreativeClickAddress(String creativeClickAddress) {
		this.creativeClickAddress = creativeClickAddress == null ? null : creativeClickAddress.trim();
	}

	public String getCreativeMonitorAddress() {
		return creativeMonitorAddress;
	}

	public void setCreativeMonitorAddress(String creativeMonitorAddress) {
		this.creativeMonitorAddress = creativeMonitorAddress == null ? null : creativeMonitorAddress.trim();
	}

	public String getAdvTitle() {
		return advTitle;
	}

	public void setAdvTitle(String advTitle) {
		this.advTitle = advTitle == null ? null : advTitle.trim();
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public String getCreativeSource() {
		return creativeSource;
	}

	public void setCreativeSource(String creativeSource) {
		this.creativeSource = creativeSource;
	}

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}

	@Override
	public String toString() {
		return "SspCreative [id=" + id + ", user=" + user + ", sspAdvertiser="
				+ sspAdvertiser + ", creativeType=" + creativeType
				+ ", creativeName=" + creativeName + ", sspDictLabelArr="
				+ Arrays.toString(sspDictLabelArr) + ", creativeState="
				+ creativeState + ", creativeLabelNew=" + creativeLabelNew
				+ ", creativeSize=" + creativeSize + ", picName=" + picName
				+ ", picSize=" + picSize + ", creativeFormat=" + creativeFormat
				+ ", videoDuration=" + videoDuration + ", creativeUrl="
				+ creativeUrl + ", creativeClickAddress="
				+ creativeClickAddress + ", creativeMonitorAddress="
				+ creativeMonitorAddress + ", advTitle=" + advTitle
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", height=" + height + ", width=" + width
				+ ", creativeSource=" + creativeSource + ", deleteState="
				+ deleteState + "]";
	}

	

}
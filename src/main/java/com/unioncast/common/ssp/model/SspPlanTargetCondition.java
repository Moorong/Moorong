package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * 广告定向条件 ssp_plan_target_condition
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:37:38
 */
@MyTable("ssp_plan_target_condition")
public class SspPlanTargetCondition implements Serializable {

	private static final long serialVersionUID = 8047341100855145498L;

	public static String PROPERTIES = "  id, time_target, dict_ad_type_id, put_rhythm, area_target_state,"
			+ " city_code, lbs_info, dict_sys_operation_state,dict_sys_operation_type, dict_mobile_brand_state,dict_mobile_brand_type,"
			+ " network_type,  device_type_state,device_type_idfa, device_type_mac, device_type_imei, media_state,dict_media_type, media_ids,"
			+ " dict_age_state,age,dict_education_state,education, dict_marriage_state, marriage, dict_income_state,income,dict_interests_state, interests,"
			+ "dict_buy_state, buy, dict_crowd_sex_state,  dict_crowd_sex_type,create_time, update_time,delete_state";

	public static String TABLE_NAME = "ssp_plan_target_condition";
	@MyId("id")
	@MyColumn("id")
	private Long id;

	// 时间定向
	@MyColumn("time_target")
	private String timeTarget;

	// 广告类型
	@MyColumn("dict_ad_type_id")
	private SspDictAdType sspDictAdType;

	// 投放节奏，1-均匀投放，2-加速投放，3-集中投放，4-效果最有投放，5-低CPC投放
	@MyColumn("put_rhythm")
	private Long putRhythm;

	// 地域定向,1-不限定,2-按地域（省、市）,3-LBS
	@MyColumn("area_target_state")
	private Long areaTargetState;
	@MyColumn("city_code")
	private SspCityInfo[] cityInfoArr;

	// 经度-纬度-半径
	@MyColumn("lbs_info")
	private String lbsInfo;

	// 操作系统定向状态1，不限，2限制
	@MyColumn("dict_sys_operation_state")
	private Long dictSysOperationState;

	// 操作系统定向
	@MyColumn("dict_sys_operation_type")
	private SspDictSysOperationType[] dictSysOperationTypeArr;

	// 移动设备品牌定向状态1，不限，2限制
	@MyColumn("dict_mobile_brand_state")
	private Long dictMobileBrandState;
	// 移动设备品牌定向
	@MyColumn("dict_mobile_brand_type")
	private SspDictMobileBrandType[] dictMobileBrandTypeArr;

	// 网络类型，1-全选，2-2G，3-3G，4-4G，5-WIFI，逗号区分
	@MyColumn("network_type")
	private String networkType;

	// 设备ID定向控制状态(1不限，2有，3指定)
	@MyColumn("device_type_state")
	private Long deviceTypeState;

	// 设备ID定向
	@MyColumn("device_type_idfa")
	private String deviceTypeIdfa;

	// 设备ID定向类型
	@MyColumn("device_type_mac")
	private String deviceTypeMac;

	// 设备ID定向类型
	@MyColumn("device_type_imei")
	private String deviceTypeImei;

	// 媒体类型定向状态1不限，2限制
	@MyColumn("media_state")
	private Long mediaState;

	// 媒体类型定向
	@MyColumn("dict_media_type")
	private SspDictMediaType[] dictMediaTypeArr;

	// 媒体ID定向，逗号区分
	@MyColumn("media_ids")
	private String mediaIds;

	// 性别定向状态 1不限 2 限制
	@MyColumn("dict_crowd_sex_state")
	private Long sexState;
	// 性别，1-男，2-女
	@MyColumn("dict_crowd_sex_type")
	private SspDictCrowdSexType[] dictCrowdSexTypeArr;

	// 年龄定向状态1，不限，2限制
	@MyColumn("dict_age_state")
	private Long dictAgeState;
	// 年龄定向
	@MyColumn("age")
	private SspDictAgeTarget[] ageTargetArr;

	// 学历定向状态1，不限，2限制
	@MyColumn("dict_education_state")
	private Long dictEducationState;
	// 学历
	@MyColumn("education")
	private SspDictEducationTarget[] educationTargetArr;

	// 婚姻定向状态1，不限，2限制
	@MyColumn("dict_marriage_state")
	private Long dictMarriageState;
	// 婚姻，1-已婚，2-未婚，，逗号区分
	@MyColumn("marriage")
	private SspDictMarriageTarget[] sspDictMarriageTargetArr;

	// 收入定向状态1，不限，2限制
	@MyColumn("dict_income_state")
	private Long dictIncomeState;
	// 收入，1-高，2-中，3-低，，逗号区分
	@MyColumn("income")
	private SspDictIncomeTarget[] sspDictIncomeTargetArr;

	// 兴趣定向状态1，不限，2限制
	@MyColumn("dict_interests_state")
	private Long dictInterestsState;
	// 兴趣爱好，
	@MyColumn("interests")
	private SspDictInterestsTarget[] interestsTargetArr;

	// 购买倾向状态1，不限，2限制
	@MyColumn("dict_buy_state")
	private Long dictBuyState;
	// 购买倾向
	@MyColumn("buy")
	private SspDictBuyTarget[] buyTargetArr;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;

	// 删除状态，1-未删除，2-已删除
	@MyColumn("delete_state")
	private Long deleteState;

	public SspPlanTargetCondition() {
	}

	public SspPlanTargetCondition(Long id, String timeTarget, SspDictAdType sspDictAdType, Long putRhythm,
			Long areaTargetState, SspCityInfo[] cityInfoArr, String lbsInfo, Long dictSysOperationState,
			SspDictSysOperationType[] dictSysOperationTypeArr, Long dictMobileBrandState,
			SspDictMobileBrandType[] dictMobileBrandTypeArr, String networkType, Long deviceTypeState,
			String deviceTypeIdfa, String deviceTypeMac, String deviceTypeImei, Long mediaState,
			SspDictMediaType[] dictMediaTypeArr, String mediaIds, Long sexState,
			SspDictCrowdSexType[] dictCrowdSexTypeArr, Long dictAgeState, SspDictAgeTarget[] ageTargetArr,
			Long dictEducationState, SspDictEducationTarget[] educationTargetArr, Long dictMarriageState,
			SspDictMarriageTarget[] sspDictMarriageTargetArr, Long dictIncomeState,
			SspDictIncomeTarget[] sspDictIncomeTargetArr, Long dictInterestsState,
			SspDictInterestsTarget[] interestsTargetArr, Long dictBuyState, SspDictBuyTarget[] buyTargetArr,
			Date createTime, Date updateTime, Long deleteState) {
		super();
		this.id = id;
		this.timeTarget = timeTarget;
		this.sspDictAdType = sspDictAdType;
		this.putRhythm = putRhythm;
		this.areaTargetState = areaTargetState;
		this.cityInfoArr = cityInfoArr;
		this.lbsInfo = lbsInfo;
		this.dictSysOperationState = dictSysOperationState;
		this.dictSysOperationTypeArr = dictSysOperationTypeArr;
		this.dictMobileBrandState = dictMobileBrandState;
		this.dictMobileBrandTypeArr = dictMobileBrandTypeArr;
		this.networkType = networkType;
		this.deviceTypeState = deviceTypeState;
		this.deviceTypeIdfa = deviceTypeIdfa;
		this.deviceTypeMac = deviceTypeMac;
		this.deviceTypeImei = deviceTypeImei;
		this.mediaState = mediaState;
		this.dictMediaTypeArr = dictMediaTypeArr;
		this.mediaIds = mediaIds;
		this.sexState = sexState;
		this.dictCrowdSexTypeArr = dictCrowdSexTypeArr;
		this.dictAgeState = dictAgeState;
		this.ageTargetArr = ageTargetArr;
		this.dictEducationState = dictEducationState;
		this.educationTargetArr = educationTargetArr;
		this.dictMarriageState = dictMarriageState;
		this.sspDictMarriageTargetArr = sspDictMarriageTargetArr;
		this.dictIncomeState = dictIncomeState;
		this.sspDictIncomeTargetArr = sspDictIncomeTargetArr;
		this.dictInterestsState = dictInterestsState;
		this.interestsTargetArr = interestsTargetArr;
		this.dictBuyState = dictBuyState;
		this.buyTargetArr = buyTargetArr;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.deleteState = deleteState;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeTarget() {
		return timeTarget;
	}

	public void setTimeTarget(String timeTarget) {
		this.timeTarget = timeTarget;
	}

	public SspDictAdType getSspDictAdType() {
		return sspDictAdType;
	}

	public void setSspDictAdType(SspDictAdType sspDictAdType) {
		this.sspDictAdType = sspDictAdType;
	}

	public Long getPutRhythm() {
		return putRhythm;
	}

	public void setPutRhythm(Long putRhythm) {
		this.putRhythm = putRhythm;
	}

	public Long getAreaTargetState() {
		return areaTargetState;
	}

	public void setAreaTargetState(Long areaTargetState) {
		this.areaTargetState = areaTargetState;
	}

	public SspCityInfo[] getCityInfoArr() {
		return cityInfoArr;
	}

	public void setCityInfoArr(SspCityInfo[] cityInfoArr) {
		this.cityInfoArr = cityInfoArr;
	}

	public String getLbsInfo() {
		return lbsInfo;
	}

	public void setLbsInfo(String lbsInfo) {
		this.lbsInfo = lbsInfo;
	}

	public Long getDictSysOperationState() {
		return dictSysOperationState;
	}

	public void setDictSysOperationState(Long dictSysOperationState) {
		this.dictSysOperationState = dictSysOperationState;
	}

	public SspDictSysOperationType[] getDictSysOperationTypeArr() {
		return dictSysOperationTypeArr;
	}

	public void setDictSysOperationTypeArr(SspDictSysOperationType[] dictSysOperationTypeArr) {
		this.dictSysOperationTypeArr = dictSysOperationTypeArr;
	}

	public Long getDictMobileBrandState() {
		return dictMobileBrandState;
	}

	public void setDictMobileBrandState(Long dictMobileBrandState) {
		this.dictMobileBrandState = dictMobileBrandState;
	}

	public SspDictMobileBrandType[] getDictMobileBrandTypeArr() {
		return dictMobileBrandTypeArr;
	}

	public void setDictMobileBrandTypeArr(SspDictMobileBrandType[] dictMobileBrandTypeArr) {
		this.dictMobileBrandTypeArr = dictMobileBrandTypeArr;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public Long getDeviceTypeState() {
		return deviceTypeState;
	}

	public void setDeviceTypeState(Long deviceTypeState) {
		this.deviceTypeState = deviceTypeState;
	}

	public String getDeviceTypeIdfa() {
		return deviceTypeIdfa;
	}

	public void setDeviceTypeIdfa(String deviceTypeIdfa) {
		this.deviceTypeIdfa = deviceTypeIdfa;
	}

	public String getDeviceTypeMac() {
		return deviceTypeMac;
	}

	public void setDeviceTypeMac(String deviceTypeMac) {
		this.deviceTypeMac = deviceTypeMac;
	}

	public String getDeviceTypeImei() {
		return deviceTypeImei;
	}

	public void setDeviceTypeImei(String deviceTypeImei) {
		this.deviceTypeImei = deviceTypeImei;
	}

	public Long getMediaState() {
		return mediaState;
	}

	public void setMediaState(Long mediaState) {
		this.mediaState = mediaState;
	}

	public SspDictMediaType[] getDictMediaTypeArr() {
		return dictMediaTypeArr;
	}

	public void setDictMediaTypeArr(SspDictMediaType[] dictMediaTypeArr) {
		this.dictMediaTypeArr = dictMediaTypeArr;
	}

	public String getMediaIds() {
		return mediaIds;
	}

	public void setMediaIds(String mediaIds) {
		this.mediaIds = mediaIds;
	}

	public Long getSexState() {
		return sexState;
	}

	public void setSexState(Long sexState) {
		this.sexState = sexState;
	}

	public SspDictCrowdSexType[] getDictCrowdSexTypeArr() {
		return dictCrowdSexTypeArr;
	}

	public void setDictCrowdSexTypeArr(SspDictCrowdSexType[] dictCrowdSexTypeArr) {
		this.dictCrowdSexTypeArr = dictCrowdSexTypeArr;
	}

	public Long getDictAgeState() {
		return dictAgeState;
	}

	public void setDictAgeState(Long dictAgeState) {
		this.dictAgeState = dictAgeState;
	}

	public SspDictAgeTarget[] getAgeTargetArr() {
		return ageTargetArr;
	}

	public void setAgeTargetArr(SspDictAgeTarget[] ageTargetArr) {
		this.ageTargetArr = ageTargetArr;
	}

	public Long getDictEducationState() {
		return dictEducationState;
	}

	public void setDictEducationState(Long dictEducationState) {
		this.dictEducationState = dictEducationState;
	}

	public SspDictEducationTarget[] getEducationTargetArr() {
		return educationTargetArr;
	}

	public void setEducationTargetArr(SspDictEducationTarget[] educationTargetArr) {
		this.educationTargetArr = educationTargetArr;
	}

	public Long getDictMarriageState() {
		return dictMarriageState;
	}

	public void setDictMarriageState(Long dictMarriageState) {
		this.dictMarriageState = dictMarriageState;
	}

	public SspDictMarriageTarget[] getSspDictMarriageTargetArr() {
		return sspDictMarriageTargetArr;
	}

	public void setSspDictMarriageTargetArr(SspDictMarriageTarget[] sspDictMarriageTargetArr) {
		this.sspDictMarriageTargetArr = sspDictMarriageTargetArr;
	}

	public Long getDictIncomeState() {
		return dictIncomeState;
	}

	public void setDictIncomeState(Long dictIncomeState) {
		this.dictIncomeState = dictIncomeState;
	}

	public SspDictIncomeTarget[] getSspDictIncomeTargetArr() {
		return sspDictIncomeTargetArr;
	}

	public void setSspDictIncomeTargetArr(SspDictIncomeTarget[] sspDictIncomeTargetArr) {
		this.sspDictIncomeTargetArr = sspDictIncomeTargetArr;
	}

	public Long getDictInterestsState() {
		return dictInterestsState;
	}

	public void setDictInterestsState(Long dictInterestsState) {
		this.dictInterestsState = dictInterestsState;
	}

	public SspDictInterestsTarget[] getInterestsTargetArr() {
		return interestsTargetArr;
	}

	public void setInterestsTargetArr(SspDictInterestsTarget[] interestsTargetArr) {
		this.interestsTargetArr = interestsTargetArr;
	}

	public Long getDictBuyState() {
		return dictBuyState;
	}

	public void setDictBuyState(Long dictBuyState) {
		this.dictBuyState = dictBuyState;
	}

	public SspDictBuyTarget[] getBuyTargetArr() {
		return buyTargetArr;
	}

	public void setBuyTargetArr(SspDictBuyTarget[] buyTargetArr) {
		this.buyTargetArr = buyTargetArr;
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

	public Long getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Long deleteState) {
		this.deleteState = deleteState;
	}

	@Override
	public String toString() {
		return "SspPlanTargetCondition [id=" + id + ", timeTarget=" + timeTarget + ", sspDictAdType=" + sspDictAdType
				+ ", putRhythm=" + putRhythm + ", areaTargetState=" + areaTargetState + ", cityInfoArr="
				+ Arrays.toString(cityInfoArr) + ", lbsInfo=" + lbsInfo + ", dictSysOperationState="
				+ dictSysOperationState + ", dictSysOperationTypeArr=" + Arrays.toString(dictSysOperationTypeArr)
				+ ", dictMobileBrandState=" + dictMobileBrandState + ", dictMobileBrandTypeArr="
				+ Arrays.toString(dictMobileBrandTypeArr) + ", networkType=" + networkType + ", deviceTypeState="
				+ deviceTypeState + ", deviceTypeIdfa=" + deviceTypeIdfa + ", deviceTypeMac=" + deviceTypeMac
				+ ", deviceTypeImei=" + deviceTypeImei + ", mediaState=" + mediaState + ", dictMediaTypeArr="
				+ Arrays.toString(dictMediaTypeArr) + ", mediaIds=" + mediaIds + ", sexState=" + sexState
				+ ", dictCrowdSexTypeArr=" + Arrays.toString(dictCrowdSexTypeArr) + ", dictAgeState=" + dictAgeState
				+ ", ageTargetArr=" + Arrays.toString(ageTargetArr) + ", dictEducationState=" + dictEducationState
				+ ", educationTargetArr=" + Arrays.toString(educationTargetArr) + ", dictMarriageState="
				+ dictMarriageState + ", sspDictMarriageTargetArr=" + Arrays.toString(sspDictMarriageTargetArr)
				+ ", dictIncomeState=" + dictIncomeState + ", sspDictIncomeTargetArr="
				+ Arrays.toString(sspDictIncomeTargetArr) + ", dictInterestsState=" + dictInterestsState
				+ ", interestsTargetArr=" + Arrays.toString(interestsTargetArr) + ", dictBuyState=" + dictBuyState
				+ ", buyTargetArr=" + Arrays.toString(buyTargetArr) + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", deleteState=" + deleteState + "]";
	}

}
package com.unioncast.common.ip;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : wangyao
 * @Date ：2016年11月16日 下午7:52:02
 * 
 *
 */
@MyTable("common_ip")
public class IpAreaInfo implements Serializable {

	private static final long serialVersionUID = 2181326050518338481L;
	public static String PROPERTIES = "id, ip_start, ip_end, ip_start_num, ip_end_num,continent,country,province,city,district,isp,area_code,country_english,country_code,longitude,latitude,province_id,city_id,update_time";
	public static String TABLE_NAME = "common_ip";
	// 主键ID
	@MyId
	@MyColumn("id")
	private Long id;

	// ip起始段
	@MyColumn("ip_start")
	private String ipStart;

	// ip结束段
	@MyColumn("ip_end")
	private String ipEnd;

	// ip数字起始段
	@MyColumn("ip_start_num")
	private Long ipStartNum;

	// ip数字结束段
	@MyColumn("ip_end_num")
	private Long ipEndNum;

	// 大洲
	@MyColumn("continent")
	private String continent;

	// 国家
	@MyColumn("country")
	private String country;

	// 省份
	@MyColumn("province")
	private String province;

	// 城市
	@MyColumn("city")
	private String city;

	// 县区
	@MyColumn("district")
	private String district;

	// 运营商
	@MyColumn("isp")
	private String isp;

	// 区划代码
	@MyColumn("area_code")
	private String areaCode;

	// 国家英文名称
	@MyColumn("country_english")
	private String countryEnglish;

	// 国家简码
	@MyColumn("country_code")
	private String countryCode;

	// 经度
	@MyColumn("longitude")
	private String longitude;

	// 纬度
	@MyColumn("latitude")
	private String latitude;

	// 省id
	@MyColumn("province_id")
	private Long provinceId;

	// 城市id
	@MyColumn("city_id")
	private Long cityId;

	// 更新时间
	@MyColumn("update_time")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIpStart() {
		return ipStart;
	}

	public void setIpStart(String ipStart) {
		this.ipStart = ipStart;
	}

	public String getIpEnd() {
		return ipEnd;
	}

	public void setIpEnd(String ipEnd) {
		this.ipEnd = ipEnd;
	}

	public Long getIpStartNum() {
		return ipStartNum;
	}

	public void setIpStartNum(Long ipStartNum) {
		this.ipStartNum = ipStartNum;
	}

	public Long getIpEndNum() {
		return ipEndNum;
	}

	public void setIpEndNum(Long ipEndNum) {
		this.ipEndNum = ipEndNum;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCountryEnglish() {
		return countryEnglish;
	}

	public void setCountryEnglish(String countryEnglish) {
		this.countryEnglish = countryEnglish;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public IpAreaInfo(Long id, String ipStart, String ipEnd, Long ipStartNum, Long ipEndNum, String continent, String country, String province, String city, String district, String isp, String areaCode, String countryEnglish, String countryCode, String longitude, String latitude, Long provinceId, Long cityId, Date updateTime) {
		this.id = id;
		this.ipStart = ipStart;
		this.ipEnd = ipEnd;
		this.ipStartNum = ipStartNum;
		this.ipEndNum = ipEndNum;
		this.continent = continent;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.isp = isp;
		this.areaCode = areaCode;
		this.countryEnglish = countryEnglish;
		this.countryCode = countryCode;
		this.longitude = longitude;
		this.latitude = latitude;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.updateTime = updateTime;
	}

	public IpAreaInfo() {
	}

	@Override
	public String toString() {
		return "IpAreaInfo{" +
				"id=" + id +
				", ipStart='" + ipStart + '\'' +
				", ipEnd='" + ipEnd + '\'' +
				", ipStartNum=" + ipStartNum +
				", ipEndNum=" + ipEndNum +
				", continent='" + continent + '\'' +
				", country='" + country + '\'' +
				", province='" + province + '\'' +
				", city='" + city + '\'' +
				", district='" + district + '\'' +
				", isp='" + isp + '\'' +
				", areaCode='" + areaCode + '\'' +
				", countryEnglish='" + countryEnglish + '\'' +
				", countryCode='" + countryCode + '\'' +
				", longitude='" + longitude + '\'' +
				", latitude='" + latitude + '\'' +
				", provinceId=" + provinceId +
				", cityId=" + cityId +
				", updateTime=" + updateTime +
				'}';
	}
}

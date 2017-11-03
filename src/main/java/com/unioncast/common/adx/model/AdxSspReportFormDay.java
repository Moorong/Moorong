package com.unioncast.common.adx.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ADX-SSP 报表按天
 * <p>
 * 对应的表：adx_ssp_report_form_day
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>media_type(int)</li>
 * <li>size(varchar)</li>
 * <li>show_num(varchar)</li>
 * <li>click_rate(double)</li>
 * <li>thousand_show_price(double)</li>
 * <li>average_click_price(double)</li>
 * <li>income(double)</li>
 * <li>date_time(datetime)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @pdOid 77a8dd1c-111b-4d04-b548-d68bf1681edb
 */
public class AdxSspReportFormDay implements Serializable {

	public static final String PROPERTIES = "id,media_type,size,show_num,click_rate,thousand_show_price,average_click_price,income,date_time,remarks,update_time";
	public static final String TABLE_NAME = "adx_ssp_report_form_day";
	private static final long serialVersionUID = -7428869694957837985L;
	/** @pdOid a7a69dd3-2d36-414c-b518-6aa984dade65 */
	private Long id;
	/**
	 * 媒体类型
	 * 
	 * @pdOid 2c1c2a51-ac4e-4a06-a390-5d6851ac4441
	 */
	private Integer mediaType;
	/**
	 * 尺寸
	 * 
	 * @pdOid 660d4d42-e33c-4939-9f35-60499264f55b
	 */
	private String size;
	/**
	 * 展现次数
	 * 
	 * @pdOid 4d01a27f-d45d-4e94-af10-5129d327f863
	 */
	private String showNum;
	/**
	 * 点击率
	 * 
	 * @pdOid 1b6b6cce-4732-4e5b-ba8e-a38f1118f1bf
	 */
	private Double clickRate;
	/**
	 * 千次展现价格
	 * 
	 * @pdOid d9ed11f9-d02e-4b28-a9c8-7b820cebf3d0
	 */
	private Double thousandShowPrice;
	/**
	 * 平均点击价格
	 * 
	 * @pdOid 86a23d25-2abd-4380-af23-c67e362adf2d
	 */
	private Double averageClickPrice;
	/**
	 * 收入
	 * 
	 * @pdOid 44554be3-cec9-4a81-8a56-f4ed56ddebd0
	 */
	private Double income;
	/**
	 * 日期时间
	 * 
	 * @pdOid 1f6c85aa-5064-499d-9dab-7b57b9fadd12
	 */
	private Date dateTime;
	/**
	 * 冗余
	 * 
	 * @pdOid eff903c9-0f0a-471e-9012-2e641efbefa3
	 */
	private String remarks;

	/**
	 * 更新时间
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
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the showNum
	 */
	public String getShowNum() {
		return showNum;
	}

	/**
	 * @param showNum
	 *            the showNum to set
	 */
	public void setShowNum(String showNum) {
		this.showNum = showNum;
	}

	/**
	 * @return the clickRate
	 */
	public Double getClickRate() {
		return clickRate;
	}

	/**
	 * @param clickRate
	 *            the clickRate to set
	 */
	public void setClickRate(Double clickRate) {
		this.clickRate = clickRate;
	}

	/**
	 * @return the thousandShowPrice
	 */
	public Double getThousandShowPrice() {
		return thousandShowPrice;
	}

	/**
	 * @param thousandShowPrice
	 *            the thousandShowPrice to set
	 */
	public void setThousandShowPrice(Double thousandShowPrice) {
		this.thousandShowPrice = thousandShowPrice;
	}

	/**
	 * @return the averageClickPrice
	 */
	public Double getAverageClickPrice() {
		return averageClickPrice;
	}

	/**
	 * @param averageClickPrice
	 *            the averageClickPrice to set
	 */
	public void setAverageClickPrice(Double averageClickPrice) {
		this.averageClickPrice = averageClickPrice;
	}

	/**
	 * @return the income
	 */
	public Double getIncome() {
		return income;
	}

	/**
	 * @param income
	 *            the income to set
	 */
	public void setIncome(Double income) {
		this.income = income;
	}

	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime
	 *            the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
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

	@Override
	public String toString() {
		return "AdxSspReportFormDay [id=" + id + ", mediaType=" + mediaType + ", size=" + size + ", showNum=" + showNum
				+ ", clickRate=" + clickRate + ", thousandShowPrice=" + thousandShowPrice + ", averageClickPrice="
				+ averageClickPrice + ", income=" + income + ", dateTime=" + dateTime + ", remarks=" + remarks
				+ ", updateTime=" + updateTime + "]";
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		AdxSspReportFormDay entity = new AdxSspReportFormDay();
		mapper.writeValue(System.out, entity);
	}

}

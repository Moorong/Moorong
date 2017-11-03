package com.unioncast.common.adx.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * adx-ssp 报表-小时表 系统信息
 * <p>
 * 对应的表：adx_ssp_report_form_hour
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
 * <li>date(datetime)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @pdOid b76b9ae5-ea88-4bd0-adab-5758e150eb38
 */
public class AdxSspReportFormHour implements Serializable {

	public static final String PROPERTIES = "id,media_type,size,show_num,click_rate,thousand_show_price,average_click_price,income,date,remarks,update_time";
	public static final String TABLE_NAME = "adx_ssp_report_form_hour";

	private static final long serialVersionUID = -8012518943730704023L;
	/**
	 * 报表id
	 * 
	 * @pdOid 0dc445af-78f6-4fd5-a845-697a16e328d6
	 */
	private Long id;
	/**
	 * 媒体类型
	 * 
	 * @pdOid 5d48fe3c-18a5-4459-ad84-8bd3d231b410
	 */
	private Integer mediaType;
	/**
	 * 尺寸
	 * 
	 * @pdOid d3228d2b-3fca-4981-b9f6-ecacc2a16d50
	 */
	private String size;
	/**
	 * 展现次数
	 * 
	 * @pdOid ab75f422-41f1-4eef-9451-de1cbd82245d
	 */
	private String showNum;
	/**
	 * 点击率
	 * 
	 * @pdOid 0bfe3557-d3bd-4e8f-a285-7f5a055718af
	 */
	private Double clickRate;
	/**
	 * 千次展现价格
	 * 
	 * @pdOid 544e6279-1c17-416f-9494-6ff061e47704
	 */
	private Double thousandShowPrice;
	/**
	 * 平均点击价格
	 * 
	 * @pdOid 0ac21760-5a99-493b-acae-a87e0bd73602
	 */
	private Double averageClickPrice;
	/**
	 * 收入
	 * 
	 * @pdOid 07125ac2-b4e1-40c8-9547-ec6f50a4962d
	 */
	private Double income;
	/**
	 * 日期
	 * 
	 * @pdOid c6a23039-fd3e-44a9-9055-9be8d326217e
	 */
	private Date date;
	/**
	 * 冗余
	 * 
	 * @pdOid 44d0bcf1-5a0c-4823-a5c0-5fdab2679338
	 */
	private String remarks;

	/**
	 * 更新日期
	 */
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMediaType() {
		return mediaType;
	}

	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getShowNum() {
		return showNum;
	}

	public void setShowNum(String showNum) {
		this.showNum = showNum;
	}

	public Double getClickRate() {
		return clickRate;
	}

	public void setClickRate(Double clickRate) {
		this.clickRate = clickRate;
	}

	public Double getThousandShowPrice() {
		return thousandShowPrice;
	}

	public void setThousandShowPrice(Double thousandShowPrice) {
		this.thousandShowPrice = thousandShowPrice;
	}

	public Double getAverageClickPrice() {
		return averageClickPrice;
	}

	public void setAverageClickPrice(Double averageClickPrice) {
		this.averageClickPrice = averageClickPrice;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		return "AdxSspReportFormHour [id=" + id + ", mediaType=" + mediaType + ", size=" + size + ", showNum=" + showNum
				+ ", clickRate=" + clickRate + ", thousandShowPrice=" + thousandShowPrice + ", averageClickPrice="
				+ averageClickPrice + ", income=" + income + ", date=" + date + ", remarks=" + remarks + ", updateTime="
				+ updateTime + "]";
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		AdxSspReportFormHour entity = new AdxSspReportFormHour();
		mapper.writeValue(System.out, entity);
	}

}

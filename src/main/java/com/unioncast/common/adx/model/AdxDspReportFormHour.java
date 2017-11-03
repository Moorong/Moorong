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
 * ADX-DSP-报表-小时表
 * <p>
 * 对应的表：adx_dsp_report_form_hour
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigInteger)</li>
 * <li>flow_type(Integer)</li>
 * <li>size(varchar)</li>
 * <li>show_num(varchar)</li>
 * <li>click_num(varchar)</li>
 * <li>click_rate(Double)</li>
 * <li>thousand_show_price(Double)</li>
 * <li>advertisers(varchar)</li>
 * <li>originality(varchar)</li>
 * <li>user_id(bigInteger)</li>
 * <li>date_time(datetime)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 *
 * @pdOid d3b9ec6b-3390-42be-9c54-93e1c7697a43
 */
@MyTable("adx_dsp_report_form_hour")
public class AdxDspReportFormHour implements Serializable {

    private static final long serialVersionUID = -2682849816475041694L;
    public static String PROPERTIES = "id,flow_type,size,show_num,click_num,click_rate,thousand_show_price,advertisers,originality,user_id,date_time,remarks,update_time";
    public static String TABLE_NAME = "adx_dsp_report_form_hour";
    public static String ID = "id";
    public static String FLOW_TYPE = "flow_type";
    public static String SIZE = "size";
    public static String SHOW_NUM = "show_num";
    public static String CLICK_NUM = "click_num";
    public static String CLICK_RATE = "click_rate";
    public static String THOUSAND_SHOW_PRICE = "thousand_show_price";
    public static String ADVERTISERS = "advertisers";
    public static String ORIGINALITY = "originality";
    public static String USER_ID = "user_id";
    public static String DATE_TIME = "date_time";
    public static String REMARKS = "remarks";
    public static String UPDATE_TIME = "update_time";

    /**
     * 报表id
     *
     * @pdOid 5328270a-c11b-486b-a3af-73b1322e85e8
     */
    @MyId
    @MyColumn("id")
    private Long id;
    /**
     * 流量类型
     *
     * @pdOid 1e8f61c2-0e19-47a5-9b81-0ac32ce9e401
     */
    @MyColumn("flow_type")
    private Integer flowType;
    /**
     * 尺寸
     *
     * @pdOid 5203f07a-e805-43e1-9a8c-18cc9f0b6d40
     */
    @MyColumn("size")
    private java.lang.String size;
    /**
     * 展现次数
     *
     * @pdOid 8ad63ae8-6b43-4fb0-9a64-5f44eec863e5
     */
    @MyColumn("show_num")
    private java.lang.String showNum;
    /**
     * 点击次数
     *
     * @pdOid a96aa7ef-8563-4723-b608-87ef1185fb32
     */
    @MyColumn("click_num")
    private java.lang.String clickNum;
    /**
     * 点击率
     *
     * @pdOid 0a659677-bc4c-4e5b-8c94-9a706c8cc521
     */
    @MyColumn("click_rate")
    private Double clickRate;
    /**
     * 千次展现价格
     *
     * @pdOid 8bfbfa46-e489-402f-a777-8e3609e2b383
     */
    @MyColumn("thousand_show_price")
    private Double thousandShowPrice;
    /**
     * 广告主
     *
     * @pdOid 29e5e593-b40e-4f65-8bf2-63eb34adf5c6
     */
    @MyColumn("advertisers")
    private java.lang.String advertisers;
    /**
     * 创意
     *
     * @pdOid 002b1e9b-c263-4c5f-9508-c9cc0a260aa0
     */
    @MyColumn("originality")
    private java.lang.String originality;
    /**
     * 用户ID
     *
     * @pdOid ad5d2718-4065-4ddf-b33c-94c055cca3f5
     */
    @MyColumn("user_id")
    private Long userId;
    /**
     * 日期时间
     *
     * @pdOid a577ce4b-25cc-4453-b2cb-69a9d4d83caa
     */
    @MyColumn("date_time")
    private java.util.Date dateTime;
    /**
     * 冗余
     *
     * @pdOid 9983a1ad-24f6-4c47-86ff-b21ebbfa1409
     */
    @MyColumn("remarks")
    private java.lang.String remarks;
    @MyColumn("update_time")
    private java.util.Date updateTime;

    public AdxDspReportFormHour() {
        super();
    }

    public AdxDspReportFormHour(Long id, Integer flowType, String size, String showNum, String clickNum,
                                Double clickRate, Double thousandShowPrice, String advertisers, String originality, Long userId,
                                Date dateTime, String remarks, Date updateTime) {
        super();
        this.id = id;
        this.flowType = flowType;
        this.size = size;
        this.showNum = showNum;
        this.clickNum = clickNum;
        this.clickRate = clickRate;
        this.thousandShowPrice = thousandShowPrice;
        this.advertisers = advertisers;
        this.originality = originality;
        this.userId = userId;
        this.dateTime = dateTime;
        this.remarks = remarks;
        this.updateTime = updateTime;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxDspReportFormHour entity = new AdxDspReportFormHour();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public java.lang.String getSize() {
        return size;
    }

    public void setSize(java.lang.String size) {
        this.size = size;
    }

    public java.lang.String getShowNum() {
        return showNum;
    }

    public void setShowNum(java.lang.String showNum) {
        this.showNum = showNum;
    }

    public java.lang.String getClickNum() {
        return clickNum;
    }

    public void setClickNum(java.lang.String clickNum) {
        this.clickNum = clickNum;
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

    public java.lang.String getAdvertisers() {
        return advertisers;
    }

    public void setAdvertisers(java.lang.String advertisers) {
        this.advertisers = advertisers;
    }

    public java.lang.String getOriginality() {
        return originality;
    }

    public void setOriginality(java.lang.String originality) {
        this.originality = originality;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public java.util.Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(java.util.Date dateTime) {
        this.dateTime = dateTime;
    }

    public java.lang.String getRemarks() {
        return remarks;
    }

    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AdxDspReportFormHour [id=" + id + ", flowType=" + flowType + ", size=" + size + ", showNum=" + showNum
                + ", clickNum=" + clickNum + ", clickRate=" + clickRate + ", thousandShowPrice=" + thousandShowPrice
                + ", advertisers=" + advertisers + ", originality=" + originality + ", userId=" + userId + ", dateTime="
                + dateTime + ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
    }

}

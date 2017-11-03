package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther wangyao
 * @date 2017-04-24 19:22
 */
@MyTable("ssp_pricing_granularity")
public class SspPricingGranularity implements Serializable {

    public static String PROPERTIES = "id, app_info_id, ad_position_id, kpi, price_type, price_start_time, price_end_time, app_price, ad_position_price, delete_state,create_time,update_time";
    public static String TABLE_NAME = "ssp_pricing_granularity";
    @MyId("id")
    @MyColumn("id")
    private Long id;

    @MyColumn("app_info_id")
    private SspAppInfo sspAppInfo;
    @MyColumn("ad_position_id")
    private SspAdPositionInfo sspAdPositionInfo;

    @MyColumn("kpi")
    private Long kpi;

    @MyColumn("price_type")
    private Long priceType;

    @MyColumn("price_start_time")
    private Date priceStartTime;
    @MyColumn("price_end_time")
    private Date priceEndTime;

    @MyColumn("unified_price")
    private Double unifiedPrice;
    @MyColumn("ad_position_price")
    private Double adPositionPrice;
    @MyColumn("delete_state")
    private int deleteState;

    @MyColumn("create_time")
    private Date createTime;
    @MyColumn("update_time")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SspAppInfo getSspAppInfo() {
        return sspAppInfo;
    }

    public void setSspAppInfo(SspAppInfo sspAppInfo) {
        this.sspAppInfo = sspAppInfo;
    }

    public SspAdPositionInfo getSspAdPositionInfo() {
        return sspAdPositionInfo;
    }

    public void setSspAdPositionInfo(SspAdPositionInfo sspAdPositionInfo) {
        this.sspAdPositionInfo = sspAdPositionInfo;
    }

    public Long getKpi() {
        return kpi;
    }

    public void setKpi(Long kpi) {
        this.kpi = kpi;
    }

    public Long getPriceType() {
        return priceType;
    }

    public void setPriceType(Long priceType) {
        this.priceType = priceType;
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

    public Double getAdPositionPrice() {
        return adPositionPrice;
    }

    public void setAdPositionPrice(Double adPositionPrice) {
        this.adPositionPrice = adPositionPrice;
    }

    public int getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(int deleteState) {
        this.deleteState = deleteState;
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
        return "SspPricingGranularity{" +
                "id=" + id +
                ", sspAppInfo=" + sspAppInfo +
                ", sspAdPositionInfo=" + sspAdPositionInfo +
                ", kpi=" + kpi +
                ", priceType=" + priceType +
                ", priceStartTime=" + priceStartTime +
                ", priceEndTime=" + priceEndTime +
                ", unifiedPrice=" + unifiedPrice +
                ", adPositionPrice=" + adPositionPrice +
                ", deleteState=" + deleteState +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public SspPricingGranularity(Long id, SspAppInfo sspAppInfo, SspAdPositionInfo sspAdPositionInfo, Long kpi, Long priceType, Date priceStartTime, Date priceEndTime, Double unifiedPrice, Double adPositionPrice, int deleteState, Date createTime, Date updateTime) {
        this.id = id;
        this.sspAppInfo = sspAppInfo;
        this.sspAdPositionInfo = sspAdPositionInfo;
        this.kpi = kpi;
        this.priceType = priceType;
        this.priceStartTime = priceStartTime;
        this.priceEndTime = priceEndTime;
        this.unifiedPrice = unifiedPrice;
        this.adPositionPrice = adPositionPrice;
        this.deleteState = deleteState;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SspPricingGranularity() {
    }
}

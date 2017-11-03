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
 * ADX_SSP-广告位
 * <p>
 * 对应的表：adx_ssp_advertising_position
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>ad_name(varchar)</li>
 * <li>application_industry(bigint)</li>
 * <li>ad_type(int)</li>
 * <li>ad_position(int)</li>
 * <li>audit_status(int)</li>
 * <li>ad_form(int)</li>
 * <li>owned_media(int)</li>
 * <li>description(varchar)</li>
 * <li>create_time(datetime)</li>
 * <li>load_mode(int)</li>
 * <li>floor_price(int)</li>
 * <li>remarks(varchar)</li>
 * <li>app_or_web_id(varchar)</li>
 * <li>slotId(varchar)</li>
 * <li>width(int)</li>
 * <li>height(int)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 *
 * @pdOid 9c78f502-eae5-4fac-89ab-32ea91b5564a
 */
@MyTable("adx_ssp_advertising_position")
public class AdxSspAdvertisingPosition implements Serializable {

    private static final long serialVersionUID = 6090301854403004278L;
    public static String PROPERTIES = "id,ad_name,application_industry,ad_type,ad_position,audit_status,ad_form,owned_media,description,create_time,load_mode,floor_price,remarks,app_or_web_id,slot_id,width,height,update_time";
    public static String TABLE_NAME = "adx_ssp_advertising_position";
    public static String ID = "id";
    public static String AD_NAME = "ad_name";
    public static String APPLICATION_INDUSTRY = "application_industry";
    public static String AD_TYPE = "ad_type";
    public static String AD_POSITION = "ad_position";
    public static String AUDIT_STATUS = "audit_status";
    public static String AD_FORM = "ad_form";
    public static String OWNED_MEDIA = "owned_media";
    public static String DESCRIPTION = "description";
    public static String CREATE_TIME = "create_time";
    public static String LOAD_MODE = "load_mode";
    public static String FLOOR_PRICE = "floor_price";
    public static String REMARKS = "remarks";
    public static String APP_OR_WEB_ID = "app_or_web_id";
    public static String SLOT_ID = "slot_id";
    public static String WIDTH = "width";
    public static String HEIGHT = "height";
    public static String UPDATE_TIME = "update_time";
    /**
     * 广告位id
     *
     * @pdOid ca0389bf-3af8-455a-ab99-02912cab472c
     */
    @MyId
    @MyColumn("id")
    private Long id;
    /**
     * 广告位名称
     *
     * @pdOid fb154858-ad1e-47ca-ac91-cfc1d163127a
     */
    @MyColumn("ad_name")
    private String adName;
    /**
     * 所属应用或行业
     *
     * @pdOid fcafb093-6a5a-42f6-b22b-451970adff5c
     */
    @MyColumn("application_industry")
    private Long applicationIndustry;
    /**
     * 广告位类型
     *
     * @pdOid 0f2e1d1c-6de7-4dea-ba41-b7d79a5686b2
     */
    @MyColumn("ad_type")
    private Integer adType;
    /**
     * 广告位位置
     *
     * @pdOid 0aac8ab2-d5b3-4db4-bbe5-f97dbb686af3
     */
    @MyColumn("ad_position")
    private Integer adPosition;
    /**
     * 审核状态
     *
     * @pdOid 44428ee4-0f49-4b65-9ed0-9c1f20eb6ae5
     */
    @MyColumn("audit_status")
    private Integer auditStatus;
    /**
     * 广告位形式(图片/文字链)
     *
     * @pdOid a09a3fc0-edc3-407e-a0db-8c9080e1338c
     */
    @MyColumn("ad_form")
    private Integer adForm;
    /**
     * 所属媒体
     *
     * @pdOid 42f999f6-36d7-4aec-8f86-dedb43ff2fc7
     */
    @MyColumn("owned_media")
    private Integer ownedMedia;

    /**
     * 广告位描述
     */
    @MyColumn("description")
    private String description;

    /**
     * 创建时间
     */
    @MyColumn("create_time")
    private Date createTime;

    @MyColumn("load_mode")
    private Integer loadMode;
    /**
     * 底价
     *
     * @pdOid db48c472-1eab-42e0-aaad-b66b61749210
     */
    @MyColumn("floor_price")
    private Integer floorPrice;

    @MyColumn("remarks")
    private java.lang.String remarks;

    @MyColumn("app_or_web_id")
    private java.lang.String appOrWebId;

    @MyColumn("slot_id")
    private java.lang.String slotId;

    @MyColumn("width")
    private Integer width;

    @MyColumn("height")
    private Integer height;

    @MyColumn("update_time")
    private java.util.Date updateTime;

    public AdxSspAdvertisingPosition() {
        super();
    }

    public AdxSspAdvertisingPosition(Long id, String adName, Long applicationIndustry, Integer adType, Integer adPosition, Integer auditStatus, Integer adForm, Integer ownedMedia, String description, Date createTime, Integer loadMode, Integer floorPrice, String remarks, String appOrWebId, String slotId, Integer width, Integer height, Date updateTime) {
        this.id = id;
        this.adName = adName;
        this.applicationIndustry = applicationIndustry;
        this.adType = adType;
        this.adPosition = adPosition;
        this.auditStatus = auditStatus;
        this.adForm = adForm;
        this.ownedMedia = ownedMedia;
        this.description = description;
        this.createTime = createTime;
        this.loadMode = loadMode;
        this.floorPrice = floorPrice;
        this.remarks = remarks;
        this.appOrWebId = appOrWebId;
        this.slotId = slotId;
        this.width = width;
        this.height = height;
        this.updateTime = updateTime;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxSspAdvertisingPosition entity = new AdxSspAdvertisingPosition();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public Long getApplicationIndustry() {
        return applicationIndustry;
    }

    public void setApplicationIndustry(Long applicationIndustry) {
        this.applicationIndustry = applicationIndustry;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public Integer getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(Integer adPosition) {
        this.adPosition = adPosition;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getAdForm() {
        return adForm;
    }

    public void setAdForm(Integer adForm) {
        this.adForm = adForm;
    }

    public Integer getOwnedMedia() {
        return ownedMedia;
    }

    public void setOwnedMedia(Integer ownedMedia) {
        this.ownedMedia = ownedMedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLoadMode() {
        return loadMode;
    }

    public void setLoadMode(Integer loadMode) {
        this.loadMode = loadMode;
    }

    public Integer getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(Integer floorPrice) {
        this.floorPrice = floorPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAppOrWebId() {
        return appOrWebId;
    }

    public void setAppOrWebId(String appOrWebId) {
        this.appOrWebId = appOrWebId;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AdxSspAdvertisingPosition{" +
                "id=" + id +
                ", adName='" + adName + '\'' +
                ", applicationIndustry=" + applicationIndustry +
                ", adType=" + adType +
                ", adPosition=" + adPosition +
                ", auditStatus=" + auditStatus +
                ", adForm=" + adForm +
                ", ownedMedia=" + ownedMedia +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", loadMode=" + loadMode +
                ", floorPrice=" + floorPrice +
                ", remarks='" + remarks + '\'' +
                ", appOrWebId='" + appOrWebId + '\'' +
                ", slotId='" + slotId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", updateTime=" + updateTime +
                '}';
    }

}

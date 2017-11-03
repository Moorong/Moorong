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
 * adx-dsp投放设置表
 * <p>
 * 对应的表：adx_dsp_delivery_setting
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>adx_or_ssp_id(bigint)</li>
 * <li>media_id(varchar)</li>
 * <li>dsp_id(bigint)</li>
 * <li>flow_percentage(double)</li>
 * <li>is_not_forward(int)</li>
 * <li>adx_manager_id(bigint)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 *
 * @pdOid 24255448-327a-4061-8964-8fb290473db9
 */
@MyTable("adx_dsp_delivery_setting")
public class AdxDspDeliverySetting implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2791185117573954433L;
    public static String PROPERTIES = "id,adx_or_ssp_id,media_id,dsp_id,flow_percentage,is_not_forward,adx_manager_id,remarks,update_time";
    public static String TABLE_NAME = "adx_dsp_delivery_setting";
    /**
     * 投放id
     *
     * @pdOid 79e3c9d7-53ce-4180-9d6f-de7364acabef
     */
    @MyId
    @MyColumn("id")
    private Long id;

    /**
     * 来源id
     *
     * @pdOid 572020d3-e5e9-4bc2-954b-b6bad081421a
     */
    @MyColumn("adx_or_ssp_id")
    private Long adxOrSspUserId;

    /**
     * 媒体id(媒体管理中appOrWebId)
     *
     * @pdOid d0cd0dad-9c70-4ab6-afe5-c596c5e5e186
     */
    @MyColumn("media_id")
    private String mediaId;

    /**
     * dspid(去处)
     *
     * @pdOid 5b546481-4a4e-4ac9-927f-af2c31558e37
     */
    @MyColumn("dsp_id")
    private Long dspId;

    /**
     * 流量百分比
     *
     * @pdOid 5daa7848-0d62-40e2-a31b-96faf9f870ca
     */
    @MyColumn("flow_percentage")
    private Double flowPercentage;
    /**
     * 是否转发
     *
     * @pdOid cc77b7eb-f618-4c6c-a245-613024a8c779
     */
    @MyColumn("is_not_forward")
    private Integer isNotForward;
    /**
     * 用户id
     *
     * @pdOid dc375b89-be83-43b3-8c94-0aabdb46b0f0
     */
    @MyColumn("adx_manager_id")
    private Long adxManagerId;

    /**
     * 冗余
     *
     * @pdOid dbd70298-9ca5-4be6-81a0-4ab6f2e3f57e
     */
    @MyColumn("remarks")
    private String remarks;
    @MyColumn("update_time")
    private Date updateTime;

    public AdxDspDeliverySetting() {

    }

    public AdxDspDeliverySetting(Long id, Long adxOrSspUserId, String mediaId,
                                 Long dspId, Double flowPercentage, Integer isNotForward,
                                 Long adxManagerId, String remarks, Date updateTime) {
        super();
        this.id = id;
        this.adxOrSspUserId = adxOrSspUserId;
        this.mediaId = mediaId;
        this.dspId = dspId;
        this.flowPercentage = flowPercentage;
        this.isNotForward = isNotForward;
        this.adxManagerId = adxManagerId;
        this.remarks = remarks;
        this.updateTime = updateTime;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxDspDeliverySetting entity = new AdxDspDeliverySetting();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdxOrSspUserId() {
        return adxOrSspUserId;
    }

    public void setAdxOrSspUserId(Long adxOrSspUserId) {
        this.adxOrSspUserId = adxOrSspUserId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public Long getDspId() {
        return dspId;
    }

    public void setDspId(Long dspId) {
        this.dspId = dspId;
    }

    public Double getFlowPercentage() {
        return flowPercentage;
    }

    public void setFlowPercentage(Double flowPercentage) {
        this.flowPercentage = flowPercentage;
    }

    public Integer getIsNotForward() {
        return isNotForward;
    }

    public void setIsNotForward(Integer isNotForward) {
        this.isNotForward = isNotForward;
    }

    public Long getAdxManagerId() {
        return adxManagerId;
    }

    public void setAdxManagerId(Long adxManagerId) {
        this.adxManagerId = adxManagerId;
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
        return "AdxDspDeliverySetting [id=" + id + ", adxOrSspUserId="
                + adxOrSspUserId + ", mediaId=" + mediaId + ", dspId=" + dspId
                + ", flowPercentage=" + flowPercentage + ", isNotForward="
                + isNotForward + ", adxManagerId=" + adxManagerId
                + ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
    }
}

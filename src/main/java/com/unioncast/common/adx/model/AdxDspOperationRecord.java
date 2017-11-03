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
 * adx-dsp操作记录表
 * <p>
 * 对应的表：adx_dsp_operation_record
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>operation_time(datetime)</li>
 * <li>operation_object(varchar)</li>
 * <li>flow_type(varchar)</li>
 * <li>operation_content(varchar)</li>
 * <li>before_operation(varchar)</li>
 * <li>after_operation(varbinary)</li>
 * <li>operation_persion(varchar)</li>
 * <li>operation_source(varchar)</li>
 * <li>operation_ip(varchar)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 *
 * @pdOid e920ea2c-5860-461d-a9be-363167d96c80
 */
@MyTable("adx_dsp_operation_record")
public class AdxDspOperationRecord implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6442552570785678378L;
    public static String PROPERTIES = "id,operation_time,operation_object,flow_type,operation_content,before_operation,after_operation,operation_persion,operation_source,operation_ip,remarks,update_time";
    public static String TABLE_NAME = "adx_dsp_operation_record";
    /**
     * 操作记录id
     *
     * @pdOid 7d84ff57-c791-4acf-a4e2-db7849285918
     */
    @MyId
    @MyColumn("id")
    private Long id;
    /**
     * 操作时间
     *
     * @pdOid 016fb08a-3666-429a-9a15-a2ca915e3857
     */
    @MyColumn("operation_time")
    private java.util.Date operationTime;
    /**
     * 操作对象
     *
     * @pdOid df2d0def-8060-42f1-8868-afc2eee4d38d
     */
    @MyColumn("operation_object")
    private java.lang.String operationObject;
    /**
     * 流量类型
     *
     * @pdOid 108d3ef3-6b92-4d8d-99ba-eec636e3d6da
     */
    @MyColumn("flow_type")
    private java.lang.String flowType;
    /**
     * 操作内容
     *
     * @pdOid 2b9b623e-c5f2-4dd0-82c0-b27e131c3135
     */
    @MyColumn("operation_content")
    private java.lang.String operationContent;
    /**
     * 操作前
     *
     * @pdOid 68cd4499-91c5-48b2-a4a8-630dcfb8ac7f
     */
    @MyColumn("before_operation")
    private java.lang.String beforeOperation;
    /**
     * 操作后
     *
     * @pdOid b9da59f1-e9fb-496b-a9ab-13385bf88e0a
     */
    @MyColumn("after_operation")
    private java.lang.String afterOperation;
    /**
     * 操作人员
     *
     * @pdOid 338a799b-1b4d-47ae-b907-4b5a8df3f032
     */
    @MyColumn("operation_persion")
    private java.lang.String operationPersion;
    /**
     * 操作来源
     *
     * @pdOid bd81ea43-1c29-4e39-909f-a8ef4d6cec2d
     */
    @MyColumn("operation_source")
    private java.lang.String operationSource;
    /**
     * 操作ip
     *
     * @pdOid fa3595ee-0624-42aa-b386-b61ab519dd06
     */
    @MyColumn("operation_ip")
    private java.lang.String operationIp;
    /**
     * 冗余
     *
     * @pdOid d264049b-9a89-4089-97b5-a1f72e728498
     */
    @MyColumn("remarks")
    private java.lang.String remarks;
    @MyColumn("update_time")
    private Date updateTime;

    public AdxDspOperationRecord() {
        super();
    }

    public AdxDspOperationRecord(Long id, Date operationTime, String operationObject, String flowType,
                                 String operationContent, String beforeOperation, String afterOperation, String operationPersion,
                                 String operationSource, String operationIp, String remarks, Date updateTime) {
        super();
        this.id = id;
        this.operationTime = operationTime;
        this.operationObject = operationObject;
        this.flowType = flowType;
        this.operationContent = operationContent;
        this.beforeOperation = beforeOperation;
        this.afterOperation = afterOperation;
        this.operationPersion = operationPersion;
        this.operationSource = operationSource;
        this.operationIp = operationIp;
        this.remarks = remarks;
        this.updateTime = updateTime;
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxDspOperationRecord entity = new AdxDspOperationRecord();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(java.util.Date operationTime) {
        this.operationTime = operationTime;
    }

    public java.lang.String getOperationObject() {
        return operationObject;
    }

    public void setOperationObject(java.lang.String operationObject) {
        this.operationObject = operationObject;
    }

    public java.lang.String getFlowType() {
        return flowType;
    }

    public void setFlowType(java.lang.String flowType) {
        this.flowType = flowType;
    }

    public java.lang.String getOperationContent() {
        return operationContent;
    }

    public void setOperationContent(java.lang.String operationContent) {
        this.operationContent = operationContent;
    }

    public java.lang.String getBeforeOperation() {
        return beforeOperation;
    }

    public void setBeforeOperation(java.lang.String beforeOperation) {
        this.beforeOperation = beforeOperation;
    }

    public java.lang.String getAfterOperation() {
        return afterOperation;
    }

    public void setAfterOperation(java.lang.String afterOperation) {
        this.afterOperation = afterOperation;
    }

    public java.lang.String getOperationPersion() {
        return operationPersion;
    }

    public void setOperationPersion(java.lang.String operationPersion) {
        this.operationPersion = operationPersion;
    }

    public java.lang.String getOperationSource() {
        return operationSource;
    }

    public void setOperationSource(java.lang.String operationSource) {
        this.operationSource = operationSource;
    }

    public java.lang.String getOperationIp() {
        return operationIp;
    }

    public void setOperationIp(java.lang.String operationIp) {
        this.operationIp = operationIp;
    }

    public java.lang.String getRemarks() {
        return remarks;
    }

    public void setRemarks(java.lang.String remarks) {
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
        return "AdxDspOperationRecord [id=" + id + ", operationTime=" + operationTime + ", operationObject="
                + operationObject + ", flowType=" + flowType + ", operationContent=" + operationContent
                + ", beforeOperation=" + beforeOperation + ", afterOperation=" + afterOperation + ", operationPersion="
                + operationPersion + ", operationSource=" + operationSource + ", operationIp=" + operationIp
                + ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
    }

}

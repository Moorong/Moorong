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
 * ADX-DSP财务账户
 * <p>
 * 对应的表：adx_dsp_financial_account
 * </p>
 * <p>
 * 所有的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>consume_or_recharge(double)</li>
 * <li>serial_number(varchar)</li>
 * <li>date_time(datetime)</li>
 * <li>state(int)</li>
 * <li>balance(double)</li>
 * <li>user_id(bigint)</li>
 * <li>remarks(varchar)</li>
 * <li>update_time(timestamp)</li>
 * <li>amount_of_money(double)</li>
 * </ul>
 * </p>
 *
 * @pdOid fce81a6c-3f18-4b9d-8f20-d430cee3db31
 */
@MyTable("adx_dsp_financial_account")
public class AdxDspFinancialAccount implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4220233118349940600L;
    public static String PROPERTIES = "id,consume_or_recharge,serial_number,date_time,state,balance,user_id,remarks,update_time,amount_of_money";
    public static String TABLE_NAME = "adx_dsp_financial_account";
    /**
     * 财务账户id
     *
     * @pdOid f8ecabc7-bd06-4916-a827-e80d6bbb6450
     */
    @MyId
    @MyColumn("id")
    private Long id;
    /**
     * 消耗/充值
     *
     * @pdOid c439e48e-267e-49ed-ba32-2541dedf3e0e
     */
    @MyColumn("consume_or_recharge")
    private Double consumeOrRecharge;
    /**
     * 流水号
     *
     * @pdOid 72fa3162-8b22-4457-bf54-ab531f7fa1a0
     */
    @MyColumn("serial_number")
    private java.lang.String serialNumber;
    /**
     * 日期
     *
     * @pdOid ec5ac3d0-4435-4df0-a914-0d292d52fd4a
     */
    @MyColumn("date_time")
    private java.util.Date dateTime;
    /**
     * 状态
     *
     * @pdOid d0859367-4b18-473a-ac04-53b08fc15814
     */
    @MyColumn("state")
    private Integer state;
    /**
     * 余额
     *
     * @pdOid c637362b-9248-4ad6-9f47-89f3f987c0b3
     */
    @MyColumn("balance")
    private Double balance;
    /**
     * dsp用户id
     *
     * @pdOid 4b9dc268-e774-454d-b4db-6bfdf308dee0
     */
    @MyColumn("user_id")
    private Long userId;
    /**
     * 冗余
     *
     * @pdOid 10164796-a953-47ce-a791-737f91ca4168
     */
    @MyColumn("remarks")
    private String remarks;
    @MyColumn("update_time")
    private Date updateTime;
    @MyColumn("amount_of_money")
    private Double amountOfMoney;

    public AdxDspFinancialAccount(Long id, Double consumeOrRecharge, String serialNumber, Date dateTime, Integer state, Double balance, Long userId, String remarks, Date updateTime, Double amountOfMoney) {
        this.id = id;
        this.consumeOrRecharge = consumeOrRecharge;
        this.serialNumber = serialNumber;
        this.dateTime = dateTime;
        this.state = state;
        this.balance = balance;
        this.userId = userId;
        this.remarks = remarks;
        this.updateTime = updateTime;
        this.amountOfMoney = amountOfMoney;
    }


    public AdxDspFinancialAccount() {
        super();
    }

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        AdxDspFinancialAccount entity = new AdxDspFinancialAccount();
        mapper.writeValue(System.out, entity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getConsumeOrRecharge() {
        return consumeOrRecharge;
    }

    public void setConsumeOrRecharge(Double consumeOrRecharge) {
        this.consumeOrRecharge = consumeOrRecharge;
    }

    public java.lang.String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public java.util.Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(java.util.Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "AdxDspFinancialAccount{" +
                "id=" + id +
                ", consumeOrRecharge=" + consumeOrRecharge +
                ", serialNumber='" + serialNumber + '\'' +
                ", dateTime=" + dateTime +
                ", state=" + state +
                ", balance=" + balance +
                ", userId=" + userId +
                ", remarks='" + remarks + '\'' +
                ", updateTime=" + updateTime +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

}

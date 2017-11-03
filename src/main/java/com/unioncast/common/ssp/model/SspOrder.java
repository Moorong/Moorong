package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单 ssp_order
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:30:36
 */
@MyTable("ssp_order")
public class SspOrder implements Serializable {

    private static final long serialVersionUID = -7155046384584772151L;
    public static String PROPERTIES = "id, account_id, advertiser_id,order_identifying, name, budget,total_amount, balance, contract_id,put_time_state, put_start_time, put_end_time,settlement_type, settlement_fee, service_fee_ratio, service_fee,agent_fee_ratio, agent_fee, single_period_show_times,show_calculation_type, single_show_times, click_calculation_type,single_click_times, daily_budget_cap, daily_show_cap,daily_click_cap, kpi,kpi_fee, keywords,comment, create_time, update_time,delete_state,ad_put_state,consumption_amount,open_state_plan_amount,count_plan_amount,click_num,exposure_num";
    public static String TABLE_NAME = "ssp_order";

    @MyId("id")
    @MyColumn("id")
    private Long id;

    @MyColumn("account_id")
    private User user;

    // 广告主
    @MyColumn("advertiser_id")
    private SspAdvertiser sspAdvertiser;

    // 订单唯一编号
    @MyColumn("order_identifying")
    private String orderIdentifying;

    // 订单名称
    @MyColumn("name")
    private String name;

    // 预算
    @MyColumn("budget")
    private Double budget;

    // 充值总金额
    @MyColumn("total_amount")
    private Double totalAmount;

    // 余额
    @MyColumn("balance")
    private Double balance;

    // 外部关联id--合同
    @MyColumn("contract_id")
    private String contractId;

    // 投放周期状态，1-限制，2-不限制
    @MyColumn("put_time_state")
    private Integer putTimeState;

    // 投放周期--开始时间
    @MyColumn("put_start_time")
    private Date putStartTime;

    // 投放周期--结束时间
    @MyColumn("put_end_time")
    private Date putEndTime;

    // 结算方式1-cpm，2-cpa，3-cpc，4-cpt，5-cpd
    @MyColumn("settlement_type")
    private Integer settlementType;

    // 结算金额
    @MyColumn("settlement_fee")
    private Double settlementFee;

    // 服务费比例
    @MyColumn("service_fee_ratio")
    private Double serviceFeeRatio;

    // 服务费实际金额
    @MyColumn("service_fee")
    private Double serviceFee;

    // 代理费比例
    @MyColumn("agent_fee_ratio")
    private Double agentFeeRatio;

    // 代理费实际金额
    @MyColumn("agent_fee")
    private Double agentFee;

    // 投放周期内单人曝光次数
    @MyColumn("single_period_show_times")
    private Long singlePeriodShowTimes;

    // 1-每人每天，2-每人每小时
    @MyColumn("show_calculation_type")
    private Integer showCalculationType;

    // 曝光不超过次数
    @MyColumn("single_show_times")
    private Long singleShowTimes;

    // 1-每人每天，2-每人每小时
    @MyColumn("click_calculation_type")
    private Integer clickCalculationType;

    // 点击不超过
    @MyColumn("single_click_times")
    private Long singleClickTimes;

    // 每日预算上限
    @MyColumn("daily_budget_cap")
    private Double dailyBudgetCap;

    // 每日曝光上限
    @MyColumn("daily_show_cap")
    private Long dailyShowCap;

    // 每日点击上限
    @MyColumn("daily_click_cap")
    private Long dailyClickCap;

    // kpi设置,1-cpa,2-cpc,3-cpm
    @MyColumn("kpi")
    private Integer kpi;

    // kpi金额
    @MyColumn("kpi_fee")
    private Double kpiFee;

    // 关键词
    @MyColumn("keywords")
    private String keywords;

    @MyColumn("comment")
    private String comment;

    @MyColumn("create_time")
    private Date createTime;

    @MyColumn("update_time")
    private Date updateTime;

    // 删除状态，1-未删除，2-已删除
    @MyColumn("delete_state")
    private Integer deleteState;

    // 订单状态 1-开，2-关
    @MyColumn("ad_put_state")
    private Integer adPutState;

    // 消耗金额
    @MyColumn("consumption_amount")
    private Double consumptionAmount;

    //状态开启的可执行计划总数
    @MyColumn("open_state_plan_amount")
    private Integer openStatePlanAmount;

    //所有可执行计划
    @MyColumn("count_plan_amount")
    private Integer countPlanAmount;

    //点击次数
    @MyColumn("click_num")
    private Long clickNum;

    //展现次数（曝光）
    @MyColumn("exposure_num")
    private Long exposureNum;

    public SspOrder() {
    }

    public SspOrder(Long id, User user, SspAdvertiser sspAdvertiser,
                    String orderIdentifying, String name, Double budget,
                    Double totalAmount, Double balance, String contractId,
                    Integer putTimeState, Date putStartTime, Date putEndTime,
                    Integer settlementType, Double settlementFee, Double serviceFeeRatio, Double serviceFee,
                    Double agentFeeRatio, Double agentFee, Long singlePeriodShowTimes,
                    Integer showCalculationType, Long singleShowTimes,
                    Integer clickCalculationType, Long singleClickTimes,
                    Double dailyBudgetCap, Long dailyShowCap, Long dailyClickCap,
                    Integer kpi, Double kpiFee, String keywords, String comment,
                    Date createTime, Date updateTime, Integer deleteState,
                    Integer adPutState, Double consumptionAmount, Integer openStatePlanAmount, Integer countPlanAmount,Long clickNum,Long exposureNum) {
        this.id = id;
        this.user = user;
        this.sspAdvertiser = sspAdvertiser;
        this.orderIdentifying = orderIdentifying;
        this.name = name;
        this.budget = budget;
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.contractId = contractId;
        this.putTimeState = putTimeState;
        this.putStartTime = putStartTime;
        this.putEndTime = putEndTime;
        this.settlementType = settlementType;
        this.settlementFee = settlementFee;
        this.serviceFeeRatio = serviceFeeRatio;
        this.serviceFee = serviceFee;
        this.agentFeeRatio = agentFeeRatio;
        this.agentFee = agentFee;
        this.singlePeriodShowTimes = singlePeriodShowTimes;
        this.showCalculationType = showCalculationType;
        this.singleShowTimes = singleShowTimes;
        this.clickCalculationType = clickCalculationType;
        this.singleClickTimes = singleClickTimes;
        this.dailyBudgetCap = dailyBudgetCap;
        this.dailyShowCap = dailyShowCap;
        this.dailyClickCap = dailyClickCap;
        this.kpi = kpi;
        this.kpiFee = kpiFee;
        this.keywords = keywords;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteState = deleteState;
        this.adPutState = adPutState;
        this.consumptionAmount = consumptionAmount;
        this.openStatePlanAmount = openStatePlanAmount;
        this.countPlanAmount = countPlanAmount;
        this.clickNum = clickNum;
        this.exposureNum = exposureNum;
    }

    public Double getSettlementFee() {
        return settlementFee;
    }

    public void setSettlementFee(Double settlementFee) {
        this.settlementFee = settlementFee;
    }

    public Integer getAdPutState() {
        return adPutState;
    }

    public void setAdPutState(Integer adPutState) {
        this.adPutState = adPutState;
    }

    public Double getKpiFee() {
        return kpiFee;
    }

    public void setKpiFee(Double kpiFee) {
        this.kpiFee = kpiFee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SspAdvertiser getSspAdvertiser() {
        return sspAdvertiser;
    }

    public void setSspAdvertiser(SspAdvertiser sspAdvertiser) {
        this.sspAdvertiser = sspAdvertiser;
    }

    public String getOrderIdentifying() {
        return orderIdentifying;
    }

    public void setOrderIdentifying(String orderIdentifying) {
        this.orderIdentifying = orderIdentifying == null ? null
                : orderIdentifying.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public Date getPutStartTime() {
        return putStartTime;
    }

    public void setPutStartTime(Date putStartTime) {
        this.putStartTime = putStartTime;
    }

    public Date getPutEndTime() {
        return putEndTime;
    }

    public void setPutEndTime(Date putEndTime) {
        this.putEndTime = putEndTime;
    }

    public Double getServiceFeeRatio() {
        return serviceFeeRatio;
    }

    public void setServiceFeeRatio(Double serviceFeeRatio) {
        this.serviceFeeRatio = serviceFeeRatio;
    }

    public Double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Double getAgentFeeRatio() {
        return agentFeeRatio;
    }

    public void setAgentFeeRatio(Double agentFeeRatio) {
        this.agentFeeRatio = agentFeeRatio;
    }

    public Double getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(Double agentFee) {
        this.agentFee = agentFee;
    }

    public Long getSinglePeriodShowTimes() {
        return singlePeriodShowTimes;
    }

    public void setSinglePeriodShowTimes(Long singlePeriodShowTimes) {
        this.singlePeriodShowTimes = singlePeriodShowTimes;
    }

    public Long getSingleShowTimes() {
        return singleShowTimes;
    }

    public void setSingleShowTimes(Long singleShowTimes) {
        this.singleShowTimes = singleShowTimes;
    }

    public Long getSingleClickTimes() {
        return singleClickTimes;
    }

    public void setSingleClickTimes(Long singleClickTimes) {
        this.singleClickTimes = singleClickTimes;
    }

    public Double getDailyBudgetCap() {
        return dailyBudgetCap;
    }

    public void setDailyBudgetCap(Double dailyBudgetCap) {
        this.dailyBudgetCap = dailyBudgetCap;
    }

    public Long getDailyShowCap() {
        return dailyShowCap;
    }

    public void setDailyShowCap(Long dailyShowCap) {
        this.dailyShowCap = dailyShowCap;
    }

    public Long getDailyClickCap() {
        return dailyClickCap;
    }

    public void setDailyClickCap(Long dailyClickCap) {
        this.dailyClickCap = dailyClickCap;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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

    public Integer getPutTimeState() {
        return putTimeState;
    }

    public void setPutTimeState(Integer putTimeState) {
        this.putTimeState = putTimeState;
    }

    public Integer getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Integer settlementType) {
        this.settlementType = settlementType;
    }

    public Integer getShowCalculationType() {
        return showCalculationType;
    }

    public void setShowCalculationType(Integer showCalculationType) {
        this.showCalculationType = showCalculationType;
    }

    public Integer getClickCalculationType() {
        return clickCalculationType;
    }

    public void setClickCalculationType(Integer clickCalculationType) {
        this.clickCalculationType = clickCalculationType;
    }

    public Integer getKpi() {
        return kpi;
    }

    public void setKpi(Integer kpi) {
        this.kpi = kpi;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public Double getConsumptionAmount() {
        return consumptionAmount;
    }

    public void setConsumptionAmount(Double consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    public Integer getOpenStatePlanAmount() {
        return openStatePlanAmount;
    }

    public void setOpenStatePlanAmount(Integer openStatePlanAmount) {
        this.openStatePlanAmount = openStatePlanAmount;
    }

    public Integer getCountPlanAmount() {
        return countPlanAmount;
    }

    public void setCountPlanAmount(Integer countPlanAmount) {
        this.countPlanAmount = countPlanAmount;
    }

    public Long getClickNum() {
        return clickNum;
    }

    public void setClickNum(Long clickNum) {
        this.clickNum = clickNum;
    }

    public Long getExposureNum() {
        return exposureNum;
    }

    public void setExposureNum(Long exposureNum) {
        this.exposureNum = exposureNum;
    }
}
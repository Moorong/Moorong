package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 计划  ssp_plan
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:33:54
 */
@MyTable("ssp_plan")
public class SspPlan implements Serializable {
	
	private static final long serialVersionUID = -5595479358795023776L;
	
	public static String PROPERTIES = "id,account_id,advertiser_id,order_id,name,plan_identifying,plan_type,put_time_state,put_start_time,put_end_time,budget_state,budget,contract_id,single_period_show_times,show_calculation_type,single_show_times,click_calculation_type,single_click_times,daily_budget_cap,daily_show_cap,daily_click_cap,put_rhythm,kpi,highest_cpm,keywords,comment,is_plan_group,parent_plan_id,plan_target_condition_id,create_time,update_time,delete_state,level,state,children_num,consumption_amount,child_state_count";
	public static String TABLE_NAME = "ssp_plan";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	@MyColumn("account_id")
	private User user;

	//广告主
	@MyColumn("advertiser_id")
	private SspAdvertiser sspAdvertiser;

	//订单
	@MyColumn("order_id")
	private SspOrder sspOrder;

	//计划名称
	@MyColumn("name")
	private String name;

	//计划唯一编号
	@MyColumn("plan_identifying")
	private String planIdentifying;

	//计划类型1-rtb，2-pdb，3-直投
	@MyColumn("plan_type")
	private Long planType;

	//投放周期状态，1-限制，2-不限制
	@MyColumn("put_time_state")
	private Long putTimeState;

	//投放周期--开始时间
	@MyColumn("put_start_time")
	private Date putStartTime;

	//投放周期--结束时间
	@MyColumn("put_end_time")
	private Date putEndTime;

	//预算状态，1-限制，2-不限制
	@MyColumn("budget_state")
	private Long budgetState;

	//预算
	@MyColumn("budget")
	private Double budget;

	//外部关联id--合同
	@MyColumn("contract_id")
	private String contractId;

	//投放周期内单人曝光次数
	@MyColumn("single_period_show_times")
	private Long singlePeriodShowTimes;

	//1-每人每天，2-每人每小时
	@MyColumn("show_calculation_type")
	private Integer showCalculationType;

	//曝光不超过次数
	@MyColumn("single_show_times")
	private Long singleShowTimes;

	//1-每人每天，2-每人每小时
	@MyColumn("click_calculation_type")
	private Integer clickCalculationType;

	//点击不超过
	@MyColumn("single_click_times")
	private Long singleClickTimes;

	//每日预算上限
	@MyColumn("daily_budget_cap")
	private Double dailyBudgetCap;

	//每日曝光上限
	@MyColumn("daily_show_cap")
	private Long dailyShowCap;

	//每日点击上限
	@MyColumn("daily_click_cap")
	private Long dailyClickCap;

	//投放节奏，1-不限，2-曝光，3-预算
	@MyColumn("put_rhythm")
	private Integer putRhythm;

	//kpi设置,1-cpa,2-cpc,3-cpm
	@MyColumn("kpi")
	private Integer kpi;

	//最高cpm出价
	@MyColumn("highest_cpm")
	private Double highestCpm;

	@MyColumn("keywords")
	private String keywords;

	@MyColumn("comment")
	private String comment;

	//是否为计划组,1-是,2-否
	@MyColumn("is_plan_group")
	private Integer planGroupFlag;

	//关联父类id
	@MyColumn("parent_plan_id")
	private SspPlan parentPlan;

	//关联广告定向条件
	@MyColumn("plan_target_condition_id")
	private SspPlanTargetCondition sspPlanTargetCondition;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;

	//删除状态，1-未删除，2-已删除
	@MyColumn("delete_state")
	private Integer deleteState;
	
	@MyColumn("level")
	private Integer level;
	
	//1-开启 2-关闭
	@MyColumn("state")
	private Integer state;
	
	//所有子计划个数 0是没有
	@MyColumn("children_num")
	private Integer childrenNum;
	//开启状态的子计划个数
	@MyColumn("child_state_count")
	private Integer childStateCount;
	//消费金额
	@MyColumn("consumption_amount")
	private Double consumptionAmount ;
	public SspPlan() {
		super();
	}


	public SspPlan(Long id, User user, SspAdvertiser sspAdvertiser,
			SspOrder sspOrder, String name, String planIdentifying,
			Long planType, Long putTimeState, Date putStartTime,
			Date putEndTime, Long budgetState, Double budget,
			String contractId, Long singlePeriodShowTimes,
			Integer showCalculationType, Long singleShowTimes,
			Integer clickCalculationType, Long singleClickTimes,
			Double dailyBudgetCap, Long dailyShowCap, Long dailyClickCap,
			Integer putRhythm, Integer kpi, Double highestCpm, String keywords,
			String comment, Integer planGroupFlag, SspPlan parentPlan,
			SspPlanTargetCondition sspPlanTargetCondition, Date createTime,
			Date updateTime, Integer deleteState, Integer level, Integer state,
			Integer childrenNum, Integer childStateCount,
			Double consumptionAmount) {
		super();
		this.id = id;
		this.user = user;
		this.sspAdvertiser = sspAdvertiser;
		this.sspOrder = sspOrder;
		this.name = name;
		this.planIdentifying = planIdentifying;
		this.planType = planType;
		this.putTimeState = putTimeState;
		this.putStartTime = putStartTime;
		this.putEndTime = putEndTime;
		this.budgetState = budgetState;
		this.budget = budget;
		this.contractId = contractId;
		this.singlePeriodShowTimes = singlePeriodShowTimes;
		this.showCalculationType = showCalculationType;
		this.singleShowTimes = singleShowTimes;
		this.clickCalculationType = clickCalculationType;
		this.singleClickTimes = singleClickTimes;
		this.dailyBudgetCap = dailyBudgetCap;
		this.dailyShowCap = dailyShowCap;
		this.dailyClickCap = dailyClickCap;
		this.putRhythm = putRhythm;
		this.kpi = kpi;
		this.highestCpm = highestCpm;
		this.keywords = keywords;
		this.comment = comment;
		this.planGroupFlag = planGroupFlag;
		this.parentPlan = parentPlan;
		this.sspPlanTargetCondition = sspPlanTargetCondition;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.deleteState = deleteState;
		this.level = level;
		this.state = state;
		this.childrenNum = childrenNum;
		this.childStateCount = childStateCount;
		this.consumptionAmount = consumptionAmount;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPlanIdentifying() {
		return planIdentifying;
	}

	public void setPlanIdentifying(String planIdentifying) {
		this.planIdentifying = planIdentifying == null ? null : planIdentifying
				.trim();
	}

	public Long getPlanType() {
		return planType;
	}

	public void setPlanType(Long planType) {
		this.planType = planType;
	}

	public Long getPutTimeState() {
		return putTimeState;
	}

	public void setPutTimeState(Long putTimeState) {
		this.putTimeState = putTimeState;
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

	public Long getBudgetState() {
		return budgetState;
	}

	public void setBudgetState(Long budgetState) {
		this.budgetState = budgetState;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId == null ? null : contractId.trim();
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

	public Double getHighestCpm() {
		return highestCpm;
	}

	public void setHighestCpm(Double highestCpm) {
		this.highestCpm = highestCpm;
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

	public SspOrder getSspOrder() {
		return sspOrder;
	}

	public void setSspOrder(SspOrder sspOrder) {
		this.sspOrder = sspOrder;
	}
	
	public Integer getPlanGroupFlag() {
		return planGroupFlag;
	}

	public void setPlanGroupFlag(Integer planGroupFlag) {
		this.planGroupFlag = planGroupFlag;
	}

	public SspPlan getParentPlan() {
		return parentPlan;
	}

	public void setParentPlan(SspPlan parentPlan) {
		this.parentPlan = parentPlan;
	}

	public SspPlanTargetCondition getSspPlanTargetCondition() {
		return sspPlanTargetCondition;
	}

	public void setSspPlanTargetCondition(
			SspPlanTargetCondition sspPlanTargetCondition) {
		this.sspPlanTargetCondition = sspPlanTargetCondition;
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

	public Integer getPutRhythm() {
		return putRhythm;
	}

	public void setPutRhythm(Integer putRhythm) {
		this.putRhythm = putRhythm;
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getChildrenNum() {
		return childrenNum;
	}

	public void setChildrenNum(Integer childrenNum) {
		this.childrenNum = childrenNum;
	}

	public Integer getChildStateCount() {
		return childStateCount;
	}

	public void setChildStateCount(Integer childStateCount) {
		this.childStateCount = childStateCount;
	}

	public Double getConsumptionAmount() {
		return consumptionAmount;
	}

	public void setConsumptionAmount(Double consumptionAmount) {
		this.consumptionAmount = consumptionAmount;
	}
	
}
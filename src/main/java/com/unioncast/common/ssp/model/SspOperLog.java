package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作日志  ssp_oper_log
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:29:18
 */
@MyTable("ssp_oper_log")
public class SspOperLog implements Serializable {

	private static final long serialVersionUID = 8555061339670308242L;

	public static String PROPERTIES = "id, module, account_id, advertiser_id, advertiser_identifying, order_id, order_identifying, plan_id, plan_identifying, creative, operation ,create_time";
	public static String TABLE_NAME = "ssp_oper_log";
	@MyId("id")
	@MyColumn("id")
	private Long id;

	//[广告主]-》[订单]：宝马广告订单
	@MyColumn("module")
	private String module;
	@MyColumn("account_id")
	private User user;

	//广告主
	@MyColumn("advertiser_id")
	private SspAdvertiser sspAdvertiser;
	@MyColumn("advertiser_identifying")
	private String advertiserIdentifying;

	//订单
	@MyColumn("order_id")
	private SspOrder sspOrder;
	@MyColumn("order_identifying")
	private String orderIdentifying;

	//计划
	@MyColumn("plan_id")
	private SspPlan sspPlan;
	@MyColumn("plan_identifying")
	private String planIdentifying;

	//创意
	@MyColumn("creative")
	private SspCreative sspCreative;

	//操作内容
	@MyColumn("operation")
	private String operation;

	@MyColumn("create_time")
	private Date createTime;

    public SspOperLog() {
    }

    public SspOperLog(Long id, String module, User user, SspAdvertiser sspAdvertiser, String advertiserIdentifying,
					  SspOrder sspOrder, String orderIdentifying, SspPlan sspPlan, String planIdentifying,
					  SspCreative sspCreative, String operation,Date createTime) {
        this.id = id;
        this.module = module;
        this.user = user;
        this.sspAdvertiser = sspAdvertiser;
        this.advertiserIdentifying = advertiserIdentifying;
        this.sspOrder = sspOrder;
        this.orderIdentifying = orderIdentifying;
        this.sspPlan = sspPlan;
        this.planIdentifying = planIdentifying;
        this.sspCreative = sspCreative;
        this.operation = operation;
        this.createTime = createTime;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module == null ? null : module.trim();
	}

	public String getAdvertiserIdentifying() {
		return advertiserIdentifying;
	}

	public void setAdvertiserIdentifying(String advertiserIdentifying) {
		this.advertiserIdentifying = advertiserIdentifying == null ? null
				: advertiserIdentifying.trim();
	}

	public String getOrderIdentifying() {
		return orderIdentifying;
	}

	public void setOrderIdentifying(String orderIdentifying) {
		this.orderIdentifying = orderIdentifying == null ? null
				: orderIdentifying.trim();
	}

	public String getPlanIdentifying() {
		return planIdentifying;
	}

	public void setPlanIdentifying(String planIdentifying) {
		this.planIdentifying = planIdentifying == null ? null : planIdentifying
				.trim();
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation == null ? null : operation.trim();
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

	public SspPlan getSspPlan() {
		return sspPlan;
	}

	public void setSspPlan(SspPlan sspPlan) {
		this.sspPlan = sspPlan;
	}

	public SspCreative getSspCreative() {
		return sspCreative;
	}

	public void setSspCreative(SspCreative sspCreative) {
		this.sspCreative = sspCreative;
	}

	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
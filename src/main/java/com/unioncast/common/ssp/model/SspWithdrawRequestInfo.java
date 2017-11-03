package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 提现申请 ssp_withdraw_request_info
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:45:45
 */
@MyTable("ssp_withdraw_request_info")
public class SspWithdrawRequestInfo implements Serializable {

	private static final long serialVersionUID = -1046398630310944527L;

	public static String PROPERTIES = "id, account_id, preTax,tax,afterTax, state, create_time, update_time, finance_info_id, delete_state";
	public static String TABLE_NAME = "ssp_withdraw_request_info";
	@MyId("id")
	@MyColumn("id")
	private Long id;
	@MyColumn("account_id")
	private User user;

	// 税前
	@MyColumn("preTax")
	private Double preTax;
	// 代扣税
	@MyColumn("tax")
	private Double tax;
	// 税后
	@MyColumn("afterTax")
	private Double afterTax;

	// 提现状态 1-提现中，2-提现成功，3-提现失败
	@MyColumn("state")
	private Long state;
	@MyColumn("create_time")
	private Date createTime;
	@MyColumn("update_time")
	private Date updateTime;

	// 财务信息
	@MyColumn("finance_info_id")
	private SspFinanceInfo sspFinanceInfo;

	// 删除状态，1-未删除，2-已删除
	@MyColumn("delete_state")
	private Long deleteState;

	public SspWithdrawRequestInfo() {
	}

	public SspWithdrawRequestInfo(Long id, User user, Double preTax, Double tax, Double afterTax, Long state,
			Date createTime, Date updateTime, SspFinanceInfo sspFinanceInfo, Long deleteState) {
		super();
		this.id = id;
		this.user = user;
		this.preTax = preTax;
		this.tax = tax;
		this.afterTax = afterTax;
		this.state = state;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.sspFinanceInfo = sspFinanceInfo;
		this.deleteState = deleteState;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreTax() {
		return preTax;
	}

	public void setPreTax(Double preTax) {
		this.preTax = preTax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getAfterTax() {
		return afterTax;
	}

	public void setAfterTax(Double afterTax) {
		this.afterTax = afterTax;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
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

	public Long getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Long deleteState) {
		this.deleteState = deleteState;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SspFinanceInfo getSspFinanceInfo() {
		return sspFinanceInfo;
	}

	public void setSspFinanceInfo(SspFinanceInfo sspFinanceInfo) {
		this.sspFinanceInfo = sspFinanceInfo;
	}
}
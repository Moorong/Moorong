package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 计划与创意关联中间表 ssp_plan_creative_relation
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:37:19
 */
@MyTable("ssp_plan_creative_relation")
public class SspPlanCreativeRelation implements Serializable {
	
	private static final long serialVersionUID = -1238241610818763723L;
	public static String PROPERTIES = "id,plan_id,creater_id,create_time,update_time,creative_group,state,delete_state";
	public static String TABLE_NAME = "ssp_plan_creative_relation";
	
	@MyId("id")
	@MyColumn("id")
	private Long id;

	@MyColumn("plan_id")
	private SspPlan sspPlan;

	@MyColumn("creater_id")
	private SspCreative sspCreative;

	@MyColumn("create_time")
	private Date createTime;

	@MyColumn("update_time")
	private Date updateTime;
    @MyColumn("creative_group")
    private String creativeGroup; 
    
    @MyColumn("state")
    private Integer state;
    
    @MyColumn("delete_state")
    private Integer deleteState;
    
	public SspPlanCreativeRelation() {
	}

	public SspPlanCreativeRelation(Long id, SspPlan sspPlan,
			SspCreative sspCreative, Date createTime, Date updateTime,
			String creativeGroup , Integer state , Integer deleteState) {
		super();
		this.id = id;
		this.sspPlan = sspPlan;
		this.sspCreative = sspCreative;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.creativeGroup = creativeGroup;
		this.state = state;
		this.deleteState = deleteState;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreativeGroup() {
		return creativeGroup;
	}

	public void setCreativeGroup(String creativeGroup) {
		this.creativeGroup = creativeGroup;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}
}
/**
 * 
 */
package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.annotation.JoinColumn;
import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 字典表
 * <p>
 * 对应的表：common_sys_dic
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>dic_id(bigint)</li>
 * <li>dic_key(varchar)</li>
 * <li>dic_value(varchar)</li>
 * <li>parent_id(varchar)</li>
 * <li>dic_order(int)</li>
 * <li>can_update(int)</li>
 * <li>comments(varchar)</li>
 * <li>system_id(int)</li>
 * <li>update_time(timestamp)</li>
 * </ul>
 * </p>
 * 
 * @author juchaochao
 * @date 2016年11月8日 下午2:51:08
 *
 */
@MyTable("common_sys_dic")
public class SysDic implements Serializable {

	private static final long serialVersionUID = -3279825970934051880L;

	/**
	 * 主键id
	 */
	@MyId
	@MyColumn("dic_id")
	private Long dicId;

	/**
	 * 字典key
	 */
	@MyColumn("dic_key")
	private String dicKey;

	/**
	 * 字典值
	 */
	@MyColumn("dic_value")
	private String dicValue;

	/**
	 * 父字典
	 */
	// @ManyToOne //多对一的关联 fetch
	@JoinColumn("parent_id")
	private SysDic parentSysDic;

	/**
	 * 字典规则
	 */
	@MyColumn("dic_order")
	private Integer dicOrder;

	/**
	 * 更新
	 */
	@MyColumn("can_update")
	private Integer canUpdate;

	/**
	 * 评论
	 */
	@MyColumn("comments")
	private String comments;

	/**
	 * 区分系统标识
	 */
	@MyColumn("system_id")
	private Integer systemId;

	/**
	 * 更新时间
	 */
	@MyColumn("update_time")
	private Date updateTime;

	public Long getDicId() {
		return dicId;
	}

	public void setDicId(Long dicId) {
		this.dicId = dicId;
	}

	public String getDicKey() {
		return dicKey;
	}

	public void setDicKey(String dicKey) {
		this.dicKey = dicKey;
	}

	public String getDicValue() {
		return dicValue;
	}

	public void setDicValue(String dicValue) {
		this.dicValue = dicValue;
	}

	public SysDic getParentSysDic() {
		return parentSysDic;
	}

	public void setParentSysDic(SysDic parentSysDic) {
		this.parentSysDic = parentSysDic;
	}

	public Integer getDicOrder() {
		return dicOrder;
	}

	public void setDicOrder(Integer dicOrder) {
		this.dicOrder = dicOrder;
	}

	public Integer getCanUpdate() {
		return canUpdate;
	}

	public void setCanUpdate(Integer canUpdate) {
		this.canUpdate = canUpdate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "SysDic [dicId=" + dicId + ", dicKey=" + dicKey + ", dicValue=" + dicValue + ", parentSysDic="
				+ parentSysDic + ", dicOrder=" + dicOrder + ", canUpdate=" + canUpdate + ", comments=" + comments
				+ ", systemId=" + systemId + ", updateTime=" + updateTime + "]";
	}

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		SysDic dic = new SysDic();
		dic.setComments("testAdd");
		dic.setUpdateTime(new Date());
		try {
			System.out.println(mapper.writeValueAsString(new SysDic[] { dic }));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}

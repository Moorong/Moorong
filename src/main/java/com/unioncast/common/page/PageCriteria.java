package com.unioncast.common.page;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询条件
 * 
 * @author liutiejun
 * @param <T>
 * @param <T>
 * @date 2016年8月31日 上午11:48:15
 *
 */
public class PageCriteria implements Serializable {

	private static final long serialVersionUID = -5829941468724095504L;
	
	private Long currUserId;

	private Class<?> entityClass;

	/**
	 * 当前页号
	 */
	private Integer currentPageNo=1;

	/**
	 * 每页显示的最多记录数
	 */
	private Integer pageSize=10;

	/**
	 * 查询条件中各个字段的关系，AND、OR
	 */
	private Operation predicate;

	/**
	 * 查询条件
	 */
	private List<SearchExpression> searchExpressionList;

	/**
	 * 排序方式
	 */
	private List<OrderExpression> orderExpressionList;
	
	public Long getCurrUserId() {
		return currUserId;
	}

	public void setCurrUserId(Long currUserId) {
		this.currUserId = currUserId;
	}

	public Class<?> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<?> entityClass) {
		this.entityClass = entityClass;
	}

	public Integer getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(Integer currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Operation getPredicate() {
		return predicate;
	}

	public void setPredicate(Operation predicate) {
		this.predicate = predicate;
	}

	public List<SearchExpression> getSearchExpressionList() {
		return searchExpressionList;
	}

	public void setSearchExpressionList(List<SearchExpression> searchExpressionList) {
		this.searchExpressionList = searchExpressionList;
	}

	public List<OrderExpression> getOrderExpressionList() {
		return orderExpressionList;
	}

	public void setOrderExpressionList(List<OrderExpression> orderExpressionList) {
		this.orderExpressionList = orderExpressionList;
	}
	

	@Override
	public String toString() {
		return "PageCriteria [currUserId=" + currUserId + ", entityClass=" + entityClass + ", currentPageNo="
				+ currentPageNo + ", pageSize=" + pageSize + ", predicate=" + predicate + ", searchExpressionList="
				+ searchExpressionList + ", orderExpressionList=" + orderExpressionList + "]";
	}

	// public static void main(String[] args) throws JsonProcessingException {
	// PageCriteria criteria = new PageCriteria();
	// criteria.setEntityClass(SysDic.class);
	// criteria.setPredicate(Operation.AND);
	// List<SearchExpression> expressions = new ArrayList<>();
	// // expressions.add(new SearchExpression("dicId", 1L, Operation.EQ));
	// expressions.add(new SearchExpression("dicKey", "es", Operation.LIKE));
	// criteria.setSearchExpressionList(expressions);
	// ObjectMapper mapper = new ObjectMapper();
	// System.out.println(mapper.writeValueAsString(criteria));
	// }
}

package com.unioncast.common.page;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 用于分页显示数据
 * 
 * @author liutiejun
 * @date 2015年6月1日 下午1:04:54
 *
 * @param <T>
 */
public class Pagination<T> implements Serializable {

	private static final long serialVersionUID = -5261756891229264182L;

	/** 每一页默认显示最多10条数据 */
	private static final int DEFAULT_PAGE_SIZE = 10;

	/** 最多显示10个分页链接 */
	private static final int MAX_PAGE_LEN = 10;

	/** 总记录数 */
	private int totalCount;

	/** 每页显示的最多记录数 */
	private int pageSize;

	/** 总页数 */
	private int totalPage;

	/** 最多显示多少页, 用来限制要显示的页数 */
	private int maxPage;

	/** 当前页号 */
	private int currentPageNo;

	/** 上一页 */
	private int prePageNo;

	/** 下一页 */
	private int nextPageNo;

	/** 是否第一页 */
	private boolean firstPage;

	/** 是否最后一页 */
	private boolean lastPage;

	/** 分页链接对应的pageNo */
	private int[] pageNoArray;

	/** 当前页的数据 */
	private T[] dataArray;

	public Pagination() {
		super();
	}

	public Pagination(Integer totalCount, Integer pageSize, Integer currentPageNo, T[] dataArray) {
		this(totalCount, pageSize, -1, currentPageNo, dataArray);
	}

	public Pagination(Integer totalCount, Integer pageSize, Integer maxPage, Integer currentPageNo, T[] dataArray) {
		super();

		adjust(totalCount, pageSize, maxPage, currentPageNo);

		this.dataArray = dataArray;
	}

	/**
	 * 调整分页参数
	 * 
	 * @author liutiejun
	 * @date 2015年6月1日 上午11:48:11
	 *
	 * @param totalCount
	 * @param pageSize
	 * @param maxPage
	 * @param currentPageNo
	 */
	private void adjust(Integer totalCount, Integer pageSize, Integer maxPage, Integer currentPageNo) {
		// set totalCount
		if (totalCount == null || totalCount <= 0) {
			totalCount = 0;
		}
		this.totalCount = totalCount;

		// set pageSize
		if (pageSize == null || pageSize <= 0) {
			pageSize = DEFAULT_PAGE_SIZE;
		}
		this.pageSize = pageSize;

		// set maxPage and totalPage
		this.totalPage = this.totalCount / this.pageSize;
		if (this.totalCount % this.pageSize > 0) {
			this.totalPage++;
		}

		if (maxPage == null || maxPage <= 0 || maxPage > this.totalPage) {
			maxPage = this.totalPage;
		}
		this.maxPage = maxPage;
		this.totalPage = maxPage;

		// set currentPageNo
		if (currentPageNo == null || currentPageNo <= 0) {
			currentPageNo = 1;
		} else if (currentPageNo > this.totalPage) {
			currentPageNo = this.totalPage;
		}
		this.currentPageNo = currentPageNo;

		// set prePageNo
		this.prePageNo = this.currentPageNo - 1;
		if (this.prePageNo <= 0) {
			this.prePageNo = 1;
		}

		// set nextPageNo
		this.nextPageNo = this.currentPageNo + 1;
		if (this.nextPageNo > this.totalPage) {
			this.nextPageNo = this.totalPage;
		}

		// set firstPage and lastPage
		this.firstPage = this.currentPageNo <= 1;
		this.lastPage = this.currentPageNo >= this.totalPage;

		// set pageNoArray
		int startPageNo = this.currentPageNo - MAX_PAGE_LEN / 2;
		if (startPageNo <= 0) {
			startPageNo = 1;
		}
		if (this.totalPage - startPageNo < MAX_PAGE_LEN - 1) {
			startPageNo = this.totalPage - MAX_PAGE_LEN + 1;
		}
		if (startPageNo <= 0) {
			startPageNo = 1;
		}

		int endPageNo = startPageNo + MAX_PAGE_LEN - 1;
		if (endPageNo > this.totalPage) {
			endPageNo = this.totalPage;
		}

		this.pageNoArray = new int[endPageNo - startPageNo + 1];
		for (int i = 0; i < this.pageNoArray.length; i++) {
			this.pageNoArray[i] = startPageNo + i;
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public int getPrePageNo() {
		return prePageNo;
	}

	public void setPrePageNo(int prePageNo) {
		this.prePageNo = prePageNo;
	}

	public int getNextPageNo() {
		return nextPageNo;
	}

	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}

	public boolean isFirstPage() {
		return firstPage;
	}

	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}

	public boolean isLastPage() {
		return lastPage;
	}

	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}

	public int[] getPageNoArray() {
		return pageNoArray;
	}

	public void setPageNoArray(int[] pageNoArray) {
		this.pageNoArray = pageNoArray;
	}

	public T[] getDataArray() {
		return dataArray;
	}

	public void setDataArray(T[] dataArray) {
		this.dataArray = dataArray;
	}

	@Override
	public String toString() {
		return String
				.format("Pagination [totalCount=%s, pageSize=%s, totalPage=%s, maxPage=%s, currentPageNo=%s, prePageNo=%s, nextPageNo=%s, firstPage=%s, lastPage=%s, pageNoArray=%s]",
						totalCount, pageSize, totalPage, maxPage, currentPageNo, prePageNo, nextPageNo, firstPage,
						lastPage, Arrays.toString(pageNoArray));
	}

}

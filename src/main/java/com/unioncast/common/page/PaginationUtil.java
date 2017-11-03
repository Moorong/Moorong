package com.unioncast.common.page;

/**
 * 分页计算工具类
 * 
 * @author liutiejun
 * @date 2015-4-23 下午4:55:17
 * 
 */
public class PaginationUtil {

	/**
	 * 求出总页数
	 * 
	 * @author liutiejun
	 * @date 2015-4-22 下午5:00:04
	 * 
	 * @param totalCount
	 *            ：总记录数
	 * @param pageSize
	 *            ：每页显示的最多记录数
	 * @return
	 */
	public static int calTotalPage(int totalCount, int pageSize) {
		int totalPage = totalCount / pageSize;
		if (totalCount % pageSize != 0) {
			totalPage++;
		}

		return totalPage;
	}

	/**
	 * 计算当前页的开始下标
	 * 
	 * @author liutiejun
	 * @date 2015年6月9日 下午2:51:05
	 *
	 * @param currentPageNo
	 *            ：当前页号
	 * @param pageSize
	 *            ：每页显示的最多记录数
	 * @return
	 */
	public static int calFirstResult(int currentPageNo, int pageSize) {
		return calFirstResult(currentPageNo, pageSize, 0);
	}

	/**
	 * 计算当前页的开始下标
	 * 
	 * @author liutiejun
	 * @date 2015年6月9日 下午2:41:30
	 *
	 * @param currentPageNo
	 *            ：当前页号
	 * @param pageSize
	 *            ：每页显示的最多记录数
	 * @param minFirstResult
	 *            ：第一页的开始下标，有可能是0，也有可能是1
	 * @return
	 */
	public static int calFirstResult(int currentPageNo, int pageSize, int minFirstResult) {
		return (currentPageNo - 1 < 0 ? 0 : currentPageNo - 1) * pageSize + minFirstResult;
	}

	/**
	 * 计算当前是第几页
	 * 
	 * @author liutiejun
	 * @date 2016年8月24日 下午5:33:34
	 *
	 * @param firstResult
	 * @param pageSize
	 * @return
	 */
	public static int calCurrentPageNo(int firstResult, int pageSize) {
		return calCurrentPageNo(firstResult, pageSize, 0);
	}

	/**
	 * 计算当前是第几页
	 * 
	 * @author liutiejun
	 * @date 2016年8月24日 下午5:34:23
	 *
	 * @param firstResult
	 * @param pageSize
	 * @param minFirstResult
	 * @return
	 */
	public static int calCurrentPageNo(int firstResult, int pageSize, int minFirstResult) {
		return (firstResult - minFirstResult) / pageSize + 1;
	}

}

package com.unioncast.common.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public final class CollectionUtil {

	private CollectionUtil() {
		super();
	}

	/**
	 * 求集合的交集
	 * 
	 * @author liutiejun
	 * @date 2016年4月6日 上午9:18:24
	 *
	 * @param lists
	 * @return
	 */
	public static <T extends Comparable<? super T>> List<T> intersection(List<T>[] lists) {
		if (ArrayUtils.isEmpty(lists)) {
			return null;
		}

		if (lists.length == 1) {
			return lists[0];
		}

		List<T> resultList = lists[0];
		List<T> otherList = lists[1];

		resultList = intersection(resultList, otherList);

		for (int i = 2; i < lists.length; i++) {
			otherList = lists[i];

			resultList = intersection(resultList, otherList);
		}

		return resultList;
	}

	/**
	 * 求集合的交集
	 * 
	 * @author liutiejun
	 * @date 2016年4月6日 上午10:49:33
	 *
	 * @param list0
	 * @param list1
	 * @return
	 */
	public static <T extends Comparable<? super T>> List<T> intersection(List<T> list0, List<T> list1) {
		if (CollectionUtils.isEmpty(list0) || CollectionUtils.isEmpty(list1)) {
			return null;
		}

		Set<T> result = new HashSet<>();

		for (T e : list0) {
			if (list1.contains(e)) {
				result.add(e);
			}
		}

		return new ArrayList<T>(result);
	}
	
	/**
	 * 获取数组和集合的交集
	 * <p>
	 * </p>
	 * @author dmpchengyunyun
	 * @date 2016年11月15日 下午2:05:51
	 * @param list0
	 * @param list1
	 * @return
	 */
	public static <T extends Comparable<? super T>> List<T> intersection(List<T> list0, T[] list1) {
		if (CollectionUtils.isEmpty(list0) || ArrayUtils.isEmpty(list1)) {
			return null;
		}

		Set<T> result = new HashSet<>();

		for (T e : list1) {
			if (list0.contains(e)) {
				result.add(e);
			}
		}

		return new ArrayList<T>(result);
	}
	
	public static <T extends Comparable<? super T>> Set<T> intersection(Set<T> list0, T[] list1) {
		if (CollectionUtils.isEmpty(list0) || ArrayUtils.isEmpty(list1)) {
			return null;
		}

		Set<T> result = new HashSet<>();

		for (T e : list1) {
			if (list0.contains(e)) {
				result.add(e);
			}
		}

		return result;
	}

	/**
	 * 合并所有的数据
	 * 
	 * @author liutiejun
	 * @date 2016年4月6日 上午10:32:16
	 *
	 * @param lists
	 * @return
	 */
	public static <T> List<T> merge(List<T>[] lists) {
		if (ArrayUtils.isEmpty(lists)) {
			return null;
		}

		if (lists.length == 1) {
			return lists[0];
		}

		List<T> result = new ArrayList<>();

		for (List<T> list : lists) {
			if (!CollectionUtils.isEmpty(list)) {
				result.addAll(list);
			}
		}

		return result;
	}

}

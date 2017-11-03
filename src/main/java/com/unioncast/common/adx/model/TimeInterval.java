/**
 * 
 */
package com.unioncast.common.adx.model;

import java.util.List;
import java.util.Map;

/**
 * @ClassName:     a.java
 * @Description:   时段解析对象
 * @author         feng
 * @Date           2016年10月28日 下午4:53:57
 */
public class TimeInterval {
	private List<Map<String, int[]>> list;

	public List<Map<String, int[]>> getList() {
		return list;
	}

	public void setList(List<Map<String, int[]>> list) {
		this.list = list;
	}
}

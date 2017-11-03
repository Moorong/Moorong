package com.unioncast.common.util;

import java.math.BigDecimal;

public class CommonUtil {
	public static double round(double num) {
		return round(num,2);
	}

	public static double round(double num, int c) {
		return isNull(num)?0.0:new BigDecimal(num).setScale(c, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	/** 空值鉴定 **/
	public static boolean isNull(Object... obj) {
		if (obj == null || obj != null && obj.length == 0)
			return true;
		for (Object o : obj) {
			if (o == null || "".equals(o)
					|| (o != null && "".equals(o.toString().trim()))
					|| "null".equals(o)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isNotNull(Object ...obj) {
		return !isNull(obj);
	}
	public static boolean isJavaClass(Class<?> clz) {
		return clz != null && clz.getClassLoader() == null;
	}
}

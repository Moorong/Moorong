package com.unioncast.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public final class RegexUtil {

	private RegexUtil() {
	}

	public static String[] getValue(String input, String regex) {
		return getValue(input, regex, 0);
	}

	public static String[] getValue(String input, String regex, int group) {
		List<String[]> valueList = getAllValue(input, regex, group);
		if (CollectionUtils.isEmpty(valueList)) {
			return null;
		}

		String[] valueArray = new String[valueList.size()];
		for (int i = 0; i < valueList.size(); i++) {
			valueArray[i] = valueList.get(i)[0];
		}

		return valueArray;
	}

	public static List<String[]> getAllValue(String input, String regex, int... group) {
		if (StringUtils.isEmpty(input) || StringUtils.isEmpty(regex) || ArrayUtils.isEmpty(group)) {
			return null;
		}

		List<String[]> result = new ArrayList<String[]>();

		Matcher matcher = getMatcher(input, regex);
		while (matcher.find()) {
			String[] array = new String[group.length];
			for (int i = 0; i < group.length; i++) {
				array[i] = matcher.group(group[i]);
			}

			result.add(array);
		}

		return result;
	}

	/**
	 * 获得可匹配对象
	 * 
	 * @param input
	 * @param regex
	 * @return
	 */
	public static Matcher getMatcher(String input, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		return m;
	}

}

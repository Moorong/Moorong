package com.unioncast.common.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class ByteUtil {

	private static final int RADIX = 32;

	private static int shift = getShift(RADIX);

	public static char[] digits = new char[36];

	public static Map<Character, Integer> digitsMap = new HashMap<Character, Integer>();

	static {
		init();
	}

	private static void init() {
		int index = 0;
		for (char c = '0'; c <= '9'; c++) {
			digits[index] = c;
			index++;
		}

		for (char c = 'a'; c <= 'z'; c++) {
			digits[index] = c;
			index++;
		}

		for (int i = 0; i < digits.length; i++) {
			digitsMap.put(digits[i], i);
		}
	}

	/**
	 * 将二进制转换成32进制
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午12:19:05
	 *
	 * @param bytes
	 * @return
	 */
	public static String byte2Str(byte[] byteArray) {
		byte[] binaryArray = toBinaryArray(byteArray);
		int binaryLen = binaryArray.length;

		int charLen = getLength(binaryLen, shift);
		char[] result = new char[charLen];

		for (int i = binaryLen - 1; i >= 0;) {
			int index = 0;

			for (int j = 0; j < shift && i - j >= 0; j++) {
				index += binaryArray[i - j] << j;
			}

			int charIndex = charLen - 1 - (binaryLen - 1 - i) / shift;

			result[charIndex] = digits[index];

			i -= shift;
		}

		return new String(result);
	}

	private static int getLength(int binaryArrayLen, int shift) {
		int len = binaryArrayLen / shift;
		if (binaryArrayLen % shift > 0) {
			len++;
		}

		return len;
	}

	public static int getShift(int radix) {
		int shift = (int) Math.round(Math.log(radix) / Math.log(2));

		return shift;
	}

	/**
	 * 将32进制转换为二进制
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午12:19:16
	 *
	 * @param text
	 * @return
	 */
	public static byte[] str2Byte(String text) {
		if (StringUtils.isEmpty(text)) {
			return null;
		}

		char[] charArray = text.toCharArray();
		byte[] binaryArray = toBinaryArray(charArray);

		int binaryLen = binaryArray.length;

		int shift = 8;

		int resultLen = getLength(binaryArray.length, shift);
		byte[] result = new byte[resultLen];

		for (int i = binaryArray.length - 1; i >= 0;) {
			byte index = 0;

			for (int j = 0; j < shift && i - j >= 0; j++) {
				index += binaryArray[i - j] << j;
			}

			int resultIndex = resultLen - 1 - (binaryLen - 1 - i) / shift;

			result[resultIndex] = index;

			i -= shift;
		}

		return result;
	}

	private static byte[] toBinaryArray(char[] charArray) {
		byte[] binaryArray = new byte[charArray.length * shift];

		for (int i = 0; i < charArray.length; i++) {
			int index = digitsMap.get(charArray[i]);
			byte[] temp = toBinaryArray(index, shift);

			System.arraycopy(temp, 0, binaryArray, i * shift, shift);
		}

		// 高位补零的个数
		int zeroSize = binaryArray.length % 8;

		byte[] result = new byte[binaryArray.length - zeroSize];
		System.arraycopy(binaryArray, zeroSize, result, 0, result.length);

		return result;
	}

	/**
	 * 将byte数组转换为二进制数组
	 * 
	 * @author liutiejun
	 * @date 2015年10月26日 下午3:58:14
	 *
	 * @param byteArray
	 * @return
	 */
	private static byte[] toBinaryArray(byte[] byteArray) {
		byte[] binaryArray = new byte[byteArray.length * 8];

		for (int i = 0; i < byteArray.length; i++) {
			byte b = byteArray[i];
			byte[] temp = toBinaryArray(b, 8);

			System.arraycopy(temp, 0, binaryArray, i * 8, 8);
		}

		return binaryArray;
	}

	/**
	 * 将一个整数value转换为binaryLen位的二进制数
	 * 
	 * @author liutiejun
	 * @date 2015年10月26日 下午5:15:21
	 *
	 * @param value
	 * @param binaryLen
	 * @return
	 */
	public static byte[] toBinaryArray(int value, int binaryLen) {
		byte[] buf = new byte[32];
		for (int j = 0; j < buf.length; j++) {
			buf[j] = 0;
		}

		int charPos = 32;
		int shift = 1;
		int radix = 1 << shift;
		int mask = radix - 1;
		do {
			buf[--charPos] = (byte) (value & mask);
			value >>>= shift;
		} while (value != 0);

		byte[] result = new byte[binaryLen];
		System.arraycopy(buf, buf.length - binaryLen, result, 0, binaryLen);

		return result;
	}
}

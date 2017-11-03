package com.unioncast.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

/**
 * 使用MD5对密码进行加密
 * 
 * @author liutiejun
 * @date 2016年3月22日 上午9:57:38
 *
 */
public class Md5PwdEncoder {

	private static final String SALT = Md5PwdEncoder.class.getSimpleName();

	private static final String ALGORITHM = "MD5";

	private static MessageDigest messageDigest = getMessageDigest();

	/**
	 * 密码加密
	 * 
	 * @param rawPass
	 *            未加密密码
	 * @return 加密后密码
	 */
	public static String encodePassword(String rawPass) {
		String saltedPass = mergePasswordAndSalt(rawPass, SALT);

		try {
			byte[] digest = messageDigest.digest(saltedPass.getBytes("UTF-8"));

			return new String(Hex.encodeHex(digest));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static final MessageDigest getMessageDigest() {
		try {
			return MessageDigest.getInstance(ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException("No such algorithm [" + ALGORITHM + "]");
		}
	}

	private static String mergePasswordAndSalt(String password, String salt) {
		if (password == null) {
			password = "";
		}

		return password + "{" + salt + "}";
	}

}

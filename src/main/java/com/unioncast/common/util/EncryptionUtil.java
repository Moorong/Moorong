package com.unioncast.common.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 数据加密、解密<br/>
 * 单向加密：MD5、SHA1<br/>
 * 双向加密：AES、DES<br/>
 * 加密异常处理：http://blog.csdn.net/rj042/article/details/8196125
 * 
 * @author liutiejun
 * @date 2015年10月15日 上午10:12:36
 *
 */
public class EncryptionUtil {

	private static final String CHARSET = "UTF-8";

	private static final int KEY_SIZE_AES = 128;
	private static final int KEY_SIZE_DES = 0;

	private static final String DEF_KEY = EncryptionUtil.class.getSimpleName();

	private static final String MD5 = "MD5";
	private static final String SHA1 = "SHA1";
	private static final String HMAC_MD5 = "HmacMD5";
	private static final String HMAC_SHA1 = "HmacSHA1";
	private static final String AES = "AES";
	private static final String DES = "DES";

	/**
	 * 使用MD5加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:05:38
	 *
	 * @param text
	 * @return
	 */
	public static String md5(String text) {
		return messageDigest(text, MD5);
	}

	/**
	 * 使用MD5加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:05:53
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String md5(String text, String key) {
		return keyGeneratorMac(text, HMAC_MD5, key);
	}

	/**
	 * 使用SHA1加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:06:04
	 *
	 * @param text
	 * @return
	 */
	public static String sha1(String text) {
		return messageDigest(text, SHA1);
	}

	/**
	 * 使用SHA1加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:06:24
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String sha1(String text, String key) {
		return keyGeneratorMac(text, HMAC_SHA1, key);
	}

	/**
	 * 使用AES加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:06:35
	 *
	 * @param text
	 * @return
	 */
	public static String aesEncode(String text) {
		return aesEncode(text, DEF_KEY);
	}

	/**
	 * 使用AES加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:06:49
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String aesEncode(String text, String key) {
		return keyGeneratorES(text, AES, key, KEY_SIZE_AES, true);
	}

	/**
	 * 使用AES解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:07:01
	 *
	 * @param text
	 * @return
	 */
	public static String aesDecode(String text) {
		return aesDecode(text, DEF_KEY);
	}

	/**
	 * 使用AES解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:07:15
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String aesDecode(String text, String key) {
		return keyGeneratorES(text, AES, key, KEY_SIZE_AES, false);
	}

	/**
	 * 使用DES加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:08:11
	 *
	 * @param text
	 * @return
	 */
	public static String desEncode(String text) {
		return desEncode(text, DEF_KEY);
	}

	/**
	 * 使用DES加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:08:23
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String desEncode(String text, String key) {
		return keyGeneratorES(text, DES, key, KEY_SIZE_DES, true);
	}

	/**
	 * 使用DES解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:08:37
	 *
	 * @param text
	 * @return
	 */
	public static String desDecode(String text) {
		return desDecode(text, DEF_KEY);
	}

	/**
	 * 使用DES解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:08:53
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String desDecode(String text, String key) {
		return keyGeneratorES(text, DES, key, KEY_SIZE_DES, false);
	}

	/**
	 * 异或加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:09:49
	 *
	 * @param text
	 * @return
	 */
	public static String xorEncode(String text) {
		return xorEncode(text, DEF_KEY);
	}

	/**
	 * 异或加密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:10:10
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String xorEncode(String text, String key) {
		try {
			byte[] textBytes = text.getBytes(CHARSET);

			for (int i = 0; i < textBytes.length; i++) {
				textBytes[i] = (byte) (textBytes[i] ^ key.hashCode());
			}

			return ByteUtil.byte2Str(textBytes);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 异或解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:10:23
	 *
	 * @param text
	 * @return
	 */
	public static String xorDecode(String text) {
		return xorDecode(text, DEF_KEY);
	}

	/**
	 * 异或解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 下午3:10:32
	 *
	 * @param text
	 * @param key
	 * @return
	 */
	public static String xorDecode(String text, String key) {
		try {
			byte[] textBytes = ByteUtil.str2Byte(text);

			for (int i = 0; i < textBytes.length; i++) {
				textBytes[i] = (byte) (textBytes[i] ^ key.hashCode());
			}

			return new String(textBytes, CHARSET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 使用MessageDigest进行单向加密，无密码
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 上午10:46:39
	 *
	 * @param text
	 * @param algorithm
	 * @return
	 */
	private static String messageDigest(String text, String algorithm) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);

			byte[] textBytes = text.getBytes(CHARSET);
			byte[] result = messageDigest.digest(textBytes);

			return ByteUtil.byte2Str(result);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 使用KeyGenerator进行单向加密，可设密码
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 上午11:03:55
	 *
	 * @param text
	 * @param algorithm
	 * @param key
	 * @return
	 */
	private static String keyGeneratorMac(String text, String algorithm, String key) {
		try {
			SecretKey secretKey = null;

			if (key == null) {
				KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
				secretKey = keyGenerator.generateKey();
			} else {
				byte[] keyBytes = key.getBytes(CHARSET);
				secretKey = new SecretKeySpec(keyBytes, algorithm);
			}

			Mac mac = Mac.getInstance(algorithm);
			mac.init(secretKey);

			byte[] textBytes = text.getBytes(CHARSET);
			byte[] result = mac.doFinal(textBytes);

			return ByteUtil.byte2Str(result);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 使用KeyGenerator双向加密、解密
	 * 
	 * @author liutiejun
	 * @date 2015年10月15日 上午11:26:48
	 *
	 * @param text
	 * @param algorithm
	 * @param key
	 * @param keysize
	 * @param isEncode
	 * @return
	 */
	private static String keyGeneratorES(String text, String algorithm, String key, int keysize, boolean isEncode) {
		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);

			if (key == null) {
				keyGenerator.init(keysize);
			} else {
				byte[] keyBytes = key.getBytes(CHARSET);

				// 密钥的生成不要和平台相关，不然可能导致在windows系统和Linux中出现不同的加密结果，从而导致解密失败
				SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
				random.setSeed(keyBytes);

				if (keysize <= 0) {
					keyGenerator.init(random);
				} else {
					keyGenerator.init(keysize, random);
				}
			}

			SecretKey secretKey = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), algorithm);
			Cipher cipher = Cipher.getInstance(algorithm);

			if (isEncode) {// 加密
				cipher.init(Cipher.ENCRYPT_MODE, secretKey);
				byte[] textBytes = text.getBytes(CHARSET);
				byte[] result = cipher.doFinal(textBytes);

				return ByteUtil.byte2Str(result);
			} else {// 解密
				cipher.init(Cipher.DECRYPT_MODE, secretKey);
				byte[] textBytes = ByteUtil.str2Byte(text);
				byte[] result = cipher.doFinal(textBytes);

				return new String(result, CHARSET);
			}
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}

		return null;
	}

}

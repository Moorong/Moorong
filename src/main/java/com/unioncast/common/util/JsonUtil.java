package com.unioncast.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

/**
 * 建索引或者查询数据的时候，用于数据的转换
 * 
 * @author liutiejun
 * @date 2015-5-12 下午3:09:00
 * 
 */
public final class JsonUtil {

	private JsonUtil() {
	}

	public static ObjectMapper objectMapper = initObjectMapper();

	private static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/**
	 * instance a json mapper, create once, reuse
	 * 
	 * @author liutiejun
	 * @date 2015-5-5 上午10:13:05
	 * 
	 * @return
	 */
	private static ObjectMapper initObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();

		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_PATTERN);
		objectMapper.setDateFormat(dateFormat);

		// 只序列化非空字段
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		return objectMapper;
	}

	/**
	 * 将对象转换为json
	 * 
	 * @author liutiejun
	 * @date 2015-5-13 下午4:57:28
	 * 
	 * @param object
	 * @return
	 * @throws JsonProcessingException
	 */
	public static <T> byte[] object2Json(T object) throws JsonProcessingException {
		return objectMapper.writeValueAsBytes(object);
	}

	/**
	 * 将对象转换为json字符串
	 * 
	 * @author liutiejun
	 * @date 2015-5-13 下午4:56:42
	 * 
	 * @param object
	 * @return
	 * @throws JsonProcessingException
	 */
	public static <T> String object2JsonString(T object) throws JsonProcessingException {

		return objectMapper.writeValueAsString(object);
	}

	/**
	 * 将json转换为对应的对象
	 * 
	 * @author liutiejun
	 * @date 2015-5-13 下午4:57:47
	 * 
	 * @param json
	 * @param valueType
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> T json2Object(byte[] json, Class<T> valueType)
			throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(json, valueType);
	}

	/**
	 * 将json字符串转换为相应的对象
	 * 
	 * @author liutiejun
	 * @date 2015年6月3日 下午4:07:48
	 *
	 * @param json
	 * @param valueType
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> T json2Object(String json, Class<T> valueType)
			throws JsonParseException, JsonMappingException, IOException {
		json = json.replaceAll("([0-9]+)\\-([0-9]+)\\-([0-9]+)", "$1-$2-$3 00:00:00");
		json = json.replaceAll("00:00:00 ([0-9]+):([0-9]+):([0-9]+)", "$1:$2:$3");
		return objectMapper.readValue(json, valueType);
	}

	public static <T> T json2Object(String json, TypeReference<T> valueTypeRef)
			throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(json, valueTypeRef);
	}
	
public static <T> T parseFrom(ServletInputStream inputStream , Class<T> valueType) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		try {
			StringBuffer sb = new StringBuffer();
			String str = "";
			while((str = reader.readLine()) != null) {
				sb.append(str);
			}
			if(sb.toString() != null) {
				return JsonUtil.json2Object(sb.toString(), valueType);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

}

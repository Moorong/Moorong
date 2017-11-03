package com.unioncast.common.restClient;

import java.util.HashMap;
import java.util.Map;
import com.unioncast.common.restClient.RestError;
import com.unioncast.common.restClient.RestResponse;

/**
 * <p>
 * 返回实体工厂
 * </p>
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:38:13
 */
public class RestResponseFactory {

	public static RestResponse ok() {
		String result = RestStatus.OK.name();

		return status(RestStatus.OK, null, result);
	}

	public static RestResponse ok(Object result) {
		return status(RestStatus.OK, null, result);
	}

	public static RestResponse ok(String key, Object value) {
		Map<String, Object> result = new HashMap<>();
		result.put(key, value);

		return status(RestStatus.OK, null, result);
	}

	public static RestResponse id(Long id) {
		if (id > 0) {
			return ok("id", id);
		}

		return exception();
	}

	public static RestResponse exception() {
		String errors = RestStatus.INTERNAL_SERVER_ERROR.name();
		
		RestError re = new RestError(0, 0, errors, null);
		
		RestError[] restErrors = new RestError[]{re};

		return status(RestStatus.INTERNAL_SERVER_ERROR, restErrors, null);
	}

	public static RestResponse exception(Exception e) {
		String errors = null;
		if (e != null) {
			errors = e.getMessage();

			if (errors == null) {
				errors = e.getClass().getSimpleName();
			}
		}
		
		RestError re = new RestError(0, 0, errors, null);
		
		RestError[] restErrors = new RestError[]{re};


		return status(RestStatus.INTERNAL_SERVER_ERROR, restErrors, null);
	}

	public static RestResponse status(RestStatus restStatus, RestError[] restErrors, Object result) {
		return new RestResponse(restStatus.getStatus(), restErrors, result);
	}
}

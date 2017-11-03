/**
 * 
 */
package com.unioncast.common.page;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.user.model.User;

/**
 * @author juchaochao
 * @param <T>
 * @date 2016年11月10日 下午2:24:20
 *
 */
public class DeleteParam {
	private Class<?> entityClass;
	private Long[] ids;

	public Class<?> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<?> entityClass) {
		this.entityClass = entityClass;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		DeleteParam deleteParam = new DeleteParam();
		deleteParam.setEntityClass(new User().getClass());
		deleteParam.setIds(new Long[] { 1L });
		System.out.println(mapper.writeValueAsString(deleteParam));
	}
}

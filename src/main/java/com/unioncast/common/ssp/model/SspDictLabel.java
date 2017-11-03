package com.unioncast.common.ssp.model;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 创意标签
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:24:36
 */
@MyTable("ssp_dict_label")
public class SspDictLabel implements Serializable {

	private static final long serialVersionUID = -2798352526150600324L;

	public static String PROPERTIES = "id, code, name";
	public static String TABLE_NAME = "ssp_dict_label";
	@MyId("id")
	@MyColumn("id")
	private Long id;
	@MyColumn("code")
	private Long code;
	@MyColumn("name")
	private String name;

	public SspDictLabel() {
	}

	public SspDictLabel(Long id, Long code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
//	public static void main(String[] args) throws JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		System.out.println(mapper.writeValueAsString(new SspDictLabel()));
//	}

	@Override
	public String toString() {
		return "SspDictLabel [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
}
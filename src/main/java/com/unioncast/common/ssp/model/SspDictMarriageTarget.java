package com.unioncast.common.ssp.model;

import java.io.Serializable;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
/**
 * 
 *<p>Title: 婚姻状况实体类</p>
 *<p>Description: </p>
 *@author dsp2liufengjiao
 *@date 2017年4月1日 上午10:08:37
 *
 */
@MyTable("ssp_dict_marriage_target")
public class SspDictMarriageTarget implements Serializable{

	
	private static final long serialVersionUID = 8126875328753423316L;

	

	public static String PROPERTIES = "id, code, name,level";
	public static String TABLE_NAME = "ssp_dict_marriage_target";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	@MyColumn("code")
	private Long code;

	@MyColumn("name")
	private String name;
	
	@MyColumn("level")
	private Long level;

	public SspDictMarriageTarget() {
	}

	public SspDictMarriageTarget(Long id, Long code, String name, Long level) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.level = level;
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
		this.name = name;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}
	
	
	
	
	
	
}

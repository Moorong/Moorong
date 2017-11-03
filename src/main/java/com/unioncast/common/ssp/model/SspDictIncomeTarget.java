package com.unioncast.common.ssp.model;

import java.io.Serializable;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 
 *<p>Title:收入实体 </p>
 *<p>Description: </p>
 *@author dsp2liufengjiao
 *@date 2017年4月1日 上午10:16:04
 *
 */
@MyTable("ssp_dict_income_target")
public class SspDictIncomeTarget  implements Serializable{

	private static final long serialVersionUID = -2694653027774182461L;

	public  static String PROPERTIES = "id,code,name,level";
	public static String TABLE_NAME = "ssp_dict_income_target";
	@MyId("id")
	@MyColumn("id")
	private Long id;
	
	@MyColumn("code")
	private Long code;
	
	@MyColumn("name")
	private String name;
	
	@MyColumn("level")
	private Long level;

	public SspDictIncomeTarget() {
	}

	public SspDictIncomeTarget(Long id, Long code, String name, Long level) {
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

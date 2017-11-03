package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;

/**
 * 购买倾向 ssp_dict_buy_target
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:22:20
 */
@MyTable("ssp_dict_buy_target")
public class SspDictBuyTarget implements Serializable {

	private static final long serialVersionUID = 1566335387193225170L;

	public static String PROPERTIES = "id, code,name,level";
	public static String TABLE_NAME = "ssp_dict_buy_target";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	//1000001  性别-男	1000002   性别-女 2000001  学历-硕士及以上	2000002  学历-本科
	@MyColumn("code")
	private Long code;

	//名称
	@MyColumn("name")
	private String name;
	
	 @MyColumn("level")
		private Long level;

	public SspDictBuyTarget() {
	}


	public SspDictBuyTarget(Long id, Long code, String name, Long level) {
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
		this.name = name == null ? null : name.trim();
	}



	public Long getLevel() {
		return level;
	}



	public void setLevel(Long level) {
		this.level = level;
	}
	
	
}
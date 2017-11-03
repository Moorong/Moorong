package com.unioncast.common.ssp.model;

import java.io.Serializable;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
/**
 * 
 *<p>Title: </p>
 *<p>Description: 人群定向条件之性别定向</p>
 *@author dsp2liufengjiao
 *@date 2017年3月31日 下午3:35:50
 *
 */
@MyTable("ssp_dict_crowd_sex_type")
public class SspDictCrowdSexType implements Serializable{

	
	private static final long serialVersionUID = -7975937117309682045L;
	 public static String PROPERTIES = "id, code, level, name";
	    public static String TABLE_NAME = "ssp_dict_crowd_sex_type";
	    @MyId("id")
	    @MyColumn("id")
	    private Long id;

	    //10011001 ：男       10011002：女       10011003：其他
	    @MyColumn("code")
	    private Long code;
	    @MyColumn("level")
	    private Long level;
	    @MyColumn("name")
	    private String name;
	    
		public SspDictCrowdSexType() {
		}

		public SspDictCrowdSexType(Long id, Long code, Long level, String name) {
			this.id = id;
			this.code = code;
			this.level = level;
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

		public Long getLevel() {
			return level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		} 

}

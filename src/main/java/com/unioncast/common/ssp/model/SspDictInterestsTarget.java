package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;

/**
 * 兴趣定向 ssp_dict_interests_target
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:24:21
 */
@MyTable("ssp_dict_interests_target")
public class SspDictInterestsTarget implements Serializable {

    private static final long serialVersionUID = 6448904648579045670L;

    public static String PROPERTIES = "id, code, name,level";
    public static String TABLE_NAME = "ssp_dict_interests_target";

    @MyId("id")
    @MyColumn("id")
    private Long id;
    @MyColumn("code")
    private Long code;
    @MyColumn("name")
    private String name;
    @MyColumn("level")
	private Long level;

    public SspDictInterestsTarget() {
    }

  

    public SspDictInterestsTarget(Long id, Long code, String name, Long level) {
		super();
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
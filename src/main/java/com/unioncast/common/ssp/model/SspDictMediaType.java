package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;

/**
 * 媒体类型定向 ssp_dict_media_type
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:24:49
 */
@MyTable("ssp_dict_media_type")
public class SspDictMediaType implements Serializable {

    private static final long serialVersionUID = -5762159595967838746L;

    public static String PROPERTIES = "id, code, level, name";
    public static String TABLE_NAME = "ssp_dict_media_type";
    @MyId("id")
    @MyColumn("id")
    private Long id;

    //1000001  影视娱乐-在线音乐	1000002   影视娱乐-xxx 1000001  影视娱乐-在线音乐	1000002   影视娱乐-xxx
    @MyColumn("code")
    private Long code;
    @MyColumn("level")
    private Integer level;
    @MyColumn("name")
    private String name;

    public SspDictMediaType() {
    }

    public SspDictMediaType(Long id, Long code, Integer level, String name) {
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
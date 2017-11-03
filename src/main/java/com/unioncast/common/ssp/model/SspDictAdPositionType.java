package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告位类型 ssp_dict_ad_position_type
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:19:21
 */
@MyTable("ssp_dict_ad_position_type")
public class SspDictAdPositionType implements Serializable {

    private static final long serialVersionUID = 1452475205928160580L;

    public static String PROPERTIES = "id, code, name, img_url, update_time";
    public static String TABLE_NAME = "ssp_dict_ad_position_type";

    @MyId("id")
    @MyColumn("id")
    private Long id;

    //0-横屏，1-开屏，2-插屏,3-视频广告，4-信息流
    @MyColumn("code")
    private Integer code;

    //名称
    @MyColumn("name")
    private String name;

    //演示图片的url
    @MyColumn("img_url")
    private String imgUrl;

    @MyColumn("update_time")
    private Date updateTime;

    public SspDictAdPositionType() {
    }

    public SspDictAdPositionType(Long id, Integer code, String name, String imgUrl, Date updateTime) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.imgUrl = imgUrl;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
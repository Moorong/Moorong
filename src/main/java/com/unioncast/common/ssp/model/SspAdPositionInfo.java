package com.unioncast.common.ssp.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;
import com.unioncast.common.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告位信息 ssp_ad_position_info
 * <p>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2017年1月9日上午9:56:41
 */
@MyTable("ssp_ad_position_info")
public class SspAdPositionInfo implements Serializable {

    private static final long serialVersionUID = -5424189493017812386L;

    public static String PROPERTIES = "id,ad_position_id,name,app_info_id,dict_ad_position_type_list,state,cheat_level,create_time,update_time,creater_id,delete_state";
    public static String TABLE_NAME = "ssp_ad_position_info";

    @MyId("id")
    @MyColumn("id")
    private Long id;

    // 广告位id，唯一串
    @MyColumn("ad_position_id")
    private String adPositionId;

    @MyColumn("name")
    private String name;

    // 所属应用
    @MyColumn("app_info_id")
    private SspAppInfo sspAppInfo;

    // 广告位类型
    @MyColumn("dict_ad_position_type_list")
    private SspDictAdPositionType sspDictAdPositionTypeList;

    // 1-正常，2-暂停
    @MyColumn("state")
    private Integer state;

    // 作弊等级默认1，分为10级，1级最好，等级越高该广告位流量越有作弊的可能。可点击选择“默认”“倒序”或“顺序”排列
    @MyColumn("cheat_level")
    private Integer cheatLevel;

    @MyColumn("create_time")
    private Date createTime;

    @MyColumn("update_time")
    private Date updateTime;

    // 创建者
    @MyColumn("creater_id")
    private User user;

    // 删除状态，1-未删除，2-已删除
    @MyColumn("delete_state")
    private Integer deleteState;

    public SspAdPositionInfo() {
    }

    public SspAdPositionInfo(Long id, String adPositionId, String name, SspAppInfo sspAppInfo, SspDictAdPositionType sspDictAdPositionTypeList, Integer state, Integer cheatLevel, Date createTime, Date updateTime, User user, Integer deleteState) {
        this.id = id;
        this.adPositionId = adPositionId;
        this.name = name;
        this.sspAppInfo = sspAppInfo;
        this.sspDictAdPositionTypeList = sspDictAdPositionTypeList;
        this.state = state;
        this.cheatLevel = cheatLevel;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.user = user;
        this.deleteState = deleteState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdPositionId() {
        return adPositionId;
    }

    public void setAdPositionId(String adPositionId) {
        this.adPositionId = adPositionId == null ? null : adPositionId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public SspAppInfo getSspAppInfo() {
        return sspAppInfo;
    }

    public void setSspAppInfo(SspAppInfo sspAppInfo) {
        this.sspAppInfo = sspAppInfo;
    }

    public SspDictAdPositionType getSspDictAdPositionTypeList() {
        return sspDictAdPositionTypeList;
    }

    public void setSspDictAdPositionTypeList(
            SspDictAdPositionType sspDictAdPositionTypeList) {
        this.sspDictAdPositionTypeList = sspDictAdPositionTypeList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCheatLevel() {
        return cheatLevel;
    }

    public void setCheatLevel(Integer cheatLevel) {
        this.cheatLevel = cheatLevel;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

}
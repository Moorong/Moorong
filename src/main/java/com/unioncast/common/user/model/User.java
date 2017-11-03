package com.unioncast.common.user.model;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户信息
 * <p>
 * 对应的表：common_user
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>login_name(varchar)</li>
 * <li>login_password(varchar)</li>
 * <li>username(varchar)</li>
 * <li>phone(varchar)</li>
 * <li>email(varchar)</li>
 * <li>balance(double)</li>
 * <li>state(int)</li>
 * <li>user_type(int)</li>
 * <li>is_delete(int)</li>
 * <li>update_time(datetime)</li>
 * <li>create_time(datetime)</li>
 * <li>remark(varchar)</li>
 * <li>isVerify(int)</li>
 * </ul>
 * </p>
 *
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:18:27
 */

@MyTable("common_user")
public class User implements Serializable {

    /**
     * 定义数据库映射
     */
    public static final String ID = "id";
    //    public static final String LOGIN_NAME = "login_name";
//    public static final String LOGIN_PASSWORD = "login_password";
//    public static final String USER_NAME = "username";
//    public static final String PHONE = "phone";
//    public static final String EMAIL = "email";
//    public static final String STATE = "state";
//    public static final String USER_TYPE = "user_type";
//    public static final String IS_DELETE = "is_delete";
//    public static final String UPDATE_TIME = "update_time";
//    public static final String CREATE_TIME = "create_time";
//    public static final String REMARK = "remark";
//    public static final String IS_VERIFY = "is_verify";
    public static final String TABLE_NAME = "user";
    private static final long serialVersionUID = 6206271782226259274L;
    // 主键id
    @MyId
    @MyColumn("id")
    private Long id;

    // 登陆账号
    @MyColumn("login_name")
    private String loginName;

    // 登陆密码
    @MyColumn("login_password")
    private String loginPassword;

    // 用户姓名
    @MyColumn("username")
    private String username;

    // 手机号码
    @MyColumn("phone")
    private String phone;
    
    // 余额
    @MyColumn("balance")
    private Double balance;

    // 邮箱
    @MyColumn("email")
    private String email;

    // 状态:1-启用, 2-停用
    @MyColumn("state")
    private Integer state;

    // 状态:0-未删除, 1-已删除
    @MyColumn("is_delete")
    private Integer isDelete;

    // 更新时间
    @MyColumn("update_time")
    private Date updateTime;

    // 创建时间
    @MyColumn("create_time")
    private Date createTime;

    // 备注
    @MyColumn("remark")
    private String remark;

    @MyColumn("user_type")
    private Integer userType;// 后台用户类型 1：管理员 2：开发者

    // 角色列表
    // @MyColumn("")
    private List<Role> roleList;

    /**
     * 审核状态 0：未审核 1：已审核
     *
     * @author juchaochao
     * @date 2016年12月21日 上午9:49:42
     */
    @MyColumn("is_verify")
    private Integer isVerify;

    @MyColumn("contact")
    private String contact;

    @MyColumn("parent_id")
    private Long parentId;

    @MyColumn("register_time")
    private Date registerTime;

    @MyColumn("validata_code")
    private String validataCode;

    public User() {

    }

    public User(Long id, String loginName, String loginPassword, String username, String phone, Double balance,
			String email, Integer state, Integer isDelete, Date updateTime, Date createTime, String remark,
			Integer userType, List<Role> roleList, Integer isVerify, String contact, Long parentId, Date registerTime,
			String validataCode) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.username = username;
		this.phone = phone;
		this.balance = balance;
		this.email = email;
		this.state = state;
		this.isDelete = isDelete;
		this.updateTime = updateTime;
		this.createTime = createTime;
		this.remark = remark;
		this.userType = userType;
		this.roleList = roleList;
		this.isVerify = isVerify;
		this.contact = contact;
		this.parentId = parentId;
		this.registerTime = registerTime;
		this.validataCode = validataCode;
	}



	public String getValidataCode() {
        return validataCode;
    }

    public void setValidataCode(String validataCode) {
        this.validataCode = validataCode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    
    public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Integer getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Integer isVerify) {
        this.isVerify = isVerify;
    }


}
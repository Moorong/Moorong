package com.unioncast.common.adx.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 广告主表
 * 
 * @pdOid 56f5e3d3-e42e-43f9-8844-cf03dbe32e93
 */
@MyTable("adx_dsp_advertisers")
public class AdxDspAdvertisers implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4553472231095681876L;
	
	public static String TABLE_NAME = "adx_dsp_advertisers";
	public static String PROPERTIES = "id, name, client_main_qua_name, web_name, phone, address, registration_time, audit_time, audit_status, reject_details, dsp_user_id, qualifications_id, create_date, remarks, update_time";
	/**
	 * 广告主id
	 * 
	 * @pdOid 8cfe23c1-702d-4b85-a17a-5b975ed7247a
	 */
	@MyId("id")
	@MyColumn("id")
	public long id;
	/**
	 * 名称
	 * 
	 * @pdOid 2bce65c6-0c2a-4f80-a2eb-c64ef8310801
	 */
	@MyColumn("name")
	private String name;
	/**
	 * 客户主体名称
	 * 
	 * @pdOid bc3d733f-39cd-4c3d-920b-2693e08ae88b
	 */
	@MyColumn("client_main_qua_name")
	private String clientMainQuaName;
	/**
	 * web名称
	 * 
	 * @pdOid ef065275-df1d-4fc4-9aa7-6412a1ab49eb
	 */
	@MyColumn("web_name")
	private String webName;
	/**
	 * 电话
	 * 
	 * @pdOid 20ab89d9-06b9-45dd-8c15-1a74e4980ab2
	 */
	@MyColumn("phone")
	private String phone;
	/**
	 * 联系地址
	 * 
	 * @pdOid e3f72afd-4a71-4455-bb38-09481e69b472
	 */
	@MyColumn("address")
	private String address;
	/**
	 * 注册时间
	 * 
	 * @pdOid 30d420fe-21cf-41b8-ae87-909f2d1ab8dd
	 */
	@MyColumn("registration_time")
	private Date registrationTime;
	/**
	 * 审核时间
	 * 
	 * @pdOid 9646a481-e182-4d81-97b4-cf222a1d0b4d
	 */
	@MyColumn("audit_time")
	private Date auditTime;
	/**
	 * 审核状态
	 * 
	 * @pdOid 5a70d6d8-8501-47ee-a5d1-1a85a8e98d1b
	 */
	@MyColumn("audit_status")
	private int auditStatus;
	/**
	 * 拒绝详情
	 * 
	 * @pdOid b1c96065-36a0-42ba-aeb3-60ad30853422
	 */
	@MyColumn("reject_details")
	private String rejectDetails;
	/**
	 * dsp账户id
	 * 
	 * @pdOid a86cbab0-4ff5-40aa-a684-2af48677cc4a
	 */
	@MyColumn("dsp_user_id")
	private Long dspUserId;
	/**
	 * 资质id
	 * 
	 * @pdOid 67e09c13-c608-4ab8-ae47-bb45ac71faed
	 */
	@MyColumn("qualifications_id")
	private Long qualificationsId;
	/**
	 * 时间
	 * 
	 * @pdOid edcad80f-71ea-4b69-81ed-570d588142fb
	 */
	@MyColumn("create_date")
	private Date createDate;
	/**
	 * 冗余
	 * 
	 * @pdOid 3d5617ae-88a5-4670-b62b-0579a6ade972
	 */
	@MyColumn("remarks")
	private String remarks;
	
	/**
	 * 更新时间
	 */
	@MyColumn("update_time")
	private Date updateTime;
	
	
	public AdxDspAdvertisers() {
		super();
	}
	
	public AdxDspAdvertisers(long id, String name, String clientMainQuaName, String webName, String phone,
			String address, Date registrationTime, Date auditTime, int auditStatus, String rejectDetails,
			Long dspUserId, Long qualificationsId, Date createDate, String remarks, Date updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.clientMainQuaName = clientMainQuaName;
		this.webName = webName;
		this.phone = phone;
		this.address = address;
		this.registrationTime = registrationTime;
		this.auditTime = auditTime;
		this.auditStatus = auditStatus;
		this.rejectDetails = rejectDetails;
		this.dspUserId = dspUserId;
		this.qualificationsId = qualificationsId;
		this.createDate = createDate;
		this.remarks = remarks;
		this.updateTime = updateTime;
	}

	public Long getDspUserId() {
		return dspUserId;
	}

	public void setDspUserId(Long dspUserId) {
		this.dspUserId = dspUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClientMainQuaName() {
		return clientMainQuaName;
	}
	public void setClientMainQuaName(String clientMainQuaName) {
		this.clientMainQuaName = clientMainQuaName;
	}
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegistrationTime() {
		return registrationTime;
	}
	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public int getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(int auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getRejectDetails() {
		return rejectDetails;
	}
	public void setRejectDetails(String rejectDetails) {
		this.rejectDetails = rejectDetails;
	}
	public Long getQualificationsId() {
		return qualificationsId;
	}
	public void setQualificationsId(Long qualificationsId) {
		this.qualificationsId = qualificationsId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AdxDspAdvertisers [id=" + id + ", name=" + name + ", clientMainQuaName=" + clientMainQuaName
				+ ", webName=" + webName + ", phone=" + phone + ", address=" + address + ", registrationTime="
				+ registrationTime + ", auditTime=" + auditTime + ", auditStatus=" + auditStatus + ", rejectDetails="
				+ rejectDetails + ", dspUserId=" + dspUserId + ", qualificationsId=" + qualificationsId
				+ ", createDate=" + createDate + ", remarks=" + remarks + ", updateTime=" + updateTime + "]";
	}
	
}

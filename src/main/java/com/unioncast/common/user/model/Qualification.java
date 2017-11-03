package com.unioncast.common.user.model;

import java.io.Serializable;
import java.util.Date;

import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

/**
 * 资质信息
 * <p>
 * 对应的表：common_qualification
 * </p>
 * <p>
 * 对应的字段：
 * <ul>
 * <li>id(bigint)</li>
 * <li>user_id(bigint)</li>
 * <li>name(varchar)</li>
 * <li>fileType(int)</li>
 * <li>fileValidateCode(varchar)</li>
 * <li>url(varchar)</li>
 * <li>scope(varchar)</li>
 * <li>startTime(datetime)</li>
 * <li>endTime(datetime)</li>
 * <li>update_time(datetime)</li>
 * </ul>
 * </p>
 * 
 * @author dmpchengyunyun
 * @date 2016年10月10日上午10:14:49
 */
@MyTable("common_qualification")
public class Qualification implements Serializable {

	private static final long serialVersionUID = 3458579647171190503L;

	/**
	 * 主键id
	 */
	@MyId
	@MyColumn("id")
	private Long id;

	/**
	 * 用户信息
	 */
	private User user;

	/**
	 * 资质文件名称
	 */
	@MyColumn("name")
	private String name;

	/**
	 * 文件类型 0：未知 1：营业执照 2：组织机构页面代码验证
	 */
	@MyColumn("fileType")
	private Integer filetype;

	/**
	 * 验证文件编码
	 */
	@MyColumn("fileValidateCode")
	private String filevalidatecode;

	/**
	 * 资质文件图片对应的URL
	 */
	@MyColumn("url")
	private String url;

	/**
	 * 经营范围
	 */
	@MyColumn("scope")
	private String scope;

	/**
	 * 可选 资质生效时间
	 */
	@MyColumn("startTime")
	private Date starttime;

	/**
	 * 资质失效时间（也就是资质的有效时间）
	 */
	@MyColumn("endTime")
	private Date endtime;

	/**
	 * 数据更新时间
	 */
	@MyColumn("update_time")
	private Date updatetime;

	public Qualification() {

	}

	public Qualification(Long id, User user, String name, Integer filetype, String filevalidatecode, String url,
			String scope, Date starttime, Date endtime, Date updatetime) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.filetype = filetype;
		this.filevalidatecode = filevalidatecode;
		this.url = url;
		this.scope = scope;
		this.starttime = starttime;
		this.endtime = endtime;
		this.updatetime = updatetime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getFiletype() {
		return filetype;
	}

	public void setFiletype(Integer filetype) {
		this.filetype = filetype;
	}

	public String getFilevalidatecode() {
		return filevalidatecode;
	}

	public void setFilevalidatecode(String filevalidatecode) {
		this.filevalidatecode = filevalidatecode == null ? null : filevalidatecode.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope == null ? null : scope.trim();
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "Qualification [id=" + id + ", user=" + user + ", name=" + name + ", filetype=" + filetype
				+ ", filevalidatecode=" + filevalidatecode + ", url=" + url + ", scope=" + scope + ", starttime="
				+ starttime + ", endtime=" + endtime + ", updatetime=" + updatetime + "]";
	}

	// public static void main(String[] args) throws JsonGenerationException,
	// JsonMappingException, IOException {
	// ObjectMapper mapper = new ObjectMapper();
	// Qualification qualification = new Qualification();
	// mapper.writeValue(System.out, qualification);
	// }
}
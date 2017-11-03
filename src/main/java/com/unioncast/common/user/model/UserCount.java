package com.unioncast.common.user.model;

/**
 * @author : wangyao
 * @Date ：2016年11月10日 下午5:23:36
 * 
 *       用户量
 */
public class UserCount {

	// ADX所有用户量
	private Integer adxAllUserCount;
	// ADX审核通过用户量
	private Integer adxQualifiedUserCount;
	// SSP所有用户量
	private Integer sspAllUserCount;
	// SSP审核通过用户量
	private Integer sspQualifiedUserCount;
	// DSP所有用户量
	private Integer dspAllUserCount;
	// DSP审核通过用户量
	private Integer dspQualifiedUserCount;

	public Integer getAdxAllUserCount() {
		return adxAllUserCount;
	}

	public void setAdxAllUserCount(Integer adxAllUserCount) {
		this.adxAllUserCount = adxAllUserCount;
	}

	public Integer getAdxQualifiedUserCount() {
		return adxQualifiedUserCount;
	}

	public void setAdxQualifiedUserCount(Integer adxQualifiedUserCount) {
		this.adxQualifiedUserCount = adxQualifiedUserCount;
	}

	public Integer getSspAllUserCount() {
		return sspAllUserCount;
	}

	public void setSspAllUserCount(Integer sspAllUserCount) {
		this.sspAllUserCount = sspAllUserCount;
	}

	public Integer getSspQualifiedUserCount() {
		return sspQualifiedUserCount;
	}

	public void setSspQualifiedUserCount(Integer sspQualifiedUserCount) {
		this.sspQualifiedUserCount = sspQualifiedUserCount;
	}

	public Integer getDspAllUserCount() {
		return dspAllUserCount;
	}

	public void setDspAllUserCount(Integer dspAllUserCount) {
		this.dspAllUserCount = dspAllUserCount;
	}

	public Integer getDspQualifiedUserCount() {
		return dspQualifiedUserCount;
	}

	public void setDspQualifiedUserCount(Integer dspQualifiedUserCount) {
		this.dspQualifiedUserCount = dspQualifiedUserCount;
	}

}

package com.unioncast.common.adx.model;

import java.io.Serializable;

/**
 * 上传的文件信息
 * @author liutiejun
 * @date 2016年9月5日 下午12:03:36
 */
public class UploadFileInfo implements Serializable {

	private static final long serialVersionUID = 736432712907512994L;

	/** 上传的文件内容对应的字节数组，如用户头像 */
	private byte[] fileData;

	/** 文件大小（字节数） */
	private long fileLength;

	/** 文件名称 */
	private String fileName;

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public long getFileLength() {
		return fileLength;
	}

	public void setFileLength(long fileLength) {
		this.fileLength = fileLength;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "UploadFileInfo {\"fileLength\":\"" + fileLength + "\",\"fileName\":\"" + fileName + "\"}";
	}

}

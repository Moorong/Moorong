package com.unioncast.common.ssp.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unioncast.common.annotation.MyColumn;
import com.unioncast.common.annotation.MyId;
import com.unioncast.common.annotation.MyTable;

import java.io.Serializable;

/**
 * 创意尺寸 ssp_dict_creative_size
 * <p>
 * </p>
 * @author dmpchengyunyun
 * @date 2017年1月9日上午10:22:58
 */
@MyTable("ssp_dict_creative_size")
public class SspDictCreativeSize implements Serializable {

	private static final long serialVersionUID = -5704703481844388058L;

	public static String PROPERTIES = "id, type, width, height";
	public static String TABLE_NAME = "ssp_dict_creative_size";

	@MyId("id")
	@MyColumn("id")
	private Long id;

	//1-图片，2-视频，3-信息流
	@MyColumn("type")
	private Integer type;

	@MyColumn("width")
	private Integer width;

	@MyColumn("height")
	private Integer height;

	public SspDictCreativeSize() {
	}

	public SspDictCreativeSize(Long id, Integer type, Integer width, Integer height) {
		this.id = id;
		this.type = type;
		this.width = width;
		this.height = height;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "SspDictCreativeSize [id=" + id + ", type=" + type + ", width=" + width + ", height=" + height + "]";
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(new SspDictCreativeSize()));
	}
}
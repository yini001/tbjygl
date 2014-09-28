package com.haiyue.pageModel;

import java.io.Serializable;

public class Exclu implements Serializable {
	
	private int page;
	private int rows;
	private String sort;  //排序字段
	private String order;  //升序 降序排序
	private String ids;
	
	private Integer id;
	private String name;
	private String excluPic;//专辑图片
	private String bgPicture;// 专辑背景图片
	
	
	
	private String musicName; //歌曲的名字

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	
	public String getExcluPic() {
		return excluPic;
	}

	public void setExcluPic(String excluPic) {
		this.excluPic = excluPic;
	}

	public String getBgPicture() {
		return bgPicture;
	}

	public void setBgPicture(String bgPicture) {
		this.bgPicture = bgPicture;
	}

	@Override
	public String toString() {
		return "Exclu [id=" + id +  ", ids=" + ids
				+ ", musicName=" + musicName + ", name=" + name + ", order="
				+ order + ", page=" + page + ", rows=" + rows + ", sort="
				+ sort + "]";
	}

	
	
	
	
	
	
}

package com.haiyue.pageModel;

import java.io.Serializable;

public class Player implements Serializable {
	
	
	private int page;
	private int rows;
	private String sort;  //排序字段
	private String order;  //升序 降序排序
	private String ids;  //批量操作
	
	private Integer id;
	private String name;
	private String playerType;
	private String playerPicture;
	private String playerPin;
	
	private String musicName;
	
	
	
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
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public String getPlayerPicture() {
		return playerPicture;
	}
	public void setPlayerPicture(String playerPicture) {
		this.playerPicture = playerPicture;
	}
	public String getPlayerPin() {
		return playerPin;
	}
	public void setPlayerPin(String playerPin) {
		this.playerPin = playerPin;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", ids=" + ids + ", name=" + name
				+ ", order=" + order + ", page=" + page + ", playerPicture="
				+ playerPicture + ", playerPin=" + playerPin + ", playerType="
				+ playerType + ", rows=" + rows + ", sort=" + sort + "]";
	}
	
	
	
	
	
}

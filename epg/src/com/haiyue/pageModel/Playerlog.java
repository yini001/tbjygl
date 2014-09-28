package com.haiyue.pageModel;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.haiyue.util.JsonDateSerializer;

public class Playerlog {
	private int page;
	private int rows;
	private String sort;
	private String order; //排序操作
	private String ids;
	
	
	private Integer id;     //日志id
	private Date clickDate;
	private String startDate;  //开始时间
	private String endDate;   //结束时间
	
	private Integer playerId;
	private String name;   //歌手的名称
	private String playerType; // 歌手的类型
	private String playerPin;
	private String playerPicture;
	private Long totalClickTimes; //总的点击数
	
	
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public String getPlayerPin() {
		return playerPin;
	}
	public void setPlayerPin(String playerPin) {
		this.playerPin = playerPin;
	}
	public String getPlayerPicture() {
		return playerPicture;
	}
	public void setPlayerPicture(String playerPicture) {
		this.playerPicture = playerPicture;
	}
	public Long getTotalClickTimes() {
		return totalClickTimes;
	}
	public void setTotalClickTimes(Long totalClickTimes) {
		this.totalClickTimes = totalClickTimes;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getClickDate() {
		return clickDate;
	}
	public void setClickDate(Date clickDate) {
		this.clickDate = clickDate;
	}
	
	
	
	
}

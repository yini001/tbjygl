package com.haiyue.pageModel;

import java.io.Serializable;

public class Musiclog implements Serializable {
	
	private int page;
	private int rows;
	private String sort;
	private String order; //排序操作
	
	private Integer id;
	private String startDate;  //开始时间
	private String endDate;   //结束时间
	
	private String ids;
	private String name;
	private String lang;
	private String type;
	private long totalClickTimes;   //总的点击数
	
	
	private String player;
	private String frees;
	private String states;
	private String cp; 
	private String clickTimes;  
	private String clickDate;     //歌曲点播时间
	
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
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
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getFrees() {
		return frees;
	}
	public void setFrees(String frees) {
		this.frees = frees;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getClickTimes() {
		return clickTimes;
	}
	public void setClickTimes(String clickTimes) {
		this.clickTimes = clickTimes;
	}
	public String getClickDate() {
		return clickDate;
	}
	public void setClickDate(String clickDate) {
		this.clickDate = clickDate;
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
	
	public long getTotalClickTimes() {
		return totalClickTimes;
	}
	public void setTotalClickTimes(long totalClickTimes) {
		this.totalClickTimes = totalClickTimes;
	}
	@Override
	public String toString() {
		return "Musiclog [page=" + page + ", rows=" + rows + ", sort=" + sort
				+ ", order=" + order + ", id=" + id + ", startDate="
				+ startDate + ", endDate=" + endDate + ", ids=" + ids
				+ ", name=" + name + ", lang=" + lang + ", type=" + type
				+ ", player=" + player + ", frees=" + frees + ", states="
				+ states + ", cp=" + cp + ", clickTimes=" + clickTimes
				+ ", clickDate=" + clickDate + "]";
	}
	
	
	
	
	
}

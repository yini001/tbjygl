package com.haiyue.pageModel;



/**
 * @author  haiyue
 * 模型驱动 歌曲的信息
 */
public class Music implements java.io.Serializable {

	private int page;
	private int rows;
	private String sort;  //排序字段
	private String order;  //升序 降序排序
	private String ids;
	
	private Integer id;   
	private String name;
	private String musicPin;
	private String type;
	private String lang;
	private String src;
	private String picture;
	private String state;  
	private String free;   //把booelan转换成字符型
	private String cp;    //歌曲提供商
	private Integer higt;
	private Integer width;
	private Integer positionx;
	private Integer positiony;
	
	private Integer playerId;  //歌手id
	private String playername;   //歌手名字
	private Integer excluId;
	private String excluname;   //专辑名字
	
	

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFree() {
		return free;
	}

	public void setFree(String free) {
		this.free = free;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getMusicPin() {
		return musicPin;
	}

	public void setMusicPin(String musicPin) {
		this.musicPin = musicPin;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getExcluname() {
		return excluname;
	}

	public void setExcluname(String excluname) {
		this.excluname = excluname;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	
	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public Integer getExcluId() {
		return excluId;
	}

	public void setExcluId(Integer excluId) {
		this.excluId = excluId;
	}
	
	public Integer getHigt() {
		return higt;
	}

	public void setHigt(Integer higt) {
		this.higt = higt;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getPositionx() {
		return positionx;
	}

	public void setPositionx(Integer positionx) {
		this.positionx = positionx;
	}

	public Integer getPositiony() {
		return positiony;
	}

	public void setPositiony(Integer positiony) {
		this.positiony = positiony;
	}

	@Override
	public String toString() {
		return "Music [page=" + page + ", rows=" + rows + ", sort=" + sort
				+ ", order=" + order + ", id=" + id
				+ ", name=" + name + ", musicPin=" + musicPin + ", type="
				+ type + ", lang=" + lang + ", src=" + src + ", picture="
				+ picture + ", playername=" + playername + ", excluname="
				+ excluname + ", state=" + state + ", free=" + free + ", cp="
				+ cp + "]";
	}
	
	
	
	
	
	
	
	


}

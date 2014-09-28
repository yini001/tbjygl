package com.haiyue.pageModel;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.haiyue.util.JsonDateSerializer;

/**
 * @author haiyue
 * 歌曲推荐
 */
public class Recom implements Serializable {
	
	private int page;
	private int rows;
	private String sort;  //排序字段
	private String order;  //升序 降序排序
	private String ids;
	
	
	private Integer id;
	private String name;        //推荐名称 
	private String type;        //推荐类型 
	private Integer sortId;     //推荐排序id
	private Date createDate;    //创建时间
	private Date updateDate;   
	
	private Integer musicId;     //歌曲id
	private String musicName;   //歌曲的名字
	private String musicPin;    //歌曲的拼音首字母 
	private String musicType;   //歌曲的类型
	private String musicLang;   //歌曲的语言
	private String musicSrc;
	private String musicPicture;
	private String musicCp;    //歌曲提供商
	private String musicState;  
	private String MusicFree;   //把booelan转换成字符型
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getSortId() {
		return sortId;
	}
	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getMusicPin() {
		return musicPin;
	}
	public void setMusicPin(String musicPin) {
		this.musicPin = musicPin;
	}
	public String getMusicType() {
		return musicType;
	}
	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}
	
	public String getMusicLang() {
		return musicLang;
	}
	public void setMusicLang(String musicLang) {
		this.musicLang = musicLang;
	}
	public String getMusicSrc() {
		return musicSrc;
	}
	public void setMusicSrc(String musicSrc) {
		this.musicSrc = musicSrc;
	}
	public String getMusicPicture() {
		return musicPicture;
	}
	public void setMusicPicture(String musicPicture) {
		this.musicPicture = musicPicture;
	}
	public String getMusicCp() {
		return musicCp;
	}
	public void setMusicCp(String musicCp) {
		this.musicCp = musicCp;
	}
	public String getMusicState() {
		return musicState;
	}
	public void setMusicState(String musicState) {
		this.musicState = musicState;
	}
	public String getMusicFree() {
		return MusicFree;
	}
	public void setMusicFree(String musicFree) {
		MusicFree = musicFree;
	}
	public Integer getMusicId() {
		return musicId;
	}
	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}
	@Override
	public String toString() {
		return "Recom [MusicFree=" + MusicFree + ", createDate=" + createDate
				+ ", id=" + id + ", musicCp=" + musicCp + ", musicId="
				+ musicId + ", musicLang=" + musicLang + ", musicName="
				+ musicName + ", musicPicture=" + musicPicture + ", musicPin="
				+ musicPin + ", musicSrc=" + musicSrc + ", musicState="
				+ musicState + ", musicType=" + musicType + ", name=" + name
				+ ", sortId=" + sortId + ", type=" + type + ", updateDate="
				+ updateDate + "]";
	}
	
	
}

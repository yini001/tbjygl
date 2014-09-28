package com.haiyue.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tmusic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmusic")
public class Tmusic implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String lang;
	private String type;
	private String picture;
	private String musicPin;
	private String cp;
	private Boolean state;
	private Boolean free;
	private String src;
	private Integer higt;
	private Integer width;  
	private Integer positionx;
	private Integer positiony;
	private Integer excluSortid;
	
	private Tplayer tplayer;
	private Texclusive texclusive;
	private Set<Tmusiclog> tmusiclogs = new HashSet<Tmusiclog>(0);
	private Set<Trecom> trecoms = new HashSet<Trecom>(0);

	// Constructors

	/** default constructor */
	public Tmusic() {
	}

	
	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLAYER_ID")
	public Tplayer getTplayer() {
		return this.tplayer;
	}

	public void setTplayer(Tplayer tplayer) {
		this.tplayer = tplayer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXCLU_ID")
	public Texclusive getTexclusive() {
		return this.texclusive;
	}

	public void setTexclusive(Texclusive texclusive) {
		this.texclusive = texclusive;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LANG", length = 10)
	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Column(name = "TYPE", length = 20)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "PICTURE")
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "MUSIC_PIN", length = 10)
	public String getMusicPin() {
		return this.musicPin;
	}

	public void setMusicPin(String musicPin) {
		this.musicPin = musicPin;
	}
	@Column(name = "CP", length = 50)
	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Column(name = "STATE")
	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	@Column(name = "FREE")
	public Boolean getFree() {
		return this.free;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}

	@Column(name = "SRC")
	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	@Column(name = "HIGT")
	public Integer getHigt() {
		return this.higt;
	}

	public void setHigt(Integer higt) {
		this.higt = higt;
	}

	@Column(name = "WIDTH")
	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@Column(name = "POSITIONX")
	public Integer getPositionx() {
		return this.positionx;
	}

	public void setPositionx(Integer positionx) {
		this.positionx = positionx;
	}

	@Column(name = "POSITIONY")
	public Integer getPositiony() {
		return this.positiony;
	}

	public void setPositiony(Integer positiony) {
		this.positiony = positiony;
	}

	@Column(name = "EXCLU_SORTID")
	public Integer getExcluSortid() {
		return this.excluSortid;
	}

	public void setExcluSortid(Integer excluSortid) {
		this.excluSortid = excluSortid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tmusic")
	public Set<Tmusiclog> getTmusiclogs() {
		return this.tmusiclogs;
	}

	public void setTmusiclogs(Set<Tmusiclog> tmusiclogs) {
		this.tmusiclogs = tmusiclogs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tmusic")
	public Set<Trecom> getTrecoms() {
		return this.trecoms;
	}

	public void setTrecoms(Set<Trecom> trecoms) {
		this.trecoms = trecoms;
	}

	@Override
	public String toString() {
		return "Tmusic [id=" + id + ", name=" + name + ", musicPin=" + musicPin
				+ ", lang=" + lang + ", cp=" + cp + ", type=" + type + ", src="
				+ src + ", picture=" + picture + ", state=" + state + ", free="
				+ free + ", excluSortid=" + excluSortid + ", width=" + width
				+ ", higt=" + higt + ", positionx=" + positionx
				+ ", positiony=" + positiony + "]";
	}
	

	
	
	

}
package com.haiyue.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tmusiclog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmusiclog")
public class Tmusiclog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tmusic tmusic;
	private Date clickTime;

	// Constructors

	/** default constructor */
	public Tmusiclog() {
	}

	/** full constructor */
	public Tmusiclog(Tmusic tmusic, Timestamp clickTime) {
		this.tmusic = tmusic;
		this.clickTime = clickTime;
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
	@JoinColumn(name = "MUSIC_ID")
	public Tmusic getTmusic() {
		return this.tmusic;
	}

	public void setTmusic(Tmusic tmusic) {
		this.tmusic = tmusic;
	}

	@Column(name = "CLICK_TIME")
	public Date getClickTime() {
		return this.clickTime;
	}

	public void setClickTime(Date clickTime) {
		this.clickTime = clickTime;
	}

}
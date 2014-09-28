package com.haiyue.model;

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
 * Tplayerlog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tplayerlog")
public class Tplayerlog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tplayer tplayer;
	private Date clickDate;

	// Constructors

	/** default constructor */
	public Tplayerlog() {
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

	@Column(name = "CLICK_DATE", nullable = false)
	public Date getClickDate() {
		return this.clickDate;
	}

	public void setClickDate(Date clickDate) {
		this.clickDate = clickDate;
	}

}
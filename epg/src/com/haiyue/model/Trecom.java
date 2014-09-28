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
import javax.persistence.UniqueConstraint;

/**
 * Trecom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trecom", uniqueConstraints = @UniqueConstraint(columnNames = {
		"SORT_ID", "TYPE"}))
public class Trecom implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String type;
	private Integer sortId;
	private Date createDate;
	private Date updateDate;
	private Tmusic tmusic;

	// Constructors

	/** default constructor */
	public Trecom() {
	}

	/** minimal constructor */
	public Trecom(Tmusic tmusic) {
		this.tmusic = tmusic;
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
	@JoinColumn(name = "MUSIC_ID", nullable = false)
	public Tmusic getTmusic() {
		return this.tmusic;
	}

	public void setTmusic(Tmusic tmusic) {
		this.tmusic = tmusic;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "SORT_ID")
	public Integer getSortId() {
		return this.sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	@Column(name = "CREATE_DATE")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_DATE")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Trecom [id=" + id + ", name=" + name + ", type=" + type
				+ ", sortId=" + sortId + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	

}
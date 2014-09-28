package com.haiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * TroleTresource entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trole_tresource")
@DynamicUpdate(true)
@DynamicInsert(true)
public class TroleTresource implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 10656353L;
	
	private String id;
	private Trole trole;
	private Tresource tresource;

	// Constructors

	/** default constructor */
	public TroleTresource() {
	}

	/** full constructor */
	public TroleTresource(String id, Trole trole, Tresource tresource) {
		this.id = id;
		this.trole = trole;
		this.tresource = tresource;
	}

	// Property accessors
	@Id
	@Column(name = "id", nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Trole getTrole() {
		return this.trole;
	}

	public void setTrole(Trole trole) {
		this.trole = trole;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resource_id", nullable = false)
	public Tresource getTresource() {
		return this.tresource;
	}

	public void setTresource(Tresource tresource) {
		this.tresource = tresource;
	}

}
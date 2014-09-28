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
 * TuserTrole entity. 
 */
@Entity
@Table(name = "tuser_trole")
@DynamicUpdate(true)
@DynamicInsert(true)
public class TuserTrole implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 10656355L;
	private String id;
	private Tuser tuser;
	private Trole trole;

	// Constructors

	/** default constructor */
	public TuserTrole() {
	}

	/** full constructor */
	public TuserTrole(String id, Tuser tuser, Trole trole) {
		this.id = id;
		this.tuser = tuser;
		this.trole = trole;
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
	@JoinColumn(name = "user_id", nullable = false)
	public Tuser getTuser() {
		return this.tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Trole getTrole() {
		return this.trole;
	}

	public void setTrole(Trole trole) {
		this.trole = trole;
	}

}
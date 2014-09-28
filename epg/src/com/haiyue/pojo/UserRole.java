package com.haiyue.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "t_user_role", catalog = "gl")
public class UserRole implements java.io.Serializable {

	// Fields

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private User TUser;
	private Role TRole;

	// Constructors

	/** default constructor */
	public UserRole() {
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getTUser() {
		return this.TUser;
	}

	public void setTUser(User TUser) {
		this.TUser = TUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Role getTRole() {
		return this.TRole;
	}

	public void setTRole(Role TRole) {
		this.TRole = TRole;
	}

}
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
@Table(name = "t_role_privilege", catalog = "gl")
public class RolePrivilege implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Privilege TPrivilege;
	private Role TRole;

	// Constructors

	/** default constructor */
	public RolePrivilege() {
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
	@JoinColumn(name = "privilege_id")
	public Privilege getTPrivilege() {
		return this.TPrivilege;
	}

	public void setTPrivilege(Privilege TPrivilege) {
		this.TPrivilege = TPrivilege;
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
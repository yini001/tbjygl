package com.haiyue.pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "t_role", catalog = "gl")
public class Role implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Short status;
	private Set<UserRole> TUserRoles = new HashSet<UserRole>(0);
	private Set<RolePrivilege> TRolePrivileges = new HashSet<RolePrivilege>(0);

	// Constructors

	/** default constructor */
	public Role() {
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TRole")
	public Set<UserRole> getTUserRoles() {
		return this.TUserRoles;
	}

	public void setTUserRoles(Set<UserRole> TUserRoles) {
		this.TUserRoles = TUserRoles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TRole")
	public Set<RolePrivilege> getTRolePrivileges() {
		return this.TRolePrivileges;
	}

	public void setTRolePrivileges(Set<RolePrivilege> TRolePrivileges) {
		this.TRolePrivileges = TRolePrivileges;
	}

}
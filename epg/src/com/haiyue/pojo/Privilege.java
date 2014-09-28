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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "t_privilege", catalog = "gl")
public class Privilege implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Privilege TPrivilege;
	private String name;
	private String url;
	private String describe;
	private Integer seq;
	private Set<RolePrivilege> TRolePrivileges = new HashSet<RolePrivilege>(0);
	private Set<Privilege> TPrivileges = new HashSet<Privilege>(0);

	// Constructors

	/** default constructor */
	public Privilege() {
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
	@JoinColumn(name = "pid")
	public Privilege getTPrivilege() {
		return this.TPrivilege;
	}

	public void setTPrivilege(Privilege TPrivilege) {
		this.TPrivilege = TPrivilege;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "url", length = 256)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "describe", length = 1000)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Column(name = "seq")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TPrivilege")
	public Set<RolePrivilege> getTRolePrivileges() {
		return this.TRolePrivileges;
	}

	public void setTRolePrivileges(Set<RolePrivilege> TRolePrivileges) {
		this.TRolePrivileges = TRolePrivileges;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TPrivilege")
	public Set<Privilege> getTPrivileges() {
		return this.TPrivileges;
	}

	public void setTPrivileges(Set<Privilege> TPrivileges) {
		this.TPrivileges = TPrivileges;
	}

}
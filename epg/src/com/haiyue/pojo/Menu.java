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
@Table(name = "t_menu", catalog = "gl")
public class Menu implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Menu TMenu;
	private String name;
	private String url;
	private String icon;
	private Integer seq;
	private Set<Menu> TMenus = new HashSet<Menu>(0);

	// Constructors

	/** default constructor */
	public Menu() {
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
	public Menu getTMenu() {
		return this.TMenu;
	}

	public void setTMenu(Menu TMenu) {
		this.TMenu = TMenu;
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

	@Column(name = "icon", length = 256)
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "seq")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TMenu")
	public Set<Menu> getTMenus() {
		return this.TMenus;
	}

	public void setTMenus(Set<Menu> TMenus) {
		this.TMenus = TMenus;
	}

}
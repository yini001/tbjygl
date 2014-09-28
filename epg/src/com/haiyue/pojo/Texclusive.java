package com.haiyue.model;

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

/**
 * Texclusive entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "texclusive")
public class Texclusive implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String excluPic;
	private String bgPicture;
	
	private Set<Tmusic> tmusics = new HashSet<Tmusic>(0);

	// Constructors

	/** default constructor */
	public Texclusive() {
	}

	/** full constructor */
	public Texclusive(String name, String excluPic, String bgPicture,
			Set<Tmusic> tmusics) {
		this.name = name;
		this.excluPic = excluPic;
		this.bgPicture = bgPicture;
		this.tmusics = tmusics;
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

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "EXCLU_PIC")
	public String getExcluPic() {
		return this.excluPic;
	}

	public void setExcluPic(String excluPic) {
		this.excluPic = excluPic;
	}

	@Column(name = "BG_PICTURE")
	public String getBgPicture() {
		return this.bgPicture;
	}

	public void setBgPicture(String bgPicture) {
		this.bgPicture = bgPicture;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "texclusive")
	public Set<Tmusic> getTmusics() {
		return this.tmusics;
	}

	public void setTmusics(Set<Tmusic> tmusics) {
		this.tmusics = tmusics;
	}

}
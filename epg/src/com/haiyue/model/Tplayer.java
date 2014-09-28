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
 * Tplayer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tplayer")
public class Tplayer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String playerType;
	private String playerPicture;
	private String playerPin;
	private Set<Tplayerlog> tplayerlogs = new HashSet<Tplayerlog>(0);
	private Set<Tmusic> tmusics = new HashSet<Tmusic>(0);

	// Constructors

	/** default constructor */
	public Tplayer() {
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

	@Column(name = "NAME", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PLAYER_TYPE", length = 50)
	public String getPlayerType() {
		return this.playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	@Column(name = "PLAYER_PICTURE")
	public String getPlayerPicture() {
		return this.playerPicture;
	}

	public void setPlayerPicture(String playerPicture) {
		this.playerPicture = playerPicture;
	}

	@Column(name = "PLAYER_PIN", nullable = false, length = 10)
	public String getPlayerPin() {
		return this.playerPin;
	}

	public void setPlayerPin(String playerPin) {
		this.playerPin = playerPin;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tplayer")
	public Set<Tplayerlog> getTplayerlogs() {
		return this.tplayerlogs;
	}

	public void setTplayerlogs(Set<Tplayerlog> tplayerlogs) {
		this.tplayerlogs = tplayerlogs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tplayer")
	public Set<Tmusic> getTmusics() {
		return this.tmusics;
	}

	public void setTmusics(Set<Tmusic> tmusics) {
		this.tmusics = tmusics;
	}




	@Override
	public String toString() {
		return "Tplayer [id=" + id + ", name=" + name + ", playerPicture="
				+ playerPicture + ", playerPin=" + playerPin + ", playerType="
				+ playerType + "]";
	}
	

}
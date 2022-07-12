package com.patrickwhel.inventory.app.chickens.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ChickenEntity implements Serializable {

	private static final long serialVersionUID = -1537686033644104765L;

	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String LastName;
	private String chickenType;
	private String chickenId;

	
	
	public long getId() {
		return id
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getChickenType() {
		return chickenType;
	}
	public void setChickenType(String chickenType) {
		this.chickenType = chickenType;
	}
	public String getChickenId() {
		return chickenId;
	}
	public void setChickenId(String chickenId) {
		this.chickenId = chickenId;
	}

	
}

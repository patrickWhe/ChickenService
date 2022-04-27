package com.patrickwhel.inventory.app.chickens.shared;

import java.io.Serializable;

public class ChickenDTO implements Serializable{
	private static final long serialVersionUID = 8686442292285463121L;
	private String firstName;
	private String LastName;
	private String chickenType;
	private String chickenId;
	private String encryptedPassword;
	
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
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
}

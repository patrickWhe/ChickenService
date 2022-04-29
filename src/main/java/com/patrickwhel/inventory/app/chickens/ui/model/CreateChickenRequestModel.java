package com.patrickwhel.inventory.app.chickens.ui.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateChickenRequestModel {
	
@NotNull(message = "First name cannot be empty")
@Size(min = 2, message = "First name must have at least 2 charactors")
private String firstName;

@NotNull(message = "Last name cannot be empty")
@Size(min = 2, message = "The ast name must have at least 2 charactors")
private String LastName;

@NotNull(message = "Type cannot be empty")
@Size(min = 2, message = "Type must have at least 2 charactors")
private String chickenType;

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
}

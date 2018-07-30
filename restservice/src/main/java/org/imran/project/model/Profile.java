package org.imran.project.model;

public class Profile {
   private Long id;
   private String profileName;
   private String firstName;
   private String lastName;
   
   public Profile()
   {}
public Profile(Long id, String profileName, String firstName, String lastName) {
	this.id = id;
	this.profileName = profileName;
	this.firstName = firstName;
	this.lastName = lastName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
   

}

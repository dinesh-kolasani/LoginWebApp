package com.example.loginwebapp;

public class UserModel {

	private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    
    public UserModel(String firstName, String lastName, String email, String password, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    } 
    
    public String getName() {
    	return (firstName + " " + lastName);
    }
    
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    
    
    public String getPassword() {
    	return password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }
    
    public String getGender() {
    	return gender;
    }
    public void setGender(String gender) {
    	this.gender = gender;
    }
}

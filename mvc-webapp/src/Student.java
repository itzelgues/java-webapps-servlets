package com.javawd.servlets;

//import java.io.Serializable;

public class Student /*implements Serializable*/ {
    private int id;
    private String firstName;
    private String lastName;

    public Student() {}
	
    public Student(int id, String firstName, String lastName) {
	    this.id =id;
	    this.firstName = firstName;
	    this.lastName = lastName;
    }

    public int getId() {
	return this.id;
    }

    public String getFirstName() {
	    return this.firstName;
    } 
    
    public String getLastName() {
	    return this.lastName;
    } 
}

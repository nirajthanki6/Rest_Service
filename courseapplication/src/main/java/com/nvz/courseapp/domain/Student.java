package com.nvz.courseapp.domain;

public class Student {
	private long id;
	private String lastName;
	private String firstName;
	private Gender gender;
	private int age;
	
	public Student() {
	}
	
	public Student(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		String studStr = "Student[" + firstName + " " + lastName + "  gender: " + gender + "]";
		return studStr;
	}
	
	public boolean equals(Object otherObj) {
		Student otherStud;
		
		if (!(otherObj instanceof Student)) return false;
		otherStud = (Student) otherObj;
		return (id == otherStud.id && lastName.equals(otherStud.lastName) && firstName.equals(otherStud.firstName));
	}
}

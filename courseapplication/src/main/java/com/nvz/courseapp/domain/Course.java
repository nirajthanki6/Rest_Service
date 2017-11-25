package com.nvz.courseapp.domain;

import java.util.*;

public class Course {
	private String name;
	private ArrayList<Student> studentList;
	
	public Course(String name) {
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
}

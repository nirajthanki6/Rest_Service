package application.domain;

import java.util.List;

public class Student  {
	private int id;
	public String name;
	private boolean isInternationalStudent;
	private boolean isGraduateStudent;
	private List<Course> courseList;

	public Student(int id, String name, boolean isInternationalStudent,
			boolean isGraduateStudent, List<Course> courseList) {
		this.id = id;
		this.name = name;
		this.isInternationalStudent = isInternationalStudent;
		this.isGraduateStudent = isGraduateStudent;
		this.courseList = courseList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInternationalStudent() {
		return isInternationalStudent;
	}

	public void setInternationalStudent(boolean isInternationalStudent) {
		this.isInternationalStudent = isInternationalStudent;
	}

	public boolean isGraduateStudent() {
		return isGraduateStudent;
	}

	public void setGraduateStudent(boolean isGraduateStudent) {
		this.isGraduateStudent = isGraduateStudent;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	public String toString() {
		return id + " - " + name;
	}
}


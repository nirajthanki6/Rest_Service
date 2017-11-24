package application.domain;

public class Course {
	private String name;
	private String departmentName;
	private boolean isGraduateCourse;
	private int numberOfUnits;
	private int numberOfStudents;

	public Course(String name, String departmentName, boolean isGraduateCourse,
			int numberOfUnits, int numberOfStudents) {
		this.name = name;
		this.departmentName = departmentName;
		this.isGraduateCourse = isGraduateCourse;
		this.numberOfUnits = numberOfUnits;
		this.numberOfStudents = numberOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public void setGraduateCourse(boolean isGraduateCourse) {
		this.isGraduateCourse = isGraduateCourse;
	}

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public String toString() {
		return name;
	}
}

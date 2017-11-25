package com.nvz.courseapp.services;
import java.util.ArrayList;

import com.nvz.courseapp.domain.Course;
import com.nvz.courseapp.domain.Student;

public interface CourseService {

	public ArrayList<Student> getCourseStudents(String courseName);
	public void addStudentToCourse(String courseName, Student student);
	public ArrayList<Course> getCourseList();
}

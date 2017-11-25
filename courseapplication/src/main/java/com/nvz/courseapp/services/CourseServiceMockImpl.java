package com.nvz.courseapp.services;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nvz.courseapp.domain.Course;
import com.nvz.courseapp.domain.Student;

@Service
public class CourseServiceMockImpl implements CourseService {
	private static ArrayList<Course> courseList;

	@PostConstruct
	private void initMockDataStructures() {
		initCourseList();
		initStudentsInCourse();
	}
	
	private void initCourseList() {
		Course course;
		courseList = new ArrayList<Course>();
		course = new Course("CS150");
		courseList.add(course);
		course = new Course("CS200");
		courseList.add(course);
	}
	
	private void initStudentsInCourse() {
		Course course;
		Student stud;
		
		course = courseList.get(0);
		stud = new Student("Johnson", "Bob");
		course.addStudent(stud);
		
		stud = new Student("Smith", "Sue");
		course.addStudent(stud);
	}
	
	
	public ArrayList<Student> getCourseStudents(String courseName) {
		Course course;
		
		course = getCourse(courseName);
		if (course != null) {
			return course.getStudentList();
		}
		
        return null;
	}
	
	private Course getCourse(String courseName) {
		int i;
		Course tstCourse;
		String tstName;
		
		if (courseList == null) {
			initCourseList();
		}
		
		for (i=0; i<courseList.size(); i++) {
			tstCourse = courseList.get(i);
			tstName = tstCourse.getName();
			if (tstName.equals(courseName)) {
				return tstCourse;
			}
		}
		
		return null;
	}
	
	public void addStudentToCourse(String courseName, Student student) {
		Course course;
		
		course = getCourse(courseName);
		course.addStudent(student);
	}
	
	public ArrayList<Course> getCourseList() {
		if (courseList == null) {
			initCourseList();
		}
		
		return courseList;
	}

}

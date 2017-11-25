package com.nvz.courseapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nvz.courseapp.domain.Student;
import com.nvz.courseapp.services.CourseService;

/*  Starting URL for this Controller:  
 *        http://localhost:8080/courseapp    (from this home page, click the "View Course Enrollment" link)
 *        http://localhost:8080/courseapp/coursestudents    (direct URL)
 *  Courses "CS150" and "CS200" are supported by StudentServiceMockImpl
 *        
*/
@Controller
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value = "/coursestudents", method = RequestMethod.GET)
	public String courseStudentsForm() {
		return "enterCourseNameForm";
	}
	
	@RequestMapping(value = "/listStudents", method = RequestMethod.GET)
	public ModelAndView listStudentsInCourse(String courseName) {
		List<Student> studentList;
		ModelAndView modelView;
		
		studentList = courseService.getCourseStudents(courseName);
		modelView = new ModelAndView("viewStudentList");
		modelView.addObject("courseName", courseName);
		modelView.addObject("studentList", studentList);
		
		return modelView;
	}
	
}

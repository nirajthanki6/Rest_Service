package com.nvz.courseapp.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nvz.courseapp.domain.Student;
import com.nvz.courseapp.services.StudentService;

/*  Go to the home page:  http://localhost:8080/courseapp
 *  Clicking on the "Create Student Profile" link will call this controller
 */
@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping(value = "/newStudentDataForm", method = RequestMethod.GET)
	public String newStudentDataForm(HttpSession session) {
		session.invalidate();   /* If there is an existing session remove it so that we'll simulate a new user at this point.  */
		return "studentDataForm";
	}
	
	@RequestMapping(value = "/processNewStudentProfile", method = RequestMethod.POST)
	public String processNewStudentForm(Student newStud, HttpSession session) 
	{
		/* Add the student object that was created from the HTML form to the session  */
 		session.setAttribute("student", newStud);
		return "editOrSubmitNewStudForm";
	}
	
	@RequestMapping(value = "/editOrStoreStudentProfile", method = RequestMethod.POST, params="editProfile")
	public String editNewStudentProfile() {
		return "studentDataForm";   /* The data for this form will be pulled from the Session  */
	}
	
	@RequestMapping(value = "/editOrStoreStudentProfile", method = RequestMethod.POST, params="createProfile")
	public ModelAndView storeNewStudentProfile(HttpSession session) 
	{
		Student newStud;
		ModelAndView modelView;
		
		/*  Pull the student object from the session and then store it in the database  */
		newStud = (Student) session.getAttribute("student");
		studentService.addNewStudent(newStud);
		logger.info("Adding new student in processNewStudentForm:   " + newStud);
		modelView = new ModelAndView("newStudentProfileSuccess");
		modelView.addObject("student", newStud);
		
		return modelView;
	}
	
}

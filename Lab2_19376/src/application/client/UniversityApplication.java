package application.client;

 import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import application.domain.Course;
import application.domain.Student;
import application.service.checkout.StudentCheckoutService;

public class UniversityApplication {
	public static Student createStudent(int id, String name,
			boolean isInternationalStudent, boolean isGraduateStudent,
			List<Course> courseList) {
		return new Student(id, name, isInternationalStudent, isGraduateStudent,
				courseList);
	}
	
	public static Course createCourse(String name, String departmentName,
			boolean isGraduateCourse, int numberOfUnits, int numberOfStudents) {
		return new Course(name, departmentName, isGraduateCourse, numberOfUnits, numberOfStudents);
	}

	public static List<Course> list(Course... courses) {
		return Arrays.asList(courses);
	}
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		StudentCheckoutService service = (StudentCheckoutService) container.getBean("StudentCheckoutService");
		
		Course CS532 = createCourse("CS532 - Advanced Internet Programming and Design", "CS", true, 3, 0);
		Course CS548 = createCourse("CS548 - Web Services Techniques and REST Technologies", "CS", true, 3, 0);
		Course CS501 = createCourse("CS501 - Computer Science Capstone Course ", "CS", true, 3, 0);
		Course CS570 = createCourse("CS570 - Special Topics: Introduction to SAS", "CS", true, 3, 0);

		Student nirajthanki = createStudent(19376, "Niraj Thanki", true, true, list(CS532, CS548, CS501, CS570));
		
		service.checkout(nirajthanki, list(CS532, CS548, CS501, CS570), 1234567890);
	}
}


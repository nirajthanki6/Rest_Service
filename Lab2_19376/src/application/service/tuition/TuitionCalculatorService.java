package application.service.tuition;

import application.domain.Course;
import application.domain.Student;
import java.util.List;

public interface TuitionCalculatorService {
	public double computeTuition(Student student, List<Course> listOfCourse);
	}
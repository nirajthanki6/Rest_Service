package application.service.tuition;

import java.util.List;
import application.domain.Course;
import application.domain.Student;

public class OhioStateUniversityTuitionCalculatorService implements TuitionCalculatorService {

	public final static double UNDERGRAD_COST_PER_UNIT = 100;
	public final static double GRAD_COST_PER_UNIT = 120;
	public final static double CHEMISTRY_LAB_FEE = 50;
	public final static double PERCENTAGE_OF_SURCHARGE_INTERNATIONAL = 10.0;
	
	@Override
	public double computeTuition(Student student, List<Course> listOfCourse) {
		System.out.println("[INFO]: Using the Ohio State University tuition calculator service to compute tuition");
		boolean isGraduate = student.isGraduateStudent();
		double amount = 0.0;
		for (Course course : listOfCourse) {
			if (isGraduate) {
				amount += course.getNumberOfUnits() * GRAD_COST_PER_UNIT;
			} else {
				amount += course.getNumberOfUnits() * UNDERGRAD_COST_PER_UNIT;
			}

			if (course.getDepartmentName().equals("Chemistry")) {
				amount = amount + CHEMISTRY_LAB_FEE;
			}
		}
		if (student.isInternationalStudent())
			amount += (amount * PERCENTAGE_OF_SURCHARGE_INTERNATIONAL) / 100;
		
		return amount;
	}
}

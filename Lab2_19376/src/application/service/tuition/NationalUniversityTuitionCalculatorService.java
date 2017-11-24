package application.service.tuition;

import java.util.List;
import application.domain.Course;
import application.domain.Student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("NationalUniversityTuitionCalculatorService")
//@Qualifier("NationalUniversityTuitionCalculatorService")
public class NationalUniversityTuitionCalculatorService implements TuitionCalculatorService {

	public final static double INTERNATIONAL_COST_PER_UNIT = 500;
	public final static double LOCAL_COST_PER_UNIT = 230;

	@Override
	public double computeTuition(Student student, List<Course> listOfCourse) {
		System.out.println("[INFO]: Using the National University tuition calculator service to compute tuition");
		double amount = 0.0;
		boolean isInternational = student.isInternationalStudent();
		for (Course course : listOfCourse) {
			if (isInternational)
				amount += course.getNumberOfUnits() * INTERNATIONAL_COST_PER_UNIT;
			else
				amount += course.getNumberOfUnits() * LOCAL_COST_PER_UNIT;
		}
		return amount;
	}
}

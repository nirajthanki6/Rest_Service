package application.service.checkout;

import application.domain.Course;
import application.domain.Student;
import application.service.payment.PaymentService;
import application.service.tuition.TuitionCalculatorService;
import java.util.List;

public class StudentCheckoutService {
	private PaymentService paymentService;
	private TuitionCalculatorService tuitionCalculatorService;

	public StudentCheckoutService() {
	}
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void setTuitionCalculatorService(TuitionCalculatorService tuitionCalculatorService) {
		this.tuitionCalculatorService = tuitionCalculatorService;
	}

	public void checkout(Student student, List<Course> listOfCourse, int creditCardNumber) {
		for(Course course : listOfCourse) {
			course.setNumberOfStudents(course.getNumberOfStudents() + 1);
		}
		System.out.println("[INFO]: The student " + student + " has taken the following courses:");
		for(Course course : listOfCourse)
			System.out.println("\t" + course);
		
		student.setCourseList(listOfCourse);
		
		double tuitionFee = tuitionCalculatorService.computeTuition(student, listOfCourse);
		System.out.println("[INFO]: The total tuition fee is : $" + tuitionFee);
		
		paymentService.makePayment(student, tuitionFee, creditCardNumber);
	}
}

package application.service.payment;

import application.domain.Student;

public interface PaymentService{
	public void makePayment(Student student, double amount, int creditCardNumber);
}
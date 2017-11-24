package application.service.payment;

import application.domain.Student;

public class WellsFargoPaymentService implements PaymentService {

	@Override
	public void makePayment(Student student, double amount, int creditCardNumber) {
		System.out.print("[INFO]: Using the Paypal credit card processor to process ");
		System.out.format("credit card number %d for %s ", creditCardNumber, student.getName());
		System.out.println("payment of $" + amount);
		return;
	}
}
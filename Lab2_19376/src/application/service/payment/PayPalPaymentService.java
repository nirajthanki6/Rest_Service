package application.service.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import application.domain.Student;

@Component("PayPalPaymentService")
//@Qualifier("PayPalPaymentService")
public class PayPalPaymentService implements PaymentService {

	@Override
	public void makePayment(Student student, double amount, int creditCardNumber) {
		System.out.print("[INFO]: Using the PayPal credit card processor to process ");
		System.out.format("credit card number %d for %s ", creditCardNumber, student.getName());
		System.out.println("payment of $" + amount);
		return;
	}
}
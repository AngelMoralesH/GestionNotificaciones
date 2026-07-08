package test;

import clases.CashPayment;
import clases.CreditCardPayment;
import clases.Payment;
import clases.Paypalment;

public class Test {
    public static void main(String[] args) {
//        Payment[] payments = new Payment[5];
//        Payment[] payments2 = {};



        CreditCardPayment creditCardPayment= new CreditCardPayment(1500,"1234567891234567");
        Payment[] payments3 = {creditCardPayment,
                new Paypalment(950,"angel@gmail.com"),
                new CashPayment(500),
                new CreditCardPayment(3500,"123456489124")

        };
        for (Payment payment : payments3) {
            payment.showPayment();
            payment.ProccesPayment();
            System.out.println("_______________________________");
        }

    }
}

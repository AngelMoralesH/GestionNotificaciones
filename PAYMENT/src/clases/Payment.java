package clases;

import java.time.LocalDate;

public abstract sealed class Payment permits CreditCardPayment, Paypalment, CashPayment{

    protected double amount;
    protected LocalDate paymentDate;
    public Payment() {

    }
    public Payment(double amount) {
//        validarMonto(amount);

        if(amount <= 0){
            System.out.println("Amount must be greater than zero");
        }else{
            this.amount = amount;
            this.paymentDate = LocalDate.now();
        }
    }

    public abstract void ProccesPayment();

//    private double validarMonto(double amount){
//        if(amount <= 0){
//            System.out.println("Amount must be greater than zero");
//        }else{
//            this.amount = amount;
//            this.paymentDate = paymentDate.now();
//        }
//    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void showPayment(){
        System.out.println("******");
        System.out.println("¨PaymentType "+getClass().getSimpleName());
        System.out.println("Amount: " + amount);
        System.out.println("PaymentDate: " + paymentDate);
    }
}

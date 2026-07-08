package clases;

public final class CashPayment extends Payment{

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void ProccesPayment() {
        System.out.println("receiving cash...");
        System.out.println("Cash payment recived");
    }
}

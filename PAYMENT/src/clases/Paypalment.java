package clases;

public final class Paypalment extends Payment{

    private String email;
    public Paypalment(double amount, String email) {

        super(amount);
        this.email = email;
    }

    @Override
    public void ProccesPayment() {
        //hacemos nuestra implementacion "solo msj"

        System.out.println("Connecting to Payment");
        System.out.println("Account: " + email);
        System.out.println("Paypal payment completed.");
    }

}

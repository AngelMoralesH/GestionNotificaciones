package test;

import excepciones.InsufficientStockException;
import excepciones.InvalidarOrderException;

public class TestExceptionNew {
    public static void main(String[] args) {
        String order = "null";
        try{
            VerifyOrder(order);

        }catch(InvalidarOrderException e){
            System.out.println(e.getMessage());
        }

//        try {
//            stock(2);
//            System.out.println("Stock.");
//
//        }catch (InsufficientStockException e){
//            System.out.println(e.getMessage());
//        }

        System.out.println("Flujo Normal");

    }
    public static void VerifyOrder(String order){
        if (order == null){
            throw new InvalidarOrderException("Order is null");
        }
    }

    public static void stock(int quantity) throws InsufficientStockException {
        if(quantity<5){
            throw new InsufficientStockException("Quantity should be greater than 5");
        }
    }

}

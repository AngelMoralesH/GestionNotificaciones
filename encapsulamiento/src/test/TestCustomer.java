package test;

import clases.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("E","fda");
        customer.showInformation();
        Customer customer2 = new Customer("p","01");
        customer2.showInformation();
    }
}

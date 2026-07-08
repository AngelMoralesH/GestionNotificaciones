package test;

import enums.*;

public class Test {

    public static void main(String[] args) {

        OrdenStatus status=  OrdenStatus.PAID;

        System.out.println(status);

        System.out.println("Valor numerico: "+Priority.LOW.ordinal());
        System.out.println("Nombre: "+ Priority.LOW.name());
        System.out.println("Descripcion: "+ Priority.LOW.getDescription());

        UserRole role = UserRole.ADMIN;
        System.out.println(role.name());

        System.out.println(Season.totalSeasons());

        int result = Operation.ADD.apply(3,5);
        System.out.println(result);


        DocumentType.PDF.print();
//        UserRole admin = UserRole.ADMIN.isAdmin();

        Country.CANADA.name();

        System.out.println(Country.CANADA.name());


    }
}

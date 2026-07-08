package condicionales;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        char op;
        System.out.println("Intresa el valor de 'a' ");
        a=entrada.nextInt();
        System.out.println("Intresa el valor de 'b' ");
        b=entrada.nextInt();

        System.out.println("OPERACIÓN (+, -, *, /, %)");
        op = entrada.next().charAt(0);


        int resultado = switch (op) {
            case '+'-> a+b;
            case '-'-> a-b;
            case '*'-> a*b;
            case '/'-> a/b;
            case '%'-> a%b;
            default -> 0;
        };
        System.out.println(a +" "+ op + " " + b +" = "+resultado);


//        switch (op) {
//            case '+'-> System.out.println(a + "+" +b+"="+(a+b));
//            case '-'-> System.out.println(a + "-" +b+"="+(a-b));
//            case '*'-> System.out.println(a + "*" +b+"="+(a*b));
//            case '/'-> System.out.println(a + "/" +b+"="+(a/b));
//            case '%'-> System.out.println(a + "%" +b+"="+(a%b));
//            default -> System.out.println("operacion no valida");
//        }




    }
}

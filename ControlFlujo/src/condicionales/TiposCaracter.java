//08/06/2026

package condicionales;
import java.util.Scanner;
public class TiposCaracter {
    public static void main(String[] args) {
        char caracter;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un solo carácter (letra o número): ");

        caracter = entrada.next().charAt(0);
        switch (caracter){
            case 'a','e','i','o','u':
                System.out.println("El dato ingresado "+ caracter + " es una vocal");
                break;
            default:
                System.out.println("El dato ingresado "+ caracter+ " es una consonante");
        }

//        if(Character.isLetter(caracter)){
//            char letraMinuscula = Character.toLowerCase(caracter);
//
//            if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' ||
//                    letraMinuscula == 'o' || letraMinuscula == 'u') {
//                System.out.println("El dato ingresado "+ letraMinuscula+ " es una vocal");
//            } else {
//                System.out.println("El dato ingresado "+ letraMinuscula+ " es una consonante");
//
//            }
//
//        } else if (Character.isDigit(caracter)) {
//            System.out.println("El dato ingresado "+ caracter+ " es un digito");
//
//
//        }else {
//            System.out.println("EL dato ingresado un espacial");
//        }

        entrada.close();
    }
}

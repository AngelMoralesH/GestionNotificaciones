//08/06/2026

package condicionales;
import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingresa el lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingresa el lado 3: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es Equilatero (todos los lados son iguales).");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es Isosceles (dos lados son iguales).");
        }
        else {
            System.out.println("El triangulo es Escaleno (todos los lados son diferentes).");
        }


        scanner.close();
    }
}

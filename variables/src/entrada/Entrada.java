package entrada;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre;
        double sueldo;
        System.out.print("ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("ingresa tu edad: ");
        edad = entrada.nextInt();
        System.out.print("ingresa tu sueldo: ");
        sueldo = entrada.nextDouble();
        entrada.close();
        System.out.println("¡Hola! "+ nombre+ " tu edad es: " +edad);
        System.out.println("Tienes en sueldo de: "+ sueldo);

    }
}

package ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base;
        System.out.print("ingresa un Número: ");
        base = entrada.nextInt();
        System.out.println("Tabla de multiplicar del " + base);
        for (int i =1;i<=10;i++){

            System.out.println(base+ " * "+ i +" = "+(base * i));
        }
        for (int tabla =1; tabla<=10; tabla++){
            System.out.println("\nTabla de del: "+ tabla);
            for (int mult =1; mult <=10; mult++){

                System.out.printf("%d x %d = %d%n",tabla,mult,tabla*mult);
            }

        }

    }

}

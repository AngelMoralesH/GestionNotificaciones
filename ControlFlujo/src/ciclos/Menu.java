package ciclos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Menú--------------");
            System.out.println("1. Alta");
            System.out.println("2. COnsulta");
            System.out.println("3. Salir");
            System.out.println("Seleccione Una: ");

            opcion = entrada.nextInt();



        }while(opcion != 3);
        System.out.println("Fin del sistema. Hasta Pronto...");
    }
}

package ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---------------Menú--------------");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Lista");
            System.out.println("5. salir");
            System.out.println("Seleccione Una: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.printf("\n Usuario actualizado correctamente \n\n");

                }
                case 2 -> {
                    System.out.printf("\n usuario Creado correctamente  \n\n");

                }
                case 3 -> {
                    System.out.printf("\nseleccionaste Lista \n\n");

                }
                case 4 -> {
                    System.out.printf("\n Usuario Eliminado correctamente: \n\n");

                }
                case 5 -> {
                    System.out.printf("\n Haz salido con exito: \n\n");

                }
                default->{
                    System.out.println("\nOpcion no valida\n");


                }
            }
        }while(opcion !=5);
        System.out.println("Fin del sistema. Hasta Pronto...");
    }
}

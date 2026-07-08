//08/06/2026

package condicionales;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double saldo = 5000.00;
        int opcion;

        System.out.println("=== CAJERO AUTOMÁTICO ===\n");


        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.print("Selecciona una opcion (1-3): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1->{
                System.out.printf("\n Tu saldo actual es: \n\n", saldo);

            }

            case 2->{

                System.out.print("\nIngresa la cantidad a depositar: ");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.printf(" Deposito exitoso. Nuevo saldo: \n\n", saldo);
                }
            }

            case 3->{

                System.out.print("\nIngresa la cantidad a retirar: ");
                double retiro = scanner.nextDouble();

                if (retiro > saldo) {
                    System.out.println("fondos insuficientes.\n");
                } else {
                    saldo -= retiro;
                    System.out.printf(" retiro exitoso:  Nuevo saldo: \n\n"+ saldo);
                }

            }


            default->{
                System.out.println("\nOpcion no valida\n");


            }
        }

        scanner.close();
    }
}

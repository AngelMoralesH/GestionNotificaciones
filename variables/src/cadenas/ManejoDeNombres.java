package cadenas;
import java.util.Scanner;

public class ManejoDeNombres {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el primer nombre: ");
            String nombre1 = scanner.nextLine();

            System.out.print("Ingresa el segundo nombre: ");
            String nombre2 = scanner.nextLine();

            System.out.print("Ingresa el tercer nombre: ");
            String nombre3 = scanner.nextLine();

            scanner.close();

            String var1 = obtenerVariable(nombre1);
            String var2 = obtenerVariable(nombre2);
            String var3 = obtenerVariable(nombre3);

            String resultado = var1 + "_" + var2 + "_" + var3;
            System.out.println(resultado);
        }

        public static String obtenerVariable(String nombre) {

            char segundoChar = Character.toUpperCase(nombre.charAt(1));

            String ultimosDos = nombre.substring(nombre.length() - 2);

            return segundoChar + "." + ultimosDos;

    }
}

package condicionales;

public class Multiplos {
    public static void main(String[] args) {
        int numero = 2;
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println(numero + " es múltiplo de AMBOS (3 y 5).");
        }
        else if (numero % 3 == 0) {
            System.out.println(numero + " es múltiplo de 3.");
        }
        else if (numero % 5 == 0) {
            System.out.println(numero + " es múltiplo de 5.");
        }
        else {
            System.out.println(numero + " no es múltiplo ni de 3 ni de 5.");
        }
    }
}

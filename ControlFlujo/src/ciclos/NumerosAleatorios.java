package ciclos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class NumerosAleatorios {
    public static void main(String[] args) {
        double numero;
        System.out.println("**** Math ****");
        numero= Math.random();
        System.out.println("Numero: " + numero);
        //numero enteros
        int numeroEntero;
        numeroEntero = (int) (Math.random() * 100) + 1;
        System.out.println("Numero entero: "+ numeroEntero);

        //clase random java 1.0
        System.out.println("**************** Clase Random *************");
        Random random = new Random();
        int numeroRandom;
        numeroRandom = random.nextInt();
        System.out.println("numeroRandom: " + numeroRandom);

        int numeroRango = random.nextInt(100)+1;
        System.out.println("numeroRango: "+ numeroRango);


        //3. clase ThereadLocalRandom    java 7

        System.out.println("******* ThreadLocalRandom *********");
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Numero "+ numeroAleatorio);

        //4. clase RandomGenerator java 17
        System.out.println("**** RandomGenerator ****");
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int numGenerator= randomGenerator.nextInt(1,100);
        System.out.println("numero: " + numeroAleatorio);

        //Ejemplo de lanzamiento de dado
        int dado;
    }
}

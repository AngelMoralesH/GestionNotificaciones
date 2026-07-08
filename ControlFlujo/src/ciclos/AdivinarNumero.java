package ciclos;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto, numero;
        secreto = random.nextInt(100)+1;
        do{
            System.out.print("Adivina el numero secreto (1-100): ");
            numero = sc.nextInt();
            if(numero < secreto){
                System.out.println("El Numero secreo es mayor");
            }else if(numero > secreto){
                System.out.println("El numero secreto es menor");
            }

        }while(secreto != numero);
        System.out.println("Adivinaste el número secreto "+ secreto);

    }
}

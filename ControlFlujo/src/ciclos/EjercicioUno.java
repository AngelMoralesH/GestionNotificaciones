package ciclos;
import java.util.Scanner;
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;
        System.out.println("Ingresa el primer valor: ");
        a = entrada.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        b= entrada.nextInt();
        int signo=1;
        if(a<0){
            signo = signo*-1;
        }
        if(b<0){
            signo = signo *-1;
        }
       int absolutoA = Math.abs(a);
       int absolitoB =Math.abs(b);

        int resultado=0;
        for(int i =0;i <absolitoB;i++){
            resultado= resultado + absolutoA ;
        }
        System.out.println(resultado * signo);

    }

}

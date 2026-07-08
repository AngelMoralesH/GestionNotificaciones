package condicionales;

public class Numeros {
    public static void main(String[] args) {
        //saber si un numero es positivo, negatico o cero
        int numero=0;
        if(numero>0){
            System.out.println("El numero: "+ numero+ " es positivo");
        } else if (numero<0) {
            System.out.println("El numero: "+ numero+ " es Negativo");
        }else{
            System.out.println("El numero es Cero");
        }
        System.out.println();
    }
}

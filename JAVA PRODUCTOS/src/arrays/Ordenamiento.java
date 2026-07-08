package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Ordenamiento {
    public static void main(String[] args) {

        int [] numeros = {45,2,50,48,12,70,90,10,60,30};


        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        int aux=0;

        for (int i = 0, j=numeros.length-1; i < j; i++,j--) {
            int temp   = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }
        System.out.println("Arreglo ordenado de mayor a menor");
        System.out.println(Arrays.toString(numeros));

        Integer [] num = {45,2,50,48,12,70,90,10,60,30};
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));
    }
}

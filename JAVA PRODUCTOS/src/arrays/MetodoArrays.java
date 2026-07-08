package arrays;
import java.util.Arrays;
public class MetodoArrays {
    public static void main(String[] args) {
        int []numeros = {1,3,4,5,6,7,8,9,10,15,4,7,5,2};
        String [] nombres= {"eloy", "angel","luis"};
        for (int i = 0; i <numeros.length ; i++) {
            System.out.print(numeros[i]+ " ");
        }
        System.out.println("\n*****Array.toString(array)*******");
        System.out.println(Arrays.toString(numeros));
        System.out.println("\n*****Array.toString(array)*******");
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println("\n*****Array.toString(array)*******");
        System.out.println(Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
        System.out.println("\n*****Array.binarySearch(array), valorBuscar*******");
        int indice = Arrays.binarySearch(numeros,78);
        System.out.println(" indice: " + indice);

        System.out.println("\n*****Array.fill( array, valor)*******");
        int [] rellenos = new int[10];
        Arrays.fill(rellenos, 2,6,10);
        System.out.println(Arrays.toString(rellenos));

        System.out.println("\n*****Array.copyOf( arrayOriginal, longitud)*******");
        int []copias = Arrays.copyOf(rellenos,rellenos.length);
        System.out.println(Arrays.toString(copias));

        System.out.println("\n*****Array.deepToString(matriz)*******\n");
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matriz));




    }
}

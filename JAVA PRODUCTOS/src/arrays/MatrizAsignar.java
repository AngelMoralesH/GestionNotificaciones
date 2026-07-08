package arrays;

public class MatrizAsignar {
    public static void main(String[] args) {
        int[][] numeros={
            {1,2,3},
            {4,5,6,7},
            {8,9},
            {10}
        };
        System.out.println("*********foreach*************");
        for(int[]fila : numeros){
            for(int valor: fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("*********for*************");

        for (int fila = 0; fila <numeros.length ; fila++) {

            for (int columna = 0; columna <numeros[fila].length ; columna++) {

                System.out.print(numeros[fila][columna]+ " ");
            }
            System.out.println();
        }

    }
}

package arrays;

public class Matriz {

    public static void main(String[] args) {
        int[][]numeros= new int[3][6];
        for (int fila = 0; fila <numeros.length ; fila++) {

            for (int columna = 0; columna <numeros[fila].length ; columna++) {
                numeros[fila][columna]= fila+columna;
                System.out.print(numeros[fila][columna]+ " ");
            }
            System.out.println();
        }

        System.out.println("*********foreach*************");
        for(int[]fila : numeros){
            for(int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

    }
}

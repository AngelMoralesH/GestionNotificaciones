package arrays;

public class Creacion {
    public static void main(String[] args) {
        final int N = 5;
        int [] numeros;
        numeros = new int [N];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;

        for (int i =0; i< numeros.length; i++){
            System.out.println("Elemento["+ i +"]: "+ numeros[i]);
        }
        //int edad =40;
        System.out.println("********foreach*******");
        for(int numero : numeros){
            System.out.println("Elemento: "+numero);
        }
    }

}

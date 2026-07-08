package arrays;

public class AsignarValores {
    public static void main(String[] args) {
        int[] numeros= {10,20,30,40,50,60,70,80,90,100};
        for(int i : numeros){
            System.out.println("Elemento: "+ i);
        }

        //modificar valores
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]+=5;
            System.out.println("Elemento["+ i+"]: "+ numeros[i]);
        }

    }
}

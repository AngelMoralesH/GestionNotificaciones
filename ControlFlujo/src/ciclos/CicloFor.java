package ciclos;

public class CicloFor {
    public static void main(String[] args) {
        System.out.println("mostrar los numeros del 1 al 10");
        for (int i =1; i<=10;i++){

            if (i<10){
                System.out.printf(i +", ");
            }else{
                System.out.println(i+".");
            }
        }
    }
}

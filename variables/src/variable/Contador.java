package variable;

public class Contador {

    public static int total = 0;

    public Contador(){
        total++;
    }
    public void mostrar(){
        System.out.println("total de objetos " + total);
    }
}

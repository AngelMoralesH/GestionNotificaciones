package interfaces;
//interfas se utliza mas cuando exite una condicon PUEDO HACER
// se utiliza con colecciones, progrmacion funcional e interfaces funcionales
public interface Printer {
    //contante
    public static int MAX_USER = 10;


    //metodo asbtracto
    //por defecto ya es un metodo abstracto en las interfaces
    void Printer();


    // si permite default para hacer esto
    public default void info(){
        System.out.println("info");
    }


    public static int sum(int x, int y){
        return x + y;
    }

    private void validate(){

        System.out.println("validate");
    }



}

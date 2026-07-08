package condicionales;

public class Evaluacion {
    public static void main(String[] args) {
        int calificaciones = 115;
        if (calificaciones >= 90){
            System.out.println("Excelente");
        }else if (calificaciones >= 80) {
            System.out.println("notable");
        }else if (calificaciones >= 70){
            System.out.println("regular");
        }else {
            System.out.println("Insuficiente");
        }
    }
}

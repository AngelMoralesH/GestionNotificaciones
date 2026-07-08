//08/06/2026

package condicionales;
public class DiaLaborable {
    public static void main(String[] args) {
        String dia = "Martes";
        dia = dia.toLowerCase();
        switch (dia){
            case "lunes","martes","miercoles","jueves","viernes"->
            // con el operador flecha solo puede con una
            // instruccion a menos que se coloque entre llaves
            {
                System.out.println(dia+ " Es Día Laborable");
                System.out.println("Mensaje");
            }
            case "sabado","Domingo" ->
                    System.out.println("Fin de semana");
            default -> System.out.println("Dia no valido");
        }


//        switch (dia){
//            case "lunes","martes","miercoles","jueves","viernes":
//                System.out.println(dia+ " Es Día Laborable");
//                break;
//            case "sabado","Domingo" :
//                System.out.println("Fin de semana");
//
//            default:
//                break;
//        }
    }

}

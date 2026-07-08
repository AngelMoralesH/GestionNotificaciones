package estudiantes;

public class Test {
    public static void main(String[] args) {
        //Estudiante estudiante = new Estudiante(); // instancia de la clase Estudiante

        //ciclo de vida
        //1. declaracion de referencia
        Estudiante estudiante;
        //2.Creacion del objeto
        estudiante = new Estudiante();
        estudiante.nombre = "angel";
        estudiante.edad = 41;
        estudiante.estudiar();
        System.out.println("edad: " + estudiante.edad);
        estudiante =null;
        System.out.println("edad: " + estudiante.edad);


        Estudiante estudiante2 = new Estudiante();
        estudiante2.edad = 26;
        estudiante2.nombre ="a";
         estudiante2.estudiar();
        System.out.println("Edad "+ estudiante2.edad);
    }
}

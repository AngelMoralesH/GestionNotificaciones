package arrays;
import java.util.Arrays;
import java.util.Random;
public class EjercicioUno {
    public static void main(String[] args) {
        final int ESTUDIANTES = 20;
        final int MATERIAS =4;
        double [][] calificaciones = new double[ESTUDIANTES][MATERIAS];
        Random random   = new Random();
        for (int i = 0; i < ESTUDIANTES ; i++) {
            for (int j = 0; j < MATERIAS; j++) {
                calificaciones[i][j]= random.nextDouble()*10;
            }
        }

        System.out.println("calificaciones");
        System.out.println(Arrays.deepToString(calificaciones));

        int mejorEstudiante =0;
        double mejorPromedio =-1.0;
        System.out.println("Promedio por estudiante");

        for (int i = 0; i < ESTUDIANTES ; i++) {
            double sumaEstudiante =0;
            for (int j = 0; j < MATERIAS; j++) {
                sumaEstudiante +=calificaciones[i][j];
            }
            double promedioEstudiante = sumaEstudiante / MATERIAS;

            System.out.printf("Estudiante #%02d -> Nota: %s | Promedio: %.2f\n",
                    (i+1), Arrays.toString(calificaciones[i]), promedioEstudiante);

            if(promedioEstudiante > mejorEstudiante){
                mejorPromedio= promedioEstudiante;
                mejorEstudiante =i +1;
            }
        }

        System.out.println("Promedio por materia");
        for (int j = 0; j < MATERIAS; j++) {
            double sumaMateria=0;
            for (int i = 0; i <ESTUDIANTES ; i++) {
                sumaMateria += calificaciones[i][j];
            }
            double promedioMateria = sumaMateria / ESTUDIANTES;
            System.out.printf(" %.2f\n", promedioMateria); //---
        }
        System.out.println("Mejor promedio");
        System.out.printf( "El estiduante #%d tuvo el mejor promedio con: %.2f\n",
                mejorEstudiante,mejorPromedio);
    }
}

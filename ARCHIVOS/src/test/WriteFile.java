package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

    public static void main(String[] args) {

        //Files.writeString();          //pequeños

        //Files.write();            //coleccion de elementos o lineas

        //BufferedWriter bw = null;  //para cantidades mayores de texto

        //FileWriter fw = null;       //para escritura basica COMO EL LA VERSION DE JAVA 1 A 7

        //PrintWriter pw = null;        //ARchivos con texto de formato

        Path path = Path.of("files","mensajes.txt");


        try{
            if(Files.exists(path)){
                Files.writeString(path, "HOla java 21");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());

        }

    }
}

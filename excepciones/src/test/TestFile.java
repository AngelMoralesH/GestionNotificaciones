package test;
import  java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class TestFile {


    public static void main(String[] args) throws IOException {

        //manejo de archivos
        //el archivo no existe
        //no hay permisos
        //no disco fallo
        //el archivo esta bloqueado

//        Files.readString(Path.of("text.txt"));


        System.out.println("antes del bloque try");
        FileReader reader =null;
        try{
            System.out.println("antes de la expe");

             reader=   new FileReader("file/clientes.txt");

//            Files.readString(Path.of("clientes.txt"));

            System.out.println("archivo abierto");

        }catch(IOException e){
//            e.printStackTrace();
            System.out.println("NO se encuesntra el archirvo");
        }catch (Exception e){
            System.out.println("generico");
        }finally{
            if(reader!=null){
                reader.close();
            }

            System.out.println("siempre se ejecuta");
        }

    }
}

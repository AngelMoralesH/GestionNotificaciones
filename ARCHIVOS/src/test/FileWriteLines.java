package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriteLines {
    public static void main(String[] args) {

        //Files.write();            //coleccion de elementos o lineas

        List<String> lines =List.of("angel","eloy","gus");
        Path path = Path.of("files","mensajes.txt");

        try {
            Files.write(path,lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

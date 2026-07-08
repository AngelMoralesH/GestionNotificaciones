package test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteIO {
    public static void main(String[] args) throws IOException {

        //Files.write();            //coleccion de elementos o lineas

        FileWriter writer = null;
        try {
            writer = new FileWriter("files/venta.txt");
            writer.write("Hola ventas");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}

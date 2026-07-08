package tipos;

import org.w3c.dom.ls.LSOutput;

public class TiposDeDatos {

    public static void main(String[] args) {
        byte edad = 50;
        System.out.println("edad = " + edad);

        short codigo = 1000;
        System.out.println("codigo = " + codigo);

        long poblacion = 1354111655L;
        System.out.println("problacion = " + poblacion);

        float precio= 4.3f;
        System.out.println("precio = " + precio);

        char c = 'E';
        System.out.println("char = " + c);
        boolean b = false;
        System.out.println("b = " + b);

        Integer valor;
        System.out.println("Tamaño maximo de int: "+ Integer.MAX_VALUE);
        System.out.println("Valor binario de 32: "+ Integer.toBinaryString(13));




        //03/06
        int i = 200;
        System.out.println("i: "+ i);
        double doble = i;
        System.out.println("doble: "+ doble);
        int j = (int) doble;
        System.out.println("j: "+ j);
        //String s =doble;

        int a = 6, p =5, mayor;
        mayor = a>p ? a: p;
        int resultado = 7 + 8 * 12 / 3 - 10 % 2;
        System.out.println(""+ resultado);
        System.out.println("mayor: "+ mayor);
        System.out.println("a: "+ a);
        System.out.println("a++: "+ ++a);
        System.out.println("a++ :"+ a);
        System.out.println("b: "+ p);
        System.out.println("b--: "+ p--);
        System.out.println("b: "+ p);
        System.out.println("--b: "+ --p);










    }



}

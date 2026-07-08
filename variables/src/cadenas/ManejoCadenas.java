package cadenas;

public class ManejoCadenas {
    public static void main(String[] args) {

        String cadena= "Hola mundo en java 21";
        String a = "hola", b= "HOla";
        System.out.println("length()-> " + cadena.length());
        System.out.println("charAt()-> " + cadena.charAt(cadena.length()-1));
        System.out.println("toUpperCase() ->"+ cadena.toUpperCase());
        System.out.println("cadena: " + cadena);
        System.out.println("toLowerCase() ->"+ cadena.toLowerCase());

        System.out.println("equales() -> "+ a.equals(b));
        System.out.println("equalsIgnoreCase() -> "+ a.equalsIgnoreCase(b));
        System.out.println("contains() -> "+ cadena.contains("java"));
        System.out.println("startsWith() -> "+ cadena.startsWith("Hola"));
        System.out.println("endsWith() -> "+ cadena.endsWith("21"));
        System.out.println("substring(index) -> "+ cadena.substring(7));
        System.out.println("substring(begininIndex, endIndex) -> "+ cadena.substring(7,14));
        System.out.println("replace() -> "+ cadena.replace("21","25"));
        System.out.println("cadena: "+ cadena);
        System.out.println("a: "+ a+ "hola");
        System.out.println("trim()" + a.trim()+ "hola");
        System.out.println("trim()" + a.trim()+ "hola");

        System.out.println("split(): " );
        String [] arreglo = cadena.split(" "); // split retorna un arreglo
        System.out.println(arreglo.toString());

        for (String s: arreglo){
            System.out.printf(s);
        }





    }
}

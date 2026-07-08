package test;

public class TestExeption {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.equals("name"));
        }catch (Exception e){
            System.out.println(name+" lanza exception");
        }
        System.out.println(name.length());
        System.out.println("Sgue normal el flujo");

    }
}

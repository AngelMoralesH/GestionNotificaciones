package estudiantes;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(32);
        persona.setNombre("angel");
        persona.mostrar();

        Persona persona2 = new Persona();
        persona2.setNombre("juan").setEdad(12).mostrar();
    }
}

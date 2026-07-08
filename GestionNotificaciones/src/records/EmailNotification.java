package records;

public record EmailNotification(String email, String Asusto, String message) implements Notification {

    public EmailNotification{
        if (email == null ||
                !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$")) {    //.matches
            throw new IllegalArgumentException("Correo inválido.");
        }

        if (Asusto == null || Asusto.isBlank()) {
            throw new IllegalArgumentException("El asuto estas vacío");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacío");
        }
    }
}

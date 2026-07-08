package records;

public record PushNotification(String token, String message) implements Notification {

public PushNotification {

    if (token == null || token.isEmpty()) {
        throw new IllegalArgumentException("El token del celular esta vacío");
    }
    if (message == null || message.isEmpty()) {
        throw new IllegalArgumentException("El mensaje no puede estar vacio");
    }

}

}

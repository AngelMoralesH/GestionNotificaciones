package records;

public record SmsNotification(String phone, String message) implements Notification {

    public SmsNotification {
        if (phone == null || !phone.matches("\\d{10}")) {         //.matches
            throw new IllegalArgumentException(
                    "El teléfono debe contener exactamente 10 dígitos.");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacío");
        }
    }
}

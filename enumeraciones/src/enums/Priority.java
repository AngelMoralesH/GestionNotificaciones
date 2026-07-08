package enums;

public enum Priority {

    HIGH("High priority"),
    MEDIUM("medium priority"),
    LOW("low priority");

    private final String description;

    Priority(String string) {
     this.description = string;
    }
    public String getDescription() {
        return description;
    }

}

package enums;

public enum Season {
    STRING,

    SUMMER,
    FALL,
    WINTER;

    public static int totalSeasons() {
        return values().length;
    }


}

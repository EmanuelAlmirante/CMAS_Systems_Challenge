package utils;

public enum NameEnum {
    MULTIPLES_OF_THREE("CMAS "),
    MULTIPLES_OF_FIVE("systems "),
    MULTIPLES_OF_FIFTEEN("CMASsystems "),
    CONTAINS_A_THREE("good "),
    IS_A_INTEGER("Integer ");

    public final String label;

    NameEnum(String label) {
        this.label = label;
    }
}

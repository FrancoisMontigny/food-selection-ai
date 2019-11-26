package DataMigrator;

public class IncorrectFormatException extends Exception {
    private String message;

    public IncorrectFormatException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}

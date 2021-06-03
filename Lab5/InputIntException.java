package Exception;

public class InputIntException extends Exception {
    private String message;

    public InputIntException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

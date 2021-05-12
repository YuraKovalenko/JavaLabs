package Exception;

public class InputStringException extends Exception {
    private String message;

    public InputStringException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

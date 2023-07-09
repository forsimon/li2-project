package exception;

/**
 * @author li
 * @description
 */
public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }

    public AgeOutOfBoundsException(AgeOutOfBoundsException e) {
    }
}

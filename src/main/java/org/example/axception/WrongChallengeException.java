package org.example.axception;

public class WrongChallengeException extends RuntimeException{
    public WrongChallengeException() {
    }

    public WrongChallengeException(String message) {
        super(message);
    }

    public WrongChallengeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongChallengeException(Throwable cause) {
        super(cause);
    }

    public WrongChallengeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

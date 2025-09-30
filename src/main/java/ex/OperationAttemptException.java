package ex;

public class OperationAttemptException extends Exception {

    //конструктор по умолчанию
    public OperationAttemptException() {
        super();
    }

    //конструктор с сообщением
    public OperationAttemptException(String message) {
        super(message);
    }

    //конструктор с сообщением и причиной
    public OperationAttemptException(String message, Throwable cause) {
        super(message, cause);
    }

    //конструктор только с причиной
    public OperationAttemptException(Throwable cause) {
        super(cause);
    }

    //конструктор с полной информацией
    protected OperationAttemptException(String message, Throwable cause,
                                        boolean enableSuppression,
                                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
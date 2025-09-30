package ex;

public class Calculator {

    public double divide(double a, double b) throws OperationAttemptException {
        if (b == 0) {
            throw new OperationAttemptException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    public void processData(String data) throws OperationAttemptException {
        if (data == null || data.isEmpty()) {
            throw new OperationAttemptException("Данные не могут быть пустыми",
                    new IllegalArgumentException("Неверные данные"));
        }
    }
}
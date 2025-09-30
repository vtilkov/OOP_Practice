package ex;

/*Задача 1
Практика ООП. Исключения #1. NumberFormatException
Необходимо написать приложение, которое принимает набор чисел в качестве параметров командной строки, складывает их и результат выводит в консоль. Формат запуска приложения следующий:

java Sum 10 34 1
здесь Sum название класса, а числа после него будут переданы в массив строк, указанный в параметрах метода main. Таким образом, метод main принимает массив строк, в каждом из которых записано число. Необходимо эти числа преобразовать в тип double с использованием Double.parseDouble(), а затем сложить их между собой. Метод parseDouble выкидывает исключение NumberFormatException в случае, если вместо числа было передано что-то иное. Обработайте данное исключение и все строки, не являющиеся числами, считайте за 0.

Пример:
java Sum 10 3qq4 1
результат: 11*/

public class Main {
    public static void main(String[] args) {

        /*Задача 3
        Практика ООП. *Исключения #3. Свое исключение - задание необязательное
        Данное задание не является обязательным для решения. Вы можете выполнить его для дополнительной тренировки навыка по данной теме

        Создайте класс исключения с названием OperationAttemptException. Данное исключение должно:

        Быть проверяемым (checked)
                Иметь те же конструкторы, что предусмотрены классом Throwable*/

        Calculator calculator = new Calculator();

        try {
            double result = calculator.divide(10, 0);
        } catch (OperationAttemptException e) {
            System.out.println("Ошибка операции: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            calculator.processData("");
        } catch (OperationAttemptException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Причина: " + e.getCause().getMessage());
            }
        }

        /*
        double sum = 0;

        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Предупреждение: '" + arg + "' не является числом и будет игнорирован");
            }
        }

        System.out.println("Результат: " + sum);*/
    }
}
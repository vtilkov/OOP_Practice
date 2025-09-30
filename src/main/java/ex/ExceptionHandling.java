package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling {

    /*Задание 4
    Данный метод считывает из файла два числа и
возвращает результат их деления друг на друга. В результате его исполнения
могут выпасть следующие исключения:*/
    public static int divide(String fileName) throws OperationAttemptException {
        //Используем try-with-resources для гарантированного закрытия Scanner
        try (Scanner sc = new Scanner(new File(fileName))) {
            return sc.nextInt() / sc.nextInt();
        }
        /*FileNotFoundException – если файл не
        будет найден*/
        catch (FileNotFoundException e) {
            throw new OperationAttemptException("Файл не найден: " + fileName, e);
        }
        /*InputMismatchException - если вместо чисел
        в файле окажутся строки*/
        catch (InputMismatchException e) {
            throw new OperationAttemptException("В файле должны быть только числа", e);
        }
        /*NoSuchElementException – если в файле
        будет менее двух чисел*/
        catch (NoSuchElementException e) {
            throw new OperationAttemptException("В файле должно быть > 2 чисел)", e);
        }
        /*ArithmeticException  – если второе число окажется нулем.*/
        catch (ArithmeticException e) {
            throw new OperationAttemptException("Деление на ноль недопустимо !", e);
        }
    }


    public static int safeDivide(String fileName) {
        try {
            return divide(fileName);
        } catch (OperationAttemptException e) {
            System.out.println("Ошибка при выполнении операции: " + e.getMessage());

            if (e.getCause() != null) {
                System.out.println("Причина: " + e.getCause().getClass().getSimpleName());
            }

            return 0;
        }
    }

    public static void main(String[] args) {

        //коректный файл с числами
        int result1 = safeDivide("numbers.txt");
        System.out.println("Результат 1: " + result1);

        //файл не существет
        int result2 = safeDivide("nonexistent.txt");
        System.out.println("Результат 2: " + result2);

        //файл с делением на ноль (0)
        int result3 = safeDivide("zero_division.txt");
        System.out.println("Результат 3: " + result3);

        //файл с недостаточным числом чисел
        int result4 = safeDivide("one_number.txt");
        System.out.println("Результат 4: " + result4);
    }
}
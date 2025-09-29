package ru;

public class Point_Main {
    public static void main(String[] args) {

        /*Задание 2
        Практика ООП. Класс Object #2. Сравнение точек
        Дан класс,
        описывающий точку координат:
        class Point{
            int x,y;
            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        Переопределите
        метод сравнения объектов по состоянию таким образом, чтобы две точки считались
        одинаковыми тогда, когда они расположены в одинаковых координатах.

                Переопределите метод
        клонирования, унаследованный от класса Object, таким
        образом, чтобы при его вызове возвращался новый объект Точки, значения полей
        которого будут копиями оригинальной Точки.*/

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        //сравнение точек
        System.out.println("Сравнить: Точка 1 == (Точка 2)): " + p1.equals(p2)); // true
        System.out.println("Сравнить: Точка 1 == (Точка 3)):: " + p1.equals(p3)); // false
        System.out.println("Ссылка: Точка 1 == Точка 2: " + (p1 == p2)); // false

        //hashCode
        System.out.println("Точка 1. hashCode(): " + p1.hashCode());
        System.out.println("Точка 2. hashCode(): " + p2.hashCode());
        System.out.println("Точка 3. hashCode(): " + p3.hashCode());

        //клонирование
        Point p4 = p1.clone();
        System.out.println("Точка 1: " + p1); // Point(3, 4)
        System.out.println("Точка 4: " + p4); // Point(3, 4)
        System.out.println("Ссылка: Точка 1 == Точка 4: " + (p1 == p4)); // false
        System.out.println("Сравнить: Точка 1 == (Точка 4)): " + p1.equals(p4)); // true

        //измененить клон
        p4.x = 10;
        System.out.println("После изменения Точка 4(x) = 10 :");
        System.out.println("Точка 1: " + p1); // Point(3, 4)
        System.out.println("Точка 4: " + p4); // Point(10, 4)
    }
}
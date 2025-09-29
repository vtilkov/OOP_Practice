package ru;

public class Line_Main {
    public static void main(String[] args) {

        /*Задание 3
        Практика ООП. Класс Object #3. Сравнение линий
        Дан класс,
        описывающий Линию:
        class Line{
            Point start,end;
            public Line(Point start, Point end) {
                this.start = start;
                this.end = end;
            }
        }
        Переопределите
        метод сравнения объектов по состоянию таким образом, чтобы две линии считались
        одинаковыми в том случае, если их начало и конец расположены в одинаковых
        точках.
                Переопределите
        метод клонирования, унаследованный от класса Object,
                таким образом, чтобы при его вызове возвращался новый объект Линии, значения
        полей которого будут копиями оригинальной Линии (т.е. необходимо выполнить
        глубокое копирование).*/

        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(5, 5);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        Line line3 = new Line(p1, p4);

        //сравним динию
        System.out.println("Сравнить: Линия 1 == Линия 2: " + line1.equals(line2)); // true
        System.out.println("Сравнить: Линия 1 == Линия 3: " + line1.equals(line3)); // false

        //клонирование с глубоким копированием
        Line line4 = line1.clone();
        System.out.println("Линия 1: " + line1); // для Линии 1 (1, 1) будет (5, 5)
        System.out.println("Линия 4: " + line4); // для Линии 4 (1, 1) будет (5, 5)
        System.out.println("Ссылка: Линия 1 == Линия 4: " + (line1 == line4)); // false
        System.out.println("Сравнить: Линия 1 == Линия 4: " + line1.equals(line4)); // true

        //изменение точки клона
        line4.start.x = 10;
        System.out.println("\nПосле изменения Линия 4(x) = 10: ");
        System.out.println("Линия 1 изначально: " + line1.start); // (1, 1) - не изменился!
        System.out.println("Линия 4 изначально: " + line4.start); // (10, 1)
    }

}

package ru;

public class PolyLine_Main {
    public static void main(String[] args) {

        /*Задача 4
        Практика ООП. Класс Object #4. Сравнение ломаных линий
        Дан класс,
        описывающий ломаную линию:
        class PolyLine{
            Point[] points;
            public PolyLine(Point... points) {
                this.points =
                        points;
            }
            public
            double length(){

                double sum=0,len1,len2;

                for(int i=0;i<points.length-1;i++){

                    len1=points[i].x-points[i-1].x;

                    len2=points[i].y-points[i-1].y;

                    sum+=Math.sqrt(len1*len1+len2*len2);

                }
                return sum;
            }
        }
        Переопределите
        метод сравнения объектов по состоянию таким образом, чтобы две ломанные
        считались одинаковыми тогда, когда все их точки совпадают.*/

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(4, 5);

        Point p4 = new Point(1, 1);
        Point p5 = new Point(2, 3);
        Point p6 = new Point(4, 5);

        Point p7 = new Point(1, 1);
        Point p8 = new Point(3, 3); // отличается от p2

        PolyLine line1 = new PolyLine(p1, p2, p3);
        PolyLine line2 = new PolyLine(p4, p5, p6);
        PolyLine line3 = new PolyLine(p7, p8, p6);

        //сравним ломаные линий
        System.out.println("Сравнить: Линия 1 == Линия 2: " + line1.equals(line2)); // true
        System.out.println("Сравнить: Линия 1 == Линия 3: " + line1.equals(line3)); // false

        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);

        //клонировать
        PolyLine line4 = line1.clone();
        System.out.println("Ссылка: Линия 1 == Линия 4: " + (line1 == line4)); // false
        System.out.println("Сравнить: Линия 1 == Линия 4: " + line1.equals(line4)); // true


        //демонстрируем глубокое копирование
        System.out.println("\nДемонстрация глубокого копирования:");
        System.out.println("Ссылка: Точка в линии 1 == Точка в линии 4: " + (line1.points == line4.points)); // false

        for (int i = 0; i < line1.points.length; i++) {
            System.out.println("Точка в линии(" + i + ") == Точка в линии(" + i + "): " +
                    (line1.points[i] == line4.points[i])); // все false
        }

        // Изменение точки клона не влияет на оригинал
        line4.points[0].x = 100;
        System.out.println("\nПосле изменения Линия 4(точка в x) = 100:");
        System.out.println("Линия 1(точка): " + line1.points[0]); // (1, 1) - не изменился!
        System.out.println("Линия 4(точка): " + line4.points[0]); // (100, 1)
    }
}
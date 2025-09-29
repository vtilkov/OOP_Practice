package ru;

public class Faction_Main {
    public static void main(String[] args) {

        /*Задание 1
        Практика ООП. *Класс Object #1. Сравнение дробей - задание необязательное
        Данное задание не является обязательным для решения. Вы можете выполнить его для дополнительной тренировки навыка по данной теме
        Имеется класс, описывающий Дробь
        class Fraction{
            int num,denum;

            public Fraction(int num, int denum) {
                this.num = num;
                this.denum = denum;
            }

            public String toString() {
                return num + "/" + denum;
            }
        }
        Переопределите
        метод сравнения объектов по состоянию таким образом, чтобы две дроби считались
        одинаковыми тогда, когда у них одинаковые значения числителя и знаменателя.
                Переопределите
        метод клонирования, унаследованный от класса Object,
                таким образом, чтобы при его вызове возвращался новый объект Дроби, значения
        полей которого будут копиями оригинальной Дроби.*/

        Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(1, 2);
        Fraction frac3 = new Fraction(2, 3);

        // Сравнение дробей
        System.out.println("Сравнить: Дробь 1 == (Дробь 2): " + frac1.equals(frac2)); // true
        System.out.println("Сравнить: Дробь 1 == (Дробь 3): " + frac1.equals(frac3)); // false

        // Клонирование
        Fraction frac4 = frac1.clone();
        System.out.println("Дробь 1: " + frac1); // 1/2
        System.out.println("Дробь 4: " + frac4); // 1/2
        System.out.println("Дробь 1 == Дробь 4: " + (frac1 == frac4)); // false
        System.out.println("Сравнить: Дробь 1 == (Дробь 4): " + frac1.equals(frac4)); // true
    }
}
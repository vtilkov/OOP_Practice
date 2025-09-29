package com;

public class Sauce_Main {
    public static void main(String[] args) {

        /*Задание 1
        Практика ООП. Перечисления #1. Соус
                Создайте
        класс Соус, который описывается:
        Название: строка
        Острота: одно из {очень острый, острый, не острый}
        При создании требует указать название и остроту
        Может возвращать текстовое представление вида “Соус НАЗВАНИЕ: ОСТРОТА”
        Гарантируйте, что острота соуса может указываться
        только одним из предопределенных значений.*/
        //создадим соусы с разной остротой
        Sauce sauce1 = new Sauce("Табаско", Spiciness.VERY_SPICY);
        Sauce sauce2 = new Sauce("Кетчуп", Spiciness.NOT_SPICY);
        Sauce sauce3 = new Sauce("Сырный", Spiciness.SPICY);
        Sauce sauce4 = new Sauce("Чили", Spiciness.VERY_SPICY);

        //наглядно отобразим
        System.out.println(sauce1.toString()); // соус Табаско: очень острый
        System.out.println(sauce2.toString()); // соус Кетчуп: не острый
        System.out.println(sauce3.toString()); // соус Сырный: острый
        System.out.println(sauce4.toString()); // соус Чили: очень острый
        System.out.println();

        //продемонстрируем перечисления
        System.out.println("Все возможные уровни остроты: ");
        for (Spiciness level : Spiciness.values()) {
            System.out.println("- " + level.getDescription());
        }
    }
}
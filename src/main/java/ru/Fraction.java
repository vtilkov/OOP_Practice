package ru;

class Fraction implements Cloneable {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    // Переопределение метода equals для сравнения дробей по состоянию
    @Override
    public boolean equals(Object obj) {
        //проверяет ссылочное равенство (this == obj)
        if (this == obj) {
            return true;
        }

        //проверяет, что объект не null и того же класса
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        //сравнивает числитель и знаменатель двух дробей
        Fraction other = (Fraction) obj;
        return this.num == other.num && this.denum == other.denum;
    }

    //обязательно переопределяется вместе с equals()
    @Override
    public int hashCode() {
        return 31 * num + denum; //генерирует хэш-код на основе числителя и знаменателя
    }

    //переопределение метода clone для создания копии дроби
    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone(); //вызвать родительский метод clone()
        } catch (CloneNotSupportedException e) { //exception на сключение
            throw new AssertionError(" Клонирование не поддерживается");
        }
    }
}
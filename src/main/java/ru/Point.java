package ru;

class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Переопределение метода equals для сравнения точек по координатам
    @Override
    public boolean equals(Object obj) {
        //является ли объект тем же самым (this == obj)
        if (this == obj) {
            return true;
        }

        //что объект не null и того же класса
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        //сравниваем координаты x и y двух точек
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    //переопределение hashCode для согласованности с equals
    @Override
    public int hashCode() {
        return 31 * x + y; //для генерации хэш-кода
    }

    //переопределение метода clone для создания копии точки
    @Override
    public Point clone() {
        try {
            return (Point) super.clone(); //вызов родительского метода clone()
        } catch (CloneNotSupportedException e) { //exception на сключение
            throw new AssertionError("Клонирование не поддерживается ");
        }
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
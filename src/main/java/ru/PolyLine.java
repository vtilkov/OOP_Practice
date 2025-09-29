package ru;

class PolyLine implements Cloneable {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 1; i < points.length; i++) { // исправлено (начинаем с i=1)
            len1 = points[i].x - points[i - 1].x;
            len2 = points[i].y - points[i - 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    //equals (сравнения ломаных линий по точкам)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //ссылочное равенство
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) { //null и совпадение классов
            return false;
        }
        PolyLine other = (PolyLine) obj;

        if (this.points == null && other.points == null) { //на null массивов точек
            return true;
        }
        if (this.points == null || other.points == null) {
            return false;
        }

        if (this.points.length != other.points.length) { //длина массивов
            return false;
        }

        for (int i = 0; i < this.points.length; i++) { //поэлементно сравним точки
            Point p1 = this.points[i];
            Point p2 = other.points[i];

            if (p1 == null && p2 == null) { //проверить на null точек
                continue;
            }
            if (p1 == null || p2 == null) {
                return false;
            }

            if (!p1.equals(p2)) { //сравнить координаты точек
                return false;
            }
        }

        return true;
    }

    //переопределим hashCode для согласованности equals
    @Override
    public int hashCode() {
        if (points == null) {
            return 0;
        }

        int result = 1;
        for (Point point : points) {
            result = 31 * result + (point != null ? point.hashCode() : 0);
        }
        return result;
    }

    //переопределим метод clone для глубокого копирования
    @Override
    public PolyLine clone() {
        try {
            PolyLine cloned = (PolyLine) super.clone();

            //глубокое копирование массива точек
            if (this.points != null) {
                cloned.points = new Point[this.points.length];
                for (int i = 0; i < this.points.length; i++) {
                    if (this.points[i] != null) {
                        cloned.points[i] = this.points[i].clone();
                    }
                }
            } else {
                cloned.points = null;
            }

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(" Клонирование не поддерживается");
        }
    }

    @Override
    public String toString() {
        if (points == null || points.length == 0) {
            return "PolyLine[]";
        }

        StringBuilder sb = new StringBuilder("PolyLine[");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
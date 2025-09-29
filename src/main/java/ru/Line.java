package ru;

class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Line other = (Line) obj;
        return this.start.equals(other.start) && this.end.equals(other.end);
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }

    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.start = this.start != null ? this.start.clone() : null;
            cloned.end = this.end != null ? this.end.clone() : null;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(" Клонирование не поддерживается");
        }
    }

    @Override
    public String toString() {
        return "Линия для " + start + " будет " + end;
    }
}
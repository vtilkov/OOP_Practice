package com;

enum MathOperation {
    ADDITION {
        @Override
        public int apply(int x, int y) {
            return x + y;
        }

        @Override
        public String toString() {
            return "сложение";
        }
    },
    SUBTRACTION {
        @Override
        public int apply(int x, int y) {
            return x - y;
        }

        @Override
        public String toString() {
            return "вычитание";
        }
    },
    MULTIPLICATION {
        @Override
        public int apply(int x, int y) {
            return x * y;
        }

        @Override
        public String toString() {
            return "умножение";
        }
    },
    DIVISION {
        @Override
        public int apply(int x, int y) {
            if (y == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            return x / y;
        }

        @Override
        public String toString() {
            return "деление";
        }
    };

    //метод применить операции
    public abstract int apply(int x, int y);
}
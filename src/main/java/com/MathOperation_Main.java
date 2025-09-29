package com;

public class MathOperation_Main {
    public static void main(String[] args) {
        System.out.println(MathOperation.ADDITION.apply(5, 3));         // 8
        System.out.println(MathOperation.SUBTRACTION.apply(5, 3));      // 2
        System.out.println(MathOperation.MULTIPLICATION.apply(5, 3));   // 15
        System.out.println(MathOperation.DIVISION.apply(6, 3));         // 2
    }
}
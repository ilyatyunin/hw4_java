package ru.betboom;

public class hw4 {
    public static void main(String[] args) {

        // объявляем типы данных
        var varByte = 127;
        int varInt = 10;
        int a = Integer.MAX_VALUE;
        double varDouble = 17.7;
        float varFloat = 17.7F;
        char varChar = 'a';
        long varLong = 17L;

        // операции с переменными разных типов данных
        System.out.println(varByte + varInt);
        System.out.println(varInt * varDouble);
        System.out.println(varDouble - varChar);
        System.out.println(varLong / varDouble);
        System.out.println(varLong / varFloat);
        System.out.println(varInt % varLong);


        // переполнение
        System.out.println((byte) (varByte + varInt));
        System.out.println("Max int is: " + a);
        System.out.println("Min int is: " + (a + 1));
        System.out.println(a + 2);
    }
}
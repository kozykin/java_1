package org.example;

public class Main {
    public static void main(String[] args) {
        byte varByte = 100;
        short varShort = 200;
        int varInt = 500;
        long varLong = 400L;
        double varDouble = 0.88;
        float varFloat = 34.56f;


        System.out.println(varByte + varShort);
        System.out.println(varInt - varLong);
        System.out.println(varLong * varDouble);
        System.out.println(varFloat / varDouble);
        System.out.println(varInt % varLong);

        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a + 4);


    }
}
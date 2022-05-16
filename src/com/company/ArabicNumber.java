package com.company;

public class ArabicNumber {

    public static String[] ARR_AR_NUM = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};


    public static void calculationArabicNumber(String num1, String num2, String operator) {

            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

        if(number1 < 1 | number1 > 10 | number2 < 1 | number2 > 10){

                throw new IllegalArgumentException();

        }

        Calculation calc1 = new Calculation(number1, number2);

        if (operator.equals( "+")) {
            System.out.println(calc1.summation());
        } else if (operator.equals("-")) {
            System.out.println(calc1.subtraction());
        } else if (operator.equals("*")) {
            System.out.println(calc1.multiplication());
        } else if (operator.equals( "/")) {
            System.out.println(calc1.division());
        }
    }
}

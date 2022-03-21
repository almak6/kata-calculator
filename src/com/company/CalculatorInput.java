package com.company;

import java.util.Scanner;

public class CalculatorInput {

    //public static void main(String[] args){

    public static void calculationInput() {

        System.out.println("Впишите математическое выражение: ");

        Scanner scanner = new Scanner(System.in);

        String[] arrStr = scanner.nextLine().split(" ");

        String romNum1 = null;
        String romNum2 = null;
        String arNum1 = null;
        String arNum2 = null;

        for (int i = 0; i < ArabicNumber.ARR_AR_NUM.length; i++) {
            if (arrStr[0].equals(ArabicNumber.ARR_AR_NUM[i])) {
                arNum1 = ArabicNumber.ARR_AR_NUM[i];
            }
            if (arrStr[2].equals(ArabicNumber.ARR_AR_NUM[i])) {
                arNum2 = ArabicNumber.ARR_AR_NUM[i];
            }
        }

        for (int i = 0; i < RomanNumber.values().length; i++) {
            if (arrStr[0].equals(RomanNumber.values()[i].toString())) {
                romNum1 = RomanNumber.values()[i].name();
            }
            if (arrStr[2].equals(RomanNumber.values()[i].toString())) {
                romNum2 = RomanNumber.values()[i].name();

            }
        }

        if (romNum1 != null && romNum2 != null) {
            RomanNumber.calculationRomNum(romNum1, romNum2, arrStr[1]);
        } else {
            ArabicNumber.calculationArabicNumber(arNum1, arNum2, arrStr[1]);
        }


        if (!arrStr[1].equals("*") && !arrStr[1].equals("/") && !arrStr[1].equals("+")
                && !arrStr[1].equals("-")) {

            throw new IllegalArgumentException();
        }
    }
}

















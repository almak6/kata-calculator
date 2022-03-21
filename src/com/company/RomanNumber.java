package com.company;

public enum RomanNumber {
    I(1), II(2), III(3), IV(4), V(5), VI(6),
    VII(7), VIII(8), IX(9), X(10), XX(20),
    XXX(30), XL(40), L(50), LX(60), LXX(70),
    LXXX(80), XC(90), C(100);


    private final int ArabicNumber;

    RomanNumber(int ArabicNumber){
        this.ArabicNumber = ArabicNumber;
    }

    public int getArabicNumber(){
        return ArabicNumber;
    }     //возращает значение поля обьекта Enum

    public static void result(int ArabicNumber) {   //метод выводит в консоль результат математического выражения римскими цифрами от Х
                                                    //ветвление вызывает метод getRomanNumber для обьектов Enum
        int[] arrArNum = new int[2];

        arrArNum[0] = (ArabicNumber / 10) * 10;
        arrArNum[1] = ArabicNumber % 10;

        if (arrArNum[1] == 0){
            System.out.println(RomanNumber.getRomanNumber(ArabicNumber));
        } else {
            System.out.println(RomanNumber.getRomanNumber(arrArNum[0]).name() + RomanNumber.getRomanNumber(arrArNum[1]).name());
        }
    }

    public static RomanNumber getRomanNumber(int ArabicNumber) { //возвращает обьект Enum по его значению переданных в аргументы
        for (RomanNumber number : RomanNumber.values()) {
            if (number.getArabicNumber() == ArabicNumber) {
                return number;
            }
        }
        throw new IllegalArgumentException(); //return поменять?
    }

    public static RomanNumber getInstance (String s){             //возвращает обьект Enum во время сравнения строки с консоли
        for(RomanNumber number : RomanNumber.values()){
            if(number.name().equals(s)) {
                return number;
            }
        }
        throw new IllegalArgumentException();                     //из за того, что здесь выкидывает исключение при не
                                                                  // нахождении экземплчра класса по задданному знвчению в аргументе
                                                                  //пришлось городить цикл for с массивами
    }

    public static void calculationRomNum(String num1, String num2, String operator){

        RomanNumber romNum1 = RomanNumber.getInstance(num1);
        RomanNumber romNum2 = RomanNumber.getInstance(num2);

        int number1 = romNum1.getArabicNumber();
        int number2 = romNum2.getArabicNumber();

        Calculation calc1 = new Calculation(number1, number2);

        if (operator.equals("+")) {
            if (calc1.summation() > 10) {
                RomanNumber.result(calc1.summation());
            } else {
                System.out.println(RomanNumber.getRomanNumber(calc1.summation()));
            }
        } else if (operator.equals("-")) {
            if (calc1.subtraction() > 10) {
                RomanNumber.result(calc1.subtraction());
            } else {
                System.out.println(RomanNumber.getRomanNumber(calc1.subtraction()));
            }
        } else if (operator.equals("*")) {
            if (calc1.multiplication() > 10) {
                RomanNumber.result(calc1.multiplication());
            } else {
                System.out.println(RomanNumber.getRomanNumber(calc1.multiplication()));
            }
        } else if (operator.equals("/")) {
            if (calc1.division() > 10) {
                RomanNumber.result(calc1.division());
            } else {
                System.out.println(RomanNumber.getRomanNumber(calc1.division()));
            }
        }
    }
}

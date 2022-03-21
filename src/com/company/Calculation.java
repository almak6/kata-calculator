package com.company;

public class Calculation {

            private int a;
            private int b;

            public Calculation(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int summation() {
                int sum = a + b;
                return sum;
            }
            public int subtraction() {
                int subtr = a - b;
                return subtr;
            }
            public int multiplication() {
                int mplic = a * b;
                return mplic;
            }
            public int division() {
                int div = a / b;
                return div;
            }



        }

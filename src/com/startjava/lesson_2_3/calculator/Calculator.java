package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private int result;
    private char sign;
    
    public boolean setNumber1(int number) {
        if (isNumberCorrect(number)) {
            number1 = number;
            return true;
        }
        System.out.println("Укажите положительное целое число.");
        return false;
    }

    public int getNumber1() {
        return number1;
    }

    public boolean setNumber2(int number) {
        if (isNumberCorrect(number)) {
            number2 = number;
            return true;
        }
        System.out.println("Укажите положительное целое число.");
        return false;
    }

    public int getNumber2() {
        return number2;
    }

    public boolean setSign(char sign) {
        if ((sign == '+') || (sign == '-') || (sign == '*') || 
                (sign == '/') || (sign == '^') || (sign == '%')) {
            this.sign = sign;
            return true;
        }
        System.out.println("Вы указали некорректный математический знак.");
        return false;
    }

    public char getSign() {
        return sign;
    }

    public void calculate() {
        switch (sign) {
            case '+' : 
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
            case '%' :
                result = number1 % number2;
                break;
        }
    }

    public int getResult() {
        return result;
    }
    
    private boolean isNumberCorrect(int x) {
        return x > 0 ? true : false;
    }
}
public class Calculator {

    private int number1;
    private int number2;
    private int result;
    private char sign;
    
    public void setNumber1(int number) {
        if (isNumberCorrect(number)) {
            number1 = number;
        } else {
            System.out.println("Укажите положительное целое число.");
            number1 = -1;
        }
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number) {
        if (isNumberCorrect(number)) {
            number2 = number;
        } else {
            System.out.println("Укажите положительное целое число.");
            number2 = -1;
        }
    }

    public int getNumber2() {
        return number2;
    }

    public void setSign(char sign) {
        if ((sign == '+') || (sign == '-') || (sign == '*') || (sign == '/') || (sign == '^') 
                    || (sign == '%')) {
            this.sign = sign;
        } else {
            this.sign = '\u0000';
            System.out.println("Вы указали некорректный математический знак.");
        }
    }

    public char getSign() {
        if (isSignCorrect()) {
            return sign;
        }
        return ' ';
    }

    public void calculate() {
        if (isSignCorrect()) {
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
    }

    public int getResult() {
        return result;
    }
    
    private boolean isNumberCorrect(int x) {
        if (x > 0) {
            return true;
        }
        return false;
    }

    private boolean isSignCorrect() {
        if (!(this.sign == ' ')) {
            return true;
        }
        return false;
    }
}
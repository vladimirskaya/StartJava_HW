public class Calculator {

    int number1;
    int number2;
    int result;
    private char sign;
    

    public void setSign(char sign) {
        if ((sign == '+') || (sign == '-') || (sign == '*') || (sign == '/') || (sign == '^') 
                    || (sign == '%')) {
            this.sign = sign;
        } else {
            this.sign = ' ';
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
    
    private boolean isSignCorrect() {
        if (!(this.sign == ' ')) {
            return true;
        }
        return false;
    }
}
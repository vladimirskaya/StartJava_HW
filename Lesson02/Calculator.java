public class Calculator {

    int number1;
    int number2;
    char sign;
    int result;

    // отвечает за проверку мат.знака
    public boolean isSignCorrect(char sign) {
        if ((sign == '+') || (sign == '-') || (sign == '*') || (sign == '/') || (sign == '^') 
                    || (sign == '%')) {
            return true;
        }
        System.out.println("Вы указали некорректный математический знак.");
        return false;
    }

    public void calculate(char sign) {

        if (isSignCorrect(sign)) {
            this.sign = sign;
            switch (this.sign) {
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
}
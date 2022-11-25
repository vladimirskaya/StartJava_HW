public class Calculator {

    public static void main(String[] arg){
        int a = 9;
        int b = 6;
        int result = 1;
        // задаем операцию, которая необходима пользователю
        char sign = '/';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
            } else if (sign == '*') {
                result = a * b;
                } else if (sign == '/') {
                    result = a / b;
                    } else if (sign == '^') {
                        for (int i = 0; i < b; i++) {
                            result *= a;
                        }
                    } else if (sign == '%') {
                        result = a % b;
                        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
} 
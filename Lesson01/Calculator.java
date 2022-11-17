public class Calculator {

    public static void main(String[] arg){
        char plus = '+';
        char minus = '-';
        char multiply = '*';
        char division = '/';
        char rate = '^';
        char remain = '%';
        int a = 9;
        int b = 6;
        int result = 1;
        char sign = '/'; // задаем операцию, которая необходима пользователю
        if (sign == plus) {
            result = a + b;
        }
        if (sign == minus) {
            result = a - b;
        }
        if (sign == multiply) {
            result = a * b;
        }
        if (sign == division) {
            result = a / b;
        }
        if (sign == rate) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        if (sign == remain) {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
} 
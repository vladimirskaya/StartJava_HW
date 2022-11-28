import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;
        char sign;
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            calc.number1 = scanner.nextInt();
            do {
                System.out.print("Введите знак математической операции: ");
                calc.setSign(scanner.next().charAt(0));
            } while (calc.getSign() == ' ');
            System.out.print("Введите второе число: ");
            calc.number2 = scanner.nextInt();
            calc.calculate();
            System.out.println(calc.number1 + " " + calc.getSign() + " " + calc.number2 + " = " + calc.result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while (!(("yes".equals(userAnswer)) || ("no".equals(userAnswer))));
        } while ("yes".equals(userAnswer));
       
    }
}
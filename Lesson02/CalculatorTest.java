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
                String line = scanner.next();
                sign = line.charAt(0);
            } while (!calc.isSignCorrect(sign));
            System.out.print("Введите второе число: ");
            calc.number2 = scanner.nextInt();
            calc.calculate(sign);
            System.out.println(calc.number1 + " " + sign + " " + calc.number2 + " = " + calc.result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while (!((userAnswer.compareToIgnoreCase("yes") == 0) || (userAnswer.compareToIgnoreCase("no") == 0)));
        } while (userAnswer.compareToIgnoreCase("yes") == 0);
       
    }
}
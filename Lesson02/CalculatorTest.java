import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;
        char sign;
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            do {
                System.out.print("Введите первое число: ");
                calc.setNumber1(scanner.nextInt());
            } while (calc.getNumber1() == -1);
            do {
                System.out.print("Введите знак математической операции: ");
                calc.setSign(scanner.next().charAt(0));
            } while (calc.getSign() == '\u0000');
            do {
                System.out.print("Введите второе число: ");
                calc.setNumber2(scanner.nextInt());
            } while (calc.getNumber2() == -1);
            calc.calculate();
            System.out.println(calc.getNumber1() + " " + calc.getSign() + " " + calc.getNumber2() + " = " + calc.getResult());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while (!(("yes".equals(userAnswer)) || ("no".equals(userAnswer))));
        } while ("yes".equals(userAnswer));
       
    }
}
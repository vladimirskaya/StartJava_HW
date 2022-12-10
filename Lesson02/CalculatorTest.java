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
            } while (!calc.setNumber1(scanner.nextInt()));
            do {
                System.out.print("Введите знак математической операции: ");
            } while (!calc.setSign(scanner.next().charAt(0)));
            do {
                System.out.print("Введите второе число: ");
            } while (!calc.setNumber2(scanner.nextInt()));
            calc.calculate();
            System.out.println(calc.getNumber1() + " " + calc.getSign() + " " 
                    + calc.getNumber2() + " = " + calc.getResult());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while ((!"yes".equals(userAnswer)) && (!"no".equals(userAnswer)));
        } while ("yes".equals(userAnswer));
       
    }
}
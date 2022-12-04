import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        boolean isEnded = false;
        String answerForContinue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.play();
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            // Scanner scanner = new Scanner(System.in);
            answerForContinue = scanner.next();
            if ("yes".equals(answerForContinue)) {
                isEnded = false;;
            } else if ("no".equals(answerForContinue)) {
                isEnded  = true;
            } else {
                do {
                    System.out.println("Хотите продолжить игру? [yes/no]: ");
                    answerForContinue = scanner.next();
                    } while (!(("yes".equals(answerForContinue)) || ("no".equals(answerForContinue))));
            }
        } while (!isEnded);
    }
}
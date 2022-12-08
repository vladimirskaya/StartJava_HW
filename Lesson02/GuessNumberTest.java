import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String playerAnswer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                playerAnswer = scanner.next();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        } while (!"no".equals(playerAnswer));
    }
}
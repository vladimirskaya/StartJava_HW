import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static Player player1;
    private static Player player2;
    private static Player currentPlayer;
    private static int secretNumber;
    private static boolean isEnded;
    private static boolean isGuessed;

    public GuessNumber(Player obj1, Player obj2) {
        player1 = obj1;
        player2 = obj2;
        currentPlayer = player1;
        isEnded = false;
    }

    public boolean getIsEnded() {
        return isEnded;
    }

    public void createNewGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100);
        System.out.println("Cлучайное число = " + secretNumber);
        isEnded = false;
        isGuessed = false;
        currentPlayer = player1;
        System.out.println("Число отгадывает " + currentPlayer.getName());
    }

    public void playGame() {
        createNewGame();
        do {
            insertNumber(currentPlayer);
            compareNumber(currentPlayer);
            if (isGuessed) {
                askAboutContinueing();
                if (!isEnded) {
                    return;
                }
            } else {
                // System.out.println("Смена игроков. Угадывал текущий = " + currentPlayer.getName());
                changePlayers(currentPlayer);
            }
        } while (!isEnded);
    }

    public void askAboutContinueing() {
        System.out.println("Хотите продолжить игру? [yes/no]: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
        if ("yes".equals(userAnswer)) {
            isEnded = false;;
        } else if ("no".equals(userAnswer)) {
            isEnded  = true;
        } else {
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                userAnswer = scanner.next();
            } while (!(("yes".equals(userAnswer)) || ("no".equals(userAnswer))));
        }
    }

    public static void changePlayers(Player player) {
        if (player == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        System.out.println("Число отгадывает " + currentPlayer.getName());
        
    }

    public static void insertNumber(Player currentPlayer) {
        do {
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            currentPlayer.setUserNumber(number);
        } while (currentPlayer.getUserNumber() == -1);
    }

    public static void compareNumber(Player player) {
        if (player.getUserNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число!");
            isGuessed = true;
        } else {
            isGuessed = false;
            if (player.getUserNumber() > secretNumber) {
                    System.out.println("Число " + player.getUserNumber() + " больше того, что загадал компьютер.");
            } else {
                System.out.println("Число " + player.getUserNumber() + " меньше того, что загадал компьютер.");
            }
        }
    }

}
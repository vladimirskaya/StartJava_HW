import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static Player player1;
    private static Player player2;
    private static Player currentPlayer;
    private static int secretNumber;
    private static boolean isGuessed;

    public GuessNumber(Player obj1, Player obj2) {
        player1 = obj1;
        player2 = obj2;
        currentPlayer = player1;
    }

    public void createNewGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100);
        System.out.println("Случайное число = " + secretNumber);
        isGuessed = false;
        currentPlayer = player1;
        System.out.println("Число отгадывает " + currentPlayer.getName());
    }

    public void play() {
        createNewGame();
        do {
            insertNumber(currentPlayer);
            compareNumber(currentPlayer);
            if (!isGuessed) {
                changePlayers(currentPlayer);
            }
        } while (!isGuessed);
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
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            currentPlayer.setNumber(number);
        } while (currentPlayer.getNumber() == -1);
    }

    public static void compareNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число!");
            isGuessed = true;
        } else {
            isGuessed = false;
            if (player.getNumber() > secretNumber) {
                    System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер.");
            } else {
                System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер.");
            }
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static Player player1;
    private static Player player2;
    private static Player currentPlayer;
    private static int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    

    public void play() {
        init();
        boolean result;
        do {
            inputNumber(currentPlayer);
            result = compareNumber(currentPlayer);
            if (!result) {
                changePlayer(currentPlayer);
            }
        } while (!result);
    }

    private void init() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        System.out.println("Случайное число = " + secretNumber);
        currentPlayer = player1;
        System.out.println("Число отгадывает " + currentPlayer.getName());
    }

    private static void inputNumber(Player currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            currentPlayer.setNumber(number);
        } while (currentPlayer.getNumber() == 0);
    }

    private static boolean compareNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число!");
            return true;
        } else {
            if (player.getNumber() > secretNumber) {
                    System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер.");
            } else {
                System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер.");
            }
            return false;
        }
    }

    private static void changePlayer(Player player) {
        if (player == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        System.out.println("Число отгадывает " + currentPlayer.getName());
    }
}
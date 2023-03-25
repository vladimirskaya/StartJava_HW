package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    public void play() {
        init();
        do {
            changePlayer(currentPlayer);
            inputNumber(currentPlayer);
        } while (!compareNumber(currentPlayer));
    }

    private void init() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        System.out.println("Случайное число: " + secretNumber);
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            player.setNumber(number);
        } while (player.getNumber() == 0);
    }

    private boolean compareNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число!");
            return true;
        }
        if (player.getNumber() > secretNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер.");
        }
        return false;
    }

    private void changePlayer(Player player) {
        currentPlayer = (player == player1) ? player2 : player1;
    }
}
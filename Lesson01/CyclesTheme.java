public class CyclesTheme {
    
    public static void main(String[] arg) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        int startSement = -10;
        int endSegment = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (startSement % 2 == 0) {
                sumEvenNumbers += startSement;
            } else {
                sumOddNumbers += startSement;
            }
            startSement++;
        } while (startSement <= endSegment);
        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumEvenNumbers + 
                " , а нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        int max = b;
        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print( i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        int number3 = 1234;
        int sumDigits = 0;
        while (number3 != 0) {
            int digit = number3 % 10;
            System.out.print(digit);
            number3 /= 10; 
            sumDigits += digit;
        }
        System.out.println("\nСумма цифр = " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int endHalfInterval = 24;
        int amountNumbers = 0;
        int amountNumbersPerLine = 5;
        for (int i = 1; i < endHalfInterval; i += 2) {
            amountNumbers++;
            System.out.printf("%5d", i);
            if (amountNumbers % amountNumbersPerLine == 0) {
                System.out.println();
            }
        }
        for (int j = amountNumbers % amountNumbersPerLine; j < amountNumbersPerLine; j++) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность.");
        int number5 = 3141591;
        int copyNumber5 = number5;
        int amountOnes = 0;
        while (number5 != 0) {
            int digit = number5 % 10;
            if (digit == 1) {
                amountOnes++;
            }
            number5 /= 10;
        }
        if (amountOnes % 2 == 0) {
            System.out.println("Число " + copyNumber5 + " содержит четное количество единиц.");
        } else {
            System.out.println("Число " + copyNumber5 +" содержит нечетное количество единиц.");
        }

        System.out.println("\n6. Отображение фигур в консоли.");
        int length = 10;
        int height = 5;
        for (int i = 0; i < height; i ++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        length = 5;
        height = 5;
        int currentHeight = 0;
        int currentLength = length;
        while (currentHeight != height) {
            while (currentLength != 0) {
                System.out.print("#");
                currentLength--;
            }
            System.out.println();
            currentHeight++;
            currentLength = length - currentHeight;
        }

        height = 5;
        length = 3;
        currentHeight = 0;
        currentLength = 0;
        int count = 1;
        do {
            currentHeight++;
            if (currentHeight <= height / 2 + 1) {
                    currentLength++;
                } else if (currentHeight <= height) {
                    currentLength--;
                }
            int cycles = currentLength;
            do {
                System.out.print("$");
                cycles--;
            } while (cycles > 0);
            System.out.println();
        } while (currentHeight < height);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.printf("%10s%10s%n", "Dec", "Char");
        for (int i = 0; i < 48; i++) {
            if (i % 2 == 1) {
                System.out.printf("%10d%10c%n", i, i);
            }
        }
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%10d%10c%n", i, i);
            }
        } 

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int origNumber = 1234321;
        int compareNumber = 0;
        int x = origNumber;
        int order = 1_000_000;
        while (x != 0) {
            compareNumber += x % 10 * order;
            x /= 10;
            order /= 10;
            }
        if (origNumber ==  compareNumber) {
            System.out.println("Число X является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым.");
        int number10 = 111111;
        int abc = 0;
        int sum10 = 0;
        int z = 100_000;
        for (int j = 0; j < 6; j++) {
            if (number10 > 1000) {
                abc += number10 / z;
            } else {
                sum10 += number10 / z;
            }
            number10 %= z;
            z /= 10;
        }
        System.out.print("Сумма цифр abc = " + abc + ", sum = " + sum10 + "\nЧисло ");
        if (abc == sum10) {
            System.out.println("является счастливым.");
        } else {
            System.out.println("не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        System.out.printf("%28S%n", "таблица Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    if (i == 1) {
                        System.out.printf("%4s", "|");
                    } else {
                        System.out.printf("%2d%2s", i, "|");
                    }
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            if (i == 1) {
                System.out.print("\n-------------------------------------");
            }
            System.out.println();
        }
    }
}
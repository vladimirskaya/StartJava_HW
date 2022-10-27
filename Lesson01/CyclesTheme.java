public class CyclesTheme {
    
    public static void main(String[] arg) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        int period = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (period % 2 == 0) {
                sumEvenNumbers += period;
            } else {
                sumOddNumbers += period;
            }
            period++;
        } while (period < 21);
        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumEvenNumbers + 
                " , а нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int a = 10;
        int b = 5;
        int c = -1;
        int max;
        int min;
        if (a > b) {
            if (a > c) {
                max = a;
                if ( b > c) {
                    min = c;
                } else {
                    min = b;
                }
            } else {
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (a > c) {
                    min = c;
                } else {
                    min = a;
                }
            } else {
                max = c;
                min = a;
            }
        }
        for (int i = max - 1; i > min; i--){
            System.out.print( i + " ");
        }
        System.out.print("\n");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр.");
        int num3 = 1234;
        int sum3 = 0;
        int x;
        while (num3 != 0) {
            x = num3 % 10;
            System.out.print(x);
            num3 /= 10;
            sum3 += x;
        }
        System.out.println("\nСумма цифр = " + sum3);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int x1 = 1;
        int x2 = 24;
        int step = 2;
        int amountNumbers = 0;
        int amountNumbersInString = 5;
        int allNumbers = (x2 - x1 + 1) / step;
        for (int i = x1; i < x2; i = i + step) {
            amountNumbers++;
            if (amountNumbers % amountNumbersInString != 0) {
                System.out.printf("%5d", i);
            } else {
                System.out.printf("%5d%n", i);
            }
            if (amountNumbers == allNumbers) {
                for (int j = amountNumbers % amountNumbersInString; j < amountNumbersInString; j++) {
                    System.out.printf("%5d", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность.");
        int num5 = 3141591;
        int duplicateNum = num5;
        int lastNumber = 0;
        int amountOf1 = 0;
        while (num5 != 0) {
            lastNumber = num5 % 10;
            if (lastNumber == 1) {
                amountOf1++;
            }
            num5 /= 10;
        }
        if (amountOf1 % 2 == 0) {
            System.out.println("Число " + duplicateNum + " содержит четное количество единиц.");
        } else {
            System.out.println("Число " + duplicateNum +" содержит нечетное количество единиц.");
        }

        System.out.println("\n6. Отображение фигур в консоли.");
        int length = 10;
        int height = 5;
        for (int i = 0; i < height; i ++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
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
            System.out.print("\n");
            currentHeight++;
            currentLength = length - currentHeight;
        }

        height = 5;
        length = 3;
        currentHeight = 0;
        currentLength = 0;
        int count = 0;
        do {
            currentHeight++;
            if (currentHeight <= 3) {
                do {
                    System.out.print("$");
                    currentLength++;
                } while (currentLength < currentHeight);
                currentLength = 0;
            } else {
                count++;
                currentLength = length - count;
                do {
                    System.out.print("$");
                    currentLength--;
                } while (currentLength > 0);
            }
            System.out.print("\n");
        } while ( currentHeight < height);

        System.out.println("\n7. Отображение ASCII-символов.");
        int dec = 0;
        char chr;
        System.out.printf("%10s", "Dec");
        System.out.printf("%10s%n", "Char");
        for (int i = 0; i < 48; i++) {
            if (i % 2 == 1) {
                System.out.printf("%10d", i);
                System.out.printf("%10s%n", (char) i);
            }
        }
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%10d", i);
                System.out.printf("%10s%n", (char) i);
            }
        } 

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number = 1234321;
        byte amountEqualNumbers = 0;
        int y = 1_000_000;
        int number1;
        int number2;
        while (y > 10) {
            number1 = number / y;
            number2 = number % 10;
            if (number1 == number2) {
                amountEqualNumbers++;
            }
            number = (number - y * number1) / 10;
            y /= 100; 
            if (amountEqualNumbers == 3) {
                System.out.println("Число X является палиндромом.");
            }
        }

        System.out.println("\n10. Определение, является ли число счастливым.");
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
        System.out.print("\nСумма цифр abc = " + abc + ", sum = " + sum10 + "\nЧисло ");
        if (abc == sum10) {
            System.out.println("является счастливым.");
        } else {
            System.out.println("не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        System.out.printf("%28S%n", "таблица Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1){
                    if (i == 1) {
                        System.out.printf("%4s", "|");
                    } else {
                        System.out.printf("%2d", i);
                        System.out.printf("%2s", "|");
                    }
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            if (i == 1) {
                System.out.print("\n-------------------------------------");
            }
            System.out.print("\n");
        }
    }
}
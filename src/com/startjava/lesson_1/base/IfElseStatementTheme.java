package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    
    public static void main(String[] arg) {
        System.out.println("\n1. Перевод псевдокода на язык Java.");
        byte age = 56;
        float height = 1.70f;
        boolean maleGender = false;
        if (age > 20) {
            System.out.println("Вам больше 20 лет.");
        } else {
            System.out.println("Вам меньше 20 лет");
        }    
        if (!maleGender) {
        System.out.println("Вы женщина.");
        } else {
            System.out.println("Вы мужчина.");
        }
        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1.80 м.");
        } else {
            System.out.println("Ваш рост больше 1.80 м.");
        }
        char firstNameLetter = "mary".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы \"М\".");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы \"I\".");
        } else {
            System.out.println("Ваше имя начинается не с буквы \"М \"и не с буквы \"I\".");
        }

        System.out.println("\n2. Поиск max и min числа.");
        int a = 178;
        int b = 132;
        if (a == b) {
            System.out.println("Числа " + a + " и " + b + " равны.");
        } else if (a > b) {
            System.out.println("max равно " + a + " и min число равно " + b);
        } else {
            System.out.println("max число равно " + b + " и min число равно " + a);
        }

        System.out.println("\n3. Работа с числом.");
        int num = -9;
        System.out.println("Число " + num);
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.print("Число чётное");
            } else {
                System.out.print("Число нечетное");
            }
            if (num >= 0) {
                System.out.print(" и положительное");
            } else {
                System.out.print(" и отрицательное");
            }
        }

        System.out.println("\n\n4.Поиск одинаковых цифр в числах");
        int num1 = 333;
        int num2 = 331;
        boolean equalDigits = false;
        System.out.println("Исходные числа: " + num1 + " и " + num2);
        int digit1 = num1 / 100;
        int digit2 = num2 / 100;
        if (digit1 == digit2) {
            equalDigits = true;
            System.out.println("Числа имеют одинаковую цифру " + digit1 + " на 1 разряде.");
        }
        digit1 = num1 % 100 / 10;
        digit2 = num2 % 100 / 10;
        if (digit1 == digit2) {
            equalDigits = true;
            System.out.println("Числа имеют одинаковую цифру " + digit1 + " на 2 разряде.");
        }
        digit1 = num1 % 10;
        digit2 = num2 % 10;
        if (digit1 == digit2) {
            equalDigits = true;
            System.out.println("Числа имеют одинаковую цифру " + digit1 + " на 3 разряде.");
        }
        if (!equalDigits) {
            System.out.println("В данных числах нет одинаковых цифр на соответствующих разрядах.");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду.");
        char symbol = '\u0057';
        if ((symbol >= (char) '0') && (symbol <= (char) '9')) {
            System.out.println("Значение " + symbol + " является цифрой."); 
        } else if ((symbol >= 'A') && (symbol <= 'Z')) {
            System.out.println("Значение " + symbol + " является заглавной буквой.");
        } else if ((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println("Значение " + symbol + " прописной буквой.");
        } else {
            System.out.println("Значение " + symbol + " является ни буквой, ни цифрой.");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300_000;
        float percent;
        if (deposit < 100_000) {
            percent = 5f;
        } else if (deposit > 300_000) {
            percent = 10f;
        } else {
            percent = 7f;
        }
        double accruedInterest = deposit * percent / 100;
        double totalSum = deposit + accruedInterest;
        System.out.println("Сумма вклада: " + deposit + ".");
        System.out.println("Начисленный процент: " + accruedInterest);
        System.out.println("Итоговая сумма: " + totalSum);

        System.out.println("\n7. Определение оценки по предметам.");
        int historyRate = 59;
        int programmingRate = 91;
        int historyBall = 2;
        int programmingBall = 2;
        if (historyRate > 91) {
            historyBall = 5;
        } else if (historyRate > 73) {
            historyBall = 4;
        } else if (historyRate > 60) {
            historyBall = 3;
        }
        if (programmingRate > 91) {
            programmingBall = 5;
        } else if (programmingRate > 73) {
            programmingBall = 4;
        } else if (programmingRate > 60) {
            programmingBall = 3;
        } 
        System.out.println(historyBall + " - история");
        System.out.println(programmingBall + " - программирование");
        System.out.println((historyBall + programmingBall) / 2 + " - средний балл оценок по предметам");
        System.out.println((historyRate + programmingRate) / 2 + " - средний процент по предметам");

        System.out.println("\n8. Расчет прибыли.");
        int renta = 5000;
        int sales = 13000;
        int cost = 9000;
        double annualProfit = (sales - renta - cost) * 12;
        char plus  = (annualProfit > 0) ? '+': ' ';
        System.out.println("Годовая прибыль составляет: " + plus  + annualProfit);

        System.out.println("\n9. Подсчет количества банкнот.");
        int needMoney = 567;
        int amountBanknotes100 = 10;
        int amountBanknotes10 = 5;
        int amountBanknotes1 = 50;
        int needAmountBanknotes100 = needMoney / 100;
        int needAmountBanknotes10 = needMoney % 100 / 10;
        int needAmountBanknotes1 = needMoney % 10;
        if (needAmountBanknotes100 > amountBanknotes100) {
            needAmountBanknotes10 += 10 * (needAmountBanknotes100 - amountBanknotes100);
            needAmountBanknotes100 = amountBanknotes100;
        }
        if (needAmountBanknotes10 > amountBanknotes10) {
            needAmountBanknotes1 += 10 * (needAmountBanknotes10 - amountBanknotes10);
            needAmountBanknotes10 = amountBanknotes10;
        }
        System.out.println("Номиналы банкнот:          100     10     1");
        System.out.println("Требуемое количество:       " + needAmountBanknotes100 + "       "
                + needAmountBanknotes10 + "     " + needAmountBanknotes1);
    }
}
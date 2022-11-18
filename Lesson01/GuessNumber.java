public class GuessNumber {
    
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;
        int secretNumber = 49;
        int userNumber = 35;
        do {
            if (userNumber > secretNumber) {
                System.out.println("Число " + userNumber + " больше того, что загадал компьютер.");
                endRange = userNumber;
            } else {
                System.out.println("Число " + userNumber + " меньше того, что загадал компьютер.");
                startRange = userNumber;
            }
            // находим длину отрезка, делим ее пополам, прибавляем к нижней границе
            userNumber = startRange + (endRange - startRange) / 2;
        } while (userNumber != secretNumber);
        System.out.println("Вы победили!");
    }
}
public class GuessNumber {
    
    public static void main(String[] args) {
        int lowerLimit = 0;
        int upperLimit = 100;
        int riddledNumber = 49; // загаданное число
        int userNumber = 35;
        do {
            if (userNumber > riddledNumber) {
                System.out.println("Число " + userNumber + " больше того, что загадал компьютер.");
                upperLimit = userNumber;
                
            } else {
                System.out.println("Число " + userNumber + " меньше того, что загадал компьютер.");
                lowerLimit = userNumber;
            }
            userNumber = lowerLimit + (upperLimit - lowerLimit) / 2; // находим длину отрезка, делим ее пополам, прибавляем к нижней границе
        } while (userNumber != riddledNumber);
        System.out.println("Вы победили!");
    }
}
public class Player {
    private String name;
    private int userNumber;
    
    public Player(String name) {
        this.name = name;
        userNumber = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUserNumber(int number) {
        if ((number > 0) && (number <= 100)) {
            userNumber = number;
        } else {
            System.out.println("Число не входит в полуинтервал (0 до 100]");
            userNumber = -1;
        }
    }

    public int getUserNumber() {
        return userNumber;
    }
}

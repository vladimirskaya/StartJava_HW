public class Player {
    private String name;
    private int number;
    
    public Player(String name) {
        this.name = name;
        number = -1;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int num) {
        if ((num > 0) && (num <= 100)) {
            number = num;
        } else {
            System.out.println("Число не входит в полуинтервал (0 до 100]");
            number = -1;
        }
    }

    public int getNumber() {
        return number;
    }
}

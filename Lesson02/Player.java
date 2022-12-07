public class Player {
    private String name;
    private int number;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if ((number > 0) && (number <= 100)) {
            this.number = number;
        } else {
            System.out.println("Число не входит в полуинтервал (0 до 100]");
            this.number = 0;
        }
    }

    public int getNumber() {
        return number;
    }
}

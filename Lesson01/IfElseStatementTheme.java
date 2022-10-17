public class IfElseStatementTheme {
    
    public static void main(String arg[]){
        System.out.println("\n1. Перевод псевдокода на язык Java.");
        byte age = 56;
        float height = 1.70f;
        boolean isMan = false;
        char firstNameLetter;
        if (age > 20) {
            System.out.println("Вам больше 20 лет.");
        } else {
            System.out.println("Вам меньше 20 лет");
        }    
        if (!isMan) {
        System.out.println("Вы женщина.");
        } else {
            System.out.println("Вы мужчина.");
        }
        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1.80 м.");
        } else {
            System.out.println("Ваш рост больше 1.80 м.");
        }
        firstNameLetter = "mary".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы \"М\".");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы \"I\".");
        } else {
            System.out.println("Ваше имя начинается не с буквы \"М \"и не с буквы \"I\".");
        }
    }
}
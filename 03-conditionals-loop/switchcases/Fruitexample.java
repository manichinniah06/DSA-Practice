import java.util.Scanner;

public class Fruitexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit :");
        String fruit = sc.nextLine();
        System.out.print("Enter a day: ");
        String day = sc.nextLine();

        switch (fruit){
            case "Mango":
            case "mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
            case "apple":
                System.out.println("Sweet red Fuit");
                break;
            case "Orange":
            case "orange":
                System.out.println("Orange is round fruit");
                break;
            case "Grapes":
            case "grapes":
                System.out.println("Grapes is violet in colour");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }

        switch(day){
            case "Monday" -> System.out.println("Monday blues");
            case "Tuesday" -> System.out.println("It's second day, push onn");
            case "Wednesday" -> System.out.println("Mid Week");
            case "Thursday" -> System.out.println("1 more day, thatit!");
            case "Friday" -> System.out.println("Weekend vibes");
        }
    }
}
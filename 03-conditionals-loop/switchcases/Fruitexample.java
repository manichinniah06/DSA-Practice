import java.util.Scanner;

public class Fruitexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit :");
        String fruit = sc.nextLine();

        switch (fruit){
            case "Mango":
            case "mango":
                System.out.print("King of fruits");
                break;
            case "Apple":
            case "apple":
                System.out.print("Sweet red Fuit");
                break;
            case "Orange":
            case "orange":
                System.out.print("Orange is round fruit");
                break;
            case "Grapes":
            case "grapes":
                System.out.print("Grapes is violet in colour");
                break;
            default:
                System.out.print("Enter a valid fruit");
        }
    }
}
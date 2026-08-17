//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largestnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("Enter the first number :");
        int firstnum = sc.nextInt();
        System.out.print("Enter the second number :");
        int secondnum = sc.nextInt();
        if(firstnum > secondnum){
            System.out.println(firstnum+" is greater");
        }
        else if (secondnum > firstnum){
            System.out.println(secondnum+" is greater");
        }
        else{
            System.out.println("Both are same");
        }
    }
}
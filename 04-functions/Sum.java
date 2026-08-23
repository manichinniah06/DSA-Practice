import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        sum();
        System.out.print("Sum = "+sum1());
    }

    static int sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = "+sum);
    }
}
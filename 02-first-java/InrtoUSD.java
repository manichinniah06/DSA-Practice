import java.util.Scanner;

public class InrtoUsd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR : ");
        float inr = sc.nextFloat();
        double result = 0.010 * inr;
        System.out.print("Amount in USD : "+result);
    }
}
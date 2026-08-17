//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

import java.util.Scanner;

public class Simpleinterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal :");
        int principal = sc.nextInt();
        System.out.print("Time (years) :");
        int time = sc.nextInt();
        System.out.print("Rate of Interest :");
        float rate = sc.nextFloat();
        float interest = principal*time*rate / 100;
        System.out.println("Interest : "+interest);
    }
}
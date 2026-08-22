//Kunal is allowed to go out with his friends only on the even days of a given month. 
// Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class Nofdays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days in the month :");
        int days = sc.nextInt();
        int outdays = 0;
        for(int i =0;i<days;i++){
            if (i%2==0){
                outdays++;
            }
        }
        System.out.print("No of days Kunal went out :"+outdays);
    }
}
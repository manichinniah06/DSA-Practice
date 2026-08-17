//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        int low = 0;
        int high = s.length() - 1;
        int count = 0;
        while(low<high){
            if(s.charAt(low) == s.charAt(high) && count >= 0){
                low++;
                high--;
                count++;
            }
            else{
                break;
            }
        }
        if(count == (s.length()/2)){
            System.out.print("Is is a Palindrome");
        }
        else{
            System.out.print("Is is not a Palindrome");
        }
    }
}
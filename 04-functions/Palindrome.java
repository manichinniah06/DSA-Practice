import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)){
            System.out.println(num + " is a Palindrome");
        }
        else{
            System.out.println(num + " is not Palindrome");
        }
    }
    static boolean isPalindrome(int num){
        int reversenum = 0;
        int inital = num;
        while(num>0){
            reversenum = reversenum*10 + (num%10);
            num = num/10;
        }
        if(reversenum==inital){
            return true;
        }
        return false;
    }
}
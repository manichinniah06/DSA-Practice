import java.util.Scanner;

public class Sumofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = 0;
        while(num>0){
            temp = temp+ (num%10);
            num = num/10;
        }
        System.out.print("Sum of digits: "+temp);
    }
}
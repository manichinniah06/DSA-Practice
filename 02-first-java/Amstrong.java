//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Amstrong{
    static boolean isAmstrong(int num){
        int[] digits = new int[50];
        int i = 0;
        int sum = 0;
        int n = num;
        int count = 0;
        while(num > 0){
            int temp_digit = num%10;
            digits[i] = temp_digit;
            i++;
            count = count + 1;
            num = num / 10;
        }
        for(int j = 0;j<i;j++){
            sum += Math.pow(digits[j],count);
        }
        if (sum == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1;i<=n2;i++){
            if(isAmstrong(i)){
                System.out.print(i);
            }
        }
    }
}
import java.util.Scanner;

public class Countingdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N :");
        int n = sc.nextInt();
        //just counting the digit 5
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 5){
                count ++;
            }
            n = n/10;
        }
        System.out.print("Count :"+count);
    }
}
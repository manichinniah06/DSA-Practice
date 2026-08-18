import java.util.Scanner;

public class Reversenumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int result = 0;
        while(n>0){
            int temp = n%10;
            result = result*10 + temp;
            n = n/10;
        }
        System.out.print("Result :"+result);
    }
}

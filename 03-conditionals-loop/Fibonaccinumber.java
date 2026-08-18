import java.util.Scanner;

public class Fibonaccinumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=2;i<=n;i++){
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.print("Result :"+b);
    }
}

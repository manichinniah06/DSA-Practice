import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Amstrongnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isAmstrong(num)){
            System.out.println(num + " is a Amstrong number");
        }
        else{
            System.out.println(num + " is not Amstrong number");
        }
    }
    static boolean isAmstrong(int num){
        int digitcount = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        int result = 0;
        int initial = num;
        while(num>0){
            digitcount += 1;
            digits.add(num % 10);
            num = num/10;
        }
        for(int j = 0;j<digitcount;j++){
            result+= Math.pow(digits.get(j),digitcount);
        }
        if(result==initial){
            return true;
        }
        return false;
    }
}
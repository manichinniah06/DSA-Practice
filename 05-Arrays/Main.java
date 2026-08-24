//To Practice syntax of arrays
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // datatype[] variablename = new datatype[size]

        int[] rnos = new int[5];

        int[] rnos2 = {23, 12, 45, 32, 15};

        for (int num : rnos2){
            System.out.print(num + " ");
        } //enhanced for loop

        System.out.println("");

        System.out.println(Arrays.toString(rnos));

        // 2d arrays
        int [][] arr = new int[3][2];

        System.out.println(arr.length);

        for(int row = 0;row < arr.length;row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(arr));
     }
}
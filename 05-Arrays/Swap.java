import java.util.Arrays;

public class Swap{
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 23, 9, 18};
        swap(arr, 1, 3);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // type should be compatable
        // desitination should be greater 
        int num = (int)(67.56f);
        // Type Casting -- explicitly 
        System.out.print(num);

        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        //byte & short --> int
        //long --> long
        //float, Double --> float & Double respectively
    }
}
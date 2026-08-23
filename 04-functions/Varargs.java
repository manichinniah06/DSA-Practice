// if don't know how much variables we are going to pass 
import java.util.Arrays;

public class Varargs{
    public static void main(String args[]){
        fun(1,2,3,4);
        fun(1);
        fun();
    }
    static void fun(int ...v){
        //takes arr input with int datatype
        System.out.println(Arrays.toString(v));
    }
}
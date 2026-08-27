import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(77);
        list.add(87);
        list.add(97);
        list.add(107);
        list.add(117);
        list.add(127);
        list.add(137);
        list.add(147);
        list.add(157);

        System.out.println(list.contains(157));

        list.set(0,99);
        list.remove(2);

        System.out.println(list);

        //input
        for(int i = 0;i < 5;i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
}
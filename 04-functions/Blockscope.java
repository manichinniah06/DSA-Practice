public class Blockscope{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        {
            a = 68; //reassign the original ref variable
            int c = 10;
            //initialized variable only can be accessed inside that particular block
        }
        int c = 100;
        System.out.println(c);
        System.out.println(a);

        // scoping in for loops
        for(int i = 0;i<4;i++){
            System.out.println(i);
            int num = 90;
            //int a = 10; can't reinitialize
            a = 100;
        }
        System.out.print(a);

    }
}
public class Shadowing{
    static int x = 90; //will be available for everything within parantheses
    // x will be shadowed at line 7
    // static - can be executed with creating an object
    public static void main(String[] args){
        System.out.println(x);
        int x = 40; // class variable is shadowed by this
        System.out.println(x);
        // Shadowing -- when we give two variable same variable name within the scope that overlaps 
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
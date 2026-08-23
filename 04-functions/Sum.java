import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Using void");
        System.out.println("2. Using int return type");
        System.out.println("3. Using parameter passing");
        System.out.print("Enter an option :");
        int option = sc.nextInt();

        switch(option){
            case 1 -> sum();
            case 2 -> System.out.print("Sum = "+ sum1());
            case 3 ->{
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                System.out.print("Sum = "+ sum2(num1,num2));
            }
        }
    }

    static int sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = "+sum);
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum2(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
}
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+'||op == '-'||op == '*'||op == '/'||op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    System.out.println("Result : "+(num1+num2));
                }
                else if (op == '-'){
                    System.out.println("Result : "+(num1-num2));
                }
                else if (op == '*'){
                    System.out.println("Result : "+(num1*num2));
                }
                else if (op == '/'){
                    System.out.println("Result : "+(num1/num2));
                }
                else if (op == '%'){
                    System.out.println("Result : "+(num1%num2));
                }
            }
            else if(op == 'X' || op == '*'){
                break;
            }
            else{
                System.out.print("Enter a valid operator");
            }
        }
    }
}
//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter 2 numbers--");
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator :");
        char operator = sc.next().charAt(0);
        if (operator == '+'){
            System.out.print(num1 + " " + operator + " " + num2 + " = " + (num1+num2));
        }
        else if (operator == '-'){
            System.out.print(num1 + " " + operator + " " + num2 + " = " + (num1-num2));
        }
        else if (operator == '*'){
            System.out.print(num1 + " " + operator + " " + num2 + " = " + (num1*num2));
        }
        else if (operator == '/' || operator == '%'){
            System.out.print(num1 + " " + operator + " " + num2 + " = " + (num1/num2));
        }
    }
}
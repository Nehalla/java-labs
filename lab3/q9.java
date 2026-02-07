package lab3;

import java.util.Scanner;

public class q9 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int a= sc.nextInt();
        System.out.println("enter the second number");
        int b= sc.nextInt();
        System.out.println("choose (+ - * / ):" );
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println("Result: "+(a+b));
                break;
            case '-':
                System.out.println("Result: "+(a-b));
                break;
            case '*':
                System.out.println("Result: "+(a*b));
                break;
            case '/':
                if(b!=0) {
                    System.out.println("Result: "+(a/b));
                    break;}
                else {
                    System.out.println("Error: Division by zero is not allowed! ");
                    break;}
            default:
                    System.out.println("enter a valid operation");
        }

    }
}

package lab4;

import java.util.Scanner;

public class q3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        do{
            if(a%2==0&&a!=0){
                System.out.println("it is even");
                break;
            }
            else if(a%2!=0&&a!=0){
                System.out.println("it is odd");
                break;
            }
            else
                System.out.println("stop");
            break;
        }while(a>=0);
    }
}

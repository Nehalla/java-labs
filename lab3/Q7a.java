package lab3;

import java.util.Scanner;

public class Q7a {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int a= sc.nextInt();
        if(a%4==0){
            if (a%100!=0||a%400==0){
                System.out.println("leap");
            }
            else
                System.out.println("not leap");
        }
        else
            System.out.println("not leap");
    }
}

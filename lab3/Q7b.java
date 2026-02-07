package lab3;

import java.util.Scanner;

public class Q7b {
    static void main() {


    Scanner sc= new Scanner(System.in);
    System.out.println("enter the year");
    int a= sc.nextInt();
    if(a%4==0&&a%100!=0) {
        System.out.println("it is leap year");
    }

       else if(a%100==0&&a%400==0){
            System.out.println("it is leap");
        }

    else
        System.out.println("not leap year");

   }
}

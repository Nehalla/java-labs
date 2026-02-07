package lab3;

import java.util.Scanner;

public class Q7c {
    static void main() {
    Scanner sc= new Scanner(System.in);
     System.out.println("enter the year");
    int a= sc.nextInt();
    boolean c=  ((a%4==0&&a%100!=0)||a%400==0);
    System.out.println( a+ " is a leap year? "+c );



        }
    }


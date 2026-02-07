package lab4;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the first no: ");
        int a =in.nextInt();
        System.out.print("enter the second no: ");
        int b =in.nextInt();
        System.out.print("enter the third no: ");
        int c =in.nextInt();
        int d=0;

        for (;a<=b;a=a+c) {
            System.out.print(a+"  ");
            d+=a;

        }
        System.out.println("\nThe sum of number displayed is  "+d);


    }

}
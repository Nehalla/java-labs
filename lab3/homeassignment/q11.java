package lab3.homeassignment;

import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the int: ");
        int a = in.nextInt();
        int b =0;
        int c =0;
        if (a%5==0&&a%6==0) {
            System.out.println("Is "+a+" divisible by 5 and 6? true");
            b++;}
        else
            System.out.println("Is "+a+" divisible by 5 and 6? false");
        if (a%5==0||a%6==0) {
            System.out.println("Is "+a+" divisible by 5 or 6? true");
            c++;}
        else
            System.out.println("Is "+a+" divisible by 5 or 6? false");
        if(b==0&&c==1)
            System.out.println("Is "+a+" divisible by 5 or 6, but not both? True");
        else
            System.out.println("Is "+a+" divisible by 5 or 6, but not both? false");
    }

}
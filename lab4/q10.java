package lab4;

import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the no:");
        int a = in.nextInt();
        int t = a;
        int c=1;
        int b = 0;
        while(a>0) {
            if (a%10!=0) {
                b+=(a%10)*c;

                c*=10;}
            a/=10;
        }



        System.out.println("After removing 0 from number "+t+", the new number is  "+b);

    }

}

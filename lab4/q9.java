package lab4;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the no:");
        int a = in.nextInt();
        int t=a;
        int b = 0;
        while(a>0) {
            b=b+(a%10);
            a/=10;
        }
        if(t%b==0)
            System.out.println("niven no");
        else
            System.out.println("not niven no  ");

    }

}
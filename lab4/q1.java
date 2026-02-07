package lab4;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("enter the no:");
            int a = sc.nextInt();
            int t=a;
            int b = 0;
            while(a>0) {
                b=b+(a%10);
                a=a/10;
            }
            if (b%9==0)
                System.out.println("divisible by 9  =  "+t);
            else
                System.out.println("not divisible");

        }

    }


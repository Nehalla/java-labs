package lab4.homeassignments;

import java.util.Scanner;

public class q14 {
    static void main() {
        int sum=0;
        int multi=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int a= sc.nextInt();
        for(int i=0;i<=a;i++){
            if((i%2)==0){
                sum=sum+i;
            }
            else {
                multi=multi*i;
            }
        }
        System.out.println("sum of all even numbers ="+sum);
        System.out.println("product of all odd numbers ="+multi);
    }
}

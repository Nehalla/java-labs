package lab4.homeassignments;

import java.util.Scanner;

public class q15 {
    static void main() {
       long sum=0;
        int sum1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){
            sum=sum+(int)Math.pow(i,2);
            sum1=sum1+i;
        }
        int z= (int)Math.pow(sum1,2);
        System.out.println("Sum of square of first "+ a+ " natural numbers is:"+sum);
        System.out.println("Square of the sum of first "+ a+ " natural numbers is:"+z);
    }
}

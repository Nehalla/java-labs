package lab3.homeassignment;

import java.util.Scanner;

public class q12c {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
       int z= (a<b)?((b<c)? c:b):((a<c)? c:a);
        System.out.println("Largest integer is "+ z);

    }
}

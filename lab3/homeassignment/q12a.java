package lab3.homeassignment;

import java.util.Scanner;

public class q12a {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a<b){
            if(b<c) {
                System.out.println("The largest number is " + c);
            }
            else
                System.out.println("the largest number is "+ b);

        }
        else{
            if(a>c){
                System.out.println("the largest number is "+ a);

                }
            else
                System.out.println("the largest number is "+ c);

            }

    }
}

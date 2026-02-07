package lab3.homeassignment;

import java.util.Scanner;

public class q12b {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if((a<b&&b<c)||(b<a)&&(a<c)){
            System.out.println(c);
        }
        else if(((b<c)&&(c<a)||(c<b)&&((b<a)))){
            System.out.println(a);
        }
        else
            System.out.println(b);
    }
}

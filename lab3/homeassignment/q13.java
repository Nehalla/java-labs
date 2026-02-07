package lab3.homeassignment;

import java.util.Scanner;

public class q13 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two coordinates");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        if(a>0&&b>0){
            System.out.println("in Ist Quadrant");
        } else if (a<0&&b>0) {
            System.out.println("in IInd Quadrant");
        }
        else if(a<0&&b<0){
            System.out.println("in IIIrd Quadrant");
        }
        else
            System.out.println("in the IVth quadrant");
    }
}

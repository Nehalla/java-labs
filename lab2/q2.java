package lab2;
import java.util.Scanner;
public class q2 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of the radius and length");
        double g=sc.nextDouble();
        double h=sc.nextDouble();
        double area= Math.PI*Math.pow(g,2);
        double volume= area*h;
        System.out.println("The area is "+ area);
        System.out.println("The volume is "+ volume);
    }
}

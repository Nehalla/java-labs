package lab2;
import java.util.Scanner;
public class q1 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the celsius value");
        double c= sc.nextDouble();
        double fin=  (  9.0 /5)*c+32;
        System.out.println("The final converted temperature is " + fin+ " fahrenheit");
    }
}

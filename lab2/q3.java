package lab2;
import java.util.Scanner;
public class q3 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the basic salary");
        int sal= sc.nextInt();
        double d= 0.4*sal;
        double h= 0.2*sal;
        int g= (int)(sal+d+h);
        System.out.println("DA IS "+ d);
        System.out.println("HRA IS "+ h);
        System.out.println("Gross salary  IS "+ g);
    }
}

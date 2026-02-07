package lab2;
import java.util.Scanner;
public class q4 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side:");
        float s= sc.nextFloat();
        float area= (float) ((3*Math.sqrt(3)/2)*Math.pow(s,2));
        System.out.printf("The area of the hexagon is %.2f" , area);
    }
}
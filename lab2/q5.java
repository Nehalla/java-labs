package lab2;
import java.util.*;
public class q5 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("Enter x2 and y2:");
        double c= sc.nextDouble();
        double d= sc.nextDouble();
        double f=Math.pow(Math.pow((c-a),2)+Math.pow((d-b),2),0.5);
        System.out.println("The distance between the two points is "+ f);


    }
}

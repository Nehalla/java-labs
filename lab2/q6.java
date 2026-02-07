package lab2;
import java.util.Scanner;
public class q6 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three points for a triangle");
        double w= sc.nextDouble();
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        double z= sc.nextDouble();
        double s= sc.nextDouble();
        double d= sc.nextDouble();
        double side1=Math.pow(Math.pow((y-w),2)+Math.pow((z-x),2),0.5);
        double side2=Math.pow(Math.pow((s-y),2)+Math.pow((d-z),2),0.5);
        double side3=Math.pow(Math.pow((s-w),2)+Math.pow((d-x),2),0.5);
        double side = (side1+side2+side3)/2;
        double area= Math.pow(side*(side-side1)*(side-side2)*(side-side3),0.5);
        System.out.printf("The area of the triangle is %.2f ", area);
    }
}

package lab6.methods;
import java.util.Scanner;
public class q4 {
    public static double area(int n,double side){
        double area=(n*(side*side))/(4*(Math.tan(Math.PI/n)));
        return area;
    }
    static void main() {
     Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of side:");
        int n= sc.nextInt();
        System.out.println("Enter the length of each side:");
        double side= sc.nextDouble();
        System.out.println("Area of the regular polygon: "+area(n,side));
    }
}

package lab3;
import java.util.Scanner;

public class q6 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the values of a b c");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= Math.sqrt(Math.pow(b,2)-4*a*c);
        double z= (-b+d)/2*a;
        double y= (-b-d)/2*a;
        if(z==y){
            System.out.println("the equation has only one root"+ " " + z);
        }
        else if(d>0) {

            System.out.println("The roots of the equations are" + z + " " + y );

        }
       else System.out.println("no real roots");


    }
}

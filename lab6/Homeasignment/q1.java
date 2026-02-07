package lab6.Homeasignment;
import java.util.Scanner;
public class q1 {
    public static double volumeOfCube(double side){

        double a=Math.pow(side,3);
        return a;
    }
    public static double volumeOfCuboid(double length,double width,double height){
        double a= length*width*height;
        return a;
    }
    public static double volumeOfSphere(double radius){
        double a = (4/3)*Math.PI*Math.pow(radius,3);
        return a;
    }
    public static double volumeOfCyclinder(double radius,double height){
        double a= Math.PI*Math.pow(radius,2)*height;
        return a;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("=== VOLUME CALCULATOR (Method Overloading) ===\n" +
                "1. Volume of Cube\n" +
                "2. Volume of Rectangular Prism (Cuboid)\n" +
                "3. Volume of Sphere\n" +
                "4. Volume of Cylinder\n" +
                "5. Exit\n" +
                "Enter your choice:");
        int a= sc.nextInt();
        switch(a){
            case 1:{
                System.out.print("Enter the side of the cube:");
                double side = sc.nextDouble();
                System.out.println("volume of the cube:"+volumeOfCube(side));
                break;
            }
            case 2:{
                System.out.print("Enter the length of the cuboid:");
                double b= sc.nextDouble();
                System.out.println("Enter the width of the cuboid");
                double c= sc.nextDouble();
                System.out.println("Enter the height of the cuboid");
                double d= sc.nextDouble();
                System.out.println("The volume of the cuboid :"+volumeOfCuboid(b,c,d));
                break;
            }
            case 3:{
                System.out.println("Enter the radius of the sphere");
                double radius = sc.nextDouble();
                System.out.println("The volume of sphere :"+ volumeOfSphere(radius));
                break;
            }
            case 4:{
                System.out.println("Enter the radius of the cylinder:");
                double rr= sc.nextDouble();
                System.out.println("Enter the height of the cylinder:");
                double rr1= sc.nextDouble();
                System.out.println("The volume of the cylinder is:"+volumeOfCyclinder(rr,rr1));
                break;
            }
            case 5:{
                System.out.println("Exiting \n Thank for using my program");
                break;
            }

        }
    }
}

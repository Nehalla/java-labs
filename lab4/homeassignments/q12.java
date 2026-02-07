package lab4.homeassignments;
import java.util.Scanner;
public class q12 {
    static void main() {
        int z=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int a= sc.nextInt();
        System.out.println("Enter the power");
        int b=sc.nextInt();
        int c=b;
        while(b!=0){
            z=z*a;
            b--;
        }
        System.out.println(a+" to the power"+ " "+ c + " is:"+ z);
    }
}

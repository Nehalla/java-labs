package lab6.Homeasignment;
import java.util.Scanner;
public class q2 {
    public static boolean isConsecutive(int a,int b,int c) {
        if((a==b+1||b==a+1)&&(b==c+1||c==b+1)||(c==a+1||a==c+1)){
            System.out.print("Check whether the three said numbers are consecutive or not!");
            return true;
        }
        else{
            System.out.print("Check whether the three said numbers are consecutive or not!");
            return false;
        }
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the first number:");
        int a= sc.nextInt();
        System.out.println("Input the second number:");
        int b=sc.nextInt();
        System.out.println("Input the third number:");
        int c= sc.nextInt();
        System.out.println(isConsecutive(a,b,c));
    }
}

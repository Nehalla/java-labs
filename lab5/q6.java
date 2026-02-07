package lab5;
import java.util.Scanner;
public class q6 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int a= sc.nextInt();
        double sum=0;
        for(int i=1;i<=a;i++){
            double g=1/Math.pow(i,2);
            sum+=g;
        }
        System.out.println("sum = "+sum);
    }
}

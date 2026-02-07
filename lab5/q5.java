package lab5;
import java.util.Scanner;
public class q5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            int sumTerm=(i*(i+1))/2;
            sum+=sumTerm;
        }
        System.out.println("The sum of the series is:"+sum);

    }
}
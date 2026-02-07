package lab5.homeassignment;
import java.util.Scanner;
public class q12 {
    static void main() {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int a = sc.nextInt();
        System.out.println("Enter the value of n:");
        int b= sc.nextInt();
        for(int i=a;i<=b;i++){
            int multi=1;
            int temp=i;
            while(temp!=0){
                multi=multi*temp;
                temp--;
            }
            System.out.println("Factorial of "+i+" is:"+multi);
        }

    }

}

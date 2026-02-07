package lab5;
import java.util.Scanner;
public class q2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if(first(a)==b&&second(b)==a)
            System.out.println("The number is amicable ");
        else
            System.out.println("it is not amicable");

    }
    static int first(int a){
        int sum=0;
        for(int i=1;i<=(a/2);i++){
           if(a%i==0){
               sum=sum+i;
           }
        }
        return sum;
    }
    static int second(int b){
        int sum1=0;
        for(int i=1;i<=(b/2);i++){
            if(b%i==0){
                sum1=sum1+i;
            }
        }
        return sum1;
    }
}

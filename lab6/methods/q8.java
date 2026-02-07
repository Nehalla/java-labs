package lab6.methods;
import java.util.Scanner;
public class q8 {
    public static int largestDigit(int n){
       n=Math.abs(n);
       int max=0;
       while(n!=0){
           n=n%10;
           if(max<n){
               max=n;
           }
           n/=10;
       }
       return max;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int d= sc.nextInt();
        System.out.println("Largest digit is "+largestDigit((d)));
    }


}

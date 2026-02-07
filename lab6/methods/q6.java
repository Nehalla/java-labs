package lab6.methods;
import java.util.Scanner;
public class q6 {
    public static int sumOfDivisors(int n){
        int sum=0;
        for(int i=1;i<=(n/2);i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static Boolean isFriendlyPair(int a,int b){
        boolean b1=true;
        if(((int)sumOfDivisors(a)/a)==(((int)sumOfDivisors(b)/b))){
            System.out.println(a+"and"+ b+ " are a friendly pair");
            return true;
        }else {
            System.out.println(a + " and " + b + " are NOT a Friendly Pair");
            return false;
        }

    }
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b= sc.nextInt();
        System.out.println("Sum of proper divisors of "+a+"="+sumOfDivisors(a));
        System.out.println("Sum of proper divisors of "+b+"="+sumOfDivisors(b));
        System.out.println(isFriendlyPair(a,b));
    }
}

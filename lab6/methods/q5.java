package lab6.methods;
import java.util.Scanner;
public class q5 {
    public static int collatzLength( int n){
        int count=0;
        while(n!=1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else  {
                n = 3 * n + 1;
                count++;
            }
        }
        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Collatz Length is:"+collatzLength(a));
    }
}

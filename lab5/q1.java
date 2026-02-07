package lab5;
import java.util.Scanner;
public class q1 {
    static int reverse(int num) {
        int sum = 0;
        while (num != 0) {
            int b = num % 10;
            num /= 10;
            sum = sum * 10 + b;
        }
        return sum;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
        static void main () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            int reversed = reverse(num);
            if (isPrime(num) && isPrime(reversed)) {
                System.out.println(num + " is twisted prime");
            } else {
                System.out.println(num + " is not a twisted prime");
            }

        }
    }


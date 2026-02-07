package lab5.homeassignment;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Prime numbers between " + a + " and " + b + " are:");

        for (int i = a; i <= b; i++) {

            if (i < 2) continue; // 0 and 1 are not prime

            boolean isPrime = true;

            for (int d = 2; d <= i / 2; d++) {
                if (i % d == 0) {
                    isPrime = false;
                    break;
                }
                if(i%d!=0){
                    isPrime=true;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}


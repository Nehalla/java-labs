package lab5.homeassignment;

import java.util.Scanner;

public class fibonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms(n): ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

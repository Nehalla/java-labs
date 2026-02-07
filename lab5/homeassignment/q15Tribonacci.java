package lab5.homeassignment;
import java.util.Scanner;
public class q15Tribonacci {
    static void main() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of terms(n): ");
                int n = sc.nextInt();

                int a = 0, b = 1, c = 1;
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");
        if (n >= 3) System.out.print(c + " ");

                for (int i = 4; i <= n; i++) {
                    int d = a + b + c;
                    System.out.print(d + " ");
                    a = b;
                    b = c;
                    c = d;
                }

            }
        }
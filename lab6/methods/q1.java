package lab6.methods;
import java.util.Scanner;
public class q1 {
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    public static double multiplicationSimple(double x, double y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        if (y == 0) {
            System.out.println("enter a valid number");
            return 0;
        } else {
            return (double) y/x;
        }

    }

    public static int remainderSimple(int n, int m) {
        return m % n;
    }

    public static double squareRootSimple(int n) {
        if(n<0){
            System.out.println("-ve numbers are not allowed ");
            return 0;
        }
        else {
            return Math.sqrt(n);
        }

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Remainder\n" +
                "6. Square Root\n" +
                "7. Exit");
        System.out.println("What you want to perform:");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Enter the first number");
                int b= sc.nextInt();
                System.out.println("Enter the second number");
                int c= sc.nextInt();
                System.out.println("sum is "+additionSimple(b,c));
                break;
            case 2:
                System.out.println("Enter the first number");
                int d= sc.nextInt();
                System.out.println("Enter the second number");
                int e= sc.nextInt();
                System.out.println("Difference is "+ subtractionSimple(d,e));
                break;
            case 3:
                System.out.println("Enter the first number");
                double f= sc.nextDouble();
                System.out.println("Enter the second number");
                double g= sc.nextDouble();
                System.out.println("Multiplication is "+ multiplicationSimple(f,g));
                break;
            case 4:
                System.out.println("Enter the first number");
                int h= sc.nextInt();
                System.out.println("Enter the second number");
                int i= sc.nextInt();
                System.out.println("Division is "+divisionSimple(i,h));
                break;
            case 5:
                System.out.println("Enter the first number");
                int j= sc.nextInt();
                System.out.println("Enter the second number");
                int k= sc.nextInt();
                System.out.println("Remainder is "+remainderSimple(j,k));
                break;
            case 6:
                System.out.println("Enter the number");
                int l= sc.nextInt();
                System.out.println("Square root is "+squareRootSimple(l));
                break;
            case 7:
                System.out.println("Thank for using my simple calculator");
                break;
            default:
                System.out.println("Enter a valid inputs");
                break;


        }
    }
}

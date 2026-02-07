package lab6.methods;

import java.util.Scanner;

public class q10 {
    public static int areaOfSquare(int m) {
        int area = m * m;
        area = Math.abs(area);
        return area;
    }

    public static int areaOfRectangle(int m, int n) {
        int area = m * n;
        area = Math.abs(area);
        return area;
    }

    public static int areaOfCircle(int r) {
        int area = (int) (Math.PI * (Math.pow(r, 2)));
        area = Math.abs(area);
        return area;
    }

    public static int areaOfTriangle(int a, int b, int c) {
        int s = (a + b + c) / 3;
        int area = (int) Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        area = Math.abs(area);
        return area;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== AREA CALCULATOR (Method Overloading) ===\n" +
                "1. Area of Square\n" +
                "2. Area of Rectangle\n" +
                "3. Area of Circle\n" +
                "4. Area of Triangle\n" +
                "5. Exit\n");
        System.out.println("Enter your choice");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter the side of the square:");
                int b = sc.nextInt();
                System.out.println("Area of the square is :" + areaOfSquare(b));
                break;
            case 2:
                System.out.println("Enter the length of the rectangle:");
                int c = sc.nextInt();
                System.out.println("Enter the width of the rectangle");
                int d = sc.nextInt();
                System.out.println("Area of the rectangle is:" + areaOfRectangle(c, d));
                break;
            case 3:
                System.out.println("Enter the radius of the circle:");
                int e = sc.nextInt();
                System.out.println("The area of the circle is " + areaOfCircle(e));
                break;
            case 4:
                System.out.println("Enter the three sides of the triangle");
                int f = sc.nextInt();
                int g = sc.nextInt();
                int h = sc.nextInt();
                System.out.println("The area of the triangle is " + areaOfTriangle(f, g, h));
                break;
            case 5:
                System.out.println("Exiting......\n hope you enjoy the program \n \"Have a good day\" ");


        }
    }
}

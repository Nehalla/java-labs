package lab3;

import java.util.Scanner;

public class q10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks between 0 and 100");
        int a= sc.nextInt();
        int b= a/10;

            if (a < 0 || a > 100) {
                System.out.println("Enter a vaild mark between 0 and 100");
            } else {
                switch(b) {
                case 10:
                case 9:
                    System.out.println('O' + " Grade");
                    break;
                case 8:
                    System.out.println('A' + " Grade");
                    break;
                case 7:
                    System.out.println('B' + " Grade");
                    break;
                case 6:
                    System.out.println('C' + " Grade");
                    break;
                case 5:
                    System.out.println('D' + " Grade");
                    break;
                case 4:
                    System.out.println('E' + " Grade");
                    break;
                case 3:
                    System.out.println('F' + " Grade");
                    break;
//                case 2:
//                case 1:
//                case 0:
//                    System.out.println('F' + " Grade");
//                    break;
            default:
                    System.out.println('F' + " Grade");
                    break;
//                System.out.println("enter a number between 0 and 100");
            }
        }
    }
}
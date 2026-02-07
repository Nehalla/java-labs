package lab3;

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no of units consumed : ");
        int a = in.nextInt();
        double b;
        if (a > 400) {
            a = a - 400;
            b = a * 6.20;
            b += (200 * 5.80) + (150 * 4.8) + (50 * 3);

        } else {
            if (a > 200) {
                a = a - 200;
                b = a * 5.8;
                b += (150 * 4.8) + (50 * 3);

            } else {
                if (a > 50) {
                    a = a - 50;
                    b = a * 4.8;
                    b += (50 * 3);


                } else {
                    b = a * 3.00;
                }
            }
        }
        System.out.print("Do you want to pay your bill online? (Y/N):");
        char c = in.next().charAt(0);
        if (c == 'y' || c == 'Y') {
            float d = (float) (b / 100) * 3;
            System.out.println("You received a 3% online payment discount of Rs." + d);
            System.out.println("Total Electricity Bill: Rs." + b);
            System.out.println("Amount Payable: Rs." + (float) (b - d));
        } else {
            System.out.println("Total Electricity Bill: Rs." + b);
            System.out.println("Amount Payable: Rs." + b);
        }


    }
}




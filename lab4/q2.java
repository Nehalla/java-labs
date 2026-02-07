package lab4;

import java.util.Scanner;

public class q2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows you want");
        int a = sc.nextInt();
        String r="";
        for (int d = 1; d <= a; d++) {


                  r=r+d+r;
                    System.out.println(r);

                }
                System.out.println("");
            }
        }



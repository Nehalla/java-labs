package lab7;

import java.util.Scanner;

public class inputFromUser {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter the elements you want to store:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("the elements you want to stored:");
        for (int b : arr) {
            System.out.print(b + " ");
        }

    }
}

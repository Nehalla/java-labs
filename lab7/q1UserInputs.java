package lab7;

import java.util.Scanner;

public class q1UserInputs {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int b : arr) {
            sum += b;
        }
        return sum;
    }

    public static double findAverage(int[] arr) {
        double d = findSum(arr) / arr.length;
        return d;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter the elements you want to store:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum is:" + findSum(arr));
        System.out.println("Average is:" + findAverage(arr));
    }
}

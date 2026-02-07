package lab7;

import java.util.Scanner;

public class MoveZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] result = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int zeroCount = 0;

        // Count zeros
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        int index = zeroCount;

        // Place non-zero elements
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println("Array after moving zeros to beginning:");
        for (int i = 0; i < 10; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

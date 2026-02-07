package lab7;

import java.util.Scanner;

public class SimpleCounter {

    // Reads numbers and counts them
    public static void readInput(int[] counts) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter numbers (1 to 100). Enter 0 to stop:");

        while ((n = sc.nextInt()) != 0) {
            if (n >= 1 && n <= 100) {
                counts[n]++;
            }
        }
    }

    // Displays the counts
    public static void displayCounts(int[] counts) {
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " : " + counts[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] counts = new int[101]; // index = number, value = count

        readInput(counts);
        displayCounts(counts);
    }
}

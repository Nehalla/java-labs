package lab6.strings;

import java.util.Scanner;

public class Q16 {
    public static boolean isValidPassword(String password) {

        for (int i = 0; i <= password.length(); i++) {
            if (i < 8) {
                System.out.println("invalid");
                System.out.println("");
            }
        }

        return true;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = sc.nextLine();

    }

}

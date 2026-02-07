package lab6.Homeasignment;
import java.util.Scanner;
public class q4 {
    public static void countCharacters(String str) {
        int capital = 0;
        int small = 0;
        int special = 0;
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                capital++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                small++;
            } else if (str.charAt(i) >='0'&& str.charAt(i) <='9') {
                digits++;
            } else {
                special++;
            }
        }
        System.out.println("Total capitals letters:" + capital);
        System.out.println("Total small letters:" + small);
        System.out.println("Total digits :"+digits);
        System.out.println("Total special characters:" + special);
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        countCharacters(str);
    }
}



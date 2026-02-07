package lab6.strings;
import java.util.Scanner;
public class q11 {
    public static int count(String str, char a) {
        int count = 0;
        char[] cc = str.toCharArray();
        for (char ch : cc) {
            if (ch == a) {
                count++;
            }
        }
        return count;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Enter an charcter");
        char c= sc.next().charAt(0);
        System.out.println("The number of occurences of "+ c+ " in "+s+" is "+count(s,c));
    }
}

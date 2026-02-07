package lab6.Homeasignment;
import java.util.Scanner;
public class q3 {
    public static int countSpaces(String str) {
        str= str.trim();
        int count = 0;
        int i=0;
        while (i < str.length()) {
            char[] cc = str.toCharArray();
            if (str.charAt(i)==' ') {
                count++;
            }
            i++;
        }
        return count;
    }

        static void main () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String ss = sc.nextLine();
            System.out.println("Number of spaces in the String :" + countSpaces(ss));

        }
    }

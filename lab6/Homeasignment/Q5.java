package lab6.Homeasignment;
import java.util.Scanner;
public class Q5 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String ss= sc.nextLine();
        System.out.println("The length of the string is:"+ss.length());
        System.out.println("The first character is:"+ss.charAt(0));
        System.out.println("The last character is:"+ss.charAt(ss.length()-1));
        System.out.println("The string in uppercase will be: "+ss.toUpperCase());
        System.out.println("The string in lowercases will be: "+ss.toLowerCase());
        System.out.println("Does the string contains \"java\"? "+ss.contains("Java"));
        System.out.println("Does the string start with \"Hello\"? "+ss.startsWith(("Hello")));
        System.out.println("Does the string ends with \"World\": "+ss.endsWith("World"));
        System.out.println("The trimmed string is: "+ss.trim());
        System.out.println("String after replacing 'a' with '@': "+ss.replaceAll("a","@"));
        System.out.println("The substring from index 2 to 7: "+ "  \""+ss.substring(2,7)+ "\"    ");


    }
}

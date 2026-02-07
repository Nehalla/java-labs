package lab6.strings;
import java.util.Scanner;
public class q12 {
    public static int countVowels(String str){
        int count=0;
        char[] cc = str.toCharArray();
        for(char ch:cc) {
                if(ch=='a'||ch=='A'|ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                    count++;
            }
        }
        return count;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String ss= sc.nextLine();
        System.out.println("The number of vowels in "+ ss +" is " + countVowels(ss));
    }
}

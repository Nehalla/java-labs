package lab6.strings;
import java.util.Scanner;
public class Q15 {
    public static boolean isPalindrome(String str){
        char [] cc= str.toCharArray();// if cc is a string then you need to use charAt at syntax as here cc is a character due to which we use cc[index]
        String ss="";
        boolean b ;
        for(int i=cc.length;i>0;i--){
            ss = ss + cc[i-1];
        }
       if(str.equalsIgnoreCase(ss)){ // as here str is a string so here we are using .equals syntax to compare if it is character then we have to compare it by "=="
           System.out.println(str+" is a palindrome");
            return b=true;
       }
        else {
           System.out.println(str +" is not palindrome");
            return b=false;
       }
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String ss= sc.nextLine();
        System.out.println(isPalindrome(ss));

    }

}

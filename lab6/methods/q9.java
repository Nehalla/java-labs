package lab6.methods;
import java.util.Scanner;
public class q9 {
    public static int reverse(int number){
        number=Math.abs(number);
        int sum=0;
        while(number!=0) {
            int digits = number % 10;
            sum=sum*10+digits;
            number/=10;
        }
        return sum;
    }
    public static boolean isPalindrome(int number){
        number=Math.abs(number);
        if(((int)number)==(((int)(reverse(number))))){
            System.out.println(number+" is a palindrome");
            return true;
        }
        else{
            System.out.println(number+" is not palindrome");
            return false;
        }
    }
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int number= sc.nextInt();
        System.out.println(isPalindrome(number));
    }
}

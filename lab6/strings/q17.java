package lab6.strings;
import java.util.Scanner;
public class q17 {
    public static char middleCharacter(String ss){
        int i=0;
        for(;i<ss.length();i++){
        }
        if(i%2==0){
            System.out.println("Middle character is "+ss.charAt(i/2));
        }
        else{
            System.out.println("Middle character is "+ss.charAt(i/2));
        }
        return 0;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String ss= sc.nextLine();
        System.out.println(middleCharacter(ss));
    }
}

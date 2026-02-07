package lab6.strings;
import java.util.Scanner;
public class q13 {
    public static int countWords(String str){
        int b=0;
        if(str.isEmpty()){
            b=0;
        }
        else{
            String[] words= str.split("\\s");
            b=words.length;
        }
        return b;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String ss= sc.nextLine();
        ss=ss.trim();
        System.out.println("The number of words in the sentence is:"+countWords(ss));
    }
}

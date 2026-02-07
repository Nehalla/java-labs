package lab7;
import java.util.Scanner;
public class q14 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double a = sc.nextDouble();
        System.out.println("Its octal expression is :"+ decimalToOctal((int) a));

    }
    public static String decimalToOctal(int decimal){
        String ss="";
        while(decimal!=0){
            int r = decimal%8;
            decimal=decimal/8;
            ss=r+ss;
        }
        return ss;
    }
}

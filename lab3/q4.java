package lab3;
import java.util.Scanner;
public class q4 {
    static void main() {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 9");
        int a = sc.nextInt();
       int b = (int)(Math.random()*9+1);
       if(Math.abs(b-a)==1) {
           System.out.println("you are alomost right");
       }
       else if(a==b){
           System.out.println("you got it right");
       }
       else System.out.println("your got it wrong ");
    }


}


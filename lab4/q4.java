package lab4;

import java.util.Scanner;

public class q4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10!");
        int a=sc.nextInt();
        int b=(int)(Math.random()*10+1);
        do{
            if(a>b){
                System.out.println("Too high");
                break;
            }
            else if(a<b){
                System.out.println("Too low");
                break;
            }
            else
                System.out.println("good guess");
            break;
        }while(a!=0);
    }
}

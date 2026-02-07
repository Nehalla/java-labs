package lab3;
import java.util.Scanner;
public class q5 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three sides");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b>c&&b+c>a&&c+a>b){
            if((a==b)&&(b==c)){
                System.out.println("it is a equilateral triangle");
            }
            else if((a==b)||(b==c)||(a==c)){
                System.out.println("it is a isosceles triangle");
            }
            else System.out.println("it is scalene triangle");
        }
        else System.out.println("the side is not valid");

    }
}

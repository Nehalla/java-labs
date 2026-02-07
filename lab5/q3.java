package lab5;
import java.util.Scanner;
public class q3 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt();
        if(a==extract(a)){
            System.out.println(a+" is a Strong number");
        }
        else {
            System.out.println(a+" is a not Strong number");
        }

    }
    static int extract(int a){
        int multi=1;
        int sum=0;
        while(a!=0) {
            int b = a%10;
            a=a/10;
            while(b>0){
                multi=multi*b;
                b--;
            }
            sum=sum+multi;
//            int y=1;
//            multi=y;
            multi=1;
        }
        return sum;
    }

}

package lab4.homeassignments;
import java.util.*;
public class q11 {
    static void main() {
        int sum=0;
        int b=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        for(int i=1;i<=(a/2);i++){
            b= sum+i;
        }
        if(a==b){
            System.out.println(a+" is a perfect number ");
        }
        else
            System.out.println(a+" is not perfect number");

    }
}

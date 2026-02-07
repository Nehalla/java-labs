package lab4.homeassignments;
import java.util.Scanner;
public class q13 {
    static void main() {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (N)");
        int a= sc.nextInt();
        for(int i=1;i<a;i++){
            if(i%3==0||i%5==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of all multiples of 3 and 5 below "+ a+" is:"+sum);
    }
}

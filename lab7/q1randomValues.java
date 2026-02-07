package lab7;
import java.util.Scanner;
public class q1randomValues {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a= sc.nextInt();
        int [] r= new int[a];
        for(int i=0;i<a;i++){
            r[i]= (int) (Math.random() * 100);
        }
        System.out.println("Sum is:"+findSum(r));
        System.out.println("Average is:"+ findAverage(r));
    }
    public static int findSum(int[] arr){
        int sum=0;
        for(int b:arr){
            sum= sum+b;
        }
        return sum;
    }
    public static double findAverage(int[] arr){
        double d= findSum(arr)/arr.length;
        return d;
    }
}

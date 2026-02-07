package lab7;
import java.util.Scanner;
public class q11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        double [] arr= new double [10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextDouble();
        }
        System.out.println("The maximum value is:"+ max(arr));
    }
    public static double max(double[] array){
        double max= array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}

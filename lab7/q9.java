package lab7;
import java.util.Scanner;
public class q9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double [] arr = new double [10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextDouble();
        }
        System.out.println("The sorted array is: ");
         bubbleSort(arr);
         for(double b:arr){
             System.out.print(b+" ");
         }
    }
    public static void bubbleSort(double[] arr){
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

package lab7;
import java.util.Scanner;
public class q7 {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements before clockwise rotation: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void rotateClockwise(int[] arr){
         int temp=arr[9];
         arr[9]=arr[0];
         arr[0]=temp;
    }
    public static void printArray(int[] arr){
        System.out.println("Array elements after the clockwise rotation: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    static void main() {
        int [] arr1= new int [10];
        readArray(arr1);
        rotateClockwise(arr1);
        printArray(arr1);
    }
}

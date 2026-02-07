package lab7;
import java.util.Scanner;
public class q3again {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers");
        for(int i=0;i<10;i++){
             arr[i] = sc.nextInt();
        }
    }
    public static int countOccurrences(int[] arr, int key){
        int count=0;
        for(int b:arr){
            if(key==b){
                count++;
            }
        }
        return count;
    }
    static void main() {
        int[] arr1= new int[10];
        Scanner sc = new Scanner(System.in);
        readArray(arr1);
        System.out.println("Enter the integer you want to search for:");
        int a= sc.nextInt();
        System.out.println("The number"+ a+" appears "+countOccurrences(arr1,a)+ " time(s) in the array.");
    }
}

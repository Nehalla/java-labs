package lab7;
import java.util.Scanner;
public class q3 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 10 integers: ");
        int arr1[]= new int[10];
        for(int i=0;i<10;i++){
            arr1[i]= sc.nextInt();
        }
        readArray(arr1);
        System.out.println("which  number to find");
        System.out.println(" ");
        int  key = sc.nextInt();
        System.out.println(countOccurrences(arr1,key));
    }
    public static void readArray(int[] arr) {
        for (int a : arr) {
            System.out.print(" " + a + " ");
        }

    }
    public static int countOccurrences(int[] arr, int key) {
        int count=0;
        for (int a : arr) {
            if(key==a){
                count++;
            }
        }
        return count;
    }


}

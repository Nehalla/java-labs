package lab7;
import java.util.Scanner;
public class q6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        readArray(arr1);
        System.out.println("The maximum value is:"+findMax(arr1));
        System.out.println("it occurs "+ countOccurrences(arr1,findMax(arr1))+" times");
        System.out.println("First position of maximum value is:"+ firstPositionOfMax(arr1,findMax(arr1)));
        System.out.println("The minimum value is:"+ findMin(arr1));
        System.out.println("it occurs "+ countOccurrences(arr1,findMin(arr1))+" times");
        System.out.println("First position of maximum value is:"+ lastPositionOfMin(arr1,findMin(arr1)));


    }

    public static void readArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static int findMax(int[] arr){
        int max= arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    public static int countOccurrences(int[] arr, int value){
        int count=0;
        for(int b:arr){
            if(value==b){
                count++;
            }
        }
        return count;
    }
    public static int findMin(int[] arr){
        int min= arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int firstPositionOfMax(int[] arr, int max){
        int a=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]== max){
                a=i+1;
                break;
            }
        }
        return a;
    }
    public static int lastPositionOfMin(int[] arr, int min){
        int a=0;
        for(int i= arr.length;i>0;i--){
            if(arr[i-1]== min){
                a=i;
                break;
            }
        }
        return a;
    }
}
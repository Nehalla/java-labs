package lab7;
import java.util.Scanner;
public class q8 {
    public static void fillArray(int[] arr){
        for(int i=0;i<10;i++){
            arr[i]= (int)(Math.random()*29)+2;
        }
    }
    public static void printArray(int[] arr){
        System.out.println("The Array elements: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static boolean isPrime(int num){
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int countPrimes(int[] arr){
        int count=0;
        for (int a : arr) {
            if (isPrime(a)) {
                count++;
            }
        }
        return count;
    }
    static void main() {
        int [] arr = new int [10];
        fillArray(arr);
        printArray(arr);
        System.out.println("The total no of the prime number in the array is : " + countPrimes(arr));
    }
}

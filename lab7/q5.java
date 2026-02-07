package lab7;

import java.util.Scanner;
public class q5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a= sc.nextInt();
        int [] b= new int[a];
        for(int i=0;i<a;i++){
            b[i]= sc.nextInt();
        }
        System.out.println("The second largest element is:"+ findSecondLargest(b));
    }
    public static int findSecondLargest(int[] arr){
        int secondlargest= Integer.MIN_VALUE;
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
               secondlargest=largest;
               largest=arr[i];
            }
        }
        return secondlargest;

    }
}

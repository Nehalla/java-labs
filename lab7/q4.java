package lab7;
import java.util.Scanner;
public class q4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
//        double a = sc.nextDouble();
        double [] b= new double[10];
        for(int i=0;i<10;i++){
            b[i]=sc.nextDouble();
        }
        System.out.println("The minimum number is:"+min(b));
    }
    public static double min(double[] array){
        double minimum=array[0];
        for(int i=1;i<10;i++){
            if(array[i]<minimum){
                array[i]=minimum;
            }
        }
        return minimum;
        }
    }


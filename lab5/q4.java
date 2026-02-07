package lab5;
import java.util.Scanner;
public class q4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
    }
    static int check(int a,int b){
        int count=0;
        int store =0;
        while(a<b) {
            for (int i=1;i<= (a/2); i++) {
                if (a%i == 0) {
                    count++;
                    store=count;
                    if(store>count){
                        return store;
                    } else if (store<count) {
                        return count;
                    }
                    else{
                        return store;
                    }
                }
            }
            a++;
            count=0;
        }
        return count;
    }
}

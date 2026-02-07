package lab4;

import java.util.Scanner;

public class q7 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int i=1;
        int a = sc.nextInt();
        for(;i<4;i++){
            System.out.println(a +"X"+i + "="+ a*i);
        }

        while(i<7){
            System.out.println(a +"X"+i + "="+ a*i);
            i++;
        }

        do{
            System.out.println(a +"X"+i + "="+ a*i);
            i++;
        }while (i<11);

    }
}

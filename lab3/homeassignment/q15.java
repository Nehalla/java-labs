package lab3.homeassignment;

import java.util.Scanner;

public class q15 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("choose from Rock(1) Paper(2) Scissor(3):-");
        int a= sc.nextInt();
       int b = (int)(Math.random()*3+1);

        switch(a) {
            case 1:
                System.out.println("your guess rock");
                break;
            case 2:
                System.out.println("your guess paper");
                break;
            case 3:
                System.out.println(" your guess scissor");
                break;
        }
        switch(b){
            case 1:
                System.out.println("Computer guesses rock");
                break;
            case 2:
                System.out.println("Computer guesses paper");
                break;
            case 3:
                System.out.println("Computer guesses scissor");
                break;

        }
        if(a==b){
            System.out.println("draw");
        }
        else{
            if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)){
                System.out.println("you won");
            }
            else
                System.out.println("computer won");
        }


    }
}

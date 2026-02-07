package lab6.methods;
public class q7 {
    public static int numberOfDaysInAYear(int year){
        if(year%4==0||(year%100==0&&year%100!=0)){
            System.out.print(year+"\t"+"366");
        }
        else{
            System.out.print(year+"\t"+"365");
        }
        System.out.println();
        return 0;
    }
    static void main() {
        System.out.println("Years"+"\t"+"Days");
        for(int year=2000;year<=2020;year++){
            numberOfDaysInAYear(year);
        }
    }
}

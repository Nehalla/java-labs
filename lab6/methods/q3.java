package lab6.methods;
public class q3 {
    public static int getPetagonalNumber( int n){
        int d= n*(3*n-1)/2;
        return d;
    }

    static void main() {
        for(int n=1;n<=100;n++){
            System.out.print(getPetagonalNumber(n)+" ");
        }
    }
}

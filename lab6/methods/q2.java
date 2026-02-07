package lab6.methods;
public class q2 {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static double power(int a, int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result= result*a;
        }
        return result;
    }
    public static boolean isArmstrong(int n) {
        int num=n;
        int sum = 0;
        int digit = countDigits(n);
        while (n!= 0) {
            int digits = n % 10;//n=65
            sum = (int) (sum + power(digits, digit));
           n/=10;
        }

        return sum==num;
    }
    static void main() {
        int count=0;
        System.out.println("The armstrong numbers are:");
        for(int n=100;n<=10000;n++) {
            if (isArmstrong(n)) {
                count++;
                System.out.print(n + " ");
            }
        }
        System.out.println("the total count is "+ count);
    }
}

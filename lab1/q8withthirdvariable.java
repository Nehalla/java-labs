package lab1;

public class q8withthirdvariable {
    static void main() {
        int a=10;
        int b=5;
        System.out.println("Before swap:"+a+"\t"+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swap:"+a+"\t"+b);
    }
}

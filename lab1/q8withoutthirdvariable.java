package lab1;

public class q8withoutthirdvariable {
    static void main() {
        int a=10;
        int b=5;
        System.out.println("Before swap:"+ a+"\t"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:"+ a+"\t"+b);
    }
}

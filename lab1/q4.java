package lab1;

public class q4 {
    static void main() {
        int radius=7;
        double peri= 2*Math.PI*radius;// Math.PI requires double type as its default value is 3.14714
        double area= Math.PI*Math.pow(radius,2);
        System.out.println("The perimeter of the circle is "+ peri);
        System.out.println("The area of the circle is "+ area);


    }
}

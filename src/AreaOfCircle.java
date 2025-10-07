import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Area Of Cricle Codel...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }
}

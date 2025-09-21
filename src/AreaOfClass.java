import java.util.*;
public class AreaOfClass {
    public static void main(String[] args) {
        System.out.println("welocme in Area Of Circle Programm");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Radius : ");
        double r = sc.nextDouble();

        double area = Math.PI * r* r;
        System.out.println("Area of Circle = " + area);
    }
}

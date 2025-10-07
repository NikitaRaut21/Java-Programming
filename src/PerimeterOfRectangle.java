import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the perimeter Of Rectangle program : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println(" Enter the width of the rectangle:");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }

}

import java.sql.SQLOutput;
import java.util.*;
public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to the Arithemtic Oprations!");
       Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 1st Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number");
        int num2 = sc.nextInt();


        System.out.println(" Addition of two number is :" + (num1- num2));
        System.out.println(" substractions of two number is :" + (num1- num2));
        System.out.println(" Multiply  of two number is :" + (num1* num2));
        System.out.println(" divide  of two number is :" + (num1 / num2));
        System.out.println(" modulus  of two number is :" + (num1 % num2));

    }
}

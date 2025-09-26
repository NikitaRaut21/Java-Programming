import  java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("welcom to the Factorail Program ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

}

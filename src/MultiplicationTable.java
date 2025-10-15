import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("welcome to the Multiplication Table ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + " is : ");

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}

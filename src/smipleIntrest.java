import java.util.*;
public class smipleIntrest {
    public static void main(String[] args) {
        System.out.println("welcome to simple interest program!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate Of Interset: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time in years : ");
        double time = sc.nextDouble();

        double simpleIntrest = (principal * rate * time );

        System.out.println("Simple Interest : " + simpleIntrest );

    }
}

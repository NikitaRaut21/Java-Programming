import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse String Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input =sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}

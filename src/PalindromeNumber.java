import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Wecome to the Palindrome Number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int  number= sc.nextInt();
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reverse)
            System.out.println(originalNumber + " is a Palindrome number.");
        else
            System.out.println(originalNumber + " is not a Palindrome number.");
    }
}

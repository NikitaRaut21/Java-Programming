import java.util.*;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        System.out.println("welcome to the  String Length Without Length");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        // convert string to char array and count manually
        char[] chars = str.toCharArray();
        for (char c : chars) {
            count++;
        }

        System.out.println("Length of the string is: " + count);
    }
}

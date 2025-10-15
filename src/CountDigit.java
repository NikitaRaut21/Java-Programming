import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to the Count Digit ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;
        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + number + " is: " + count);


    }
}

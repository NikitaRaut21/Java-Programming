import java.util.*;
public class TrianglePattern {
    public static void main(String[] args) {
        System.out.println("Welcome to the pattern Program !");
        for (int i =1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

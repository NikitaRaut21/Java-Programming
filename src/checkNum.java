import java.util.*;


public class checkNum {
    public static void main(String[] args) {
        System.out.println("welcome to the even odd Number");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Number : ");
        int  n = sc.nextInt();
        if(n % 2== 0){
            System.out.println(n + "is the  Even Number");
        }else {
            System.out.println(n + "  is the  Odd Number");
        }
    }

}

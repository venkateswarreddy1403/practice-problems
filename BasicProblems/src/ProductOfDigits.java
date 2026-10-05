import java.util.Scanner;

//Write a Java program that calculates the product of all digits of an integer.
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int res = 1;
        if(n == 0) {
            System.out.println(0);
            return;
        }
        while (n != 0) {
            int digit = n % 10;
            res = res * digit;
            n = n / 10;
        }
        System.out.println(res);
    }
}

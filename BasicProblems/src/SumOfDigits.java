import java.util.Scanner;

//Write a Java program that takes an integer and calculates the sum of its digits.

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sum = 0;

        if (n == 0) {
            System.out.println(sum);;
            return;
        }

        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

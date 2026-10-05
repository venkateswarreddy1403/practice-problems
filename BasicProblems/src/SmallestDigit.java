//Write a Java program that finds the smallest digit in an integer.

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int min = 9;
        if(n == 0) {
            min = 0;
            System.out.println("Smallest Digit: " + min);
            return;
        }

        while(n > 0) {
            int firstDigit = n % 10;
            if(firstDigit < min) {
                min = firstDigit;
            }
            n /= 10;
        }
        System.out.println("Smallest Digit: " + min);
    }
}

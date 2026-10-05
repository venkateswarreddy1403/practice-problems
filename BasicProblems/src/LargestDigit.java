
//Write a Java program that finds the largest digit in an integer.

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int max = 0;
        while(n != 0) {
            int digit = n % 10;
            if(digit > max) {
                max = digit;
            }
            n /= 10;
        }
        System.out.println("Largest Digit: " + max);
    }
}

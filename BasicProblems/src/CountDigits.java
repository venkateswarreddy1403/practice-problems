//Write a Java program that takes an integer and counts how many digits it contains.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        n = Math.abs(n);
        if(n == 0) {
            System.out.println(1);
            return;
        }
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}

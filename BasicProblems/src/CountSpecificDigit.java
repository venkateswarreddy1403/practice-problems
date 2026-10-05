/*
Write a Java program that takes:
    An integer n
    A digit d
and counts how many times d appears in n.
*/

import java.util.Scanner;

public class CountSpecificDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        n = Math.abs(n);
        int count = 0;
        if(n == 0 && d == 0) {
            count++;
            System.out.println(count);
            return;
        }
        while(n!=0) {
            int digit = n%10;
            if(digit == d) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}

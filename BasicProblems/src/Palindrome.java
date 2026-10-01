//Write a Java program that checks whether a number is a palindrome.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String results = isPalindrome(n);
        System.out.println(results);
    }

    static String isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(rev);
        if(rev == n){
            return "Palindrome";
        }
        return "Not Palindrome";
    }
}

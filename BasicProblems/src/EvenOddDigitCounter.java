import java.util.Scanner;

/*
Write a Java program that takes an integer and counts:
    How many even digits
    How many odd digits
*/

public class EvenOddDigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddDigitCount = 0;
        int evenDigitCount = 0;

        if( n == 0) {
            evenDigitCount++;
            System.out.println("Even digit: " + evenDigitCount);
            System.out.println("Odd digits: " +oddDigitCount);
            return;
        }

        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0) evenDigitCount++;
            else oddDigitCount++;
            n /= 10;
        }
        System.out.println("Even digits: " +evenDigitCount);
        System.out.println("Odd digits: " +oddDigitCount);
    }
}

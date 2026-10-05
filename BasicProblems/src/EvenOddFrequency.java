import java.util.Scanner;

/*

    Write a Java program that takes an integer and finds:
        Number of even digits
        Number of odd digits
        Sum of even digits
        Sum of odd digits

*/

public class EvenOddFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddDigitsSum = 0;
        int evenDigitsSum = 0;
        int oddDigitsCount = 0;
        int evenDigitsCount = 0;
        n = Math.abs(n);
        if(n == 0) {
            evenDigitsCount++;
            System.out.println("Even Count: " + evenDigitsCount);
            System.out.println("Odd Count: " + oddDigitsCount);
            System.out.println("Even Sum: " + evenDigitsSum);
            System.out.println("Odd Sum: " + oddDigitsSum);
        }
        while(n != 0) {
            int digit = n % 10;
            if(digit % 2 == 0) {
                evenDigitsSum += digit;
                evenDigitsCount++;
            }else  {
                oddDigitsSum += digit;
                oddDigitsCount++;
            }
            n /= 10;
        }
        System.out.println("Even Count: " + evenDigitsCount);
        System.out.println("Odd Count: " + oddDigitsCount);
        System.out.println("Even Sum: " + evenDigitsSum);
        System.out.println("Odd Sum: " + oddDigitsSum);
    }
}

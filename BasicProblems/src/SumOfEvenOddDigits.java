import java.util.Scanner;

//Write a Java program that calculates the sum of all even digits in a number.
public class SumOfEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddDigitsSum = 0;
        int evenDigitsSum = 0;
        n = Math.abs(n);
        if(n == 0) {
            System.out.println("The sum is 0 for both");
            return;
        }
        while(n != 0) {
            int digit = n % 10;
            if(digit % 2 == 0) {
                evenDigitsSum += digit;
            }else  {
                oddDigitsSum += digit;
            }
            n /= 10;
        }
        System.out.println("The even sum is " + evenDigitsSum
        + " and the odd digit is " + oddDigitsSum);
    }
}

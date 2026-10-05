import java.util.Scanner;

/*
Write a Java program that takes two integers:
    start
    end
and counts how many numbers in that range are:
    Even
    Odd
 */
public class CountEvenOddDigitsInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int evenDigitsCount = 0;
        int oddDigitsCount = 0;

        for(int i = start; i <= end; i++){
            if(i % 2 == 0) {
                evenDigitsCount++;
            }else {
                oddDigitsCount++;
            }
        }
        System.out.println("Even: " + evenDigitsCount);
        System.out.println("Odd: " + oddDigitsCount);

    }
}

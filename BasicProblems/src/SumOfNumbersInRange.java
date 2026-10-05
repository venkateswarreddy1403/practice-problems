import java.util.Scanner;

/*
    Write a Java program that takes:
        start
        end
    and calculates:
        Sum of all numbers
        Sum of all even numbers
        Sum of all odd numbers
*/

public class SumOfNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int evenSum= 0;
        int oddSum = 0;
        int sum = 0;

        for(int i = start; i <= end; i++){
            sum += i;
            if(i % 2 == 0){
                evenSum += i;
            }else {
                oddSum += i;
            }
        }
        System.out.println("Even: " + evenSum);
        System.out.println("Odd: " + oddSum);
        System.out.println("Sum: " + sum);
    }
}

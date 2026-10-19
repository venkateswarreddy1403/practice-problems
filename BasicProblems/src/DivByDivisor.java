import java.util.Scanner;

/*
🚀 Problem #19 — Count numbers divisible by a given number
Write a Java program that takes three integers:
    - start
    - end
    - divisor
Count how many numbers in the range are divisible by divisor.
*/
public class DivByDivisor {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int divisor = sc.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++){
            if(i % divisor == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

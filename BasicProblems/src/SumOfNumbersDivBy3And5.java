/*
🚀 Problem #18 — Sum of numbers divisible by 3 AND 5
Write a Java program that takes start and end and calculates the sum of all numbers divisible by both 3 and 5.
*/

import java.util.Scanner;

public class SumOfNumbersDivBy3And5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

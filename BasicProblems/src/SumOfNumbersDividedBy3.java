/*
Write a Java program that takes:
    start
    end
and calculates the sum of all numbers divisible by 3 in that range.
*/

import java.util.Scanner;

public class SumOfNumbersDividedBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

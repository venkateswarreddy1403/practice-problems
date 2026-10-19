/*
Write a Java program that takes:
    start
    end
and counts how many numbers in that range are divisible by both 3 and 5.
*/

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++){
            if( i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

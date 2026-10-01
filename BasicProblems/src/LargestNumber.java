//Write a Java program that takes three integers and prints the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}

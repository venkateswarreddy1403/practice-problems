import java.util.Scanner;

//Find the largest number in a range that is divisible by 3.
public class LargestNumDivBy3 {
    public static void  main (String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int count = 0;
        int largestNumDivBy3 = start;
        for (int i = start; i <= end; i++) {
            if(i % 3 == 0){
                count++;
                largestNumDivBy3 = i;
            }
        }
        if(count == 0){
            System.out.println("No Number Found");
            return;
        }
        System.out.println(largestNumDivBy3);
    }
}

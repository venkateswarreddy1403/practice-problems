import java.util.Scanner;

//Find the smallest number in a range that is divisible by 5.
public class SmallestNumDivBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++){
            if(i % 5 == 0){
                System.out.println(i);
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("No number found");
        }
    }
}

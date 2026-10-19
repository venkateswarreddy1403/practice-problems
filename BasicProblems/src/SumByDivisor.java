import java.util.Scanner;

public class SumByDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int divisor = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % divisor == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

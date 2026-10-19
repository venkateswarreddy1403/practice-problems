import java.util.Scanner;

public class DivBy2And3And5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int divBy2 = 0;
        int divBy3 = 0;
        int divBy5 = 0;

        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                divBy2++;
            }
            if (i % 3 == 0){
                divBy3++;
            }
            if (i % 5 == 0){
                divBy5++;
            }
        }
        System.out.println("Divisible by 2: " +divBy2);
        System.out.println("Divisible by 3: " +divBy3);
        System.out.println("Divisible by 5: " +divBy5);

    }
}

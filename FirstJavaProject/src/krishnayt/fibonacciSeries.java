package krishnayt;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int first_num = 0;
        int second_num = 1;
        for(int i = 1; i<=n; i++){
            System.out.println(first_num + ", ");
            int next_num = first_num + second_num;
            first_num = second_num;
            second_num = next_num;
        }
        scanner.close();
    }
}

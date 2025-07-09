package krishnayt;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        System.out.println("Repeated value check: ");
        k = scanner.nextInt();
        System.out.println("Give me full value: ");
        n = scanner.nextInt();
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem == k) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(k+ " repeated: " + count);
        scanner.close();
    }
}

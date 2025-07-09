package krishnayt;

import java.util.Scanner;

public class firstFunction {
    public static void main(String[] args) {
        solution();
    }

    static void solution()
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;
        result = a + b;
        System.out.println(result);
        scanner.close();
    }

}

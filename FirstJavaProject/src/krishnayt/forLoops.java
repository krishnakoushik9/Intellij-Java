package krishnayt;

import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        //Print numbers from 1 to n
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 1; i<=n ; i++)
        {
            System.out.println(i);
        }
    scanner.close();
    }
}

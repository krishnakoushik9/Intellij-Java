package krishnayt;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a>b && a>c){
            System.out.println("A is Largest");
        }
        else if (b>a && b>c) {
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
        scanner.close();
    }
}

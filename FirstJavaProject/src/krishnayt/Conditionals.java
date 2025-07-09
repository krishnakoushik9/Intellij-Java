package krishnayt;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary;
        int bonus = 2000;
        int bonus2 = 1000;
        salary = scanner.nextInt();
        if(salary > 10000){
            salary += bonus;
        }
        else
        {
            salary += bonus2;
        }
        System.out.println("The Updated salary is: "+salary);
        scanner.close();
    }
}

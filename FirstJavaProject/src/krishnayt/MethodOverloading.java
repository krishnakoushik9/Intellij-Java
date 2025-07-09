package krishnayt;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(80);
        fun("Krishna");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println("Krishna");
    }
}

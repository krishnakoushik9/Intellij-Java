package krishnayt;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        char r = 'i';
        name = scanner.next();
        System.out.println(search(name,r));
    }
    static boolean search(String str,char r){
        for(int i = 0;i<str.length();i++)
        {
            if (r == str.charAt(i)){
                return true;
            }
        }return false;
    }
}

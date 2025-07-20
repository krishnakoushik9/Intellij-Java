package krishnayt;

public class Palindrome {
    public static void main(String[] args) {
        String check = "abcdcba";
        System.out.println(check.contentEquals(new StringBuilder(check).reverse()) ? "Palindrome" : "Not Palindrome");
    }
}


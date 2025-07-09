package krishnayt;

public class parameterIntmethod {
    public static void main(String[] args) {
        System.out.println("Using parameters");
        int answer = sum(5, 6);  // ← semicolon added here
        System.out.println("Sum is: " + answer);
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

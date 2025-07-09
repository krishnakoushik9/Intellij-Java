package krishnayt;

public class swapNumbers {
    public static void main(String[] args) {
        swap(6,8);
    }
    static void swap(int a,int b)
    {
        System.out.println(a + "," + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "," + b);
    }
}

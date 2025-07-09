package krishnayt;

public class LinearSearching1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 33, 2, -1};
        int target = 33;
        int ans = linearSearch(arr, target);
        System.out.println("Target number found at: "+ans);
    }
    static int linearSearch(int[] arr, int target) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

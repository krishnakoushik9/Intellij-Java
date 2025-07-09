package krishnayt;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 33, 2, -1};
        int target = 3;
        int ans = linearSearch(arr, target,1,3);
        System.out.println("Target number found at: "+ans);
    }
    static int linearSearch(int[] arr, int target,int start,int end) {
        int i;
        for (i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

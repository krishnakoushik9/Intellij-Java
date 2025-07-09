package krishnayt;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,12,24,42,56,66,68,71,90,91};
        binaryelement(arr,0,arr.length,0,68);

    }

    static int binaryelement(int[] arr, int s, int e, int m,int target) {

        s = 0;
        e = arr.length;
        m = (s + e)/2;
    }
}

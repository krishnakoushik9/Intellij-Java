package krishnayt;

public class BinarySearch {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] arr = {-18,-7,0,1,4,12,23,35,44,58,72,91};
        int target = 72;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
        long end = System.nanoTime();
        System.out.println("Time taken (ms): " + (end - start) / 1_000_000.0);
    }
    static int binarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end) {
        int mid = start + (end - start) / 2;
        if (target < arr[mid]) {
            end = mid - 1;
        }
        if (target > arr[mid]) {
            start = mid + 1;
        }
        else
        {
            return mid;
        }
    }return -1;
    }
}

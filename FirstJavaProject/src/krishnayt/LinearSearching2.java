package krishnayt;

public class LinearSearching2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 33, 2, -1};
        int target = 22;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target) {
        int i;
        for(int element : arr)
        {
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}

package krishnayt;

public class FIndMin {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8,-1, 33, 2, -11};
        int Min = MinSearch(arr);
        System.out.println(Min);
    }

    static int MinSearch(int[] arr){
        int ans = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i] < ans){
                ans = arr[i];

            }
        }
        return ans;
    }
}

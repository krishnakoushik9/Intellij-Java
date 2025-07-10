package krishnayt;

public class OderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99,87,73,65,53,43,21,10,2};
        int target = 21;
        int ans = orderChecker(arr,target);
        System.out.println(ans);
    }

    static int orderChecker(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //Find whether the Array is ascending or descending
        boolean isAscending = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else {
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
        }return -1;
    }
}

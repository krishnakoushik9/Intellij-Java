package krishnayt;

public class maxArray {
    public static void main(String[] args) {
        int[] arr = {1,22,5,18,9,27};
        int max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}

package krishnayt;

import java.util.Arrays;
import java.util.Scanner;

public class SeachIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {3,6,4,8},
                {12,88}
        };
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        in.close();

    }
    static int[] search(int[][] arr, int target){
        int row;
        int col;
        for(row = 0;row<arr.length;row++){
            for(col = 0;col < arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

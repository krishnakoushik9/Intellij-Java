package krishnayt;

import com.sun.source.tree.EnhancedForLoopTree;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr2d = new int[m][n];
        //input
        for (int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr2d[i][j] = scanner.nextInt();
            }
        }
        //output
        //for (int i = 0; i < m; i++) {
            /*for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();*/
            //System.out.println(Arrays.toString(arr2d[i]));
        //}
        //Below is our enhanced for loop
        for (int[] a: arr2d){
            System.out.println(Arrays.toString(a));
        }

        scanner.close();
    }
}

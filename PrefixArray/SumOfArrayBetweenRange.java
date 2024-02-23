/*
 * Complexity = O(n+m)
 */

public class SumOfArrayBetweenRange {
    public static void main(String[] args) {
        int[] arr = {2,7,8,3,6,5,4,1};
        int[][] arr1 = {
            {1, 2},{1, 7},{2, 6},{4, 5}
        };
        for(int i = 1 ; i < arr.length; i++)    arr[i] += arr[i-1];
        for(int i = 0 ; i < arr1.length; i++){
            if(arr1[i][0] == 1){
                System.out.println(arr[arr1[i][1]-1]);
                continue;
            }
            System.out.println(arr[arr1[i][1]-1] - arr[arr1[i][0]-2]);
        }

    }
}

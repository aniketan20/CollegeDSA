/*
 * no. of arrays = n(n+1)/2
 * no. of subsets/subsequence = 2^n
 */

public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {1,1,-1,-2,5};
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
            if(sum < 0) sum = 0;
            if(sum > max) max = sum;
        }
        System.out.println(max);
    }
}

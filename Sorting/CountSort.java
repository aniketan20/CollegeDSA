/*
 * Used when the length of array is greater than maximum no. in the array and only valid for only positive element
 * Complexity: O(n+m) where n is the length of array and m is the maximum element
 * 
 * 5 3 1 2 4 1 2
 * max element is 5
 * create array named count with size max element + 1(5+1=6)
 * initalize count array as 0 
 * count the occurance of elements of the array
 * 0 2 2 1 1 1
 * now calculate prefix sum of count array
 * 0 2 4 5 6 7 
 */
public class CountSort {
    public static void main(String[] args) {
        int arr[] = {5,3,1,2,4,1,2};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            max = Math.max(max,i);
        }

        int countArray[] = new int[max+1];
        for(int i : arr){
            countArray[i]++;
        }

        for(int i = 1 ; i <= max ; i++){
            countArray[i] += countArray[i-1];
        }

        int output[] = new int[n];

        for(int i = n - 1 ; i >= 0 ; i--){
            output[countArray[arr[i]]-1] = arr[i];
            countArray[arr[i]]--;
        }

        for(int i : output) System.out.print(i+" ");
    }
}

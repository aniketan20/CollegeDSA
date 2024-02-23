/*
 *  SubArray:
 *  ---------
 *  Traditional Approach:
 *  ---------------------
 *  arr = {1,2,3,4,5}
 *  for(int i = 0 ; i < n ; i++)
 *      for(int j = i ; j < n ; j++)
 *          for(int k = i ; k <= j ; k++)
 *              print(arr[k])
 *  
 *  same approach is used to 
 *      -   calculate the max sum of subarrays
 *      -   printing sub arrays
 *      -   finding length of each subarray (starting and ending index of a subarray)
 *  
 *  Sliding Window Approach:
 *  ------------------------
 * 
 *  Here, window is fixed
 *  
 *  int arr = {1,2,3,4,5}
 *  int w = 2
 *  for(int i = 0 ; i < n - w + 1; i++)
 *      for(int j = i ; j < i + w ; j++)
 *          print(arr[j])
 */

import java.util.*;

public class SubArray {

    public static int sumOfMinMaxOfEachSubArray(int[] arr,int n, int w){

        int sum = 0;
        for(int i = 0 ; i < n - w + 1; i++){
            // int max = Integer.MIN_VALUE;
            // int min = Integer.MAX_VALUE;
            int max = arr[i];
            int min = arr[i];
            for(int j = i ; j < i + w ; j++){
                max = (arr[j] > max)?arr[j]:max;
                min = (arr[j] < min)?arr[j]:min;
            }
            sum += (max + min);
        }
        return sum;
    }

    public static void printDistinctElementsInEachSubArray(int[] arr,int n, int w){

        // Using O(n^2) approach
        // for(int i = 0 ; i < n - w + 1 ; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j = i ; j < i + w ; j++){
        //         set.add(arr[j]);
        //     }
        //     System.out.print(set.size()+" ");
        // }

        // Using O(n) approach
        int left = 0;
        int right = w - 1;
        Set<Integer> set = new HashSet<>();
        for(int i = left; i <= right; i++){
            set.add(arr[i]);
        }
        System.out.print(set.size()+" ");
        right++;
        left++;
        while(right < n){
            if(!set.contains(arr[right])){
                set.add(arr[right]);
            }
            else{
                set.remove(arr[left-1]);
                set.add(arr[right]);
            }
            System.out.print(set.size()+" ");
            left++;
            right++;
        }
    }

    public static void main(String[] args) {
        // Basic Approach
        // int arr[]= {1,2,3,4,5};
        // int n = arr.length;
        // int w = 2;
        // for(int i = 0 ; i < n - w + 1 ; i++){
        //     for(int j = i ; j < i + w ; j++){
        //         System.out.print(arr[j]+" ");
        //     }
        //     System.out.println();
        // }

        // int arr[] = {1,2,3,4,5,6,7,8};
        // int n = arr.length;
        // int w = 3;
        // System.out.println(sumOfMinMaxOfEachSubArray(arr,n,w));

        int arr[] = {1,2,1,3,4,2,3};
        int n = arr.length;
        int w = 4;
        printDistinctElementsInEachSubArray(arr,n,w);
    }
}

import java.util.*;

public class MaxInEverySubArray {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        TreeSet <Integer> set = new TreeSet<Integer>();
        for(int i = 0 ; i < k ; i++){
            set.add(arr[i]);
        }
        System.out.print(set.last()+" ");
        for(int i = k ; i < arr.length ; i++){
            set.remove(arr[i-k]);
            set.add(arr[i]);
            System.out.print(set.last()+" ");
        }
    }
}

import java.util.*;

public class SubArrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        int k = 15;

        int max = 0, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if(sum == k){
                max = i + 1;
            }
            if(hm.containsKey(sum - k)){
                max = Math.max(max, i - hm.get(sum - k));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }

        System.out.println(max);
    }
}

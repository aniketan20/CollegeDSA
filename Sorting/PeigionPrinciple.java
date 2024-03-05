/*
 * if there are n spaces and n + 1 candidates to fill that spaces there will be atleast 1 pair of canditates that shares the same place
 *  Complexity is O(n+r) where r is the range calculated as max - min + 1
 */

public class PeigionPrinciple {
    public static void main(String[] args) {
        int arr[] = {8,2,2,7,5,6,8};
        int max = 0;
        int min = 1000;
        for(int i : arr){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }

        int range = max - min + 1;

        int ph[] = new int[range];

        for(int i : arr){
            ph[i-min]++;
        }
        int k = 0;
        for(int i = 0 ; i < range ; i++){
            while(ph[i]-- > 0){
                arr[k++] = i + min;
            }
        }

        for(int i : arr)    System.out.print(i+" ");
        
    }    
}

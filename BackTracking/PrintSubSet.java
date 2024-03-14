/*
 * O(2^n * n)
 */

public class PrintSubSet {

    public static void printSubSet(int arr[], StringBuilder ans ,int i){
        if(i == arr.length){
            System.out.println(ans);
            return;
        }
        printSubSet(arr, ans, i+1);
        ans.append(""+arr[i]);
        printSubSet(arr, ans, i+1);
        ans.delete(ans.length()-1,ans.length()); //pop the last index
        return;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        printSubSet(arr, new StringBuilder() , 0);
    }
}



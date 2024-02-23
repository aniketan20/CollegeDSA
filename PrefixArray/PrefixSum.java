public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for(int i = 1 ; i < arr.length ; i++)    arr[i] += arr[i-1];
        for(int i = 0 ; i < arr.length ; i++)    System.out.print(arr[i]+" ");
    }
}

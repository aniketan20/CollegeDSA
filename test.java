public class test {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2};
        int res = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            res = arr[i];
        }
        System.out.println(res);
    }
}

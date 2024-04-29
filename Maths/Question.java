public class Question {


    public static int fact(int n){
        int ans = 1;
        for(int i = 2 ; i <= n ; i++){
            ans *= i;
        }
        return ans;
    }
    public static int ncr(int n, int r){
        int ans = 1;
        ans = fact(n)/(fact(r)*fact(n-r));
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,7,8,11,9,2,0};
        int m = 3;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % m;
        }
        int a[] = new int[m];
        for(int i : arr){
            a[i]++;
        }

        int ans = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] <= 1)   continue;
            if(i == 0 || i == m/2){
                ans+=ncr(a[i], 2);
            }
            else{
                ans += a[i]*a[m-i];
                a[i] = -1;
                a[m-i] = -1;
            }
        }
        System.out.println(ans);
    }
}

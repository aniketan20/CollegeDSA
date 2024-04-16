import java.util.Arrays;

/**
 * Fibonacci
 */
public class Fibonacci {

    static int dp[];
    public static int fibo_memo(int n){
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        return memo_fibo(n,dp);
    }

    public static int memo_fibo(int n, int dp[]){
        if(dp[n] != -1) return dp[n];
        return dp[n] = memo_fibo(n-1,dp) + memo_fibo(n-2,dp);
    }

    // public static int fibo_tab(int n){
    //     int dp[] = new int[n+1];
    //     if(n < 1)   return 0;
    //     dp[1] = 1;
    //     for(int i = 2 ; i <= n ; i++){
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }
    public static void main(String[] args) {
        int n = 10;
        // System.out.println(fibo_tab(n));
        System.out.println(fibo_memo(n));
    }
    
}
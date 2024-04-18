import java.util.*;

public class CountWaysToJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 1){
            System.out.println(1);
            return;
        }
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}

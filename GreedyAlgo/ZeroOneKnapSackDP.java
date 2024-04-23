public class ZeroOneKnapSackDP {

    public static int ZeroOneKnapSack(int []h, int []w ,int cap){
        int dp[][] = new int[h.length+1][cap+1];
        for (int i=0;i<=h.length;i++){
            for (int j=0;j<=cap;j++){
                if (i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if (w[i-1] <= j){
                    dp[i][j] = Math.max(h[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[h.length][cap];
    }

    public static void main(String[] args) {
        int h[] = {3,10,4,5};
        int w[] = {10,6,8,9};
        int cap = 17;
        System.out.println(ZeroOneKnapSack(h,w,cap));
    }
}

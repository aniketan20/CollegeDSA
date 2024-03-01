/*
 * n/2+n/3+n/5+n/7+n/11+..... = 
 */


public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        boolean[] visited = new boolean[n+1];
        for(int i = 2 ; i*i <= n ; i++){
            if(!visited[i]){
                // System.out.print(i+" ");
                for(int j = i*i ; j <= n ; j+=i){
                    visited[j] = true;
                }
            }
        }
        for(int i = 2 ; i <= n ; i++)   if(!visited[i])  System.out.print(i+" ");
    }
}

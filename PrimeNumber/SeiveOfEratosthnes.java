/*
 * n/2+n/3+n/5+n/7+n/11+..... = 
 */

import java.util.*;

public class SeiveOfEratosthnes {
    public static void main(String[] args) {
        boolean[] visited = new boolean[101];
        Arrays.fill(visited, true);
        visited[0] = false;
        visited[1] = false;
        for(int i = 2 ; i < 101 ; i++){
            if(visited[i]){
                System.out.print(i+" ");
                for(int j = i*i ; j < 101 ; j+=i){
                    visited[j] = false;
                }
            }
        }
    }
}

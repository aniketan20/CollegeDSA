/*
 * time complexity :
 * root(end-start)*log(root(end-start+1))
 * 
 */

import java.util.*;

public class SegmentedSeiveOfEratosthenes {

    public static void segmentedSeive(boolean visited[], List li, int len,int start){
        for(int i = 0 ; i < li.size() ; i++){
            for(int j = 0 ; j < len ; j++){
                if(visited[j] == false) continue;
                if((j+start) == 1)  visited[j] = false;
                if((j+start)%((int)li.get(i)) == 0 && (j+start) != ((int)li.get(i))){
                    visited[j] = false;
                }
            }
        }
        for(int i = 0 ; i < len ; i++){
            if(visited[i]) System.out.print(i+start+" ");
        }
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        int len = end-start+1;

        boolean visited[] = new boolean[len];
        Arrays.fill(visited,true);

        int root = (int) Math.sqrt(end);
        boolean prime[] = new boolean[root+1];
        Arrays.fill(prime, true);

        ArrayList<Integer> li = new ArrayList<>();
        prime[0] = false;
        prime[1] = false;
        for(int i = 2 ; i < root + 1 ; i++){
            if(prime[i]){
                for(int j = i*i ; j < root + 1 ; j+=i){
                    prime[j] = false;
                }
                li.add(i);
            }
        }
        segmentedSeive(visited, li, len,start);
    }
}



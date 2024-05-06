import java.util.*;

public class BipartiteGraphDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no. of nodes : ");
        int n = sc.nextInt();
        // System.out.println("Enter no. of edges : ");
        int e = sc.nextInt();

        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();

        for(int i = 1 ; i <= n ; i++){
            hm.put(i, new ArrayList<>());
        }

        // System.out.println("Enter edges (start,end) : ");

        for(int i = 0 ; i < e ; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            hm.get(start).add(end);
        }

        int color[] = new int[n+1];
        boolean visited[] = new boolean[n+1];

        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        color[1] = 1;
        visited[1] = true;

        while(!qu.isEmpty()){
            int x = qu.poll();
            int y = color[x];
            for(int i : hm.get(x)){
                if(!visited[i] && color[i] == 0){
                    visited[i] = true;
                    color[i] = (y == 1) ? 2 : 1;
                    qu.add(i);
                }else if(visited[i] && color[i] != y){
                    continue;
                }
                else{
                    System.out.println("It is not a bipartite graph");
                    return;
                }
            }
        }

        System.out.println("It is a bipartite graph");
    }
}

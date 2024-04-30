import java.util.*;

public class TopologicalSort {

    public static void topologicalSort(HashMap<Integer, ArrayList<Integer>> hm, int indegree[]) {
        ArrayList<Integer> visited = new ArrayList<Integer>();
        ArrayList<Integer> sortedOrder = new ArrayList<Integer>();

        Queue<Integer> qu = new LinkedList<>();

        for(int i = 1 ; i < indegree.length ; i++){
            if(indegree[i] == 0){
                qu.add(i);
                visited.add(i);
            }
        }

        while(!qu.isEmpty()){
            int x = qu.poll();
            visited.add(x);
            System.out.print(x+" ");
            for(int i : hm.get(x)){
                if(visited.contains(i)){
                    System.out.println("Cycle found");
                    return;
                }
                indegree[i]--;
                if(indegree[i] == 0){
                    qu.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        
        int n = sc.nextInt();
        
        int indegree[] = new int[n+1];

        for (int i = 1; i <= n; i++) {
            hm.put(i, new ArrayList<>());
        }

        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();
            int dest = sc.nextInt();

            hm.get(start).add(dest);
            indegree[dest]++;
        }
        topologicalSort(hm,indegree);
    }
}

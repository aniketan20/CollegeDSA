import java.util.*;

public class ShortestPath {

    public static int[] dijkstra(HashMap<Integer, ArrayList<Pair>> hm, int src,int n) {
        int dist[] = new int[n]; 

        

        return dist;       
    }

    public static int[] bellmanFord(HashMap<Integer, ArrayList<Pair>> hm, int src,int n) {
        int dist[] = new int[n]; 



        return dist;       
    }

    public static int[] floyfWarshall(HashMap<Integer, ArrayList<Pair>> hm, int src,int n) {
        int dist[] = new int[n]; 



        return dist;       
    }

    static class Pair {
        int v;
        int w;
        Pair(int dest, int weight){
            this.v = dest;
            this.w = weight;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Pair>> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of vertices
        int e = sc.nextInt(); // Number of edges

        for(int i = 1; i <= n; i++) {
            hm.put(i, new ArrayList<>());
        }   

        for(int i = 0; i < e; i++) {
            int u = sc.nextInt(); // Source vertex
            int v = sc.nextInt(); // Destination vertex
            int w = sc.nextInt(); // Weight of the edge
            Pair p = new Pair(v, w);
            hm.get(u).add(p);
            
            // For undirected graph, you need to add reverse edge as well
            // hm.get(v).add(new Pair(u, w));
        }

        // Printing the adjacency list
        for (Map.Entry<Integer, ArrayList<Pair>> entry : hm.entrySet()) {
            int vertex = entry.getKey();
            ArrayList<Pair> edges = entry.getValue();
            System.out.print(vertex + ": ");
            for (Pair edge : edges) {
                System.out.print("(" + edge.v + ", " + edge.w + ") ");
            }
            System.out.println();
        }
    }
}


/*
 * 4
5
1 2 2
1 4 7
2 4 3
2 3 8
4 3 2
 */
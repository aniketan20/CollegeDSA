import java.util.*;
public class GraphDemo {

    //BFS
    // public static void traverseGraph(HashMap<Integer,ArrayList<Integer>> hm){

    //     Queue<Integer> qu = new LinkedList<Integer>();
    //     ArrayList<Integer> visited = new ArrayList<>();

    //     qu.add(1);
    //     while(!qu.isEmpty()){
    //         int temp = qu.poll();
    //         for(int i : hm.get(temp)){
    //             if(!visited.contains(i)){
    //                 visited.add(i);
    //                 qu.add(i);
    //             }
    //         }
    //         System.out.print(temp+" ");
    //     }
    // }

    //DFS
    public static void traverseGraph(HashMap<Integer,ArrayList<Integer>> hm, ArrayList<Integer> visited , int x){
        if(visited.contains(x)){
            return;
        }
        System.out.print(x+" ");
        visited.add(x);

        for(int i : hm.get(x)){
            traverseGraph(hm, visited, i);
        }
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            hm.put(i, new ArrayList<>());
        }

        int e = sc.nextInt();
        for(int i = 0 ; i < e ; i++){
            int start = sc.nextInt();
            int dest = sc.nextInt();

            hm.get(start).add(dest);
        }

        // traverseGraph(hm); //BFS
        traverseGraph(hm,new ArrayList<>(),1); //DFS
    }
}

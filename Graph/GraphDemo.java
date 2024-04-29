import java.util.*;
public class GraphDemo {

    public static void traverseGraph(HashMap<Integer,ArrayList<Integer>> hm){

        Queue<Integer> qu = new LinkedList<Integer>();
        ArrayList<Integer> visited = new ArrayList<>();

        qu.add(1);
        while(!qu.isEmpty()){
            int temp = qu.poll();
            for(int i : hm.get(temp)){
                if(!visited.contains(i)){
                    qu.add(i);
                }
            }
            System.out.print(temp+" ");
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

        traverseGraph(hm);
    }
}

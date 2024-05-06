import java.util.*;
import javafx.util.Pair;

public class MinimumSpanningTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Pair<Integer,Integer>> hm = new HashMap<>();

        int n = sc.nextInt();
        int parent[] = new int[n + 1];
        parent[0] = -1;

        for (int i = 1; i <= n; i++) {
            hm.put(i, new ArrayList<>());
            parent[i] = i;
        }
        int e = sc.nextInt();

        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();
            int dest = sc.nextInt();

            hm.get(start).add(dest);
            parent[start] = dest;
        }
    }
}

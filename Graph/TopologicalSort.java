import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TopologicalSort {

    public static void topologicalSort(HashMap<Integer, ArrayList<Integer>> hm) {
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            hm.put(i, new ArrayList<>());
        }

        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();
            int dest = sc.nextInt();

            hm.get(start).add(dest);
        }
        topologicalSort(hm);
    }
}

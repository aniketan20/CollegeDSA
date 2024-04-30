import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DisjointSetUnit {

    static Scanner sc = new Scanner(System.in);

    public static int checkRootParent(int []p, int x){
        if(p[x] == x) return x;
        return checkRootParent(p,p[x]);
    }

    public static void DSU(HashMap<Integer,ArrayList<Integer>> hm , int[] p){
        int t = sc.nextInt();
        while(t > 0){

            int u = sc.nextInt();
            int v = sc.nextInt();

            // int su = p[u];
            // int sv = p[v];

            // int ru = 0;
            // int rv = 0;

            // while(ru != su){
            //     ru = su;
            //     su = p[su];
            // }

            // while(rv != sv){
            //     rv = sv;
            //     sv = p[sv];
            // }

            int ru = checkRootParent(p, u);
            int rv = checkRootParent(p, v);

            if(rv == ru){
                System.out.println("false");
            }
            else{
                System.out.println("true");
                hm.get(Math.max(u,v)).add(Math.min(u,v));
                p[u] = Math.min(ru,rv);
                p[v] = Math.min(ru,rv);
            }
            // for(int x : p) System.out.print(x+" ");
            // System.out.println();
            t--;
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        
        int n = sc.nextInt();
        int parent[] = new int[n+1];
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

        DSU(hm,parent);
    }
}
/*
6
3
2 1
3 2
5 4
10
 */
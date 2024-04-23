import java.util.ArrayList;

public class ZeroOneKnapSackProblem{

    public static ArrayList<ArrayList<Integer>> getSubSets(int n){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        for(int i = 0 ; i < (1 << n) ; i++){
            ArrayList<Integer> subset = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                if((i & (1 << j)) != 0){
                    subset.add(j);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
    static int maxPro = 0;
    public static int ZeroOneKnapSack(int []h, int []w ,int cap, int index, int currPro){
        if(cap <= 0 || index == 0 || h[index] < 0){
            return 0;
        }
        ZeroOneKnapSack(h, w, cap, index - 1,currPro);
        currPro += h[index];
        maxPro = Math.max(maxPro,currPro);
        ZeroOneKnapSack(h,w,cap-w[index],index - 1,currPro);
        // currPro -= h[index];
        return maxPro;
    }

    public static void main(String[] args) {
        int h[] = {3,10,4,5};
        int w[] = {10,6,8,9};
        int cap = 17;
        int maxPro = 0;

        ArrayList<ArrayList<Integer>> subsets = getSubSets(h.length);
        // System.out.println(subsets);

        int temp = cap;
        for(ArrayList<Integer> x : subsets){
            int currPro = 0;
            for(int i = 0 ; i < x.size() ; i++){
                if(cap >= w[x.get(i)]){
                    currPro += h[x.get(i)];
                    cap -= w[x.get(i)];
                }
            }
            cap = temp;
            maxPro = Math.max(maxPro,currPro);
        }
        // System.out.println(maxPro);

        System.out.println(ZeroOneKnapSack(h,w,cap,h.length-1,0));
    }
}